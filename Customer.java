
public class Customer {
	private String emailid;
	private String name;
	public Customer()
	{
		emailid="NA";
		name="NA";
	}
	public Customer(String emailid,String name)
	{
		this.emailid=emailid;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Emmail id: "+emailid);
		System.out.println("Name     : "+name);
	}
	//cmnt added by omkar padmale

}
