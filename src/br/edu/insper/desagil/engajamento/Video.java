package br.edu.insper.desagil.engajamento;

import java.util.HashMap;
import java.util.Map;

public class Video{
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<String, Integer> avaliacoes;
	
	public Video(int id, Usuario usuario, Produto produto, Map<String, Integer> avaliacoes) {
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes  = new HashMap<>();
	}
	public int getId() {
		return this.id;
	}
	public Produto getProduto() {
		return this.produto;
	}
	public void adicionaAvaliacao(String usuario, int id) {
		if (usuario != nome && (id > 1 && id < 5)) {
			avaliacoes.put(usuario, id);
		}
	}
	
	public double mediaAvaliacoes() {
		int soma = 0;
		double media = 0;
		for (int id: avaliacoes.values()) {
			soma += id;
			media = soma / avaliacoes.size();
		}
		return media;
	}
}
//get -> leitura -> public
//set -> escrita -> public void