package com.evgeniykudashov.adservice.configuration;

import com.evgeniykudashov.adservice.security.jwt.BearerAuthenticationFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;

import java.util.List;


@Configuration
public class SecurityComponentConfiguration {

    @Bean
    public AuthenticationManager authenticationManagerBean(List<AuthenticationProvider> providers) {
        return new ProviderManager(providers);
    }

    @Bean
    public FilterRegistrationBean<BearerAuthenticationFilter> filterFilterRegistrationBean(AuthenticationManager manager) {
        FilterRegistrationBean<BearerAuthenticationFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new BearerAuthenticationFilter(manager));
        return filterFilterRegistrationBean;
    }
}
