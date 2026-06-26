/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

import com.mycompany.bomb_it.*;

/**
 *
 * @author Hugo
 */
public abstract class Bloco extends EntidadesImoveis {

   public Bloco(int x, int y, int vida) {
        super(x, y, vida); 
    }
    
    // Como é uma classe abstrata e não tem propriedades exclusivas no momento, 
    // os métodos de colisão ou destruição serão definidos nas filhas.
}


  
    // sobreescrever metodo
    //@Override
    
    


