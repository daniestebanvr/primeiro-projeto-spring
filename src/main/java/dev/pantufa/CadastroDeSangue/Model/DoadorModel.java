package dev.pantufa.CadastroDeSangue.Model;

import dev.pantufa.CadastroDeSangue.Enums.TipoSanguineo;
import jakarta.persistence.Entity;

@Entity
public class DoadorModel {
    private String nomeDoador;
    private Integer idadeDoador;
    private Long pesoDoador;
    private TipoSanguineo tipoSangue;
}
