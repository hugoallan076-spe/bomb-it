/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bomb_it.model;
import com.mycompany.bomb_it.model.Fogo;
import com.mycompany.bomb_it.model.EntidadesMoveis;
import com.mycompany.bomb_it.model.Bomba;
import java.util.LinkedList;

/**
 *
 * @author Hugo
 */
public class Fase {
    private Mapa mapa; 
    private LinkedList <EntidadesMoveis> inimigos;
    private LinkedList <Bomba> bombas;
    private LinkedList <Fogo> fogos;
    private LinkedList <PowerUp> powerUps;
    private Portal portal;
    
    public Fase(){
        this.mapa = new Mapa();
        this.inimigos = new LinkedList<EntidadesMoveis>();
        this.bombas = new LinkedList<Bomba>();
        this.fogos = new LinkedList<Fogo>();
        this.powerUps = new LinkedList<PowerUp>();
        this.portal = new Portal();
    }
    
    public void verificarColisao(EntidadesMoveis entidade){}
    
    public boolean foiConcluida(){
    
        return true;
    }
    
    public void carregarProximaFase(){}
    
    public void removerInimigo(EntidadesMoveis inimigo){
        
    }
    
    public boolean podeMover(int x, int y){
    
        return true;
    }
    
    public void destruirBloco(EntidadesMoveis entidade, Direcao direcao){}
}
