// VerificaCadastroAdmRepository.java

package webapp.escola_xyz_b.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_xyz_b.Model.VerificaCadastroAdm;
import java.util.List;


public interface VerificaCadastroAlunoRepository extends CrudRepository<VerificaCadastroAdm,String>{
    VerificaCadastroAdm findByCpf(String cpf);
}
    