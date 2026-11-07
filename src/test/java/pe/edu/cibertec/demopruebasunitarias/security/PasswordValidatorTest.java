package pe.edu.cibertec.demopruebasunitarias.security;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {

    @Test
    void debeRetornarFalsoCuandoPasswordNoTieneOchoCaracteres(){
        PasswordValidator validator = new PasswordValidator();
        //ASERCIONES
        assertFalse(validator.isValid("Ab1#"));
    }
    @Test
    void debeRetornarFalsoCuandoElPasswordNoTieneNumero(){
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("Password#"));
    }

    @Test
    void debeRetornarFalsoCuandoElPasswordNoTieneCaracterEspecial(){
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("PasswordSecreto2026"));
    }

    @Test
    void debeRetornarTrueCuandoElPasswordCumpleTodosLosCriterios(){
        PasswordValidator validator = new PasswordValidator();
        assertTrue(validator.isValid("Valid@Password123"));
    }

}
