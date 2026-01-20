package pe.fact.gestor.tablasmaestras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"pe.fact.gestor"})
@EnableJpaRepositories(basePackages = {"pe.fact.gestor"})
@EntityScan(basePackages = {"pe.fact.gestor"})
public class FactTablasMaestrasApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FactTablasMaestrasApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(FactTablasMaestrasApplication.class, args);
    }

}
