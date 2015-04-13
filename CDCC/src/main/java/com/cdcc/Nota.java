package com.cdcc;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Nota {
	
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	private Paziente paziente;
	@ManyToOne
	private Autore autore;
	private enum Tipo {Medico, Infermiere};
	@Enumerated
	private Tipo tipo;
	private String testo;
	private Date data;
	
	public Nota() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nota(Paziente paziente, Autore autore, String testo, Date data) {
		super();
		this.paziente = paziente;
		this.autore = autore;
		this.testo = testo;
		this.data = data;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autore == null) ? 0 : autore.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((paziente == null) ? 0 : paziente.hashCode());
		result = prime * result + ((testo == null) ? 0 : testo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		if (autore == null) {
			if (other.autore != null)
				return false;
		} else if (!autore.equals(other.autore))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id != other.id)
			return false;
		if (paziente == null) {
			if (other.paziente != null)
				return false;
		} else if (!paziente.equals(other.paziente))
			return false;
		if (testo == null) {
			if (other.testo != null)
				return false;
		} else if (!testo.equals(other.testo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Nota [id=" + id + ", paziente=" + paziente + ", autore="
				+ autore + ", testo=" + testo + ", data=" + data + "]";
	}	
	

}
