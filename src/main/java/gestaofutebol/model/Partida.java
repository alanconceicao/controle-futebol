package gestaofutebol.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Partida implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	Date data;
	double desconto;
	String observacao;
	
	@OneToMany
	List<Participante> participantes;
	
	public Partida() {
		
	}

	public Partida(Date data, double desconto, String observacao) {
		super();
		this.data = data;
		this.desconto = desconto;
		this.observacao = observacao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}

	@Override
	public String toString() {
		return "Partida [id=" + id + ", data=" + data + ", desconto=" + desconto + ", observacao=" + observacao
				+ ", participantes=" + participantes + "]";
	}
	
	

}
