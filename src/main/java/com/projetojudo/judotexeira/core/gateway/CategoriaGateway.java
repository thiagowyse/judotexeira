package com.projetojudo.judotexeira.core.gateway;

import com.projetojudo.judotexeira.core.entities.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaGateway {
    Categoria salvar(Categoria categoria);
    Optional<Categoria> buscarPorId(Long id);
    Optional<Categoria> buscarPorNome(String nome);
    List<Categoria> listarTodas();
    void deletar(Long id);
}
