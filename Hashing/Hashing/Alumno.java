/*Vargas Arenas Pedro*/

public class Alumno {

  private String matricula;  //clave de acceso
  private String nombre;


  public Alumno(String nombre, String matricula){
    this.nombre = nombre;
    this.matricula = matricula;
   }

  public Alumno(String nombre){
    this(nombre, "201812345");
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Alumno other = (Alumno) obj;
    if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
      return false;
    }
    return true;
  }

  @Override
  /*
  El método hashcode viene a complementar al método equals y
  sirve para comparar objetos de una forma más rápida en
  estructuras Hash ya que únicamente nos devuelve un número entero.
  Cuando Java compara dos objetos en estructuras de tipo hash
  (HashMap, HashSet etc) primero invoca al método hashcode y
  luego el equals. Si los métodos hashcode de cada objeto
  devuelven diferente hash no seguirá comparando y considerará
  a los objetos distintos. En el caso en el que ambos objetos
  compartan el mismo hashcode Java invocará al método equals()
  y revisará a detalle si se cumple la igualdad. De esta forma
  las búsquedas quedan simplificadas en estructuras hash.
  */
  public int hashCode() {
    int hash = 3;

    hash = 29 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
    return hash;
  }

  @Override
  public String toString() {
    return matricula + " - " + nombre;
  }
}
