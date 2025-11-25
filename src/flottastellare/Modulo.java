/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottastellare;

import java.util.ArrayList;

/**
 *
 * @author lin.elena
 */
public class Modulo {
    private String nome;
    private boolean stato = true;
    
    public Modulo(Moduli n){
        this.nome = n.toString();
    }
    
    public void danni(){
        if(stato){
            stato = false;
            System.out.println("modulo " + nome + " dannaggiato");
        }
        else{
            System.out.println("modulo " + nome + " distrutto e rimosso dall'astronave");
        }
    }
    
    public void ripara(){
        if(!stato){
            stato = true;
            System.out.println("modulo " + nome + " riparato");

        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean getStato(){
        return stato;
    }
    
    public void stampa(){
        System.out.println("\nnome: " + nome + "\nstato: " + stato);
    }
}
