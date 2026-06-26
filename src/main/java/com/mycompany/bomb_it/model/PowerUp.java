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
public abstract class PowerUp extends EntidadesImoveis {
    public PowerUp(int x, int y) {
        super(x, y, 1);
        this.setAtivo(false); // Assim como o portal, começa escondido na parede
    }

    public void aparecer() {
        this.setAtivo(true); // Parede quebrou, o PowerUp aparece no mapa
    }
    
    //extra//claude recomendou
    // Método abstrato Cada PowerUp específico (ex: PowerUpBomba) 
    // vai ter que escrever a sua própria regra de melhoria.
    // Dica: Futuramente você precisará passar o 'Jogador' como parâmetro aqui
    // para saber quem recebe a melhoria: public abstract void aplicarMelhoria(Jogador j);
    public abstract void aplicarMelhoria();

    @Override
    public void destruir() {
        // No Bomberman clássico, se você explodir um PowerUp que está no chão,
        // ele é destruído. Então mantemos o comportamento padrão da classe mãe.
        super.destruir();
    }
}

