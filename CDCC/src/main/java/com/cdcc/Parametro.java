package com.cdcc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Parametro {
	
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	private Nota nota;
	@ManyToOne
	private Chiave chiave;
	@ManyToOne
	private Valore valore;
	
	public Parametro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Parametro(Nota nota, Chiave chiave, Valore valore) {
		super();
		this.nota = nota;
		this.chiave = chiave;
		this.valore = valore;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

	public Chiave getChiave() {
		return chiave;
	}

	public void setChiave(Chiave chiave) {
		this.chiave = chiave;
	}

	public Valore getValore() {
		return valore;
	}

	public void setValore(Valore valore) {
		this.valore = valore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chiave == null) ? 0 : chiave.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nota == null) ? 0 : nota.hashCode());
		result = prime * result + ((valore == null) ? 0 : valore.hashCode());
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
		Parametro other = (Parametro) obj;
		if (chiave == null) {
			if (other.chiave != null)
				return false;
		} else if (!chiave.equals(other.chiave))
			return false;
		if (id != other.id)
			return false;
		if (nota == null) {
			if (other.nota != null)
				return false;
		} else if (!nota.equals(other.nota))
			return false;
		if (valore == null) {
			if (other.valore != null)
				return false;
		} else if (!valore.equals(other.valore))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Parametro [id=" + id + ", nota=" + nota + ", chiave=" + chiave
				+ ", valore=" + valore + "]";
	}
	
	
}