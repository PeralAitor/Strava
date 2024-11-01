package deportes.entity;

import java.util.List;
import java.util.Objects;

import deportes.dto.UsuarioDTO;

public class Usuario {
	private int idUsuario;
	private String email;
	private String contrasenya;
	private String nombre;
	private String fechaNacimiento;
	private int peso;
	private int altura;
	private int frecuenciaCardiacaMax;
	private int frecuendiaCardiacaReposo;
	private List<Reto> listaRetos;
	private List<Sesion> listaSesiones;
	
	public Usuario() {
	}

	public Usuario(int idUsuario, String email, String contrasenya, String nombre, String fechaNacimiento, int peso, int altura,
			int frecuenciaCardiacaMax, int frecuendiaCardiacaReposo, List<Reto> listaRetos,
			List<Sesion> listaSesiones) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.contrasenya = contrasenya;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.altura = altura;
		this.frecuenciaCardiacaMax = frecuenciaCardiacaMax;
		this.frecuendiaCardiacaReposo = frecuendiaCardiacaReposo;
		this.listaRetos = listaRetos;
		this.listaSesiones = listaSesiones;
	}

	public Usuario(String email, String contrasenya, String nombre, String fechaNacimiento, int peso, int altura, int frecuenciaCardiacaMax,
			int frecuendiaCardiacaReposo, List<Reto> listaRetos, List<Sesion> listaSesiones) {
		super();
		this.email = email;
		this.contrasenya = contrasenya;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.altura = altura;
		this.frecuenciaCardiacaMax = frecuenciaCardiacaMax;
		this.frecuendiaCardiacaReposo = frecuendiaCardiacaReposo;
		this.listaRetos = listaRetos;
		this.listaSesiones = listaSesiones;
	}
	
	public Usuario(UsuarioDTO usuarioDTO) {
		this.email = usuarioDTO.getEmail();
		this.contrasenya = usuarioDTO.getContrasenya();
		this.nombre = usuarioDTO.getNombre();
		this.fechaNacimiento = usuarioDTO.getFechaNacimiento();
		this.peso = usuarioDTO.getPeso();
		this.altura = usuarioDTO.getAltura();
		this.frecuenciaCardiacaMax = usuarioDTO.getFrecuenciaCardiacaMax();
		this.frecuendiaCardiacaReposo = usuarioDTO.getFrecuendiaCardiacaReposo();
	}

	public boolean comprobarContrasenya(String contrasenya) {
        return this.contrasenya.equals(contrasenya);
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

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

	public List<Reto> getListaRetos() {
		return listaRetos;
	}

	public void setListaRetos(List<Reto> listaRetos) {
		this.listaRetos = listaRetos;
	}

	public List<Sesion> getListaSesiones() {
		return listaSesiones;
	}

	public void setListaSesiones(List<Sesion> listaSesiones) {
		this.listaSesiones = listaSesiones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre);
	}
	
}
