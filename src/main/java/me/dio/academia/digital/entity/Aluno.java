package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor //o hibernate necessita
@AllArgsConstructor
@Entity //ela que acha no banco de dados e ela ja pede uma chave primaria
@Table(name= "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})//exceptions
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique=true)
    private String cpf;

    private String bairro;

    private LocalDate dataDeNascimento;

    @OneToMany(mappedBy = "aluno",fetch=FetchType.LAZY)
    @JsonIgnore//exceptions
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}