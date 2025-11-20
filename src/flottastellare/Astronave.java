/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottastellare;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lin.elena
 */
public class Astronave {
    Random r = new Random();
    private String nome;
    private boolean stato = true;
    private float salute;
    private ArrayList<Modulo> moduli;
    private ArrayList<MembroEquipaggio> membri;
    private Flotta flotta;
    
    public Astronave(String n){
        this.nome = n;
        moduli = new ArrayList<>();
        membri = new ArrayList<>();
        salute = 100;
    }
    
    public void assegnaFlotta(Flotta f){
        flotta = f;
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
        if(!membri.contains(m)){
            membri.add(m);
            m.assegnaAstronave(this);
        }
    }
    
    public void rimuoviMembro(MembroEquipaggio m){
        if(membri.contains(m)){
            membri.remove(m);
            m.rimuoveAstronave(this);
        }
    }
    
    public ArrayList<MembroEquipaggio> getMembri(){
        return membri;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void danni(){
        salute -= 10;
        int i = r.nextInt(0, moduli.size());
        moduli.get(i).danni();
        
        if(salute <= 40){
            stato = false;
            System.out.print("astronave danneggiato");
        }
        
        if(salute <= 0){
            flotta.rimuoviAstronave(this);
        }
    }
    
    public void cura(){
        if(salute < 100){
            salute += 10;
            if(salute > 100){
                salute = 100;
            }
        }
    }
    
    public void alieniABordo(){
        int i = r.nextInt(0, membri.size());
        membri.get(i).alieniABordoMembro();
    }
    
    public void ripara(Modulo m){
        boolean check = false;
        int i = 0;
        while(!check || i < membri.size()){
            if(Ruoli.ingenieria.equals(membri.get(i).getRuolo())){
                check = true;
                if(m.getStato() == false) m.ripara();
            }
            i++;
        }
        if(!check) System.out.print("assenza ingenieria");
    }
    
    public boolean checkMedico(){
        for(int i = 0; i < membri.size(); i++){
            if(Ruoli.medico.equals(membri.get(i).getRuolo())){
                return true;
            }
        }
        return false;
    }
}
