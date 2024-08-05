package flavia.dev.senhasegura.service.senhavalidatorstrategy;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class SenhaContainsLowercaseValidatorStrategy implements SenhaValidatorStrategy {

    @Override
    public SenhaValidatorResponse isValid(String senha) {
        if (!Pattern.matches(".*[a-z].*", senha)) {
            return new SenhaValidatorResponse(false, "A senha deve possuir pelo menos uma letra minúscula.");
        }

        return new SenhaValidatorResponse(true, null);
    }
}
