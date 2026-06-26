/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

import com.mycompany.bomb_it.*;

/**
 *
 * @author Hugo
 */
public class PowerUpFogo extends PowerUp {
    private int aumentoAlcance;

    public PowerUpFogo(int x, int y) {
        super(x, y);
        this.aumentoAlcance = 1; // Aumenta o raio da explosão em +1 bloco
    }

    @Override
    public void aplicarMelhoria() {
        // LÓGICA DO JOGO:
        // Quando o jogador colidir com este item:
        // jogador.setAlcanceBomba(jogador.getAlcanceBomba() + this.aumentoAlcance);
        
        System.out.println("PowerUp coletado: Alcance do fogo aumentado!");
        
        // Depois de aplicado, o item deve sumir
        super.destruir();
    }
}

