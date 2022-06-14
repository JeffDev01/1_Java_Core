package intermediate.Kthreads.test;

import intermediate.Kthreads.domain.Account;

public class CSymcronizesCounThreadTest01 implements Runnable {

    //SYNCHRONIZED FAZ COM QUE APENAS UMA THREAD ACESSE O BLOCO POR VEZ

    private final Account account = new Account(); /*Só é final para syncronizar o objeto*/

    public static void main(String[] args) {
        CSymcronizesCounThreadTest01 symcronizesCounThreadTest01 = new CSymcronizesCounThreadTest01();
        Thread t1 = new Thread(symcronizesCounThreadTest01, "Jefferson");
        Thread t2 = new Thread(symcronizesCounThreadTest01, "Lucas");
        t1.start();
        t2.start();

    }
    /*Podemos sincronizar o metodo que pertence ao objeto symcronizesCounThreadTest01 o qual implementa Runnable ou
    * também podemos sincronizar o Objeto Account que  faz uso do metodo Runnable, nesse caso o objeto tem que ser final
    * porque cada objeto pega apenas uma chave.*/
//    private synchronized void  withdrawal(int amount){
//        if(account.getBalance()>=amount){
//            System.out.println(getThreadName()+" is going to withdrawal money");
//            account.withdrawal(amount);
//            System.out.println(getThreadName()+" finished with, current balance:  "+account.getBalance());
//        }else{
//            System.out.println("Not enough balance for "+getThreadName()+ " withdrawal money");
//        }
//    }

    //SYNCHRONIZED OBJETO QUE ACESSA RUNNABLE, ELE TEM QUE SER FINAL E ABRIR UM BLOCO ENVELOPANDO O METODO A SER USADO
    private void  withdrawal(int amount){
        System.out.println("##### outside: "+getThreadName());
        synchronized (account) {
            System.out.println("##### inside: "+getThreadName());
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " is going to withdrawal money");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " finished with, current balance:  " + account.getBalance());
            } else {
                System.out.println("Not enough balance for " + getThreadName() + " withdrawal money");
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //PODEMOS USAR SYNCHRONIZED TAMBÉM COM MÉTODOS STATICS
    /*Quando a gente faz isso estamos adicionando LOCK para a classe inteira*/
    private static synchronized void print(){
        /*Isso é a mesma coisa que fazer isso abaixo*/
        synchronized (CSymcronizesCounThreadTest01.class){

        }

    }



    private  String getThreadName(){
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if(account.getBalance()<0){
                System.out.println("Something VERY VERY VERY VERY WRONG happened");
            }
        }

    }
}
