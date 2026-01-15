package dev.pantufa.CadastroDeSangue.Enums;

public enum TipoSanguineo {
    A_POSITIVO("A+"),
    A_NEGATIVO("A-"),
    B_POSITIVO("B+"),
    B_NEGATIVO("B-"),
    AB_POSTIVO("AB+"),
    AB_NEGATIVO("AB-"),
    O_POSITIVO("O+"),
    O_NEGATIVO("O-");

    private final String label;

    TipoSanguineo(String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}
