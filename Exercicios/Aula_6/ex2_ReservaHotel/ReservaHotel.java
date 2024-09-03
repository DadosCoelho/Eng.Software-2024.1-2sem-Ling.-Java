package Exercicios.Aula_6.ex2_ReservaHotel;


public class ReservaHotel {
    
    public String cliente;
    private int numeroQuarto;
    private boolean status;

    public ReservaHotel(String cliente){
        this.cliente = cliente;
    }

    public void detalheReserva(){
        System.out.println(" ");
        System.out.println("Detalhe de reserva de Hotel");
        System.out.println("Cliente: "+cliente);
        System.out.println("Numero do Quarto: "+numeroQuarto);
        System.out.println("Status: "+status);
        System.out.println(" ");
    }

    public void reservar(int numeroQuarto){
        this.numeroQuarto = numeroQuarto;
        status = true;
        System.out.println(" ");
        System.out.println("Quarto "+numeroQuarto+" reservado!");
        System.out.println(" ");
    }

    public void cancelar(){
        status = false;

        System.out.println(" ");
        System.out.println("Quarto "+numeroQuarto+" cancelado!");
        System.out.println(" ");
    }
}
