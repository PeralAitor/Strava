package deportes.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import deportes.entity.Usuario;

@Service
public class AuthService {
	
	private static Map<String, Usuario> mapaUsuarios = new HashMap<>();
	private static Map<String, Usuario> mapaTokens = new HashMap<>();
	
	
	public Optional<Boolean> register(Usuario usuario) {
		if (mapaUsuarios.containsKey(usuario.getEmail())) {
			return Optional.empty();
		} else {
			mapaUsuarios.put(usuario.getEmail(), usuario);
			return Optional.of(true);
		}
	}
	
	public Optional<String> login(String email, String contrasenya) {
		Usuario usuario = mapaUsuarios.get(email);
		
		if (usuario != null && usuario.comprobarContrasenya(contrasenya)) {
			String token = generateToken();
			mapaTokens.put(token, usuario);
			
			return Optional.of(token);
		} else {
			return Optional.empty();
		}
	}
	
	public Optional<Boolean> logout(String token) {
		if (mapaTokens.containsKey(token)) {
			mapaTokens.remove(token);
			return Optional.of(true);
		} else {
			return Optional.empty();
		}
	}
	
	public Usuario getUsuarioPorToken(String token) {
        return mapaTokens.get(token); 
    }
    
    public Usuario getUsuarioPorEmail(String email) {
		return mapaUsuarios.get(email);
	}
	
	private static synchronized String generateToken() {
        return Long.toHexString(System.currentTimeMillis());
    }
}
