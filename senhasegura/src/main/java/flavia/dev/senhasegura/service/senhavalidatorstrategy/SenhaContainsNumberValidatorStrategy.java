package flavia.dev.senhasegura.service.senhavalidatorstrategy;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class SenhaContainsNumberValidatorStrategy implements SenhaValidatorStrategy {

    @Override
    public SenhaValidatorResponse isValid(String senha) {
        if (!Pattern.matches(".*[0-9].*", senha)) {
            return new SenhaValidatorResponse(false, "A senha deve possuir pelo menos um numero.");
        }

        return new SenhaValidatorResponse(true, null);
    }
}
