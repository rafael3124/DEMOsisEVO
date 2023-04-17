package upgradeit.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upgradeit.rest.api.model.PessoaModel;


public interface IPessoa extends JpaRepository<PessoaModel, Integer> {
}
