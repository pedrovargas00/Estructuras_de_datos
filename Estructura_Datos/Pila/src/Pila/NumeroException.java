package Pila;

/*
Elaboró:
Ramos López Lizbeth
Vargas Arenas Pedro
*/
public class NumeroException extends Exception{
    public NumeroException() { 
        super ("no puede ingresar número negativos"); }
    public NumeroException(String mensaje){
        super(mensaje); }
}
