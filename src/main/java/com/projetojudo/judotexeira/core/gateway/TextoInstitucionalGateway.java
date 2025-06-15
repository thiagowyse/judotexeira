package com.projetojudo.judotexeira.core.gateway;

import com.projetojudo.judotexeira.core.entities.TextoInstitucional;

import java.util.List;
import java.util.Optional;

public interface TextoInstitucionalGateway {
    TextoInstitucional salvar(TextoInstitucional texto);
    Optional<TextoInstitucional> buscarPorTipo(String tipo);
    List<TextoInstitucional> listarTodos();
    void deletar(Long id);
}
