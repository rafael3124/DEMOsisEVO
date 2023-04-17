package upgradeit.rest.api.service;

import org.springframework.stereotype.Service;
import upgradeit.rest.api.model.EmpresaModel;
import upgradeit.rest.api.repository.IEmpresa;
import java.util.List;


@Service
public class EmpresaService {
    private IEmpresa repository;

    public EmpresaService(IEmpresa repository){
        this.repository = repository;
    }

    public List<EmpresaModel> listarEmpresa(){
        List<EmpresaModel> lista = repository.findAll();
        return lista;
    }

    public EmpresaModel criarEmpresa(EmpresaModel empresa) {
        EmpresaModel empresaNovo = repository.save(empresa);
        return empresaNovo;
    }

    public EmpresaModel editarEmpresa(EmpresaModel empresa) {
        EmpresaModel empresaNovo = repository.save(empresa);
        return empresaNovo;
    }

    public Boolean excluirEmpresa(Integer CPF) {
        repository.deleteById(CPF);
        return  true;
    }
}
