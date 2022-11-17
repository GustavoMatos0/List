package list;


import java.util.ArrayList;
import java.util.List;

public class MainPessoa {

    public static void main(String[] args) {
        ListaPessoas l = new ListaPessoas();
        Pessoa p = new Pessoa("Gustavo", "exemplo@gmail.com");
        l.add(p);

        p = new Pessoa("Gustavo", "exemplo@gmail.com"); // sequencia new/add/new/add

        l.add(p);

        List<Pessoa> lista = l.getLista();

        for (Pessoa item : lista) {
            System.out.println(item.toString());
        }
    }

}
