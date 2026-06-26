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
public class ParedeIndestrutivel extends Bloco {
    public ParedeIndestrutivel(int x, int y) {
        super(x, y, -1); // Vida -1 (ou qualquer valor) pois ela nunca vai morrer
    }

    // logica pra não destruir a parede
    @Override
    public void destruir() {
        // Deixamos vazio propositalmente. 
        // Se uma bomba tentar chamar paredeIndestrutivel.destruir(), nada acontece!
    }
}

