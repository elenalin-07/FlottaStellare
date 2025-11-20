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
public class MembroEquipaggio {
    private String nome;
    private Ruoli ruolo;
    private boolean stato;
    private float salute; 
    private Astronave astronave;
    private ArrayList<String> ruoli;
    
    public enum Ruoli{
        
    }
    
    public MembroEquipaggio(String n, Ruoli r){
        this.nome = n;
        this.ruolo = r;
        salute = 100; 
    }
    public void assegnaAstronave(Astronave a){
        astronave = a;
    }
    
    public void rimuoveAstronave(Astronave a){
        astronave = null;
    }
    
    public Astronave getAstronave(){
        return astronave;
    }
    
    public void cura(){
        if(astronave.checkMedico()) setSaluta();
        else{
            System.out.print("assenza medico");
        }
    }
    
    public void setSaluta(){
        if(salute < 100){
            salute = 100;
        } 
    }
    
    public void alieniABordoMembro(){
        salute -= 30;
        
        if(salute <= 0){
            astronave.rimuoviMembro(this);
        }
    } 
    
    public Ruoli getRuolo(){
        return ruolo;
    }
}
