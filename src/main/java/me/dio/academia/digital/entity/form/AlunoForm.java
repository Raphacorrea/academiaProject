package me.dio.academia.digital.entity.form;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

    @NotEmpty
    @Size
    private String nome;

    @NotEmpty
    @CPF
    private String cpf;

    @NotEmpty
    @Size
    private String bairro;


    @NotNull
    @Past
    private LocalDate dataDeNascimento;
}
