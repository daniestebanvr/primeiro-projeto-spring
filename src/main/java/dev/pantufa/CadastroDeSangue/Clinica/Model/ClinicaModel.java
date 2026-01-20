package dev.pantufa.CadastroDeSangue.Clinica.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_cadastro_de_clinica")
public class ClinicaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idClinica;

    @NotBlank(message = "O nome da clínica é obrigatório")
    @Size(max = 55, message = "Nome muito grande")
    private String nomeClinica;
    @Embedded
    private Endereco enderecoClinica;

}
