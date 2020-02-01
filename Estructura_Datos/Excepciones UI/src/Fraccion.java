
public class Fraccion extends Exception{
    
    private int numerador, denominador;
    private Coordinador coordinador;
    
    Fraccion(){
        
        numerador = 0;
        denominador = 0;
    }
    
    Fraccion(String num, String den){
        
        int numerador1 = Integer.parseInt(num);
        int denominador1 = Integer.parseInt(den);
        this.numerador = numerador1;
        this.denominador = denominador1;
    }
    
    public void setCoordinador(Coordinador coordinador){
        this.coordinador = coordinador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Fraccion sumar(Fraccion fraccion2, Fraccion fraccion1)throws ValorNoValidoException{
        
        int d, n;
        System.out.println("de: "+ fraccion1.getDenominador() +" nu: "+ fraccion1.getNumerador());
        System.out.println("de1: "+ fraccion2.getDenominador() +" nu1: "+ fraccion2.getNumerador());
        d = fraccion1.getDenominador() * fraccion2.getDenominador();
        n = (fraccion1.getNumerador() * fraccion2.getDenominador()) + (fraccion1.getDenominador() * fraccion2.getNumerador());
        if (d <= 0)
            throw new ValorNoValidoException("El denominador es cero");
        else{
            String nu = String.valueOf(n);
            String de = String.valueOf(d);
            return new Fraccion(nu, de);
        }          
    }
    
    public Fraccion restar(Fraccion fraccion2, Fraccion fraccion1)throws ValorNoValidoException{
        
        int d, n;
        
        d = fraccion1.getDenominador() * fraccion2.getDenominador();
        n = (fraccion1.getNumerador() * fraccion2.getDenominador()) - (fraccion1.getDenominador() * fraccion2.getNumerador());
        if (d <= 0)
            throw new ValorNoValidoException("El denominador es cero");
        else{
            String nu = String.valueOf(n);
            String de = String.valueOf(d);
            return new Fraccion(nu, de);
        }      
    }
    
    public Fraccion multiplicar(Fraccion fraccion2, Fraccion fraccion1)throws ValorNoValidoException{
        
        int d, n;
        
        d = fraccion1.getDenominador() * fraccion2.getDenominador();
        n = fraccion1.getNumerador() * fraccion2.getNumerador();
        if (d <= 0)
            throw new ValorNoValidoException("El denominador es cero");
        else{
            String nu = String.valueOf(n);
            String de = String.valueOf(d);
            return new Fraccion(nu, de);
        }      
    }
    
    public Fraccion dividir(Fraccion fraccion2, Fraccion fraccion1)throws ValorNoValidoException{
        
        int d, n;
        
        n = fraccion1.getNumerador() * fraccion2.getDenominador();
        d = fraccion1.getDenominador() * fraccion2.getNumerador();
        if (d <= 0)
            throw new ValorNoValidoException("El denominador es cero");
        else{
            String nu = String.valueOf(n);
            String de = String.valueOf(d);
            return new Fraccion(nu, de);
        }      
    }
    
    
    public Fraccion simplificar(Fraccion fraccion2){
    
       int k = mcd(fraccion2.numerador, fraccion2.denominador);
       fraccion2.numerador = fraccion2.numerador/k;
       fraccion2.denominador = fraccion2.denominador/k;
       
       return fraccion2;
    }
    
    
    public int mcd(int a, int b){
        if (b == 0)
            return a;
        else
            return mcd(b, a%b);
    }
    
    public String mostrar(Fraccion fr1){
        
        String st;
        if (fr1.getNumerador() == fr1.getDenominador()){
            int n = fr1.getNumerador() / fr1.getDenominador();
            st = "Resultado: " + n;
        }
        else{
            Fraccion f = simplificar(fr1);
            st = "Resultado: " + f.getNumerador() + "/" + f.getDenominador();
            System.out.println(st);
        }
           
        return st;
    }
}