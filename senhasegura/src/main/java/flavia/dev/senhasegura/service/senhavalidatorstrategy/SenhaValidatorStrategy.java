package flavia.dev.senhasegura.service.senhavalidatorstrategy;

public interface SenhaValidatorStrategy {
    SenhaValidatorResponse isValid(String senha);
}
