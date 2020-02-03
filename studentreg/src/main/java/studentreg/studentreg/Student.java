package studentreg.studentreg;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "studentlist1")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private String dpmt;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
    }

	public void setName(String name) {
		this.name = name;
	}

	public String getDpmt() {
		return dpmt;
	}

	public void setDpmt(String dpmt) {
		this.dpmt = dpmt;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dpmt=" + dpmt + "]";
	}

}
