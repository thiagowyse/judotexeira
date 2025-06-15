package com.projetojudo.judotexeira.core.usecases.impl;

import com.projetojudo.judotexeira.core.entities.Usuario;
import com.projetojudo.judotexeira.core.gateway.UsuarioGateWay;
import com.projetojudo.judotexeira.core.usecases.UsuarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class UsuarioUseCaseImpl implements UsuarioUseCase {
    private final UsuarioGateWay gateway;

    @Override
    public Usuario salvar(Usuario usuario) {
        return gateway.salvar(usuario);
    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {
        return gateway.buscarPorId(id);
    }

    @Override
    public Optional<Usuario> buscarPorEmail(String email) {
        return gateway.buscarPorEmail(email);
    }

    @Override
    public List<Usuario> listarTodos() {
        return gateway.listarTodos();
    }

    @Override
    public void deletar(Long id) {
        gateway.deletar(id);
    }
}


