package com.apihexa.springboot.rest.example.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
/**
 * Reference : <a href="https://support.intershop.com/kb/index.php/Display/2914L4">...</a>
 */
@OpenAPIDefinition(
        info = @Info(
                description = "Awesome Resources",
                version = "V12.0.12",
                title = "Awesome Resource API",
                contact = @Contact(
                        name = "Rajesh Balasekarab",
                        email = "rajeshb6@hexaware.com",
                        url = "http://hexaware.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        servers = {@Server(url = "http://hexaware.com")}
)
public interface ApiDocumentationConfig {

}