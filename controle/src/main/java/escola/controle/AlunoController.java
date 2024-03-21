package escola.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlunoController {

    @GetMapping("/aluno")
    public String alunoPage() {
        return "aluno";
    }
}
