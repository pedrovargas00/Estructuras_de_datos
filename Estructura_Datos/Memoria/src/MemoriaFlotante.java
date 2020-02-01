public class MemoriaFlotante {
    
    private float memoria[];

    public MemoriaFlotante(int direccion) {
        this.memoria = new float[100];
        memoria[direccion] = 0;
    }
    
    private int calcularPolinomio(int i, int j, int m, int tipo, int base){
        
        int resultado = base + ((((i - 1) * m) + j - 1) * tipo);
        System.out.println("------->" + resultado);
        return resultado;
    }
    
    public void ingresar(float dato, int i, int j, int m, int tipo, int base){
        
        memoria[calcularPolinomio(i, j, m, tipo, base)] = dato;
        System.out.println("--> Valor ingresado <--");
    }
    
    public void eliminar(int i, int j, int m, int tipo, int base){
        
        memoria[calcularPolinomio(i, j, m, tipo, base)] = 0;
        System.out.println("--> Valor eliminado <--");
    }
    
    public void mostrarMatriz(int n, int m, int dato, int base){
        
       int x = base;
       for (int i = base; i < base + (n*m); i++){
           if (i != base + m)
               System.out.print(memoria[x] + " ");
           else{
               System.out.println("\n");
               System.out.print(memoria[x] + " ");
           }
           x += dato;
       }
        System.out.println("\n");
    }
    
    public void mostrarMemoria(int dato, int base){

        int x = base;
        System.out.println("Dirección -- Dato");
        for(int i = base; x < memoria.length; i++){
            System.out.println(x + " " + memoria[x] + "\n");
            x += dato;
        }
    }
}