package basic.Ustring.test;

public class StringBuilderTest {
    public static void main(String[] args) {

        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(16);//stringBuilder nao é uma string
        sb.append("mumoc esarf amU");
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0, 4));
        System.out.println(sb.insert(0,"MMM"));


    }



}
