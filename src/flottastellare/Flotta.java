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
public class Flotta {
    private ArrayList<Astronave> astronavi;
    
    public Flotta(){
        astronavi = new ArrayList<>();
    }
    
    public void aggiungiAstronave(Astronave a){
        if(!astronavi.contains(a)) astronavi.add(a);
    }
    
    public void rimuoviAstronave(Astronave a){
        if(astronavi.contains(a)) astronavi.remove(a);
    }
    
    public ArrayList<Astronave> getAstronavi(){
        return astronavi;
    }
}
