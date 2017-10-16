package test.health.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.actuate.endpoint.mvc.AbstractMvcEndpoint;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Configuration
public class ManagementEndPoint extends AbstractMvcEndpoint {

    public ManagementEndPoint(){
        super("/internal-greetings", false);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getInternalGreetings() {
        return "Hello Management";
    }

}