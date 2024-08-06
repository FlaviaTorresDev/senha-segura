package flavia.dev.senhasegura.service;

import flavia.dev.senhasegura.service.senhavalidatorstrategy.SenhaValidatorContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SenhaService {

    private final SenhaValidatorContext senhaValidatorContext;

    public SenhaService(SenhaValidatorContext senhaValidatorContext) {
        this.senhaValidatorContext = senhaValidatorContext;
    }

    public List<String> validar(String senha) {
        return senhaValidatorContext.execute(senha);
    }
}

