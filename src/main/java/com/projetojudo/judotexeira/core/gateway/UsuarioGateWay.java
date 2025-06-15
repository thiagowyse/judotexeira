package com.projetojudo.judotexeira.core.gateway;

import com.projetojudo.judotexeira.core.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioGateWay {

    Usuario salvar(Usuario usuario);
    Optional<Usuario> buscarPorId(Long id);
    Optional<Usuario> buscarPorEmail(String email);
    List<Usuario> listarTodos();
    void deletar(Long id);
}
