package como.adonai.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/cerradura")
public class CerraduraController {

    @Autowired
    private CerraduraService cerraduraService;

    // Endpoint para cerradura de Kleene
    @GetMapping("/kleene")
    public Map<String, String> obtenerKleene(@RequestParam int n) {
        return cerraduraService.kleeneCerradura(n);
    }

    // Endpoint para cerradura positiva
    @GetMapping("/positiva")
    public Map<String, String> obtenerPositiva(@RequestParam int n) {
        return cerraduraService.kleeneClausuraPositiva(n);
    }
}
