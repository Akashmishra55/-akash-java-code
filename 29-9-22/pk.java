package p2;

class Human {
		 void person() {
			System.out.println("Can Talk");
		}
		}
		class Worker extends Human
		{
		 void walk()
			{
				System.out.println("Can Walk");	
	}
		public static void main(String []args)
		{
			Human h=new Worker();//upca
			h.person();
		}
		}


