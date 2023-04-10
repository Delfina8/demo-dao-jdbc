package model.entities;

import java.io.Serializable;

/*
 * implements Serializable: Serve para os objetos serem transformados em sequência de Bytes
 */

public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Department () {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*O hashCode e o equals servem para que o objeto seja comparado pelo seu conteúdo e não pela
	 * referência de ponteiros
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	
	//nesse caso gerei apenas para o ID

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	/*
	 * toString para facilitar a impressão dos valores do objeto quando estivermos a testar
	 * Gerei para os dois atributos
	 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [id=" + id + ", name = " + name + "]";
	}
	

	
	

}
