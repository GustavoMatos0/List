package list;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {

    private List<Pessoa> lista = new ArrayList<Pessoa>();

    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }

    public boolean add(Pessoa pessoa) {  
        lista.add(pessoa);
        return true;
    }

}
