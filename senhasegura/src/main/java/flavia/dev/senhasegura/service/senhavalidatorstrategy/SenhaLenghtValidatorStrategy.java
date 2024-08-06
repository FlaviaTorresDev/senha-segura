package flavia.dev.senhasegura.service.senhavalidatorstrategy;

import org.springframework.stereotype.Component;

@Component
public class SenhaLenghtValidatorStrategy implements SenhaValidatorStrategy {
    @Override
    public SenhaValidatorResponse isValid(String senha) {
        if (senha.isBlank() || senha.length() < 8) {
            return new SenhaValidatorResponse(false, "A senha deve possuir pelo menos 08 caracteres.");
        }

        return new SenhaValidatorResponse(true, "");
    }
}
