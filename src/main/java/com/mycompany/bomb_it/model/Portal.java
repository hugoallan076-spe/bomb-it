/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;

/**
 *
 * @author Hugo
 */
public class Portal extends EntidadesImoveis {
 private boolean aberto;
    
    public Portal(int x, int y) {
        super(x, y, 1);
        this.aberto = false; // Começa fechado
        this.setAtivo(false); // Começa "inativo" (escondido debaixo de uma parede)
    }

    public boolean isAberto() {
        return aberto;
    }

    // O portal foi revelado porque a parede que o escondia foi destruída
    public void aparecer() {
        this.setAtivo(true);
    }
    
    // O portal abre,quando alem de ser descoberto vc mata todos os inimigos
    // no caso libera o portal
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void destruir() {
        // No nosso jogo, o fogo da bomba NÃO destrói o portal,
        
        // Por enquanto, deixamos em branco para ele ser indestrutível.
    }
}