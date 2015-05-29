package sdp.ratajo.amaderbari.config;
import sdp.ratajo.amaderbari.dao.*;
import sdp.ratajo.amaderbari.dao.search.*;
import org.springframework.jdbc.core.*;

import sdp.ratajo.amaderbari.bll.*; 

import javax.sql.DataSource;

import sdp.ratajo.amaderbari.userpack.dao.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@Configuration
@ComponentScan(basePackages="org.ratajo.amaderbari")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{
 
    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
     
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
 
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/ratajo");
        dataSource.setUsername("ratajo");
        dataSource.setPassword("ratajo");
         
        return dataSource;
    }
    @Bean
    public JdbcTemplate JdbcTemplate()
    {
    	return new JdbcTemplate(getDataSource());
    }
    @Bean
    public UserDAO UserDAO()
    {
		return new UserDAOImpl();
    }
    
    @Bean
    public FlatDao FlatDao(){
    	return new FlatDao();
    }
    @Bean AddressLabelDao AddressLabelDao(){
    	return new AddressLabelDao();
    }
    @Bean 
    AddressDao AddressDao(){
    	return new AddressDao();
    }
    @Bean ImageDao ImageDao(){
    	return new ImageDao();
    }
    
    @Bean
    public AddressFactory AddressFactory() {
        return new AddressFactory();
    }
    
    
    
}