package intermediate.Kthreads.test;

import intermediate.Kthreads.domain.Members;
import intermediate.Kthreads.service.EmailDeliveryService;

import javax.swing.*;

public class FEmailDeliveryTest01 {
    public static void main(String[] args) {


        Members members= new Members();
        Thread devDojo = new Thread(new EmailDeliveryService(members), "DevDojo");
        Thread alura = new Thread(new EmailDeliveryService(members), "Alura");

        devDojo.start();
        alura.start();

        while(true){
            String email = JOptionPane.showInputDialog("Please type your email");
            if(email==null|| email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }

    }
}
