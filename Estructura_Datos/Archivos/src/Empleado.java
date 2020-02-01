//Clase Empleado

class Empleado{
	int id;
	String nombre;
	String apellido;
	double sueldo;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
	
	public Empleado(){
            this(0, "", "", 0);
	}

	public Empleado(int id, String n, String a, double s){
		this.id = id;
		nombre = n;
		apellido = a;
		sueldo = s;
	}
	
	public int getId(){
		return id;
	}
	
	public String toString(){
		return id + " " + nombre + " " + apellido + " " + sueldo + "\n";
	}	
}