package examenfinalparte1;
/**
 * 
 * @author ylagorebollar
 */
public class Principal {
    
    int totalOperaciones;
    
   /**
     * Guarda dentro de la variable totalOperaciones un valor, en este caso -1
     */
    public Principal() { 
        totalOperaciones=-1;
    }
    
    /**
     * Recibe dos valores, los envia al metodo suma y guarda el resultado dentro de la variable totalOperaciones 
     * @param num1 Tipo int
     * @param num2 Tipo int
     */
    public Principal(int num1, int num2) {
        
        totalOperaciones=suma(num1,num2);
    }
    
    /**
     * Recibe un parametro, envia al metodo suma dos veces el mismo parametro y guarda el resultado dentro de la variable totalOperaciones
     * @param num Tipo int
     */
    public Principal(int num) {
        totalOperaciones=suma(num,num);
    }
    
     /**
     * Recibe dos parmetros de tipo int y realiza una suma con ellos
     * @param x Tipo int
     * @param y Tipo int
     * @return Retorna la suma de los enteros recibidos
     */
    public int suma(int x, int y) {
       return x + y;
    
    }
    
}
