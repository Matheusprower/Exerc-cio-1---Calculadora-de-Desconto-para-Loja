package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraDescontoTeste{
    CalculadoraDesconto calculadora = new CalculadoraDesconto();

    @Test
    void retornar100() {
        double resultado = calculadora.CalculadoraDesconto(80);

        AssertEquals(80,resultado);
    }

    @Test
    void retornarEntre500() {
        double resultado = calculadora.CalculadoraDesconto(200);

        AssertEquals(190,resultado);
    }

     @Test
    void retornarMaiorQue500() {
        double resultado = calculadora.CalculadoraDesconto(1000);

        AssertEquals(900,resultado);
    }

     @Test
    void retornarNegativo() {
        IllegalArgumentException excecao = assertThrows(
            IllegalArgumentException.class,
            () -> {
                calculadora.CalculadoraDesconto(-50);
            }
        )
    }

}