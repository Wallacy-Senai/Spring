package crudescola.crud_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import crudescola.crud_escola.Model.Administrador;
import crudescola.crud_escola.Repository.AdministradorRepository;


@Controller
public class AdministradorController {

    @Autowired
    private AdministradorRepository ar;

    @PostMapping("cadastro-adm")
    public String postCadastroAdm(Administrador adm) {
        //mensagem de casdatro
        System.out.println("Cadastro realizado com sucesso");
        return "login/login-adm";
    }
    

}
