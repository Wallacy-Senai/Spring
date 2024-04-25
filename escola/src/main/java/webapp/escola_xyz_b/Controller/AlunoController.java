package webapp.escola_xyz_b.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import webapp.escola_xyz_b.Model.Aluno;
import webapp.escola_xyz_b.Repository.AlunoRepository;
import webapp.escola_xyz_b.Repository.VerificaCadastroAlunoRepository;

@Controller
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    VerificaCadastroAlunoRepository verificaCadastroAlunoRepository;

    boolean acessoAluno = false;

    @PostMapping("cadastrar-aluno")
    public String cadastrarAlunoBD(Aluno aluno) {
        boolean verificaMatricula = verificaCadastroAlunoRepository.existsById(aluno.getMatricula());
        if (verificaMatricula) {
            alunoRepository.save(aluno);
            System.out.println("Cadastro Realizado com Sucesso");
        } else {
            System.out.println("Falha ao Cadastrar");
        }
        return "/login/login-aluno";
    }

    @GetMapping("/interna-aluno")
    public String acessoPageInternaAluno() {
        String vaiPara = "";
        if (acessoAluno) {
            vaiPara = "interna/interna-aluno";
        } else {
            vaiPara = "login/login-aluno";
        }
        return vaiPara;
    }

    @PostMapping("acesso-aluno")
    public String acessoAluno(@RequestParam String matricula,
                               @RequestParam String senha) {
        try {
            boolean verificaMatricula = AlunoRepository.existsById(matricula);
            boolean verificaSenha = AlunoRepository.findByMatricula(matricula).getSenha().equals(senha);
            String url = "";
            if (verificaMatricula && verificaSenha) {
                acessoAluno = true;
                url = "redirect:/interna-aluno";
            } else {
                url = "redirect:/login-aluno";
            }
            return url;
        } catch (Exception e) {
            return "redirect:/login-aluno";
        }
    }
}
