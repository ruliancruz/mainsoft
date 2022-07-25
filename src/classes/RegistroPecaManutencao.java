package classes;

import java.io.Serializable;

public class RegistroPecaManutencao implements Serializable
{
    private long id;
    private String nome;
    private String alteracao;
    private long idPeca; //private Peca peca;
    private long idPecaSubstituida; //private Peca peca;
}