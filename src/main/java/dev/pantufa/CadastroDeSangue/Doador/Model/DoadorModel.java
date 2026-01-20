package dev.pantufa.CadastroDeSangue.Doador.Model;

import dev.pantufa.CadastroDeSangue.Doador.Model.Enums.TipoSanguineo;
import jakarta.persistence.*;

@Entity //Essa anotação transforma uma classe em uma entidade no BD
@Table(name = "tb_cadastro_de_doador")
public class DoadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDoador;
    private String nomeDoador;
    private Integer idadeDoador;
    private Long pesoDoador;
    private TipoSanguineo tipoSangue;

    public DoadorModel(){
    }

    public DoadorModel(String nomeDoador, Integer idadeDoador, Long pesoDoador,TipoSanguineo tipoSangue){
        this.nomeDoador = nomeDoador;
        this.idadeDoador = idadeDoador;
        this.pesoDoador = pesoDoador;
        this.tipoSangue = tipoSangue;
    }

    public Long getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(Long idDoador) {
        this.idDoador = idDoador;
    }

    public String getNomeDoador() {
        return nomeDoador;
    }

    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }

    public Integer getIdadeDoador() {
        return idadeDoador;
    }

    public void setIdadeDoador(Integer idadeDoador) {
        this.idadeDoador = idadeDoador;
    }

    public Long getPesoDoador() {
        return pesoDoador;
    }

    public void setPesoDoador(Long pesoDoador) {
        this.pesoDoador = pesoDoador;
    }

    public TipoSanguineo getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(TipoSanguineo tipoSangue) {
        this.tipoSangue = tipoSangue;
    }
}
