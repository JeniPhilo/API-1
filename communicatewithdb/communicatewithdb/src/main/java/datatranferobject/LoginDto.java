package datatranferobject;
// from entity(Db) to viwe(htmlpage) 
// otherwise data will be changed when entity changes.  

public class LoginDto {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
