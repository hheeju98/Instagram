package site.metacoding.intagram_clone.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity // 해당 파일로 시큐리티를 활성화 시키는 어노테이션
@Configuration // IoC컨테이너로 넣어주는 어노테이션
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests() // 이주소로 요청이 들어오면
                .antMatchers("/", "/user/**", "/image/**", "/subscribe/**", "/comment/**")
                .authenticated() // 인증이 필요하다.
                .anyRequest() // 그 외의 요청들은
                .permitAll() // 모두 허용한다.
                .and() // 그리고
                .formLogin() // 로그인(인증)이 필요한 요청이 들어오면
                .loginPage("/auth/signin") // 로그인페이지 auth/signin 으로 이동시키고
                .defaultSuccessUrl("/"); // 인증이 정삭적으로 완료되면 / 로 이동한다.
    }
}
