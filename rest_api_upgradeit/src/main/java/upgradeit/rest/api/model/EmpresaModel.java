package upgradeit.rest.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "EMPRESAS")
public class EmpresaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_EMPRESA;
    @Column (length = 14, nullable = false)
    private Integer CNPJ;
    @Column (length = 50, nullable = false)
    private String NOME_EM;
    @Column (length = 50, nullable = false)
    private String NOME_FANTASIA_EMP;
    @Column (length = 200, nullable = true)
    private String OBS_EMP;
    @Column(length = 8, nullable = false)
    private Integer CEP_EMP;
    @Column(length = 25, nullable = false)
    private String CIDADE_EMP;
    @Column(length = 25, nullable = false)
    private String ESTADO_EMP;
    @Column(length = 25, nullable = false)
    private String BAIRRO_EMP;
    @Column(length = 25, nullable = false)
    private String RUA_EMP;
    @Column(length = 10, nullable = false)
    private Integer NUMERO_EMP;
    @Column(length = 50, nullable = false)
    private String COMPLEMENTO_EMP;
    @Column(length = 14, nullable = false)
    private Integer CONTATO_EMP;
    @Column(length = 100, nullable = true)
    private Integer CONTATO_EMP_SEC;
    @Column(length = 100, nullable = false)
    private String EMAIL_EMP;
    @Column(length = 200, nullable = true)
    private String EMAIL_EMP_SEC;
    public Integer getId_EMPRESA() {
        return id_EMPRESA;
    }
    public void setId_EMPRESA(Integer id_EMPRESA) {
        this.id_EMPRESA = id_EMPRESA;
    }
    public Integer getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(Integer cNPJ) {
        CNPJ = cNPJ;
    }
    public String getNOME_EM() {
        return NOME_EM;
    }
    public void setNOME_EM(String nOME_EM) {
        NOME_EM = nOME_EM;
    }
    public String getNOME_FANTASIA_EMP() {
        return NOME_FANTASIA_EMP;
    }
    public void setNOME_FANTASIA_EMP(String nOME_FANTASIA_EMP) {
        NOME_FANTASIA_EMP = nOME_FANTASIA_EMP;
    }
    public String getOBS_EMP() {
        return OBS_EMP;
    }
    public void setOBS_EMP(String oBS_EMP) {
        OBS_EMP = oBS_EMP;
    }
    public Integer getCEP_EMP() {
        return CEP_EMP;
    }
    public void setCEP_EMP(Integer cEP_EMP) {
        CEP_EMP = cEP_EMP;
    }
    public String getCIDADE_EMP() {
        return CIDADE_EMP;
    }
    public void setCIDADE_EMP(String cIDADE_EMP) {
        CIDADE_EMP = cIDADE_EMP;
    }
    public String getESTADO_EMP() {
        return ESTADO_EMP;
    }
    public void setESTADO_EMP(String eSTADO_EMP) {
        ESTADO_EMP = eSTADO_EMP;
    }
    public String getBAIRRO_EMP() {
        return BAIRRO_EMP;
    }
    public void setBAIRRO_EMP(String bAIRRO_EMP) {
        BAIRRO_EMP = bAIRRO_EMP;
    }
    public String getRUA_EMP() {
        return RUA_EMP;
    }
    public void setRUA_EMP(String rUA_EMP) {
        RUA_EMP = rUA_EMP;
    }
    public Integer getNUMERO_EMP() {
        return NUMERO_EMP;
    }
    public void setNUMERO_EMP(Integer nUMERO_EMP) {
        NUMERO_EMP = nUMERO_EMP;
    }
    public String getCOMPLEMENTO_EMP() {
        return COMPLEMENTO_EMP;
    }
    public void setCOMPLEMENTO_EMP(String cOMPLEMENTO_EMP) {
        COMPLEMENTO_EMP = cOMPLEMENTO_EMP;
    }
    public Integer getCONTATO_EMP() {
        return CONTATO_EMP;
    }
    public void setCONTATO_EMP(Integer cONTATO_EMP) {
        CONTATO_EMP = cONTATO_EMP;
    }
    public Integer getCONTATO_EMP_SEC() {
        return CONTATO_EMP_SEC;
    }
    public void setCONTATO_EMP_SEC(Integer cONTATO_EMP_SEC) {
        CONTATO_EMP_SEC = cONTATO_EMP_SEC;
    }
    public String getEMAIL_EMP() {
        return EMAIL_EMP;
    }
    public void setEMAIL_EMP(String eMAIL_EMP) {
        EMAIL_EMP = eMAIL_EMP;
    }
    public String getEMAIL_EMP_SEC() {
        return EMAIL_EMP_SEC;
    }
    public void setEMAIL_EMP_SEC(String eMAIL_EMP_SEC) {
        EMAIL_EMP_SEC = eMAIL_EMP_SEC;
    }

    
}
