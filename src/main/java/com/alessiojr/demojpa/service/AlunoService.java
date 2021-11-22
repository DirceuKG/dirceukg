package com.alessiojr.demojpa.service;

import com.alessiojr.demojpa.domain.Aluno;
import com.alessiojr.demojpa.repository.AlunoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final Logger log = LoggerFactory.getLogger(AlunoService.class);

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> findAllList(){
        log.debug("Request to get All Aluno");
        return alunoRepository.findAll();
    }

    public Optional<Aluno> findOne(Long id) {
        log.debug("Request to get Aluno : {}", id);
        return alunoRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete Aluno : {}", id);
        alunoRepository.deleteById(id);
    }

    public Aluno save(Aluno aluno) {
        log.debug("Request to save Aluno : {}", aluno);
        aluno = alunoRepository.save(aluno);
        return aluno;
    }

    public List<Aluno> saveAll(List<Aluno> alunos) {
        log.debug("Request to save Aluno : {}", alunos);
        alunos = alunoRepository.saveAll(alunos);
        return alunos;
    }
}
