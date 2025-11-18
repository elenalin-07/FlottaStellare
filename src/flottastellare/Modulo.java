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
    private float salute;
    
    public Modulo(String occ, String n){
        this.occupazione = occ;
        this.nome = n;
    }
    
    public void danni(){
        stato = false;
        System.out.print("modulo dannaggiato");
    }
    
    public void ripara(){
        stato = true;
        System.out.print("modulo riparato");
    }
    
    public boolean getStato(){
        return stato;
    }
}
