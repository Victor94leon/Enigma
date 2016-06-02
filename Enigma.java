public class Enigma
{
    /**
     * Constructor de objetos de la clase enigma
     */
    public Enigma(){
    }
    
    public int encripta(Mecanismo mecanismo, int mensaje) {
        return mecanismo.encripta(mensaje);
    }
    
    public int desencripta(Mecanismo mecanismo, int mensaje) {
        return mecanismo.desencripta(mensaje);
    }
}
