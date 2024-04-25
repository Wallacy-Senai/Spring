package webapp.escola_xyz_b.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    
    @GetMapping("/login-professor")
    public String showProfessorLoginPage() {
        return "login/login-professor"; // O nome do arquivo HTML sem a extensão e o prefixo de pasta
    }
}
