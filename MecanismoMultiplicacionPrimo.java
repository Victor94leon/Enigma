public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    /**
     * Constructor for objects of class MecanismoMultiplicacionPrimo
     */
    public MecanismoMultiplicacionPrimo(int clave)
    {
        super(clave);
    }

    @Override
    public int encripta(int mensaje) {
        int resultado = mensaje * getClave();
        if(mensaje<=10 || resultado<=10) {
            resultado = -1;
        }
        return resultado;
    }
    
    @Override
    public int desencripta(int mensaje) {
        int resultado = mensaje / getClave();
        if(mensaje<=10 || resultado<=10) {
            resultado = -1;
        }
        return resultado;
    }
}
