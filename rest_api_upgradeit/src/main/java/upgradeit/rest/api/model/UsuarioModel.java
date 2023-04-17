package upgradeit.rest.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "operadores")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_OPERADOR;
    @Column (length = 200, nullable = false)
    private String NOME_OP;
    @Column (length = 200, nullable = false)
    private String EMAIL_OP;
    @Column (columnDefinition = "TEXT", nullable = false)
    private String SENHA_OP;

    public Integer getId_OPERADOR() {
        return id_OPERADOR;
    }

    public void setId_OPERADOR(Integer id_OPERADOR) {
        this.id_OPERADOR = id_OPERADOR;
    }

    public String getNOME_OP() {
        return NOME_OP;
    }

    public void setNOME_OP(String NOME_OP) {
        this.NOME_OP = NOME_OP;
    }

    public String getEMAIL_OP() {
        return EMAIL_OP;
    }

    public void setEMAIL_OP(String EMAIL_OP) {
        this.EMAIL_OP = EMAIL_OP;
    }

    public String getSENHA_OP() {
        return SENHA_OP;
    }

    public void setSENHA_OP(String SENHA_OP) {
        this.SENHA_OP = SENHA_OP;
    }
}
