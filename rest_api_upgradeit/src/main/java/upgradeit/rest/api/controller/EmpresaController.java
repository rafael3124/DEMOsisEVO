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

import upgradeit.rest.api.model.EmpresaModel;
import upgradeit.rest.api.service.EmpresaService;

@RestController
@RequestMapping ("/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaService usuarioService;
    
    public EmpresaController(EmpresaService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity <List<EmpresaModel>> listaUsuarios () {
        return ResponseEntity.status(200).body(usuarioService.listarEmpresa());
    }

    @PostMapping
    public  ResponseEntity <EmpresaModel> criarUsuario (@RequestBody EmpresaModel usuario){
        return ResponseEntity.status(201).body(usuarioService.criarEmpresa(usuario));
    }
    
    @PutMapping
    public ResponseEntity <EmpresaModel> editarUsuario (@RequestBody EmpresaModel usuario){
        return ResponseEntity.status(200).body(usuarioService.editarEmpresa(usuario));
    }
    
    @DeleteMapping ("/{id}")
    public ResponseEntity<?> excluirUsuario (@PathVariable Integer id){
        usuarioService.excluirEmpresa(id);
    return ResponseEntity.status(204).build();
    }

}   