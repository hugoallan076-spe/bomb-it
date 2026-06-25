package com.mycompany.bomb_it.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hugo
 */
public abstract class EntidadesMoveis {
    private int x;
    private int y;
    private int vida;
    private int velocidade;
    protected Direcao direcaoAtual;

    public EntidadesMoveis(int x, int y, int vida, int velocidade) {
        this.x = x;
        this.y = y;
        this.vida = vida;
        this.velocidade = velocidade;
        this.direcaoAtual = Direcao.BAIXO;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
        if (this.vida == 0){
            //chama o morrer
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Direcao getDirecaoAtual() {
        return direcaoAtual;
    }

    public void setDirecaoAtual(Direcao direcaoAtual) {
        this.direcaoAtual = direcaoAtual;
    }
    public abstract void mover();
    
    public abstract void morrer();
}
