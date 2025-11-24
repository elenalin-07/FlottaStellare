/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flottastellare;

/**
 *
 * @author lin.elena
 */
public class FlottaStellare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Flotta f = new Flotta();
        
        Astronave a1 = new Astronave("Astronave n1121");
        Astronave a2 = new Astronave("Astronave n252");
        Astronave a3 = new Astronave("Astronave n913");
        
        f.aggiungiAstronave(a1);
        f.aggiungiAstronave(a2);
        f.aggiungiAstronave(a3);
        
        Modulo mod1 = new Modulo(Moduli.motore);
        Modulo mod2 = new Modulo(Moduli.motore);
        Modulo mod3 = new Modulo(Moduli.motore);
        Modulo mod4 = new Modulo(Moduli.pannelloSolare);
        Modulo mod5 = new Modulo(Moduli.batteria);
        Modulo mod6 = new Modulo(Moduli.batteria);
        Modulo mod7 = new Modulo(Moduli.batteria);
        Modulo mod8 = new Modulo(Moduli.arme);
        Modulo mod9 = new Modulo(Moduli.armadura);        
        
        a1.aggiungiModulo(mod1);
        a2.aggiungiModulo(mod2);
        a3.aggiungiModulo(mod3);

        a1.aggiungiModulo(mod4);
        a2.aggiungiModulo(mod5);
        a3.aggiungiModulo(mod6);

        a1.aggiungiModulo(mod7);
        a2.aggiungiModulo(mod8);
        a3.aggiungiModulo(mod9);

        
        MembroEquipaggio m1 = new MembroEquipaggio("A", Ruoli.cuoco);
        MembroEquipaggio m2 = new MembroEquipaggio("B", Ruoli.medico);
        MembroEquipaggio m3 = new MembroEquipaggio("C", Ruoli.soldato);
        MembroEquipaggio m4 = new MembroEquipaggio("D", Ruoli.ingeniere);
        MembroEquipaggio m5 = new MembroEquipaggio("E", Ruoli.pilota);
        MembroEquipaggio m6 = new MembroEquipaggio("F", Ruoli.pilota);
        MembroEquipaggio m7 = new MembroEquipaggio("G", Ruoli.pilota);
        MembroEquipaggio m8 = new MembroEquipaggio("H", Ruoli.medico);
        MembroEquipaggio m9 = new MembroEquipaggio("I", Ruoli.medico);
        
        
        a1.aggiungiMembro(m1);
        a2.aggiungiMembro(m2);
        a3.aggiungiMembro(m3);
        
        a1.aggiungiMembro(m4);
        a2.aggiungiMembro(m5);
        a3.aggiungiMembro(m6);
        
        a1.aggiungiMembro(m7);
        a2.aggiungiMembro(m8);
        a3.aggiungiMembro(m9);
        
        f.stampa();
        
        f.eventiCasuali();
        f.eventiCasuali();
        f.eventiCasuali();
        
        mod2.ripara();
    }
    
}
