package basic.Twrappers.test;

public class WrappersTest {

    public static void main(String[] args) {


        //Classes Wrappers encapsulam essas variáveis de modo a agregar mais funções a eles
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        //Agora temos variáveis do tipo reference
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = Integer.valueOf("10"); //new é redundante
        Long longWrapper = 10L;
        Float floatWrapper = 10.0F;
        Double doubleWrapper = 10.0D;
        Character characterWrapper = 'A';
        Boolean booleanWrapper = true;

        //conversão de number em string
        String valor = "10";
        Float f = Float.parseFloat(valor);
        System.out.println(f);

        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isLetter('2'));
        System.out.println(Character.isLetterOrDigit('@'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));




    }
}
