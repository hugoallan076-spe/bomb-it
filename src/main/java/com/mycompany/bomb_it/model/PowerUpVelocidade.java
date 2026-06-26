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
public class PowerUpVelocidade extends PowerUp {
  private int aumentoVelocidade;

    public PowerUpVelocidade(int x, int y) {
        super(x, y);
        this.aumentoVelocidade = 2; // Quantidade de pixels a mais que o jogador anda por frame
    }

    @Override
    public void aplicarMelhoria() {
        // LÓGICA DO JOGO:
        // Quando o jogador colidir com este item:
        // jogador.setVelocidade(jogador.getVelocidade() + this.aumentoVelocidade);
        
        System.out.println("PowerUp coletado: Velocidade do jogador aumentada!");
        
        // Depois de aplicado, o item deve sumir
        super.destruir();
    }
}  

