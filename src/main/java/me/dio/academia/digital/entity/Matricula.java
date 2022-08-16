package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor //o hibernate necessita
@AllArgsConstructor
@Entity //ela que acha no banco de dados e ela ja pede uma chave primaria
@Table(name= "tb_matricula")
public class Matricula {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="aluno_id")
  private Aluno aluno;

  private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
