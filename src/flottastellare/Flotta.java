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
public class Flotta {
    Random r = new Random();
    private ArrayList<Astronave> astronavi;
    
    public Flotta(){
        astronavi = new ArrayList<>();
    }
    
    public void aggiungiAstronave(Astronave a){
        if(!astronavi.contains(a)) astronavi.add(a);
        a.assegnaFlotta(this);
    }
    
    public void rimuoviAstronave(Astronave a){
        if(astronavi.contains(a)) astronavi.remove(a);
    }
    
    public ArrayList<Astronave> getAstronavi(){
        return astronavi;
    }
    
    public void alieniABordo(){
        int i = r.nextInt(0, astronavi.size());
        astronavi.get(i).alieniABordo();
    }
    
    public void danni(){
        int i = r.nextInt(0, astronavi.size());
        astronavi.get(i).danni();
    }
    
    public void guastiAiModuli(){
        int na = r.nextInt(astronavi.size());
        System.out.println(na + " astronavi hanno subito i guasti ai moduli");
        int a;
        for(int i = 0; i < na; i++){
            a = r.nextInt(astronavi.size());
            astronavi.get(a).guastiAiModuli();
        }
    }
    
    public void meteoriti(){
        int na = r.nextInt(astronavi.size());
        System.out.println(na + " astronavi sono entrati in collisione con meteoriti e hanno subito i danni");
        int a;
        for(int i = 0; i < na; i++){
            a = r.nextInt(astronavi.size());
            astronavi.get(a).meteoriti();
        }
    }
    
    public void stazioneSpaziale(){
        System.out.println("La flotta ha raggiunto la stazione spaziale di supporto: tutti i moduli e le astronavi vengono riparati e riforniti, pronti per la prossima missione");
        for(int i = 0; i< astronavi.size(); i++){
            astronavi.get(i).stazioneSpaziale();
        }
    }
    
    public void eventiCasuali(){
        int n = r.nextInt(1, 6);
        switch(n){
            case 5:
                int yesORno = r.nextInt(1, 3);
                if(yesORno == 1)stazioneSpaziale();
                break;
            case 4:
                meteoriti();
                break;
            case 3:
                guastiAiModuli();
                break;
            case 2:
                alieniABordo();
                break;
            case 1:
                danni();
                break;
        }
    }
    
    public void stampa(){
        System.out.println("informazione sulla flotta:");
        System.out.println("il numero degli astronavi: " + astronavi.size());
        for(Astronave a : astronavi){
            a.stampa();
        }
    }
}
