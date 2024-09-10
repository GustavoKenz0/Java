package com.sesi.Sistema.ATA.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Ata {

		private Long id;

	    private String inicio;
	    private String fim;
	    private String setor;
	    private String titulo;
	    private String pauta;
	    private String descricao;

	    @Enumerated(EnumType.STRING)
	    private TipoAta tipo;

	    private String palavrasChave;

	    @OneToMany(mappedBy = "ata", cascade = CascadeType.ALL)
	    private List<Participante> participantes = new ArrayList<>();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInicio() {
			return inicio;
		}

		public void setInicio(String inicio) {
			this.inicio = inicio;
		}

		public String getFim() {
			return fim;
		}

		public void setFim(String fim) {
			this.fim = fim;
		}

		public String getSetor() {
			return setor;
		}

		public void setSetor(String setor) {
			this.setor = setor;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getPauta() {
			return pauta;
		}

		public void setPauta(String pauta) {
			this.pauta = pauta;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public TipoAta getTipo() {
			return tipo;
		}

		public void setTipo(TipoAta tipo) {
			this.tipo = tipo;
		}

		public String getPalavrasChave() {
			return palavrasChave;
		}
		
		public void setPalavrasChave(String palavrasChave) {
			this.palavrasChave = palavrasChave;
		}

		public List<Participante> getParticipantes() {
			return participantes;
		}

		public void setParticipantes(List<Participante> participantes) {
			this.participantes = participantes;
		}
	    
	    
	
}
