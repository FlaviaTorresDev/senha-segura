package flavia.dev.senhasegura.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class senhaController {
	
	@PostMapping(name = "/validar")
	public ResponseEntity<?> validarSenha(@RequestBody Request request){
		return ResponseEntity.noContent().build();
	}

}
