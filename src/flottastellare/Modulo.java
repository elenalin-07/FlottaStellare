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
    private String occupazione, nome;
    private boolean stato = true;
    
    public Modulo(String occ, String n){
        this.occupazione = occ;
        this.nome = n;
    }
    
    public void danni(){
        if(stato){
            stato = false;
            System.out.print("modulo " + nome + " dannaggiato");
        }
        else{
            System.out.print("modulo " + nome + " distrutto e rimosso dall'astronave");
        }
    }
    
    public void ripara(){
        if(!stato){
            stato = true;
            System.out.print("modulo " + nome + " riparato");

        }
    }
    
    public boolean getStato(){
        return stato;
    }
}
