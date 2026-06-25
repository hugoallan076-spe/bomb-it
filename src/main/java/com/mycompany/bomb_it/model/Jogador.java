/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

/**
 *
 * @author Hugo
 */
public class Jogador extends Personagem {
    
    
    public Jogador(int x, int y){
        super(x, y, 1, 3, 1, 1);
    }
    
    @Override
    public void mover(){}
    
    @Override
    public void morrer(){}
    //provavelmente vou apagar esse método
   // public void PegarPowerUp(){}
}
