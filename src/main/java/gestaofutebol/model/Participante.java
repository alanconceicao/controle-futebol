package gestaofutebol.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Participante implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	double valorPago;
	String observacao;
	
	@OneToOne
	Jogador jogador;
	
	public Participante() {
	}

	public Participante(Jogador jogador, double valorPago, String observacao) {
		super();
		this.valorPago = valorPago;
		this.observacao = observacao;
		this.jogador = jogador;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	@Override
	public String toString() {
		return "Participante [id=" + id + ", valorPago=" + valorPago + ", observacao=" + observacao + ", jogador="
				+ jogador + "]";
	}
	
	
	
}
