package Pila;
/*
Elaboró:
Ramos López Lizbeth
Vargas Arenas Pedro
*/
public class ArrayException extends Exception{
    public ArrayException() { 
        super ("no se puede realizar esa acción"); }
    public ArrayException(String mensaje){
        super(mensaje); }
}
