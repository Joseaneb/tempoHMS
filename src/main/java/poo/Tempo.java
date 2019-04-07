package poo;

public class Tempo {

    private int hora;
    private int minutos;
    private int segundos;

    public Tempo(Tempo objeto){

    }

    public Tempo(int segundos){

    }
    public Tempo(int hora, int minutos, int segundos){

        horaCerta(testarHora(hora, minutos, segundos), hora, minutos, segundos);
    }

    public long toSeconds(){

        return ((hora * (60 * 60)) + (minutos * 60) + segundos);
    }

    public long diferenca(Tempo objeto){

        return (((objeto.hora * (60 * 60)) + (objeto.minutos * 60) + objeto.segundos) - ((hora * (60 * 60))
                + (minutos * 60) + segundos));
    }


    public boolean setFullHora(int hora, int minutos, int segundos) {

        if (testarHora(hora, minutos, segundos) == true) {

            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
            return true;
        } else {

            return false;
        }
    }

    /**
     * Seta Hora
     *
     * @param hora
     *
     */

    public boolean setHora(int hora) {
        if (testarHora(hora, 1, 1) == true){

            this.hora = hora;
            return true;
        } else {

            return false;
        }
    }
    public boolean setMinuto(int minutos) {

        if (testarHora(1, minutos, 1) == true) {

            this.minutos = minutos;
            return true;
        } else {

            return false;
        }
    }

    public boolean setSegundos(int segundos){

        if (testarHora(1, 1, segundos) == true){

            this.segundos = segundos;
            return true;
        } else {

            return false;
        }
    }
    /**
     * Testa Hora, Minutos e Segundos, se estiver dentro do parametro indicado no "if" retorna true, "else" false
     * @param hora para Hora maior e igual a 0 e menor e igual a 23 true
     * @param minutos para Minutos maior e igual a 0 e menor e igual a 59 true
     * @param segundos para Minutos maior e igual a 0 e menor e igual a 59 true
     * @return false se não estiver dentro dos parametros indicados
     */
    public boolean testarHora(int hora, int minutos, int segundos){
        if ((hora >= 0) && (hora <= 23) && (minutos >= 0) && (minutos <= 59) && (segundos >= 0) && (segundos <= 59)){
            return true;

        }else {
            return false;
        }

    }

    /**
     * Se informada Hora, Minutos ou Segundos corretos, apresenta os valores
     * Se informada Hora ou Minutos ou Segundo errados, apresenta 0, 0, 0
     * @param certa indicará true ou false
     * @param hora indicará Hora
     * @param minutos indicará Minutos
     * @param segundos indicará Segundos
     */

    public void horaCerta(boolean certa, int hora, int minutos, int segundos){
        if(certa == true) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;



        }
    }

    /**
     * Apresenta os valores de Hora, Minutos e Segundos
     * @return valores de Hora, Minutos e Segundos
     */
    public String toString() {

        return (hora + ":"+ minutos + ":" + segundos);
    }
}
