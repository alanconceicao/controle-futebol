package gestaofutebol.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Campo implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	String nome;
	double mensalidade;
	int duracao; //em minutos
	
	@OneToMany
	List<Partida> partidas;
	
	public Campo() {
		
	}
	
	public Campo(String nome, double mensalidade, int duracao) {
		super();
		this.nome = nome;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}

	@Override
	public String toString() {
		return "Campo [id=" + id + ", nome=" + nome + ", mensalidade=" + mensalidade + ", duracao=" + duracao
				+ ", partidas=" + partidas + "]";
	}
	
	
	
}
