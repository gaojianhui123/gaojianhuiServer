package com.gaojianhui.framework.config;

import com.gaojianhui.framework.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.gaojianhui.framework.security.JwtAuthenticationEntryPoint;
import com.gaojianhui.framework.security.JwtAuthenticationTokenFilter;


@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
    private JwtAuthenticationEntryPoint unauthorizedHandler;

//    @Bean
//    public JwtAuthenticationTokenFilter authenticationTokenFilterBean() throws Exception {
//        return new JwtAuthenticationTokenFilter();
//    }
	@Autowired
    private JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;
	@Autowired
	private CustomAccessDeniedHandler customAccessDeniedHandler;
    @Bean
	public PasswordEncoder passwordEncoder(){
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}
    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    
    @Autowired
	private UserService userDetailsService;
    @Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
    
	@Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.headers().frameOptions().disable();             //解决 X-Frame-Options 嵌入时会无法加载，在同域名页面中同样会无法加载。
        httpSecurity
        // we don't need CSRF because our token is invulnerable
        .csrf().disable()

        .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()

        // don't create session
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()

        .authorizeRequests()
        .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
        .antMatchers(
        		    "/",
        		    "/fontawesome*",
        		    "/assets/**",
        		    "/**/noLimit_*/**",
        		    "/wxLogin/login",
        		    "/user/auth",
        		    "/file/upload",
                "/*.html",
                "/favicon.ico",
                "/**/*.html",
                "/**/*.css",
                "/imgs/**",
                "/**/*.js").permitAll()
        .antMatchers("/uploadimg").permitAll()
//        .antMatchers("/gateway/user/registerParent").permitAll()
//        .anyRequest().hasAuthority("SOME_ROLE");
        .anyRequest().access("@sanyiSecurity.check(authentication,request)").and().exceptionHandling().accessDeniedHandler(customAccessDeniedHandler);//使用自定义授权策略
//        .anyRequest().authenticated();
		
        httpSecurity
                .addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);
//       httpSecurity.addFilterAfter(permissionFilter, UsernamePasswordAuthenticationFilter.class);
        httpSecurity.headers().cacheControl();
    } 
}