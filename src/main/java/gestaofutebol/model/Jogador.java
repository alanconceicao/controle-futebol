package gestaofutebol.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Jogador implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String nome;
	String tipo;

	public Jogador() {

	}

	public Jogador(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", nome=" + nome + ", tipo=" + tipo + "]";
	}

	
}
