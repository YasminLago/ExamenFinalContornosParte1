package examenfinalparte1;
/**
 * 
 * @author ylagorebollar
 */
public class Principal {
    
    int i;
    
   /**
     * Constructor sin paramatros que guarda dentro de la variable i un valor, en este caso -1
     */
    public Principal() { 
        i=-1;
    }
    
    /**
     * Constructor con paramatros que recibe dos valores, los envia al metodo met y guarda el resultado dentro de la variable i 
     * @param j Tipo int
     * @param m Tipo int
     */
    public Principal(int j, int m) {
        
        i=met(j,m);
    }
    
    /**
     * Recibe un parametro, envia al metodo met dos veces el mismo parametro y guarda el resultado dentro de la variable i
     * @param j Tipo int
     */
    public Principal(int j) {
        i=met(j,j);
    }
    
    
    
     /**
     * Recibe dos parmetros de tipo int y realiza una suma con ellos
     * @param x Tipo int
     * @param x1 Tipo int
     * @return Retorna la suma de los enteros recibidos
     */
    public int met(int x, int x1) {
      return x + x1;
    
    }
    
}
