//package br.com.forumhub.api.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests(authorizeRequests ->
//                        authorizeRequests
//                                .antMatchers("/login").permitAll() // Permite acesso ao login sem autenticação
//                                .anyRequest().authenticated() // Requer autenticação para qualquer outra requisição
//                )
//                .formLogin(formLogin ->
//                        formLogin
//                                .loginPage("/login") // Define a página de login personalizada
//                                .permitAll()
//                )
//                .logout(logout ->
//                        logout
//                                .permitAll() // Permite acesso ao logout sem autenticação
//                );
//
//        return http.build();
//    }
//
//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager() {
//        var user = User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("password")
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
//}
