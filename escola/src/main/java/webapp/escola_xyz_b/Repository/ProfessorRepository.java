// AdministradorRepository.java

package webapp.escola_xyz_b.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_xyz_b.Model.Professor;


public interface ProfessorRepository extends CrudRepository<Professor, String> {
    //se eu precisar criar algum método extra eu vou criar aqui
    
    Professor findByCpf(String cpf);
}
