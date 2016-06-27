package cn.com.entity;
/*
 * 所有int id继承类
 * Base class for document classes
 */
import org.springframework.data.annotation.Id;

public class AbstractDocument {

	@Id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		AbstractDocument other = (AbstractDocument) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
}
