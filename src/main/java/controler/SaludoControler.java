package controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoControler {

    @GetMapping("/hola")
    public String holaMundo(){

        return "Hola";
    }
}
