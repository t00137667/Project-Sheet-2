import javax.swing.*;

public class MessageDisplay {
    public static void main(String[] args) {
        String rcpnt, sndr, msgtxt;

        Message message = new Message(inputRecipent(),inputSender(),inputMessage());

        System.out.println(message.getRecipient()+message.getSender()+message.getMessageText());
        JOptionPane.showMessageDialog(null,message.toString());
    }
    private static String inputRecipent(){
        return JOptionPane.showInputDialog("Please enter the recipent's name.");
    }
    private static String inputSender(){
        return JOptionPane.showInputDialog("Please enter your name.");
    }
    private static String inputMessage(){
        return JOptionPane.showInputDialog("Please enter your message.");
    }
}
