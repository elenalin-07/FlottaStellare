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
}
