
public class Method {

	String name;
	int id;
	double salary;
	static String companyName;
	
	Method( String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	
	void getData()
	{
		System.out.println("\tName:"+this.name+" "+"\tID:"+this.id+" "+"\tSalary:"
	                           +this.salary+" "+"\tCompany:"+this.companyName);
		
	}
	
	static void method(){
		System.out.println("\tCompany Name:"+companyName);   
		
	}
	
	public static void main(String[] args){
    Method d=new Method("mrunali",1,25478);
	Method d1=new Method("yashu",3,25478);
	Method d2=new Method("Ash",2,14597);
	Method.companyName="Amazon";
	d.getData();
	d1.getData();
	d2.getData();
	

	
}
}


