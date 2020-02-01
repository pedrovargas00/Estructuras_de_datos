package lord_many_p1;

public class Geometría {
    
    private float r = 1;
    //Modificar métodos, hacer uno por acción.
        
        //Rectángulo.
        public float calArea(float b, float h){
            
            if ((b != 0) || (h != 0)){
                if (b != h)
                    r = b * h;
            }
            else
                r = 0;
            return r;
        }
        
        public float calPerimetro(float b, float h){
            
            r = 2*(b + h);
            return r;
        }
        
        public void imprimirDatos(float b, float a){
            System.out.println("Los datos del rectángulo son: ");
            System.out.println("Ancho = " + a + "\nLargo = " + b);
        }
        
        //Cubo
        public float calArea(float l){
            if (l != 0){
                r = 1;
                for (int i = 1; i <= 2; i++)
                    r *= l;
                r *= 6;
            }
            else
                r = 0;
            return r;
        }
         
        public float calPerimetro(float l){
            r = 16 * l;
            return r;
        }
        
        public double CalVolumen(float l){
            double r1;
            r1 = Math.pow(l, 3);
            return r1;
        }
        
        public void imprimirDatos(float l){
            System.out.println("El lado del cubo es: ");
            System.out.println("Largo = " + l); 
        }
        
        //Círculo.
        public float calAreaCirculo(float radio){
            
            double r1 = (3.1416f)*(Math.pow(radio, 2));
            r = (float)r1;
            return r;
        }
        
        public float calPerimetroCirculo(float r){
            
            r = 2 * ((3.1416f) * r);
            return r;
        }
        
        public void imprimirDatosCirculo(float r){
            
            System.out.println("Los lados del cubo son: ");
            System.out.println("El radio es: " + r + " y el diámetro es: " + 2*r);
        }
}