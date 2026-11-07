package pe.edu.cibertec.demopruebasunitarias.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {

    @Test
    void debeRetornarDosEnRomanos(){
        RomanConverter converter = new RomanConverter();
        assertEquals("II",
                converter.toRoman(2));
    }
    @Test
    void debeRetornarSieteEnRomanos(){
        RomanConverter converter = new RomanConverter();
        assertEquals("VII",
                converter.toRoman(7));
    }
}
