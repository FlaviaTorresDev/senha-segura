package flavia.dev.senhasegura.service.senhavalidatorstrategy;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SenhaValidatorContext {
    private final List<SenhaValidatorStrategy> validators;

    public SenhaValidatorContext(List<SenhaValidatorStrategy> validators) {
        this.validators = validators;
    }

    public List<String> execute(String password) {
        return validators.stream()
                .map(it -> it.isValid(password))
                .filter(it -> !it.isValid()).map(SenhaValidatorResponse::message)
                .collect(Collectors.toList());

    }
}
