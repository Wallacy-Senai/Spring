// AdministradorRepository.java

package webapp.escola_xyz_b.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_xyz_b.Model.Aluno;


public interface AlunoRepository extends CrudRepository<Aluno, String> {
    //se eu precisar criar algum método extra eu vou criar aqui
    
    Aluno findByCpf(String cpf);
}
