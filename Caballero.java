
package battle.game;

import java.util.Random;

public class Caballero extends Personaje {
    
    public Caballero(){
        
        super("Caballero",150,30,20,0.8,"un corte con espada");
        
    }
    
    public void aumentoAtaque(){
        
        Random r = new Random();
        int a = r.nextInt(200);
        
       
        if (a>100&&a<150&&this.getSalud()<=50){
            
            int ataque = this.getAtaque();
            ataque+=3;
            this.setAtaque(ataque);
            System.out.println("Creiste que me derrotaste");
            System.out.println("Ahora aumente mi ataque mucho mas");
            
        }
    }
    
    @Override
    public void ganador() {
        System.out.println("Caballero: Al fin te venci mi debil y torpe enemigo");
    }
 
 
}
