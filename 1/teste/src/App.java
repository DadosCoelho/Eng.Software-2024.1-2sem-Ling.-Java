public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World, Boy!");

        String primeiroNome = "Reinaldo";
        String segundoNome = " Fernandes Coelho";
        String nomeCompleto = primeiroNome + " " + segundoNome;
        System.out.println(nomeCompleto);
        System.out.println(nomeCompleto.toUpperCase()); //Deixar as letras maiusculas
        System.out.println(nomeCompleto.toLowerCase()); //Deixar as letras minusculas


        String myStr = "Hello %s! %,d kilobyte is %,d bytes.";
        String result = String.format(myStr, nomeCompleto, 1, 1024);
        System.out.println(result);
        System.out.println("hello world");
    }
    
}
