package datatype;

public class TypesOfData {
	public void primitiveDatatype() {
		
		 byte a=8;//-128 to 127 byte
		 
		 short b= 31787; //-32768 to 32767 short
		 
		 int c=672352827;//INT
		 
		 long d=2362828278279289765l; //long
		 
		 float e=4.8836293873f; // float[6 to 7 digits] 
		 
		 double f=5.2347432421763;//double[ 15 digits]
		 
		 boolean g=true; // true or false 
		 
		 char h='*'; //store any one character
		 System.out.println("primitive");
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
		 System.out.println(e);
		 System.out.println(f);
		 System.out.println(g);
		 System.out.println(h);
		 
		 
		 
		}
		 
		 
		
		public void nonprimitiveDatatype() {
			
			String i=" 78947777&";
			
			System.out.println(" non primitive");
			System.out.println(i);
		
			
		}
		
		

		
		
		
		public static void main(String args []) {
			
			TypesOfData obj= new TypesOfData();
			obj.primitiveDatatype();
			obj.nonprimitiveDatatype();
			
			
			
		}


}
