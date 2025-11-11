/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottastellare;

/**
 *
 * @author lin.elena
 */
public class MembroEquipaggio {
    private String nome, ruolo, stato;
    private float salute; 
    private Astronave astronave;
    private ArrayList<String> ruoli;
    
    public MembroEquipaggio(String n, String r){
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
    
    public void cura(MembroEquipaggio m){
        m.setSaluta();
    }
    
    public void setSaluta(){
        if(salute < 100){
            salute = 100;
        }
        if(salute <= 0){
                astronave.rimuoviMembro(this);
        }
    }
    
    public void alieni(){
        
    }
    
}
