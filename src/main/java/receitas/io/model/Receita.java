package receitas.io.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity //Representa uma entidade do BD, uma tabela dentro do banco.
@Getter //Cria get em tempo de compilação - extensão lombok
@Setter //Cria set em tempo de compilação - extensão lombok
public class Receita {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) //Auto incremento
	private Long id;

	@Column
	private String receitaTitulo;
	
	@Column
	private String receitaDescricao;
	
	@Column
	private boolean concluido;
	
	@Column
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDateTime cadastro;
	
	@Column
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDateTime exclusao;
	
	@PrePersist
	public void antesSalvar() {
		setCadastro(LocalDateTime.now());
	}

}
