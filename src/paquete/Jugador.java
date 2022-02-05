package paquete;

public class Jugador {
    //Variables nativas de la clase
    String nombreJugador;
    int edadJugador;
    String piernaHabil;
    double peso;
    double altura;
    String nacionalidad;
    String equipoDondeJuega;
    String posicion;
    int experiencia;
    String colorPiel;
    String colorOjos;
    String colorPelo;

    //Constructores
    public Jugador (){
        this.nombreJugador = "Cristiano Ronaldo Dos Santos Aveiro";
        this.edadJugador = 37;
        this.piernaHabil = "Derecha";
        this.peso = 85;
        this.altura = 1.87;
        this.nacionalidad = "portugues";
        this.equipoDondeJuega = "Manchester United";
        this.posicion = "Delantero Central";
        this.experiencia = 20;
        this.colorPiel = "trigeño";
        this.colorOjos = "Cafe";
        this.colorPelo = "Negro";
    }
    //Termina constructores

    //Metodos
    public String obtenerNombreJugador(){
        return this.nombreJugador;
    }
    public int obtenerEdadJugador(){
        return this.edadJugador;
    }
    public String obtenerPiernaHabil(){
        return this.piernaHabil;
    }
    public double obtenerPeso(){
        return this.peso;
    }
    public double obtenerAltura(){
        return this.altura;
    }
    public String obtenerNacionalidad(){
        return this.nacionalidad;
    }
    public String obtenerEquipoDondeJuega(){
        return this.equipoDondeJuega;
    }
    public String obtenerPosicion(){
        return this.posicion;
    }
    public int obtenerExperiencia(){
        return this.experiencia;
    }
    public String obtenerColorPiel(){
        return this.colorPiel;
    }
    public String obtenerColorOjos(){
        return this.colorOjos;
    }
    public String obtenerColorPelos(){
        return this.colorPelo;
    }
    public void celebracion(){
        System.out.println("Siuuuuuuuuuuuu");
    }
}
