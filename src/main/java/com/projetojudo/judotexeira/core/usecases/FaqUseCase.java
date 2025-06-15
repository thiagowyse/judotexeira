package com.projetojudo.judotexeira.core.usecases;

import com.projetojudo.judotexeira.core.entities.Faq;

import java.util.List;
import java.util.Optional;

public interface FaqUseCase {

    Faq salvar(Faq faq);
    Optional<Faq> buscarPorId(Long id);
    List<Faq> listarTodos();
    void deletar(Long id);
}
