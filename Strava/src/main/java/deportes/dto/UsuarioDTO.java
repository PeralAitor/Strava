package deportes.dto;

public class UsuarioDTO {
	private String email;
	private String contrasenya;
	private String nombre;
	private String fechaNacimiento;
	private int peso;
	private int altura;
	private int frecuenciaCardiacaMax;
	private int frecuendiaCardiacaReposo;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getFrecuenciaCardiacaMax() {
		return frecuenciaCardiacaMax;
	}

	public void setFrecuenciaCardiacaMax(int frecuenciaCardiacaMax) {
		this.frecuenciaCardiacaMax = frecuenciaCardiacaMax;
	}

	public int getFrecuendiaCardiacaReposo() {
		return frecuendiaCardiacaReposo;
	}

	public void setFrecuendiaCardiacaReposo(int frecuendiaCardiacaReposo) {
		this.frecuendiaCardiacaReposo = frecuendiaCardiacaReposo;
	}
}
