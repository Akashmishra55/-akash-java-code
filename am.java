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
		Employee e1=new Employee();
		Employee e2=new Employee();
		
        e1.id=1;
		e1.name="Akash";
		e1.email="Akash@gmail.com";
         
		e2.id=2;
		e2.name="Abhi";
		e2.email="Abhi@gmail.com";
		
		e1.displayData();
		e2.displayData();
		
		System.out.println();
	}
} 