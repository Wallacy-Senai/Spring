package crudescola.crud_escola.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SuppressWarnings("unused")
@Controller

public class IndexController {
    @GetMapping("/")
    public String acessoHome(){
        return "index";
    }

    @GetMapping("/home")
    public String acessoHome2(){
        return "index";
    }

    @GetMapping("/login-adm")
    public String acessoLoginAdm(){
        return "login/login-adm";
    }

}
