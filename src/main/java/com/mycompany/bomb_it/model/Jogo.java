/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

import com.mycompany.bomb_it.model.Fase;
import com.mycompany.bomb_it.model.Jogador;

/**
 *
 * @author Hugo
 */
public class Jogo {
    private Fase faseAtual;
    private Jogador jogador;
    private boolean pause;
    
    public Jogo(Fase fase){
        this.faseAtual = fase;
        this.jogador = new Jogador(1,1);
        this.pause = false;
    }

    public Fase getFaseAtual() {
        return faseAtual;
    }

    public void setFaseAtual(Fase faseAtual) {
        this.faseAtual = faseAtual;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public boolean isPause() {
        return pause;
    }

    public void setPause(boolean pause) {
        this.pause = pause;
    }
    
    
    
    public void iniciar(){}
    
    public void foiConcluida(){}
    
    public boolean pause(){
    
        return true;
    }
    
    
}
