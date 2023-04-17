package upgradeit.rest.api.service;


import org.springframework.stereotype.Service;
import upgradeit.rest.api.model.UsuarioModel;
import upgradeit.rest.api.repository.IUsuario;
import java.util.List;

@Service
public class UsuarioService {
    private IUsuario repository;

    public UsuarioService(IUsuario repository){
        this.repository = repository;
    }

    public List<UsuarioModel> listarUsuario(){
        List<UsuarioModel> lista = repository.findAll();
        return lista;
    }

    public UsuarioModel criarUsuario(UsuarioModel usuario) {
        UsuarioModel usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }

    public UsuarioModel editarUsuario(UsuarioModel usuario) {
        UsuarioModel usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }

    public Boolean excluirUsuario(Integer id_OPERADOR) {
        repository.deleteById(id_OPERADOR);
        return  true;
    }
}
