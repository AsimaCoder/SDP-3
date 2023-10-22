
public class Main {
    public static void sendViaAdapter(IMessagingService messagingService, String message, String recipient) {
        messagingService.sendMessage(message, recipient);
    }

    public static void sendVoiceViaAdapter(IMessagingService messagingService, String audio, String recipient) {
        messagingService.sendVoiceMessage(audio, recipient);
    }

    public static void sendEmojiViaAdapter(IMessagingService messagingService, String emoji, String recipient) {
        messagingService.sendEmoji(emoji, recipient);
    }

    public static void main(String[] args) {
        WhatsAppService whatsapp = new WhatsAppService();
        SnapchatService snapchat = new SnapchatService();
        TelegramService telegram = new TelegramService();

        IMessagingService whatsappAdapter = new WhatsAppAdapter(whatsapp);
        IMessagingService snapchatAdapter = new SnapchatAdapter(snapchat);
        IMessagingService telegramAdapter = new TelegramAdapter(telegram);

        String message = "Hello from the adapter pattern!";
        String audioMessage = "Voice message recording...";
        String emoji = "😊";

        sendEmojiViaAdapter(whatsappAdapter, emoji,"John");
        sendViaAdapter(whatsappAdapter, message, "John");
        sendVoiceViaAdapter(whatsappAdapter, audioMessage, "John");
        sendEmojiViaAdapter(snapchatAdapter, emoji, "Alice");
        sendViaAdapter(snapchatAdapter, message, "Alice");
        sendVoiceViaAdapter(snapchatAdapter, audioMessage, "Alice");
        sendEmojiViaAdapter(telegramAdapter, emoji, "Bob");
        sendViaAdapter(telegramAdapter, message, "Bob");
        sendVoiceViaAdapter(telegramAdapter, audioMessage, "Bob");
    }
}
