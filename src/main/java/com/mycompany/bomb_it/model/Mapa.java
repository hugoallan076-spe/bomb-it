/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

import com.mycompany.bomb_it.*;
import java.util.LinkedList;

/**
 *
 * @author Hugo
 */
public class Mapa {
    public static final int ALTURA = 13;
    public static final int LARGURA = 11;
    public static final int TILE_SIZE = 32;
    private int mapa[][];
    private LinkedList <ParedeIndestrutivel> paredes;
    private LinkedList <ParedeDestrutivel> blocos;
    
    public Mapa() {
    this.mapa = new int[ALTURA][LARGURA];
    this.paredes = new LinkedList<ParedeIndestrutivel>();
    this.blocos = new LinkedList<ParedeDestrutivel>();
}
    
    public void GerarMapa(){}
    
    public boolean posicaoLivre(int x, int y){
    
        return true;
    }
}
