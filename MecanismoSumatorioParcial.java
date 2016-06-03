public class MecanismoSumatorioParcial extends Mecanismo
{
    /**
     * Constructor for objects of class MecanismoSumatorioParcial
     */
    public MecanismoSumatorioParcial(int clave)
    {
        super(clave);
    }

    @Override
    public int encripta(int mensaje) {
        int resultado = -1;
        if(mensaje>10) {
            resultado = 0;
            int i = getClave();
            while(i<=mensaje) {
                resultado = resultado + i;
                i++;
            }
            if(resultado<=10) {
                resultado = -1;
            }
        }
        return resultado;
    }

    @Override
    public int desencripta(int mensaje) {
        int resultado = -1;
        if(mensaje>10) {
            int i = 0;
            while(mensaje>0) {
                mensaje = mensaje - (getClave() + i);
                if(mensaje>0) {
                    i++; 
                }
            }
            if(mensaje>=0) {
                resultado = i+getClave();
            }
        }
        return resultado;
    }
}
