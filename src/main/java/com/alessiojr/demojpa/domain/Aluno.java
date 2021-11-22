package com.alessiojr.demojpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "table_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Instant dataNascimento;
    private String cpf;
    private String telefone;
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;
    private Boolean isActive;
    

}
