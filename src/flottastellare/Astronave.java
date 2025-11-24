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
    private float salute, maxSalute;
    private ArrayList<Modulo> moduli;
    private ArrayList<MembroEquipaggio> membri;
    private Flotta flotta;
    
    public Astronave(String n){
        this.nome = n;
        moduli = new ArrayList<>();
        membri = new ArrayList<>();
        maxSalute = 100;
        salute = maxSalute;
    }
    
    public void assegnaFlotta(Flotta f){
        flotta = f;
    }
    
    public void aggiungiModulo(Modulo m){
        if(!moduli.contains(m)) {
            moduli.add(m);
            if(m.equals(Moduli.armadura)){
                maxSalute = 200;
                salute = maxSalute;
            }
        }
    }
    
    public void rimuoviModulo(Moduli m){
        if(moduli.contains(m)) moduli.remove(m);
    }
    
    public ArrayList<Modulo> getModuli(){
        return moduli;
    }
    
    public void aggiungiMembro(MembroEquipaggio m){
        if(!membri.contains(m)){
            membri.add(m);
            m.assegnaAstronave(this);
            if(m.getRuolo().equals(Ruoli.cuoco)) this.aumentaMaxSalute();
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
    
    public void aumentaMaxSalute(){
        for(int i = 0; i < membri.size(); i++){
            membri.get(i).setMaxSalute(20);
        }
    }
    
    public void diminuiMaxSalute(){
        for(int i = 0; i < membri.size(); i++){
            membri.get(i).setMaxSalute(-20);
            membri.get(i).setSalute();
        }
    }
    
    public void danni(){
        System.out.println(nome + " ha subito i danni: ");
        System.out.println("salute: -10");
        salute -= 10;
        int i = r.nextInt(0, moduli.size());
        moduli.get(i).danni();
        
        checkSalute();
    }
    
    public void alieniABordo(){
        if(!checkSoldato()){
            int m;
            salute -= 10;
            checkSalute();
            int n = r.nextInt(membri.size());
            System.out.println("l'attacco degli alieni a bordo ha cusato i danni a " + n + " membri dell'equipaggio");
            for(int i = 0; i < n; i++){
                m = r.nextInt(membri.size());
                membri.get(m).alieniABordoMembro();
            }
        }
        else System.out.println("soldato ha sconfitto gli alieni");
    }
    
    public void riparaModulo(Modulo m){
        boolean check = false;
        int i = 0;
        while(!check || i < membri.size()){
            if(Ruoli.ingeniere.equals(membri.get(i).getRuolo())){
                if(membri.get(i).getStato()) {
                    check = true;
                    if(m.getStato() == false) m.ripara();
                }
                else System.out.println("ingenere " + membri.get(i).getNome() + " in stato non operativo");
            }
            i++;
        }
        if(!check) System.out.println("assenza ingeniere");
    }
    
    public void riparaAstronave(){
         boolean check = false;
        int i = 0;
        while(!check || i < membri.size()){
            if(Ruoli.ingeniere.equals(membri.get(i).getRuolo())){
                check = true;
                if(!stato) {
                    stato = true;
                }   salute = maxSalute;
            }
            i++;
        }
        if(!check) System.out.println("assenza ingeniere");
    }
    
    public boolean checkMedico(){
        for(int i = 0; i < membri.size(); i++){
            if(Ruoli.medico.equals(membri.get(i).getRuolo())){
                if(membri.get(i).getStato()) return true;
                else System.out.println("medico " + membri.get(i).getNome() + " in stato non operativo");
            }
        }
        return false;
    }
    
    public boolean checkSoldato(){
        for(int i = 0; i < membri.size(); i++){
            if(Ruoli.soldato.equals(membri.get(i).getRuolo())){
                if(membri.get(i).getStato()) return true;
                else System.out.println("soldato " + membri.get(i).getNome() + " in stato non operativo");
            }
        }
        return false;
    }
    
    public void guastiAiModuli(){
        int nm = r.nextInt(moduli.size());
        int m;
        for(int i = 0; i < nm; i++){
            m = r.nextInt(moduli.size());
            System.out.println("il modulo: " + moduli.get(m) + "e' danneggiato e viene rimosso dall'astronave");
            moduli.remove(moduli.get(m));
        }
    }
    
    public void checkSalute(){
        if(salute <= 40){
            stato = false;
            System.out.println("astronave danneggiato");
        }
        
        if(salute <= 0){
            System.out.println("astrpnave e' distrutto e rimosso dalla flotta");
            flotta.rimuoviAstronave(this);
        }
    }
    
    public void meteoriti(){
        int danno = r.nextInt(20, 50);
        salute -= danno;
        System.out.println(nome);
        System.out.println("salute: -" + danno);
        checkSalute();
    }
    
    public void stazioneSpaziale(){
        salute = maxSalute;
        for(int i = 0; i < moduli.size(); i++){
            moduli.get(i).ripara();
        }
    }
    
    public void stampa(){
        System.out.println("\nnome " + nome + "\nstato: " + stato + "\nsalute: " + salute + "/" + maxSalute + "\nil numero dei moduli: " + moduli.size());
        for(Modulo m : moduli){
            m.stampa();
        }
        
        System.out.println("\nil numero dei membri dell'equipaggio: " + membri.size());
        for(MembroEquipaggio e : membri){
            e.stampa();
        }
    }
}
