package receitas.io.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import receitas.io.model.Receita;

public interface ReceitasRepositorio extends JpaRepository<Receita, Long>{

}
