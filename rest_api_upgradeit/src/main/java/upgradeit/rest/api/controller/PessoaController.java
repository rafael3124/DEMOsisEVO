package upgradeit.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import upgradeit.rest.api.model.PessoaModel;
import upgradeit.rest.api.service.PessoaService;

@RestController
@RequestMapping ("/pessoas")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;
    public PessoaController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public ResponseEntity <List<PessoaModel>> listaPessoas () {
        return ResponseEntity.status(200).body(pessoaService.listarPessoa());
    }

    @PostMapping
    public  ResponseEntity <PessoaModel> criarPessoa (@RequestBody PessoaModel pessoa){
        return ResponseEntity.status(201).body(pessoaService.criarPessoa(pessoa));
    }
    
    @PutMapping
    public ResponseEntity <PessoaModel> editarPessoa (@RequestBody PessoaModel pessoa){
        return ResponseEntity.status(200).body(pessoaService.editarPessoa(pessoa));
    }
    
    @DeleteMapping ("/{id}")
    public ResponseEntity<?> excluirPessoa (@PathVariable Integer id){
        pessoaService.excluirPessoa(id);
    return ResponseEntity.status(204).build();
    }

}

