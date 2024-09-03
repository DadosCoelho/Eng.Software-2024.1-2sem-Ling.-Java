package Exercicios.Aula_6.ex2_ReservaHotel;


public class Main {
    public static void main(String[] args) {
        ReservaHotel cliente1 = new ReservaHotel("Reinaldo");

        cliente1.detalheReserva();
        cliente1.reservar(1);
        
        cliente1.detalheReserva();

        cliente1.cancelar();
        cliente1.detalheReserva();

    }
}
