package Practice_Myself;

public class StringBuilder {
    public StringBuilder(String html) {
    }

    public static void main(String[] args) {
        String str1="java";
        System.out.println("line6:"+str1);

        String str2="java";
        System.out.println("line9:"+str2);

        str1="selenium";

        System.out.println("str1 after change: "+str1);

        System.out.println("str2 after change: "+str2);
        System.out.println("++++++++++++++++++++++++++++");

        StringBuilder sb1= new StringBuilder("html");

        StringBuilder sb2=sb1;
        System.out.println("values of sb1" +sb1+ "and sb2 "+sb2);
        sb1=new StringBuilder("cucumber");
        System.out.println("values of sb1" +sb1+ "and sb2 "+sb2+"after change");


    }
}
