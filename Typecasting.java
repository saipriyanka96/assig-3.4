
public class Typecasting {
	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
//Type casting is a class name
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java Program processing starts from the main() method which is a mandatory part of every program 		
		//static used to prepare a field,method or inner classes as a class field.
		//void is used to define the return type of the method
		//String[] args is actually an array of java.lang.String type and it's name is args here
		//String is predefined class name 
		//args is name of the array
		short s=20;//s is the name of the variable,here 20 is literal
		byte b=30;//b is the name of the variable,here 30 is literal
		int I=(int)s + (int)b;
//here by casting the values of short and byte we are inserting these values in
//integer data type by adding these values we are assigning them in integer "i" data type
		System.out.println("value of int I is "+I);
		long L=(long)I + (long)s;
//long data type we are inserting the values of integer and short in them
//by adding we assign them in "1"		
		System.out.println("value of long L is"+L);
		float F=(float)I + (float)L;
//the values of float and long are converted into long and these values are added
//then the value is assigned to the variable of double that is "D"
		System.out.println("value of float F is "+F);
		double D=(double)F + (double)L;
		
		System.out.println("value of double D is"+D);
		//System is a final class in java.lang package
		//out is a static member field of system class and it's type PrintStream
			//println is a method of PrintStream class and it means print in next line
			//Inside the brackets is value which to be printed		
				
			}


}
