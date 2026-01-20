package dev.pantufa.CadastroDeSangue.Clinica.Model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Embeddable
public class Endereco {

    @NotBlank(message = "O nome da cidade é obrigatório")
    @Size(max = 45, message = "O nome da cidade deve ter no máximo 45 caracteres")
    private String nomeCidade;

    @NotBlank(message = "O nome do bairro é obrigatório")
    @Size(max = 45, message = "O nome do bairro deve ter no máximo 45 caracteres")
    private String nomeBairro;

    @NotBlank(message = "O nome da rua é obrigatório")
    @Size(max = 45, message = "O nome da rua deve ter no máximo 45 caracteres")
    private String nomeRua;

    @NotBlank(message = "O número da rua é obrigatório")
    @Size(max = 30, message = "O número da rua deve ter no máximo 30 caracteres")
    private Integer numeroDaRua;

    @NotBlank(message = "O CEP é obrigatório")
    @Size(max = 9, message = "O CEP deve ter no máximo 9 caracteres")
    @Pattern(regexp = "\\d{5}-\\d{3}", message = "O CEP deve estar no formato XXXXX-XXX")
    private String cep;

    public Endereco(){
    }

    public Endereco(String nomeCidade, String nomeBairro, String nomeRua, String cep){
     this.nomeCidade = nomeCidade;
     this.nomeBairro = nomeBairro;
     this.nomeRua = nomeRua;
     this.cep = cep;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public Integer getNumeroDaRua(){
        return numeroDaRua;
    }

    public void setNumeroDaRua(Integer numeroDaRua){
        this.numeroDaRua = numeroDaRua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
