package entrega1;
import java.util.Calendar;

public class HelloWorld {
    private String nome;
    public void setNome(String nome) {
        this.nome = nome;

    }
    public String getNome() {
        return nome;
    }
    public void imprimir() {
        Calendar hs = Calendar.getInstance();
        String hora = hs.get(Calendar.HOUR_OF_DAY) + ":" + hs.get(Calendar.MINUTE) + ":" + hs.get(Calendar.SECOND);

        System.out.println(hora + " - Olá " + this.getNome() + ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns!");
    }

}