package br.com.alura.forum.controller;

import java.time.LocalDateTime;

import br.com.alura.forum.modelo.Topico;

public class TopicoDTo {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	
	public TopicoDTo(Topico topico) {
		this.id = topico.getId();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
		this.titulo = topico.getTitulo();
	}
	
	public Long getId() {
		return this.id;
	}

	public String getTitulo() {
		return this.titulo;
	}
	
	public String getMensagem() {
		return this.mensagem;
	}
	
	public LocalDateTime getLocalDateTime() {
		return this.dataCriacao;
	}
	
}
