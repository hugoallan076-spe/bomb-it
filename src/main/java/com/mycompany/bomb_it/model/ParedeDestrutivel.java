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
public class ParedeDestrutivel extends Bloco {
    
    public ParedeDestrutivel(int x, int y) {
        super(x, y, 1); // Vida igual a 1, pois quebra com a explosão de 1 bomba
    }

    // Sobrescrevemos o método destruir da classe mãe
    @Override
    public void destruir() {
        super.destruir(); // Chama a lógica de zerar vida e morrer da EntidadesImoveis
        
        // lógica para 
        // aparição de um PowerUp ou revelar o Portal
    }
}
