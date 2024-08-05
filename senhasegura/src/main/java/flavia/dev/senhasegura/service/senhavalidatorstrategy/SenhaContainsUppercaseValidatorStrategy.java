package flavia.dev.senhasegura.service.senhavalidatorstrategy;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class SenhaContainsUppercaseValidatorStrategy implements SenhaValidatorStrategy {

    @Override
    public SenhaValidatorResponse isValid(String senha) {
        if (!Pattern.matches(".*[A-Z].*", senha)) {
            return new SenhaValidatorResponse(false, "A senha deve conter pelo menos uma letra maiúscula");
        }

        return new SenhaValidatorResponse(true, null);
    }
}
