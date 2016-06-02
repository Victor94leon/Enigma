public abstract class Mecanismo
{
    private int clave;
    
    public Mecanismo(int clave) {
        this.clave = clave;
    }
    
    public abstract int encripta(int mensaje);
    
    public abstract int desencripta(int mensaje);
    
    public int getClave(){
        return clave;
    }
}
