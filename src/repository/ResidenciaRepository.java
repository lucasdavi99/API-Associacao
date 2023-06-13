package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Residencia;

public class ResidenciaRepository implements RepositorioGenerico<Residencia> {

    private List<Residencia> lista;

    public ResidenciaRepository() {
        this.lista = new ArrayList<>();
    }

    @Override
    public Residencia inserir(Residencia residencia) {
        lista.add(residencia);
        return residencia;
    }

    @Override
    public Residencia alterar(Residencia residencia) {
        // Implemente a lógica de alteração aqui
        return residencia;
    }

    @Override
    public Residencia excluir(Residencia residencia) {
        lista.remove(residencia);
        return residencia;
    }

    @Override
    public List<Residencia> consultar(Residencia residencia) {
        List<Residencia> resultado = new ArrayList<>();
        for (Residencia item : lista) {
            if (item.equals(residencia)) {
                resultado.add(item);
            }
        }
        return resultado;
    }
}
