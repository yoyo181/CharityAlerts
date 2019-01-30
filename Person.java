public class Person {
	
	//Attributes
	public String name ;
	public int age;
    public float height ;
    public float weight ;
	
	// Constructor 
	public Person (String n) {
		this.name = n; 
	this.age =0;
	//...
	
	
	}
public void talk() {
	
     System.out.println("Hi , my name is " + this.name );
	
}
	public static void main (String[]args ) {
		
	Person tito = new Person ("tito ");
	tito.talk(); 
	
	//System.out.println(tito.name );
	
        }
}