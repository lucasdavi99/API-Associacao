package service;

import entity.Residencia;
import repository.ResidenciaRepository;
import repository.RepositorioGenerico;

import java.util.List;

public class ResidenciaService {
    private RepositorioGenerico<Residencia> repositorio;

    public ResidenciaService() {
        this.repositorio = new ResidenciaRepository();
    }

    public Residencia cadastrarResidencia(String endereco, boolean disponibilidade, int id) {
        Residencia residencia = new Residencia(endereco, disponibilidade, id);
        return repositorio.inserir(residencia);
    }

    public Residencia alterarResidencia(Residencia residencia) {
        return repositorio.alterar(residencia);
    }

    public Residencia excluirResidencia(Residencia residencia) {
        return repositorio.excluir(residencia);
    }

    public List<Residencia> consultarResidencia(Residencia residencia) {
        return repositorio.consultar(residencia);
    }
}
