package upgradeit.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upgradeit.rest.api.model.EmpresaModel;


public interface IEmpresa extends JpaRepository<EmpresaModel, Integer> {
}
