package modelpackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
// representation DB table in Java.  
@Entity
@Table(name="user_detail")
public class User {
	@Id
	// import id dependency.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	@Column (name="user_name") used when the dbcolumn name is different from java column name. 
	private String name;
	private String password;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	

}
