/*
Estructuras de datos
García Cruz Ricardo Emmanuel 
Vargas Arenas Pedro
*/

public class Calculadora {
    
   //    private Pila pDig, pOper;
    private Pila pila = new Pila(50);
    private Operadores operador = new Operadores();
    private Controlador miControlador;
    String postfijo = ""; //cadena de salida
    
    public Calculadora(){
    }
    
    public void setMiControlador(Controlador miControlador){
        this.miControlador = miControlador;
    }
    public String convertirPosFijo(String infijo){
        String postfijo = ""; //cadena de salida
        String prueba = "";
        int i = 0;
        while(i < infijo.length()) {
            if(Character.isDigit(infijo.charAt(i))){
                prueba += String.valueOf(infijo.charAt(i));
            }
            else{
                prueba += " ";
                while (!pila.estaVacia() && (operador.prioridad(String.valueOf(infijo.charAt(i))) <= operador.prioridad(pila.peek()))){
                    postfijo += prueba;
                    prueba = "";
                    postfijo += String.valueOf(pila.pop());//para agregar el operando
                    postfijo += " ";
                    //Enviar a interfaz
                }
                pila.push(String.valueOf(infijo.charAt(i)));
            }
            i++;
        }
        postfijo += prueba;
        while (!pila.estaVacia()){
            //Se manda a interfaz
            postfijo += " ";
            postfijo += String.valueOf(pila.pop());
            
        }
        return postfijo;
    }
    
    //Para calcular la operación.
    public String evaluar(String postfijo){
        String[] post = postfijo.split(" ");//hace que el String elimine todos los espacios y lo asigna a arreglo de tipo String
        String signo = "+-/*";

        //System.out.println("cadena : " + postfijo + " longitud: " + postfijo.length());
        Pila E = new Pila(50); //Pila de entrada, donde se almacena la case
        Pila P = new Pila(50); //Pila para los operadores. y donde se guardara el resultado. 
        // Agrega la cadena a una pila, de entrada. de forma inversa
        for (int i = post.length-1;i>=0; i--){
                E.push(post[i]);
                //System.out.print(String.valueOf(postfijo.charAt(i)));
            }
            
        while (!E.estaVacia()) //Verifica que la pila no este vacía
            {
                if(signo.contains("" + E.peek())) //Verifica si es un signo
                    { //Si es un signo, llama al método operar y le manda los dos numero que ya se tienen con el signo de operacion, los opera y los apila
                        P.push(operador.operar(E.pop(),P.pop(),P.pop())+"");
                    }
                else 
                    { //En caso de que no sea un numero, osea un signo, apila el signo en la pila P, para operaodres.
                     P.push(E.pop());
                    }
            }
        return P.peek();
        }
  
}
