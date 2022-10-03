package br.rpinfo.challenge.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.sql.*;

@SpringBootApplication
@EnableWebMvc
public class ServiceOrderWsApplication{

	//Estabelece a conbexão com o h2, criando o database e executando a aplicação
	public static void main(String[] args) throws SQLException {

    	Connection conn = DriverManager.getConnection("jdbc:h2:mem:rpinfodb", "sa", "password");
	
		SpringApplication.run(ServiceOrderWsApplication.class, args);

    	conn.close();
        
	}

}
