package ldap_example_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@Configuration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Value("${spring.ldap.embedded.port}")
    private Integer spring_ldap_embedded_port;
    
    
    @RequestMapping("/")
    @ResponseBody
    String root(){
    	return "This is a LDAP server running on port: " +Integer.toString(spring_ldap_embedded_port);
    }
    
}
