package PratoPronto.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PratoPronto.back.model.LoginRequest;
import PratoPronto.back.model.Usuario;
import PratoPronto.back.repository.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        // 1. Busca o usuário pelo email
        Usuario usuario = usuarioRepository.findByEmail(loginRequest.getEmail());

        // 2. Verifica se o usuário existe e se a senha corresponde
        if (usuario != null && passwordEncoder.matches(loginRequest.getSenha(), usuario.getSenha())) {
            // Login bem-sucedido. Retorna os dados do usuário (sem a senha).
            // No futuro, aqui você geraria e retornaria um token JWT.
            usuario.setSenha(null); // Nunca retorne a senha para o frontend
            return ResponseEntity.ok(usuario);
        }

        // 3. Se a autenticação falhar, retorna um erro 401 Unauthorized
        return ResponseEntity.status(401).body("Email ou senha inválidos.");
    }
}
