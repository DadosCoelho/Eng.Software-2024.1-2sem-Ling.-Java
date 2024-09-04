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
        System.out.println("Numero do Quarto: "+getNumeroQuarto());
        System.out.println("Status: "+getStatus());
        System.out.println(" ");
    }

    public void reservar(int numeroQuarto){
        
        if(!getStatus()){
            //this.numeroQuarto = numeroQuarto;
            setNumeroQuarto(numeroQuarto);
            //status = true;
            setStatus(true);
            System.out.println(" ");
            System.out.println("Quarto "+numeroQuarto+" reservado!");
            System.out.println(" ");
        } else {
            System.out.println(" ");
            System.out.println("Quarto "+numeroQuarto+" não pode ser reservado!");
            System.out.println(" ");
        }
    }

    public int getNumeroQuarto(){
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto){
        this.numeroQuarto = numeroQuarto;
    }

    public boolean  getStatus(){
        return status;
    }

    public void setStatus(boolean  status){
        this.status = status;
    }


    public void cancelar(){

        if(getStatus()){
            setStatus(false);
            System.out.println(" ");
            System.out.println("Quarto "+getNumeroQuarto()+" cancelado!");
            System.out.println(" ");
        } else {
            System.out.println(" ");
            System.out.println("Quarto "+getNumeroQuarto()+" não pode ser cancelado!");
            System.out.println(" ");
        }
    }
}
