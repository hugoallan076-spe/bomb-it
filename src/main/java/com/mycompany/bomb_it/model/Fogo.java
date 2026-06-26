/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

/**
 *
 * @author Hugo
 */
public class Fogo extends EntidadesImoveis {
private int tempoDeVida; 
    
    public Fogo(int x, int y, int tempoDeVida) {
        super(x, y, 1); 
        this.tempoDeVida = tempoDeVida;
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    // iteração do fogo com outras entidades imoveis ou com personagens
    public void causarDano(EntidadesImoveis entidadeAtingida) {
        entidadeAtingida.destruir();
    }

    public void desaparecer() {
        super.morrer(); // Torna ativo = false, sumindo do mapa
    }

    // O método atualizar roda a cada instante do jogo para diminuir o tempo do fogo
    @Override
    public void atualizar() {
        tempoDeVida--;
        if (tempoDeVida <= 0) {
            desaparecer();
        }
    }
}
