public class Message {
    String recipent, sender, messageText;

    public static void main(String[] args) {

    }

    public Message(){

    }
    public Message(String recipent,String sender,String messageText){
        setRecipent(recipent);
        setSender(sender);
        setMessageText(messageText);
    }

    @Override
    public String toString() {
        String s = "From: " + sender + "\nTo: " + recipent + "\nMessage: " + messageText;
        return s;
    }

    public String getRecipient() {
        return recipent;
    }
    public String getSender(){
        return sender;
    }
    public String getMessageText(){
        return messageText;
    }
    public void setRecipent(String recipent){
        this.recipent = recipent;
    }
    public void setSender(String sender){
        this.sender = sender;
    }
    public void setMessageText(String messageText){
        this.messageText = messageText;
    }
}
