import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Department implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
		private int did;
		private String dname;
	
		public Department(int did, String dname) {
			super();
			this.did = did;
			this.dname = dname;
		}
		public Department()
		{			
		}
		public int getDid() {
			return did;
		}
		public void setDid(int did) {
			this.did = did;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
}



Create a second entity class named “Teacher.java” under the above package.
src\main\java\com\perscholas\model\Teacher.java
Here is the initial code of the Teacher.java class:
In the Teacher class, we specified a ManyToOne relationship between the Department and Teacher entities, as one Department can have more than one Teacher.
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class Teacher implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int tit;
	private String salary;
	private String Teachername;
	
	@ManyToOne
	private Department department;
	public Teacher(int tit, String salary, String teachername) {
		super();
		this.tit = tit;
		this.salary = salary;
		Teachername = teachername;	}
	public Teacher()
	{}
	
	public Department getDep() {
		return department;	}
	public void setDep(Department department) {
		this.department = department;
	}
	public int getTit() {
		return tit;
	}
	public void setTit(int tit) {
		this.tit = tit;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getTeachername() {
		return Teachername;
	}
	public void setTeachername(String teachername) {
		Teachername = teachername;	}	
}

