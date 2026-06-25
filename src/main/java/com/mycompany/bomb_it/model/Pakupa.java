/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

/**
 *
 * @author Hugo
 */
public class Pakupa extends EntidadesMoveis {
   //vai ser como ele detecta o alcance de uma certa bomba para poder come-la
    private int raio;
    
    public Pakupa(int x, int y){
        super(x,y,2,3);
        this.raio = 4;
    }
    
    @Override
    public void mover(){}
    
    public void ComerBomba(){}
    
    @Override
    public void morrer(){}
}
