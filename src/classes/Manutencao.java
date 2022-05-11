package classes;

import java.util.ArrayList;
//import java.util.Calendar;

public class Manutencao {
    private long id;
    private String equipamento; //private Equipamento equipamento;
    private String responsavel; //private Responsavel responsavel;
    private String dataInicio; //private Calendar dataInicio;
    private String horarioInicio; //private Calendar horarioInicio;
    private String dataConclusao; //private Calendar dataConclusao;
    private String horarioConclusao; //private Calendar horarioConclusao;
    private String dataAgendamento; //private Calendar dataAgendamento;
    private String horarioAgendamento; //private Calendar horarioAgendamento;
    private String periodicidade; //private int periodicidade;
    private String causaFalha; 
    private String descricao;
    private String tipoManutencao;
    private ArrayList <RegistroPeca> registroPeca = new ArrayList<RegistroPeca>();
    
    public Manutencao(String equipamento, String responsavel, String dataInicio, String horarioInicio, String dataConclusao, String horarioConclusao, String dataAgendamento, String horarioAgendamento, String periodicidade, String causaFalha, String descricao, String tipoManutencao) {
        this.equipamento = equipamento;
        this.responsavel = responsavel;
        this.dataInicio = dataInicio;
        this.horarioInicio = horarioInicio;
        this.dataConclusao = dataConclusao;
        this.horarioConclusao = horarioConclusao;
        this.dataAgendamento = dataAgendamento;
        this.horarioAgendamento = horarioAgendamento;
        this.periodicidade = periodicidade;
        this.causaFalha = causaFalha;
        this.descricao = descricao;
        this.tipoManutencao = tipoManutencao;
    }
    
//    public Manutencao(Equipamento equipamento, Responsavel responsavel, Calendar dataInicio, Calendar horarioInicio, Calendar dataConclusao, Calendar horarioConclusao, Calendar dataAgendamento, Calendar horarioAgendamento, int periodicidade, String causaFalha, String descricao, String tipoManutencao) {
//        this.equipamento = equipamento;
//        this.responsavel = responsavel;
//        this.dataInicio = dataInicio;
//        this.horarioInicio = horarioInicio;
//        this.dataConclusao = dataConclusao;
//        this.horarioConclusao = horarioConclusao;
//        this.dataAgendamento = dataAgendamento;
//        this.horarioAgendamento = horarioAgendamento;
//        this.periodicidade = periodicidade;
//        this.causaFalha = causaFalha;
//        this.descricao = descricao;
//        this.tipoManutencao = tipoManutencao;
//    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getResponsavel() {
        return responsavel;
    }
    
//    public Funcionario getResponsavel() {
//        return responsavel;
//    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
//    public void setResponsavel(Funcionario responsavel) {
//        this.responsavel = responsavel;
//    }

    public String getEquipamento() {
        return equipamento;
    }
    
//    public Equipamento getEquipamento() {
//        return equipamento;
//    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
    
//    public void setEquipamento(Equipamento equipamento) {
//        this.equipamento = equipamento;
//    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }
    
//    public Calendar getDataInicio() {
//        return dataInicio;
//    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    
//    public void setDataInicio(Calendar dataInicio) {
//        this.dataInicio = dataInicio;
//    }

    public String getDataConclusao() {
        return dataConclusao;
    }
    
//    public Calendar getDataConclusao() {
//        return dataConclusao;
//    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
    
//    public void setDataConclusao(Calendar dataConclusao) {
//        this.dataConclusao = dataConclusao;
//    }

    public String getHorarioInicio() {
        return horarioInicio;
    }
    
//    public Calendar getHorarioInicio() {
//        return horarioInicio;
//    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }
    
//    public void setHorarioInicio(Calendar horarioInicio) {
//        this.horarioInicio = horarioInicio;
//    }

    public String getHorarioConclusao() {
        return horarioConclusao;
    }
    
//    public Calendar getHorarioConclusao() {
//        return horarioConclusao;
//    }

    public void setHorarioConclusao(String horarioConclusao) {
        this.horarioConclusao = horarioConclusao;
    }
    
//    public void setHorarioConclusao(Calendar horarioConclusao) {
//        this.horarioConclusao = horarioConclusao;
//    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }
    
//    public Calendar getDataAgendamento() {
//        return dataAgendamento;
//    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }
    
//    public void setDataAgendamento(Calendar dataAgendamento) {
//        this.dataAgendamento = dataAgendamento;
//    }

    public String getHorarioAgendamento() {
        return horarioAgendamento;
    }
    
//    public Calendar getHorarioAgendamento() {
//        return horarioAgendamento;
//    }

    public void setHorarioAgendamento(String horarioAgendamento) {
        this.horarioAgendamento = horarioAgendamento;
    }
    
//    public void setHorarioAgendamento(Calendar horarioAgendamento) {
//        this.horarioAgendamento = horarioAgendamento;
//    }

    public String getPeriodicidade() {
        return periodicidade;
    }
    
//    public int getPeriodicidade() {
//        return periodicidade;
//    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
    
//    public void setPeriodicidade(int periodicidade) {
//        this.periodicidade = periodicidade;
//    }

    public String getCausaFalha() {
        return causaFalha;
    }

    public void setCausaFalha(String causaFalha) {
        this.causaFalha = causaFalha;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }
    
    public ArrayList<RegistroPeca> getRegistroPeca() {
        return registroPeca;
    }

    public void setRegistroPeca(ArrayList<RegistroPeca> registroPeca) {
        this.registroPeca = registroPeca;
    }
}