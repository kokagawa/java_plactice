package JavaPlactice;

public class JavaCode {
	 public static void main(String[] args) {
	  String str = "Javaの学習";
	  System.out.println(str.length());
	  System.out.println(str.indexOf("学習"));
	  System.out.println(str.indexOf("Ruby"));
	  System.out.println(str.contains("Java"));
	  System.out.println(str.contains("Ruby"));
      System.out.println(str.replace("Java",  "Java言語"));
      String st ="2017/11/22";
      String[] items = st.split("/");
        for(int i = 0; i < items.length; i++) {
        System.out.println(items[i]);
        }
    }
}
