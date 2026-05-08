/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.educ.etec.Sistema_Carro.Teste;

import br.educ.etec.Sistema_Carro.model.Carro;

/**
 *
 * @author Admin
 */
public class TesteCarro {
    public static void main(String[] args) {
        Carro Koenigsegg = new Carro();
        Koenigsegg.setMarca("Koenigsegg");
        Koenigsegg.setAno(2332);
        Koenigsegg.setCor("vermelho");
    System.out.println("A marca do carro é " + Koenigsegg.getMarca() );
    System.out.println("O ano do carro é "+  Koenigsegg.getAno() );
    System.out.println("A cor do carro é "+  Koenigsegg.getCor() );
    }
}
