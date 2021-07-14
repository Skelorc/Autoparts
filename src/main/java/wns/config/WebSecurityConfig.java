package wns.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/","/static/**","/css/**", "/js/**","/images/**","/fonts/**")
                .permitAll()
                .anyRequest().authenticated()
            .and()
                .formLogin()
                .permitAll();

                /*.loginProcessingUrl("/login")*/
                /*.defaultSuccessUrl("/panel_admin")
                .failureForwardUrl("/login")
                .permitAll()
                .and()
                .logout();*/
                    /*.logoutUrl("/logout")
                .deleteCookies("JSESSIONID");*/
    }


}
