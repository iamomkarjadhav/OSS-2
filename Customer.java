
public class Customer {
	private String emailid;
	private String name;
	public Customer()
	{
		emailid="NA";
		name="NA";
	}
	//Hello World
	public Customer(String emailid,String name)
	{
		this.emailid=emailid;
		this.name=name;
	}
	//New changes added by Omkar Jadhav
	
	public void display()
	{
		System.out.println("Emmail id: "+emailid);
		System.out.println("Name     : "+name);
	}
	//cmnt added by omkar padmale

}
