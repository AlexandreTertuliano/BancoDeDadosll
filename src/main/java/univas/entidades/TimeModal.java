package univas.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "time")
public class TimeModal implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "id_time")
	private Integer id_time;
	
	@Column(name="nome_time")
	private String nome_time;
	
	@Column(name="city")
	private String city;
	
	@Column(name="titulos")
	private Integer titulos;

	public TimeModal() {

	}

	public Integer getId_time() {
		return id_time;
	}

	public void setId_time(Integer id_time) {
		this.id_time = id_time;
	}

	public String getNome_time() {
		return nome_time;
	}

	public void setNome_time(String nome_time) {
		this.nome_time = nome_time;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getTitulos() {
		return titulos;
	}

	public void setTitulos(Integer titulos) {
		this.titulos = titulos;
	}

	@Override
	public String toString() {
		return "Time [nome_time=" + nome_time + ", id_time=" + id_time + ", city=" + city + " titulos=" + titulos + "]";
	}
}
