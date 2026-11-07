package pe.edu.cibertec.demopruebasunitarias.converter;

public class RomanConverter {

    public String toRoman(int number) {
        if (number == 10) return "X";
        if (number == 9) return "IX";
        if (number >= 5) return "V" + "I".repeat(number - 5);
        if (number == 4) return "IV";
        return "I".repeat(number);
    }

}
