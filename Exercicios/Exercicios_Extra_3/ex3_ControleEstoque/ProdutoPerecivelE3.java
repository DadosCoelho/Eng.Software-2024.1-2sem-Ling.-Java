import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class ProdutoPerecivelE3 extends ProdutoE3 {
    private String dataValidade;

    public ProdutoPerecivelE3(String codigo, String nome, double preco, int quantidade, String dataValidade) {
        super(codigo, nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public boolean verificarValidade() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dataValidade = sdf.parse(this.dataValidade);
            return dataValidade.after(new Date());
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }
}

