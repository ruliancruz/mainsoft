package Classes;
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private boolean bissexto;
    private boolean valida;
    
    public Data(int dia, int mes, int ano) {
        if(ano % 4 == 0) {
            if(ano % 100 == 0) {
                if(ano % 400 == 0) {
                    bissexto = true;
                } else {
                    bissexto = false;
                }
            } else {
                bissexto = true;
            }
        } else {
            bissexto = false;
        }
        // data válida se a quantidade de dias faz jus ao mês, em relação ao fevereiro, se faz jus quando é e não bissexto
        if((dia > 0 && dia <= 31) && ano > 0) {
            // se o ano é bissexto, fevereiro tem 29 dias, caso contrário, tem 28
            // os meses 4, 6, 9 e 11 possuem 30 dias, o restante, 31
            if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) ||
                    ((mes == 2 && !bissexto && dia <= 28) || (mes == 2 && bissexto && dia <= 29)) ||
                        ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30)) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
                valida = true;
            } else {
                valida = false;
            }
        } else {
            valida = false;
        }
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public boolean getBissexto() {
        return bissexto;
    }
    
    public boolean getValida() {
        return valida;
    }
}