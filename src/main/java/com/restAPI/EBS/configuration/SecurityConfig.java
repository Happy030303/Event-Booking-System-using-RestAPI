package com.restAPI.EBS.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig
{
    @Autowired
    private CustomeUsersDetailService customeUsersDetailService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder(6); // 6 is the strength parameter
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        http.csrf(csrf -> csrf.disable())
                    .authorizeHttpRequests(auth -> auth
                            .requestMatchers("/db/**").hasRole("ADMIN") // hasRole() method automatially adds "ROLE_" in hasRole() method parameter, because spring understand only this.
                            .requestMatchers("/admin/**").hasRole("ADMIN") // hasRole() method automatially adds "ROLE_" in hasRole() method parameter, because spring understand only this.
                            .requestMatchers("/public/**").permitAll()
                            .anyRequest().authenticated()) // all other url will need authentication
//                    .formLogin(form -> form.permitAll())
                  .httpBasic(Customizer.withDefaults()) // it is used when you want to use "basic auth" from "postman" to send credentials.
                    .logout(logout -> logout.permitAll())
        ;

        return http.build();
    }

    @Bean
    public AuthenticationProvider authenticatingUser()
    {
        DaoAuthenticationProvider dao = new DaoAuthenticationProvider();
        dao.setUserDetailsService(customeUsersDetailService);
        dao.setPasswordEncoder(new BCryptPasswordEncoder(6));

        return dao;
    }

//    @Bean
//    public UserDetailsService inMemoryStoringCredential()
//    {
//        UserDetails u1 = User.withDefaultPasswordEncoder().username("karan").password("karan").roles("USER").build();
//        UserDetails u2 = User.withDefaultPasswordEncoder().username("happy").password("happy").roles("ADMIN").build();
//
//        return new InMemoryUserDetailsManager(u1, u2);
//    }
}
