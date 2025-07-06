package PratoPronto.back.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Habilita a configuração de CORS que definimos no método abaixo
            .cors(cors -> cors.configurationSource(corsConfigurationSource()))
            
            // Desabilita a proteção CSRF, que não é tipicamente necessária para APIs REST
            .csrf(csrf -> csrf.disable())
            
            // Define as regras de autorização para os endpoints
            .authorizeHttpRequests(authorize -> authorize
                // Por enquanto, permite acesso a QUALQUER requisição sem autenticação
                // para facilitar os testes.
                .anyRequest().permitAll() 
            );

        return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        // Define a origem do seu frontend que tem permissão para acessar a API
        configuration.setAllowedOrigins(List.of("http://localhost:5173")); 
        // Define os métodos HTTP permitidos (GET, POST, etc.)
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        // Permite todos os tipos de cabeçalhos na requisição
        configuration.setAllowedHeaders(List.of("*"));
        // Permite o envio de credenciais (como cookies)
        configuration.setAllowCredentials(true); 

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // Aplica esta configuração a todos os endpoints ("/**") da sua aplicação
        source.registerCorsConfiguration("/**", configuration); 
        return source;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // Define o BCrypt como o algoritmo para codificar e verificar senhas
        return new BCryptPasswordEncoder();
    }
}