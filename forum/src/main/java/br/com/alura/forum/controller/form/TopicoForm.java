package br.com.alura.forum.controller.form;

public class TopicoForm {

	private String titulo;
	private String mensagem;
	private String nomeCurso;
	
	public void setTitulo(String titulo ) {
		this.titulo = titulo;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void setCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
}
