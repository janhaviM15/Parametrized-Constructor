package Constructor;

public class ParametrizedCons 
{
	String name;
	int id;
	
	ParametrizedCons(String n, int i)
	{
		name = n;
		id = i;
	}
	void ParametrizedCons()
	{
		System.out.println("Name is "+name+" Id is:"+id);
	}
	

	public static void main(String[] args) 
	
	{
		ParametrizedCons obj = new ParametrizedCons("John",101);
		obj.ParametrizedCons();
	}

}
