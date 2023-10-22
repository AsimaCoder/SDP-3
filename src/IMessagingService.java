interface IMessagingService {
    void sendMessage(String message, String recipient);
    void sendVoiceMessage(String audio, String recipient);
    void sendEmoji(String emoji, String recipient);
}

