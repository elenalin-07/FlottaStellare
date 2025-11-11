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
    private String occupazione, nome, stato;
    private float salute;
    private ArrayList<String> occupazioni;
    private ArrayList<String> occupazioniNave;
    
    public Modulo(String occ, String n){
        this.occupazione = occ;
        this.nome = n;
        occupazioni = new ArrayList<>();
        occupazioniNave.add("Comando");
        occupazioniNave.add("Pannello solare");
        occupazioniNave.add("Motore");
        occupazioniNave.add("Abitazione");
        
        occupazioni.add("Protezione");
        occupazioni.add("Abitazione");
        occupazioni.add("Abitazione");
    }
    
}
