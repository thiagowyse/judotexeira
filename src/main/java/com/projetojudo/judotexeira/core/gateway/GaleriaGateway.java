package com.projetojudo.judotexeira.core.gateway;

import com.projetojudo.judotexeira.core.entities.Galeria;

import java.util.List;
import java.util.Optional;

public interface GaleriaGateway {
    Galeria salvar(Galeria galeria);
    Optional<Galeria> buscarPorId(Long id);
    List<Galeria> listarTodos();
    void deletar(Long id);
}
