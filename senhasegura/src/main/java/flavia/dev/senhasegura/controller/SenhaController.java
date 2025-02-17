package flavia.dev.senhasegura.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import flavia.dev.senhasegura.service.SenhaService;

@RestController
public class SenhaController {
    private final SenhaService senhaService;

    public SenhaController(SenhaService senhaService) {
        this.senhaService = senhaService;
    }

    @PostMapping(name = "/validar")
    public ResponseEntity<List<String>> validar(@RequestBody Request request) {
        var falhas = senhaService.validar(request.senha());

        if (falhas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.badRequest().body(falhas);
    }

}
