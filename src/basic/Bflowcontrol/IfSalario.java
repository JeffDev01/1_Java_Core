package basic.Bflowcontrol;

public class IfSalario {
    public static void main(String[] args){

    double salario = 1000;

    if(salario<1000){
        salario=salario+(salario*0.05);

    }else if(salario >=1000&salario<2000){
        salario=salario+(salario*0.1);

    }else if(salario>=2000&&salario<4000){

        salario=salario+(salario*0.15);

    }else if(salario>5000){
        salario=salario+(salario*0.2);
    }else{
        salario  = salario+salario*0.2;
    }
    System.out.println("Seu salario será: "+salario);

    }

}
