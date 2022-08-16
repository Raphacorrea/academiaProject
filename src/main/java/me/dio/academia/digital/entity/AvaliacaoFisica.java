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
@Table(name= "tb_avaliacoes")
public class AvaliacaoFisica {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;
  @ManyToOne(cascade=CascadeType.ALL)//tudo que fizer em avaliacao vai refletir em aluno
  @JoinColumn(name="aluno_id")//a coluna das foreigns keys estará dentro da tabela de avaliacao fisica
private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

  @Column(name="peso_atual")
  private double peso;

  @Column(name="altura_atual")
  private double altura;

}
