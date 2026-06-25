/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

/**
 *
 * @author Hugo
 */
public class Bakuda extends EntidadesMoveis {
    private int alcance;
    //vai ser o contador de passos até ele se transformar em bomba
    private int cont;
    private boolean eBomba;
    
    public Bakuda(int x,int y){
        super(x,y,1,3);
        this.alcance = 3;
        this.cont = 0;
        this.eBomba = false;
    }
    
    @Override
    public void mover(){}
    
    public void TransformarEmBomba(){}
    
    @Override
    public void morrer(){}
}
