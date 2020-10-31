package selam11;
  
class MyClass{
	
	public void methodone(){
   
	int J =16; //local variable
    System.out.println("the value of j:" +J);
	}
	
	public void methodtwo() {
	
		int k =38;
		System.out.println("the value of k:" +k);
	//	System.out.println("the value of j: + j");
	}
}

public class localvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MyClass mc = new MyClass();
		 mc.methodone();
         mc.methodtwo();
	}

}
