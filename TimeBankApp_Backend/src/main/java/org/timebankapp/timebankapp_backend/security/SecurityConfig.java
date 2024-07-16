import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.http.HttpMethod;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Disable CSRF protection (for stateless applications or APIs)

                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .antMatchers(HttpMethod.GET).permitAll() // Allow all GET requests without authentication
                                .anyRequest().authenticated() // Require authentication for all other requests
                )

                .httpBasic(); // Enable HTTP Basic authentication for APIs

        return http.build(); // Build and return the SecurityFilterChain
    }
}
