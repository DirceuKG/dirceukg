package com.alessiojr.demojpa.service;

import com.alessiojr.demojpa.domain.Professor;
import com.alessiojr.demojpa.repository.ProfessorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    private final Logger log = LoggerFactory.getLogger(ProfessorService.class);

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> findAllList(){
        log.debug("Request to get All Professor");
        return professorRepository.findAll();
    }

    public Optional<Professor> findOne(Long id) {
        log.debug("Request to get Professor : {}", id);
        return professorRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete Professor : {}", id);
        professorRepository.deleteById(id);
    }

    public Professor save(Professor professor) {
        log.debug("Request to save Professor : {}", professor);
        professor = professorRepository.save(professor);
        return professor;
    }

    public List<Professor> saveAll(List<Professor> professores) {
        log.debug("Request to save Professor : {}", professores);
        professores = professorRepository.saveAll(professores);
        return professores;
    }
}
