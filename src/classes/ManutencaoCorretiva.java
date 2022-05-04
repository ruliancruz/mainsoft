package classes;

public class ManutencaoCorretiva extends ManutencaoAbstrata {
    private String causaFalha;
    
    public ManutencaoCorretiva()
    {
        
    }
    
    public ManutencaoCorretiva(String equipamento, String responsavel, String dataInicio, String horarioInicio, String dataConclusao, String horarioConclusao, String causaFalha, String descricao)
    {
        this.setEquipamento(equipamento);
        this.setResponsavel(responsavel);
        this.setDataInicio(dataInicio);
        this.setHorarioInicio(horarioInicio);
        this.setDataConclusao(dataConclusao);
        this.setHorarioConclusao(horarioConclusao);
        this.setCausaFalha(causaFalha);
        this.setDescricao(descricao);
    }

    public String getCausaFalha() {
        return causaFalha;
    }

    public void setCausaFalha(String causaFalha) {
        this.causaFalha = causaFalha;
    }
}
