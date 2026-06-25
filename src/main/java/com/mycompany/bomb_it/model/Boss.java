/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

/**
 *
 * @author Hugo
 */
public class Boss extends Personagem {
    
    public Boss(int x, int y){
        super(x, y, 4, 6, 4, 3);
    }
    // vou sobrescrever o método mover com uma ia simples
    @Override
    public void mover(){}
    
    @Override
    public void morrer(){}
}
