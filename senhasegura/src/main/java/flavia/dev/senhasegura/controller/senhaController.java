package flavia.dev.senhasegura.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class senhaController {
	
	@PostMapping(name = "/validar")
	public ResponseEntity<?> validarSenha(){
		return ResponseEntity.noContent().build();
	}

}
