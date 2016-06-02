public class MecanismoOffset extends Mecanismo
{
    /**
     * Constructor for objects of class MecanismoOffset
     */
    public MecanismoOffset(int clave)
    {
        super(clave);
    }

    @Override
    public int encripta(int mensaje) {
        int resultado = 0;
        if(mensaje>10) {
            int nuevoMensaje = mensaje;
            int i = 0;
            int numero;
            int multiplicador = 1;
            while(nuevoMensaje>0) {
                nuevoMensaje = nuevoMensaje / 10;
                i++;
            }
            int[] cifras = new int[i];
            i = 0;     
            while(mensaje>0) {
                numero = mensaje%10;
                mensaje = mensaje/10;
                cifras[i] = numero;
                i++;
            }
            i = 0;
            while(i<cifras.length) {
                if(i!=cifras.length-1) {
                    numero = (cifras[i] + getClave());   
                    if(numero>=10){
                        numero = numero%10;
                    }
                    numero = numero * multiplicador;
                }
                else {
                    numero = cifras[i] * multiplicador;  
                }
                resultado = resultado + numero;
                i++;
                multiplicador = multiplicador * 10;
            }
            if(resultado<=10) {
                resultado = -1;
            }
        }
        else {
            resultado = -1;
        }
        return resultado;
    }

    @Override
    public int desencripta(int mensaje) {
        int resultado = 0;
        if(mensaje>10) {
            int nuevoMensaje = mensaje;
            int i = 0;
            int numero;
            int multiplicador = 1;
            while(nuevoMensaje>0) {
                nuevoMensaje = nuevoMensaje / 10;
                i++;
            }
            int[] cifras = new int[i];
            i = 0;     
            while(mensaje>0) {
                numero = mensaje%10;
                mensaje = mensaje/10;
                cifras[i] = numero;
                i++;
            }
            i = 0;
            while(i<cifras.length) {
                if(i!=cifras.length-1) {
                    numero = (cifras[i] - getClave());   
                    if(numero<0){
                        numero = 10 + numero;
                    }
                    numero = numero * multiplicador;
                }
                else {
                    numero = cifras[i] * multiplicador;  
                }
                resultado = resultado + numero;
                i++;
                multiplicador = multiplicador * 10;
            }
            if(resultado<=10) {
                resultado = -1;
            }
        }
        else {
            resultado = -1;
        }
        return resultado;
    }
}
