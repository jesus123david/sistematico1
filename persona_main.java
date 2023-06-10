package persona;

public class persona_main {
	private String nombre;
	private byte edad;
	private String dni;
	
	public persona_main() {
		this.nombre = "";
		this.edad = 0;
		dni = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre !=null  ) {
		this.nombre = nombre;
		}
		else {
			System.out.println("el espacio del nombre no debe estar vacio");
		}
		
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		if(edad>=18) {
		this.edad = edad;
		}
		else {
			System.out.println("Eres menor de edad "+ edad);
		}
	}

	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		if(dni != null && dni.length() == 16 ) {
		this.dni = dni;
		} 
		else {
			throw new IllegalArgumentException("el DNI debe tener almenos 13 caracteres, reintentalo ");
		}
	}
	
	public void creaPersona(String _nombre, byte _edad, String _dni) {
		
		nombre = _nombre;
		edad= _edad;
		dni= _dni;
	}
	
	
	
}
