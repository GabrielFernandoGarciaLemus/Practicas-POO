//Gabriel Fernando Garcia Lemus
package battle.game;


public abstract class Personaje {
    private String nombre;
    private int salud;
    private int ataque;
    private int defensa;
    private double ta;
 
    
    //Metodo Constructor
    
    public Personaje(String _nombre, int _salud,int _ataque,int _defensa, double _ta, String _tipo){
        
        this.nombre = _nombre;
        this.salud = _salud;
        this.ataque = _ataque;
        this.defensa = _defensa;
        this.ta = _ta;
        this.tipoA = _tipo;

    }
    
    //Metodo para modificar el Nombre
    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    //Metodo para modificar la Salud 
    
    public void setSalud(int _salud) {
        this.salud = _salud;
    }
    
    public int getSalud() {
        return this.salud;
    }
   
    //Metodo para modificar el Ataque
    
    public void setAtaque(int _ataque) {
        this.ataque = _ataque;
    }
    
  
    public int getAtaque() {
        return this.ataque;
    }
    
     //Metodo para modificar la defensa 
    
    public void setDefensa(int _defensa){
        this.defensa = _defensa;
    }
    
    public int getDefensa(){
        return this.defensa;
    }
    
    //Metodo para modificar Tasa de Acierto 
    
    public void setTa(double _ta){
        this.ta = _ta;
    }
    
    public double getTa(){
        return this.ta;
    }
    
    
    //Metodo Tipo de Ataqure
    
    public String getTipoA(){
        return this.tipoA;
    }
    
    //Metodo para conocer cual es el estado del Personaje
    public boolean Estado(){
        boolean vida = true;
        if(this.salud<=0) vida=false;
        return vida;
    }
    
    //Metodo para decir si el Personaje esquivo un ataque
    
    public void Esquivar(){
        System.out.println(this.nombre + " logro esquivar el ataque...Fallo!");
    }
    
    //Metodo para Atacar a otro Personaje daño
    public void Ataque(int _ataque, String _tipo){
        
        int daño = _ataque-this.defensa;
        int vidaRestante = this.salud;
        
        if(daño>0){
            vidaRestante -= daño;
            System.out.println(this.nombre + " ha recibido" + _tipo + daño +" puntos de vida");
        } else{
            System.out.println(this.nombre +" recibio "+ _tipo +" pero no hizo efecto Aprovecha y acabalo");
        } if(vidaRestante<0){
            vidaRestante=0;
        }
        this.salud = vidaRestante;
         System.out.println(this.nombre +" tiene " + this.salud + " puntos restantes de vida!");
    }
    
    //Metodo Abstracto para Ganador
    
    public abstract void ganador();


}
