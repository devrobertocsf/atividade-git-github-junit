@Test
    void testarSomaDeDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    void testarSubtracao() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.subtrair(5, 3));
    }

    @Test
    void testarMultiplicacao() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicar(5, 3));
    }

    @Test
    void testarDivisao() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    void testarDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }
}
