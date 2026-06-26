/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

/**
 *
 * @author Hugo
 */
public class EntidadesImoveis {
    int x; //posição
    int y; //posição
    int vida;
    boolean ativo; //se a entidade ainda existe no mapa true ou false
    
    
    
    public EntidadesImoveis(int x, int y, int vida) {
        this.x = x;
        this.y = y;
        this.vida = vida;
        this.ativo = true;
    }

    // Get e Set
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
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    //metodos
    public void verificarColisao() {
        //bloqueio de movimento
    }

    public void destruir() {
        //algumas paredes podem ser destruídas
        //momento de executar a ação e chamar morrer para zerar a vida
        vida = 0;
        morrer();
    }

    public void morrer() {
        ativo = false; //a parede deixa de existir no mapa
    }

    public void atualizar() {
        //lógica de atualização do novo espaço do mapa depois de destruir a parede, se precisar
    }
}   