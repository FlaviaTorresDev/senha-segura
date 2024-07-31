package flavia.dev.senhasegura.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import io.micrometer.common.util.StringUtils;

@Service
public class senhaService {
	
	public List<String> validar(String senha) {
        List<String> falhas = new ArrayList<>();

        validateLength(senha, falhas);
        validateUppercase(senha, falhas);
        validateLowercase(senha, falhas);
        validateNumber(senha, falhas);
        validateSpecialChars(senha, falhas);

        return falhas;
    }
	
    private static void validateLength(String senha, List<String> falhas) {
        if (StringUtils.isBlank(senha) || senha.length() < 8) {
            falhas.add("A senha deve possuir pelo menos 08 caracteres.");
        }
    }

    private static void validateUppercase(String senha, List<String> falhas) {
        if (!Pattern.matches(".*[A-Z].*", senha)) {
            falhas.add("A senha deve possuir pelo menos uma letra maiúscula.");
        }
    }

    private static void validateLowercase(String senha, List<String> falhas) {
        if (!Pattern.matches(".*[a-z].*", senha)) {
            falhas.add("A senha deve possuir pelo menos uma letra minúscula.");
        }
    }

    private static void validateNumber(String senha, List<String> falhas) {
        if (!Pattern.matches(".*[0-9].*", senha)) {
            falhas.add("A senha deve possuir pelo menos um numero.");
        }
    }
    private static void validateSpecialChars(String senha, List<String> falhas) {
        if (!Pattern.matches(".*[\\W].*", senha)) {
            falhas.add("A senha deve possuir pelo menos um caractere especial.");
        }
    }
}

