package upgradeit.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import upgradeit.rest.api.model.UsuarioModel;
import upgradeit.rest.api.service.UsuarioService;

import java.util.List;


@RestController
@RequestMapping ("/operadores")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity <List<UsuarioModel>> listaUsuarios () {
        return ResponseEntity.status(200).body(usuarioService.listarUsuario());
    }

    @PostMapping
    public  ResponseEntity <UsuarioModel> criarUsuario (@RequestBody UsuarioModel usuario){
        return ResponseEntity.status(201).body(usuarioService.criarUsuario(usuario));
    }
    
    @PutMapping
    public ResponseEntity <UsuarioModel> editarUsuario (@RequestBody UsuarioModel usuario){
        return ResponseEntity.status(200).body(usuarioService.editarUsuario(usuario));
    }
    
    @DeleteMapping ("/{id}")
    public ResponseEntity<?> excluirUsuario (@PathVariable Integer id){
        usuarioService.excluirUsuario(id);
    return ResponseEntity.status(204).build();
    }

}
