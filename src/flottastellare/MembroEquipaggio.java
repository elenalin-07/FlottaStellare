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
public class MembroEquipaggio {
    Random r = new Random();
    private String nome;
    private Ruoli ruolo;
    private boolean stato;
    private float salute, maxSalute; 
    private Astronave astronave;
    
    public MembroEquipaggio(String n, Ruoli r){
        this.nome = n;
        this.ruolo = r;
        if(r.equals(Ruoli.cuoco)) astronave.aumentaMaxSalute();
        maxSalute = 100; 
        salute = maxSalute;
        stato = true;
    }
    public void assegnaAstronave(Astronave a){
        astronave = a;
    }
    
    public boolean getStato(){
         return stato;
     }
     
    public void rimuoveAstronave(Astronave a){
        astronave = null;
    }
    
    public Astronave getAstronave(){
        return astronave;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void cura(){
        if(astronave.checkMedico()) setSalute();
        else{
            System.out.print("assenza medico");
        }
    }
    
    public void setMaxSalute(float s){
        maxSalute += s;
    }
    
    public void setSalute(){
        salute = maxSalute;
    }
    
    public void alieniABordoMembro(){
        int danno = r.nextInt(30, 51);
        System.out.print("membro: " + nome + "\nruolo: " + ruolo + "\nha subito i danni: -" + danno);
        salute -= danno;
        checkSalute();
    } 
    
    public Ruoli getRuolo(){
        return ruolo;
    }
    
    public void checkSalute(){
        if(salute < 20) {
            stato = false;
            System.out.print("membro: " + nome + "\nruolo: " + ruolo + "\nsatato: non operativo");
        }
        if(salute <= 0) {
            astronave.rimuoviMembro(this);
            System.out.print("membro: " + nome + "\nruolo: " + ruolo + "\nè morto e viene rimosso dall'astronave");
        }
    }
}
