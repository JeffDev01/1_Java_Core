package basic.Bflowcontrol;

public class OperadorTernario {

    public static void main(String[] args){
        int age = 20;
        String status;

       /* if(age<18){
            status = "não adulto";
        }else {
            status = "adulto";
        }*/
        //Operador Ternário : Uma forma de diminuir o número de if
        status = age <18 ? "não adulto" : "adulto"; //posso colocar operador dentro de operador.
        System.out.println(status);
    }


}
