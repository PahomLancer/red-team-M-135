public class auth{
	int id = 0;
	public String login;
	private String password;
	String salt = "qa12ws34ed56rf78tg90";
	public void setUser(int id, String login, String password){
		this.login = login;
		this.password = password;
		this.id = id;
	}
	public int checkUser(auth user){
		if (user.login.equals(this.login))
		{
			if (user.password.equals(this.password))
			{
				return 1;
			}
			return 2;
		}
		return 3;
	}
	public void printUser()
	{
		System.out.println(this.id + " " + this.login + " " + this.password);
	}
}
