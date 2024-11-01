package deportes.facade;



import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deportes.dto.CredencialesDTO;
import deportes.dto.TokenDTO;
import deportes.dto.UsuarioDTO;
import deportes.entity.Usuario;
import deportes.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private AuthService authService;
	
	public AuthController(AuthService authService) {
		this.authService = authService;
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario(usuarioDTO);
		Optional<Boolean> respuesta = authService.register(usuario);
		
		if (respuesta.isPresent()) {
			return new ResponseEntity<String>("Usuario registrado correctamente", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Usuario ya existe", HttpStatus.UNAUTHORIZED);
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody CredencialesDTO credenciales) {
		Optional<String> token = authService.login(credenciales.getEmail(), credenciales.getContrasenya());
		
		if (token.isPresent()) {
			return new ResponseEntity<>(token.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}
	
	@PostMapping("/logout")
	public ResponseEntity<String> logout(@RequestBody TokenDTO token) {
		Optional<Boolean> respuesta = authService.logout(token.getToken());
		
		if (respuesta.isPresent() && respuesta.get()) {
			return new ResponseEntity<>("Logout exitoso", HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}
}
