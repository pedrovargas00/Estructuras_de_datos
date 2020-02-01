public class Utileria {
    
	//obtiene recursivamente el factorial de un numero
	public static int fact(int n){
		if(n == 0 || n == 1)
			return 1;
		return (n*fact(n-1));
	}
	
	//obtiene recursivamente la suma de n numeros
	public static int suma(int n){
		if(n == 1)
			return 1;
		return (n+suma(n-1));
	}
	
	//obtiene recursivamente el maximo comun divisor de 2 numeros
	public static int MCD(int m, int n){
		if(m%n == 0)
			return n;
		else
			return MCD(n, m%n);
	}

	//obtiene recursivamente el valor maximo de un arreglo de enteros
	public static int maximo(int a[], int pos){
            
            int max;

            if(pos == a.length-1)
                return a[pos];
            else{
                max = maximo(a, pos +1);
                if(max < a[pos])
                    return a[pos];
                else
                    return max;
            }
        }
	
        //Exponente de un número.
        public static int exponente(int base, int exp){
            
            if (exp == 0)
                return 1;
            else{
                return base*(exponente(base, exp-1));
            }
        }
        
        //Resta por secuencia.
        public static int resta(int n1, int n2){
            
            if (n2 == 0)
                return n1;
            else{
                return resta(n1-1, n2-1);
            }
        }
        
        //Division por resta.
        public static int division(int dividendo, int divisor, int c){
            
            if (dividendo <= 0)
                return c;
            else{
                return division(dividendo-divisor, divisor, c+1);
            }
        }
        
        //Mínimo de un arreglo.
        public static int minimo(int a[], int pos){
            
            int min;

            if(pos == a.length-1)
                    return a[pos];
            else
            {
                    min = minimo(a, pos+1);
                    if(min > a[pos])
                            return a[pos];
                    else
                            return min;
            }
        }
        
        //Posicion de un elemento.
        public static int posicion(int a[], int ele, int c){
          
            if (a[c] == ele)
                return c+1;
            else
                return posicion(a, ele, c+1);
        }
        
        //Sumatoria de (x^i)/n
        public static int sumatoria(int veces, int dato, int res){            
            
            res += exponente(dato, veces);
            //System.out.println("dat: "+ dato + "res: "+ res);
            if (veces == 0)
                return res;
            else
                return sumatoria(veces-1, dato, res);
        }
        
	//Aqui van el resto de metodos de utileria
	//	public static int minimo(int a[], int pos)
	//	public static int buscar(int datoBuscar, int a[], int pos)
	//	public static int resta(int x, int y)
	//	public static int dividir(int x, int y)
	//	public static int sumatoriaRecursiva(int n, i)

}
