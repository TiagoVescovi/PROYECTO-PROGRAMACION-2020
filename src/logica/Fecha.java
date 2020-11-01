
package logica;

public class Fecha {
    private String mes;
    private int dia;
    private int año;

    public Fecha(int dia, String mes, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }
     
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes =  mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String toString() {
        return dia+"/"+mes+"/"+año;
    }
}
