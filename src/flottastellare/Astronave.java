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
public class Astronave {
    private String stato, nome;
    private ArrayList<Modulo> moduli;
    private ArrayList<MembroEquipaggio> membri;
    
    public Astronave(String n, String s){
        this.nome = n;
        this.stato = s;
        moduli = new ArrayList<>();
        membri = new ArrayList<>();
    }
    
    public void aggiungiModulo(Modulo m){
        if(!moduli.contains(m)) moduli.add(m);
    }
    
    public void rimuoviModulo(Modulo m){
        if(moduli.contains(m)) moduli.remove(m);
    }
    
    public ArrayList<Modulo> getModuli(){
        return moduli;
    }
    
    public void aggiungiMembro(MembroEquipaggio m){
        if(!membri.contains(m)) membri.add(m);
    }
    
    public void rimuoviMembro(MembroEquipaggio m){
        if(membri.contains(m)) membri.remove(m);
    }
    
    public ArrayList<MembroEquipaggio> getMembro(){
        return membri;
    }
    
    public String getNome(){
        return nome;
    }
}
