package examenfinalparte1;

import java.io.IOException;

/**
 *
 * @author ylagorebollar
 */
public class Prin {

    public static void main(String[] args) throws IOException {
        
        Principal sum1 = new Principal(10, 20); //Intancia un objeto de la clase Principal y le pasa dos parametros
        int dosParametros = sum1.totalOperaciones;
        System.out.println("El resultado para el metodo que recibe dos parametros es: " + dosParametros);

        Principal sum2 = new Principal(10); //Intancia un objeto de la clase Principal y le pasa un parametros
        int unParametro = sum2.totalOperaciones;
        System.out.println("El resultado para el metodo que recibe un parametro es: " + unParametro);

        Principal sum3 = new Principal(); //Intancia un objeto de la clase Principal sin pasarle parametros
        int sinParametros = sum3.totalOperaciones;
        System.out.println("El resultado del metodo que no recibe parametros es: " + sinParametros);
    }
}
