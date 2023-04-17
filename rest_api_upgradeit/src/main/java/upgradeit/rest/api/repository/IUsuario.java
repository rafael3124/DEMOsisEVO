package upgradeit.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upgradeit.rest.api.model.UsuarioModel;

public interface IUsuario extends JpaRepository<UsuarioModel, Integer>{
}
