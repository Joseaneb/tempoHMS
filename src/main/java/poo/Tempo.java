package poo;

public class Tempo {

    private int hora;
    private int minutos;
    private int segundos;

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String toString() {

        return (hora + ":"+ minutos + ":" + segundos);
    }
}
