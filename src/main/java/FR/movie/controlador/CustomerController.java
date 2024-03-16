package FR.movie.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class CustomerController {
    /* Probamos 2 endpoints uno con seguridad y otro sin seguridad */
    /* Esto funciona si "comentamos" en el archivo pom.xml
    * la dependencia de "SPRINGBOOT SECURITY", entonces no habrá
    * seguridad en nuestro proyecto.  */

    /* ENDPOINT con Seguridad */
    @GetMapping("/index")
    public String index(){
        return "Aplicando Seguridad";
        //localhost:8080/v1/index
    }

    /* ENDPOINT sin Seguridad */
    @GetMapping("/index2")
    public String index2(){
        return "Not SECURED!";
        //localhost:8080/v1/index2
    }
}
