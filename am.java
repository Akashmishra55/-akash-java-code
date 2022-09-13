class CompanyDemo
{
 int id;
 String name;

 static String Company="Tesla";
 static String faculty="It/Cs";

 void displaydata()
 {
	 System.out.println(id + " " +name);
 }
}
      public static void main(String[] args)
	{
		Employee a1=new Employee();
		Employee a2=new Employee();
		
        a1.id=1;
		a1.name="Akash";
		a1.email="Akash@gmail.com";
         
		a2.id=2;
		a2.name="Abhi";
		a2.email="Abhi@gmail.com";
		
		a1.displayData();
		a2.displayData();
		
		System.out.println();
	}
} 
