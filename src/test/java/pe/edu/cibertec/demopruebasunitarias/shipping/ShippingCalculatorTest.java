package pe.edu.cibertec.demopruebasunitarias.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingCalculatorTest {

    @Test
    void debeRetornarPrecioBaseCuandoElPesoEsMenorAlLimiteYLocal(){
        ShippingCalculator calculator = new ShippingCalculator();
        // Respuesta: $ 5
        assertEquals(5.0, calculator.calculateCost(5.0,
                "Local"));
    }

    @Test
    void debeRetornarPrecioRecargadoCuandoElPesoEsMenorAlLimiteEInternacional(){
        ShippingCalculator calculator = new ShippingCalculator();
        // Por 5KG = $5 => El destino es Internacional => $10
        assertEquals(10.0, calculator.calculateCost(5.0,
                "Internacional"));
    }

    @Test
    void debeRetornarPrecioBaseRecargadoCuandoElPesoEsMayorAlLimiteYLocal(){
        ShippingCalculator calculator = new ShippingCalculator();
        // 10 KG = $5 => 2 * 2 => $ 4 = $9
        assertEquals(9.0, calculator.calculateCost(12.0,
                "Local"));
    }

    @Test
    void debeRetornarPrecioBaseRecargadoCuandoElPesoEsMayorAlLimiteEInternacional(){
        ShippingCalculator calculator = new ShippingCalculator();
        // 10 KG = $5 => 2 * 2 => $4 = $9 => Duplicar = $18.
        assertEquals(18.0, calculator.calculateCost(12.0,
                "Internacional"));
    }

}
