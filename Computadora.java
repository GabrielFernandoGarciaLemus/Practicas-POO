
package battle.game;

import java.util.Random;


public final class Computadora extends Personaje{
    
    private int vidaTotal;
    
    public Computadora(){
        
        super("Computadora",200,25,10,0.9," cortocircuitare tu vida rivsl ");
        this.vidaTotal = super.getSalud();
    }
    
    public void aumentarDefensa(){
        Random r = new Random();
        int a = r.nextInt(200);
        
        if(a>150 &&((double)super.getSalud()/(double)this.vidaTotal)<0.20)
        {
            int defensa = super.getDefensa();
            defensa +=5;
            super.setDefensa(defensa);
            System.out.println("Estoy imparable");
        }
        
    }
    
    @Override
    public void ganador() {
        System.out.println("Computadora: Mis circuitos fueron los vencedores de este duelo");
    }
}
