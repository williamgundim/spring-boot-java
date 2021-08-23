package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@Controller
public class TopicosController {

	@Autowired //Utilizado para injeção de dependencia no spring.
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> lista() {

		//Curso newCurso = new Curso("Angular", "Web");
		//Topico novoTopico = new Topico("Titulo", "Nova AAAA", newCurso);
		//TopicoDTo novoTopicoDTO = new TopicoDTo(topicos);
		
		List<Topico> topicos = this.topicoRepository.findAll();
		return topicos;
		
	}
	
}
