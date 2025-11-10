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
    
    public MembroEquipaggio(String n, String r){
        this.nome = n;
        this.ruolo = r;
        salute = 100; 
    }
    
    public void astronave(Astronave a){
        if(a.getMembri().contains(a)){
            astronave = a;
        }
    }
    
    public Astronave getAstronave(){
        return astronave;
    }
    
    public void cura(Astronave a){
        if(salute < 100){
            salute += 10;
            if(salute > 100){
                salute = 100;
            }
            else if(salute <= 0){
                a.rimuoviMembro(this);
            }
        }
    }
}
