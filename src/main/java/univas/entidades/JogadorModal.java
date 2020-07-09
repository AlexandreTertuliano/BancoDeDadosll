package univas.entidades;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "jogadores")
public class JogadorModal implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "id_jogador")
	private Integer id_jogador;
	
	public TimeModal getId_time() {
		return id_time;
	}

	public void setId_time(TimeModal id_time) {
		this.id_time = id_time;
	}

	@Column(name="nome_jogador")
	private String nome_jogador;
	
	@Column(name="posicao")
	private String posicao;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_time")
	private TimeModal id_time;
	
	@Column(name="dt_nascimento")
	@Temporal (TemporalType.TIMESTAMP)
	private Date dt_nascimento;
	
	public JogadorModal() {
		
	}

	public Integer getId_jogador() {
		return id_jogador;
	}

	public void setId_jogador(Integer id_jogador) {
		this.id_jogador = id_jogador;
	}

	public String getNome_jogador() {
		return nome_jogador;
	}

	public void setNome_jogador(String nome_jogador) {
		this.nome_jogador = nome_jogador;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Date getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
	@Override
	public String toString() {
		return "Jogadores [nome_jogador=" + nome_jogador + ", id_jogador=" + id_jogador + ", posicao=" + posicao + " dt_nascimento=" + dt_nascimento + "]";
	}
	
	
}
