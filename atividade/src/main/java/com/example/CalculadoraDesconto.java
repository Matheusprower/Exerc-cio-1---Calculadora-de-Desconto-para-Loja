package com.example;

public class CalculadoraDesconto {

    public double calcularValorFinal(double valorCompra) {
        double valorComDesconto;
        if(valorCompra >= 0) {
            if(valorCompra < 100) {
            return valorCompra;
        } else if(valorCompra <= 100 && valorCompra >= 499) {
            valorComDesconto = valorCompra - (valorCompra*0.05);
            return valorComDesconto;
        } else {            
            valorComDesconto = valorCompra - (valorCompra*0.1);
            return valorComDesconto;
        }
        } else {
            throw new IllegalArgumentException();
        }
    }
}