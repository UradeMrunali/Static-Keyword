
public class Data_Members {
   
	String name;
	int roll_no;
	String sec;
	static String clg="Priyadarshini";
	
	Data_Members( String name,int roll_no,String sec)
	{
		this.name=name;
		this.roll_no=roll_no;
		this.sec=sec;
		
	}
	
	void getData()
	{
		System.out.println("\tName:"+this.name+" "+"\tRoll:"+this.roll_no+" "+"\tSec:"
	                           +this.sec+" "+"\tClg:"+this.clg);
	}
	
	public static void main(String[] args){
	Data_Members d=new Data_Members("mrunali",1,"A");
	Data_Members d1=new Data_Members("yashu",3,"A");
	Data_Members d2=new Data_Members("Ash",2,"B");
	d.getData();
	Data_Members.clg="Bhagwati";
	d1.getData();
	d2.getData();
	
}
}
