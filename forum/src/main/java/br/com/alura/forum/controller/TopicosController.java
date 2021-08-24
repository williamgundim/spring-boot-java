package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.controller.form.TopicoForm;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@Controller
@RequestMapping("/topicos")
public class TopicosController {

	@Autowired //Utilizado para injeção de dependencia no spring.
	private TopicoRepository topicoRepository;
	
	@GetMapping
	@ResponseBody
	public List<Topico> lista() {

		//Curso newCurso = new Curso("Angular", "Web");
		//Topico novoTopico = new Topico("Titulo", "Nova AAAA", newCurso);
		//TopicoDTo novoTopicoDTO = new TopicoDTo(topicos);
		
		List<Topico> topicos = this.topicoRepository.findAll();
		return topicos;
		
	}
	
	@PostMapping
	public void postItem(@RequestBody TopicoForm form ) {
		
		//this.topicoRepository.save();
		
	}
	
	@GetMapping("/{id}")
	public TopicoDTo getDetail(@PathVariable Long id  ) {
		
		Topico novoTopico = new Topico();
		TopicoDTo topico = new TopicoDTo(novoTopico);
		return topico;
	}
	
	@PutMapping("/{id}")
	public void refresh( @PathVariable Long id, @RequestBody TopicoForm topico ) {
		
	}
	
	@DeleteMapping("/{id}")
	public Number delete( @PathVariable Long id  ) {
		
		this.topicoRepository.deleteById(id);
		
		return 200;
		
	}
	
	
}
