package br.edu.insper.desagil.engajamento;

import java.util.ArrayList;
import java.util.List;

public class Usuario{
	private String nome;
	private List<Video> videos;
	private Video video;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void postaVideo(int id, Produto produto) {
		Video video = new Video(id, produto);
		this.videos.add(video);
	}
}
//get -> leitura -> public
//set -> escrita -> public void