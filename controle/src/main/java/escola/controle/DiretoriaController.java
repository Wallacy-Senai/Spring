package escola.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiretoriaController {

    @GetMapping("/diretoria")
    public String diretoriaPage() {
        return "diretoria";
    }
}
