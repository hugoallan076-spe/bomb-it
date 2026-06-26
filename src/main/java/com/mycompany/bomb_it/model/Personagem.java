/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

/**
 *
 * @author Hugo
 */
public abstract class Personagem extends EntidadesMoveis {
    private int alcance;
    private int qtdBombas;
    
    public Personagem(int x, int y, int vida, int velocidade, int alcance, int qtdBombas){
        super(x, y, vida, velocidade);
        this.alcance = alcance;
        this.qtdBombas = qtdBombas;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getQtdBombas() {
        return qtdBombas;
    }

    public void setQtdBombas(int qtdBombas) {
        this.qtdBombas = qtdBombas;
    }
    
    public void SoltarBomba(Fase fase){
        int qtdBombas = this.qtdBombas;
        if(qtdBombas > 0){}
    }
}
