package upgradeit.rest.api.service;

import org.springframework.stereotype.Service;
import java.util.List;
import upgradeit.rest.api.model.PessoaModel;
import upgradeit.rest.api.repository.IPessoa;

@Service
public class PessoaService {
    private IPessoa repository;

    public PessoaService(IPessoa repository){
        this.repository = repository;
    }

    public List<PessoaModel> listarPessoa(){
        List<PessoaModel> lista = repository.findAll();
        return lista;
    }

    public PessoaModel criarPessoa(PessoaModel pessoa) {
        PessoaModel pessoaNovo = repository.save(pessoa);
        return pessoaNovo;
    }

    public PessoaModel editarPessoa(PessoaModel pessoa) {
        PessoaModel pessoaNovo = repository.save(pessoa);
        return pessoaNovo;
    }

    public Boolean excluirPessoa(Integer CPF) {
        repository.deleteById(CPF);
        return  true;
    }
}
