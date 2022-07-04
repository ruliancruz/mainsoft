package classes;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManutencaoCorretiva extends Manutencao
{
    private String causaFalha;
    
    public ManutencaoCorretiva(Equipamento equipamento, Funcionario responsavel, String dataInicio, String dataConclusao, String causaFalha, String descricao)
    {
        setEquipamento(equipamento);
        setResponsavel(responsavel);
                
        try
        {
            getDataInicio().setTime(getFormatadorDataHora().parse(dataInicio));
        }
        catch (ParseException ex)
        {
            Logger.getLogger(ManutencaoCorretiva.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try
        {
            getDataConclusao().setTime(getFormatadorDataHora().parse(dataConclusao));
        }
        catch (ParseException ex)
        {
            Logger.getLogger(ManutencaoCorretiva.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.causaFalha = causaFalha;
        setDescricao(descricao);
        setTipoManutencao("Corretiva");
    }

    public String getCausaFalha()
    {
        return causaFalha;
    }

    public void setCausaFalha(String causaFalha)
    {
        this.causaFalha = causaFalha;
    }
}