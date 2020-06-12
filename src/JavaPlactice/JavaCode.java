package JavaPlactice;
class SimpleClass {
	void dosomething() {
		 int array[] = new int[3];
		 array[10] = 99;
		 System.out.println("dosomethingメソッドを終了します。");
	 }
}

class InvalidAgeException extends Exception {
	InvalidAgeException(String message){
		super(message);
	}
}

class Person {
	int age;
	void setAge(int age) throws InvalidAgeException {
		if(age < 0) {
			throw new InvalidAgeException("年齢にマイナスの値が指定されました");
		}
		this.age = age;
		System.out.println("年齢は" + age + "です");
	}
}
public class JavaCode {
	
	 public static void main(String[] args) {
//	  String str = "Javaの学習";
//	  System.out.println(str.length());
//	  System.out.println(str.indexOf("学習"));
//	  System.out.println(str.indexOf("Ruby"));
//	  System.out.println(str.contains("Java"));
//	  System.out.println(str.contains("Ruby"));
//      System.out.println(str.replace("Java",  "Java言語"));
//      String st ="2017/11/22";
//      String[] items = st.split("/");
//        for(int i = 0; i < items.length; i++) {
//        System.out.println(items[i]);
//        }
//		 int a = 4;
//		 int b = 0;
//		 try {
//		 int c = a / b;
//		 System.out.println("cの値は" + c);
//		 }
//		catch(ArithmeticException e) {
//		 System.out.println("例外をキャッチしました");
//		 System.out.println(e);
//		 }
//		 System.out.println("プログラムを終了します");
//		 SimpleClass obj = new SimpleClass();
//		 try {
//			 obj.dosomething();
//		 }
//		 catch(ArrayIndexOutOfBoundsException e) {
//			 System.out.println("例外をキャッチしました");
//			 e.printStackTrace();
//		 }
//		int[] scores = new int[5];
//		int a = 4;
//		int b = (int)(Math.random() * 10);
//		System.out.println("b=" + b);
//		try {
//			int c = a / b;
//			System.out.println("cの値は" + c);
//			scores[b]  = 10;
//			System.out.println("処理が正常に行われました");
//			}
//		catch(ArithmeticException e) {
//			System.out.println("ArithmeticException型の例外をキャッチしました");
//			System.out.println(e);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBoundsException型の例外をキャッチしました");
//			System.out.println(e);
//		}
//		System.out.println("プログラムを終了します");
//		 int age = -10;
//		 try {
//			 if(age < 10) {
//				 throw new InvalidAgeException("年齢にマイナスの値が設定されました");
//			 }
//			 System.out.println("年齢は" + age + "歳です");
//		 }
//		 catch(InvalidAgeException e) {
//			 System.out.println("例外をキャッチしました");
//			 System.out.println(e);
//		 }
		 Person P = new Person();
		 try {
			 P.setAge(-5);
		 }
		 catch(InvalidAgeException e) {
			 System.out.println(e);
		 }
    }
}
