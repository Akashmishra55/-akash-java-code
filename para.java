/**3. Create any real time logical entity with atleast 3 non static properties and create all possible
type of parameterized constructor. Create objects using each type of constructor and display the object data. 
**/
 public class Pa
{
String studentName;
int studentAge;
int studentRollnum;
Pa(String name,int age,int rollnum)
{
studentName=name;
studentAge=age;
studentRollnum=rollnum;
}
 void display()
{
System.out.println( studentName+" "+studentAge+" "+studentRollnum);
}
public static void main(String args[])
{
 Pa s1 = new Pa("Akash", 21, 12);              //Pa s1 = new Pa("Akash");   
    s1.display();                                                      //Pa s2 = new Pa(21);          
     }
}                                                       //Pa s3 = new Pa(12);
                                                       //s1.display();
                                                       //s2.display();
                                                           //s3.display();





