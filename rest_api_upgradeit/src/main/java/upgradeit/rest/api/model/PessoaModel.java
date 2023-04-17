package upgradeit.rest.api.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "PESSOAS")
public class PessoaModel {

    @Id
    @Column (length = 11, nullable = false)
    private Integer CPF_PE;
    @Column (length = 7, nullable = true)
    private Integer RG_PE;
    @Column (length = 7, nullable = true)
    private Integer RG_EMISSOR;
    @Column (length = 100, nullable = false)
    private String NOME_PE;
    @Column (length = 20, nullable = false)
    private String GENERO_PE;
    @Column ( nullable = false)
    @Temporal(TemporalType.DATE)
    private Date NASCIMENTO;
    @Column (length = 8, nullable = false)
    private Integer CEP_PE;
    @Column (length = 25, nullable = false)
    private String CIDADE_PE;
    @Column (length = 25, nullable = false)
    private String ESTADO_PE;
    @Column (length = 25, nullable = false)
    private String BAIRRO_PE;
    @Column (length = 25, nullable = false)
    private String RUA_PE;
    @Column (length = 10, nullable = false)
    private Integer NUMERO_PE;
    @Column (length = 50, nullable = false)
    private String COMPLEMENTO_PE;
    @Column (length = 14, nullable = false)
    private Integer CONTATO_PES;
    @Column (length = 100, nullable = true)
    private Integer CONTATO_PES_SEC;
    @Column (length = 100, nullable = false)
    private String EMAIL_PES;
    @Column (length = 200, nullable = true)
    private String EMAIL_PES_SEC;
    public Integer getCPF_PE() {
        return CPF_PE;
    }
    public void setCPF_PE(Integer cPF_PE) {
        CPF_PE = cPF_PE;
    }
    public Integer getRG_PE() {
        return RG_PE;
    }
    public void setRG_PE(Integer rG_PE) {
        RG_PE = rG_PE;
    }
    public Integer getRG_EMISSOR() {
        return RG_EMISSOR;
    }
    public void setRG_EMISSOR(Integer rG_EMISSOR) {
        RG_EMISSOR = rG_EMISSOR;
    }
    public String getNOME_PE() {
        return NOME_PE;
    }
    public void setNOME_PE(String nOME_PE) {
        NOME_PE = nOME_PE;
    }
    public String getGENERO_PE() {
        return GENERO_PE;
    }
    public void setGENERO_PE(String gENERO_PE) {
        GENERO_PE = gENERO_PE;
    }
    public Date getNASCIMENTO() {
        return NASCIMENTO;
    }
    public void setNASCIMENTO(Date nASCIMENTO) {
        NASCIMENTO = nASCIMENTO;
    }
    public Integer getCEP_PE() {
        return CEP_PE;
    }
    public void setCEP_PE(Integer cEP_PE) {
        CEP_PE = cEP_PE;
    }
    public String getCIDADE_PE() {
        return CIDADE_PE;
    }
    public void setCIDADE_PE(String cIDADE_PE) {
        CIDADE_PE = cIDADE_PE;
    }
    public String getESTADO_PE() {
        return ESTADO_PE;
    }
    public void setESTADO_PE(String eSTADO_PE) {
        ESTADO_PE = eSTADO_PE;
    }
    public String getBAIRRO_PE() {
        return BAIRRO_PE;
    }
    public void setBAIRRO_PE(String bAIRRO_PE) {
        BAIRRO_PE = bAIRRO_PE;
    }
    public String getRUA_PE() {
        return RUA_PE;
    }
    public void setRUA_PE(String rUA_PE) {
        RUA_PE = rUA_PE;
    }
    public Integer getNUMERO_PE() {
        return NUMERO_PE;
    }
    public void setNUMERO_PE(Integer nUMERO_PE) {
        NUMERO_PE = nUMERO_PE;
    }
    public String getCOMPLEMENTO_PE() {
        return COMPLEMENTO_PE;
    }
    public void setCOMPLEMENTO_PE(String cOMPLEMENTO_PE) {
        COMPLEMENTO_PE = cOMPLEMENTO_PE;
    }
    public Integer getCONTATO_PES() {
        return CONTATO_PES;
    }
    public void setCONTATO_PES(Integer cONTATO_PES) {
        CONTATO_PES = cONTATO_PES;
    }
    public Integer getCONTATO_PES_SEC() {
        return CONTATO_PES_SEC;
    }
    public void setCONTATO_PES_SEC(Integer cONTATO_PES_SEC) {
        CONTATO_PES_SEC = cONTATO_PES_SEC;
    }
    public String getEMAIL_PES() {
        return EMAIL_PES;
    }
    public void setEMAIL_PES(String eMAIL_PES) {
        EMAIL_PES = eMAIL_PES;
    }
    public String getEMAIL_PES_SEC() {
        return EMAIL_PES_SEC;
    }
    public void setEMAIL_PES_SEC(String eMAIL_PES_SEC) {
        EMAIL_PES_SEC = eMAIL_PES_SEC;
    }   
}