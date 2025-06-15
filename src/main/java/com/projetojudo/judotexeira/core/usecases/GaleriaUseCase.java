package com.projetojudo.judotexeira.core.usecases;
import com.projetojudo.judotexeira.core.entities.Galeria;

import java.util.List;
import java.util.Optional;

public interface GaleriaUseCase {

    Galeria salvar(Galeria galeria);
    Optional<Galeria> buscarPorId(Long id);
    List<Galeria> listarTodos();
    void deletar(Long id);
}
