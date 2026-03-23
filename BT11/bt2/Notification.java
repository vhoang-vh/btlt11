public class Notification {
    private MessageService messageService;

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}