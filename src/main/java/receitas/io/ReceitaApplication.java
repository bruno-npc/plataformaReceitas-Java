package receitas.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReceitaApplication {
	
	/*
	@Autowired
	private ReceitasRepositorio receitaRepo;
	
	@Bean
	public CommandLineRunner init() 
	{
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				// Execução de tarefas
				
				Receita rec = new Receita();
				
				rec.setReceitaDescricao("Estudando java com spring");
				rec.setCadastro(LocalDateTime.now());
				
				receitaRepo.save(rec); //Percistencia de dados.
				
			}
		};
	}
	*/
	
	public static void main(String[] args) 
	{
		SpringApplication.run(ReceitaApplication.class, args);
	}

}
