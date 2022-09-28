package receitas.io.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import receitas.io.model.Receita;
import receitas.io.repositorio.ReceitasRepositorio;

@RestController
@RequestMapping("/api/receitas")
public class ReceitaController {
	
	@Autowired  //Injeção de dependencia
	private ReceitasRepositorio repo;
	
	
	@PostMapping //Não preciso indicar link, se realizar post no principal, cai aqui.
	public Receita save(@RequestBody  Receita receita) 
	{//reconhece json do post 
		return repo.save(receita);
	}
	
	
	// url/api/receita/1 ou 2 ou 3...
	@GetMapping("{id}")
	public Receita getById(@PathVariable Long id) 
	{
		//Pode não existir o id, caso não retorne, devolve o erro not found
		return repo.findById(id)
			.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
}
