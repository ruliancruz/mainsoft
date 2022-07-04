package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Manutencao
{
    private long id;
    private Equipamento equipamento;
    private Funcionario responsavel;
    private final SimpleDateFormat formatadorDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private Calendar dataInicio = Calendar.getInstance();
    private Calendar dataConclusao = Calendar.getInstance();
    private String descricao;
    private String tipoManutencao;
    private ArrayList <RegistroPeca> registroPeca = new ArrayList<>();

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Funcionario getResponsavel()
    {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel)
    {
        this.responsavel = responsavel;
    }

    public Equipamento getEquipamento()
    {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento)
    {
        this.equipamento = equipamento;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public SimpleDateFormat getFormatadorDataHora() {
        return formatadorDataHora;
    }
    
    public Calendar getDataInicio()
    {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio)
    {
        this.dataInicio = dataInicio;
    }
    
    public String getDataInicioString()
    {
        return String.format("%02d/%02d/%d %02d:%02d", dataInicio.get(Calendar.DAY_OF_MONTH), dataInicio.get(Calendar.MONTH) + 1, dataInicio.get(Calendar.YEAR), dataInicio.get(Calendar.HOUR_OF_DAY), dataInicio.get(Calendar.MINUTE));
    }

    public Calendar getDataConclusao()
    {
        return dataConclusao;
    }
    
    public void setDataConclusao(Calendar dataConclusao)
    {
        this.dataConclusao = dataConclusao;
    }
    
    public String getDataConclusaoString()
    {
        return String.format("%02d/%02d/%d %02d:%02d", dataConclusao.get(Calendar.DAY_OF_MONTH), dataConclusao.get(Calendar.MONTH) + 1, dataConclusao.get(Calendar.YEAR), dataConclusao.get(Calendar.HOUR_OF_DAY), dataConclusao.get(Calendar.MINUTE));
    }

    public String getTipoManutencao()
    {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao)
    {
        this.tipoManutencao = tipoManutencao;
    }
    
    public ArrayList<RegistroPeca> getRegistroPeca()
    {
        return registroPeca;
    }

    public void setRegistroPeca(ArrayList<RegistroPeca> registroPeca)
    {
        this.registroPeca = registroPeca;
    }
}