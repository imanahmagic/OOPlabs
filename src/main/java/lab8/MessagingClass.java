package lab8;

public class MessagingClass {

    @CanSendMessage
    @UserPermission(2)
    public void sendMessage(Admin admin_sender, String message){
        System.out.println(message);
    }
    @CanSendMessage
    @UserPermission(2)
    public void sendMessage(User user_sender, String message){
        System.out.println("Restricted");
    }

    public static void main(String[] args) {
        MessagingClass mess = new MessagingClass();
        User u1 = new User("iman");
        Admin a1 = new Admin("hena");
        mess.sendMessage(a1, "I'm an admin");
        mess.sendMessage(u1, "How am i here?");

    }

}
