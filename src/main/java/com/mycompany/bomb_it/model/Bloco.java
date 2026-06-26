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
<<<<<<< HEAD
    
=======

    String tipo; // tipo do bloco
    

    public Bloco(int x, int y, int vida, int largura, int altura, String tipo, ) {
        super(x, y, vida, largura, altura); 
        this.tipo = tipo;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  
    // sobreescrever metodo
    //@Override
    
}    

>>>>>>> origin/master
}
