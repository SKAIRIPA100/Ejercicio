
public class Alumno {
	
	private int dni;
	private String nombre;
	private String apellido;
	public Alumno(int dni, String nombre, String apellido) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
