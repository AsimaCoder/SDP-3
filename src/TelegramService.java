class TelegramService {
    void sendTelegramMessage(String message, String recipient) {
        System.out.println("Sending Telegram message to " + recipient + ": " + message);
    }

    void sendTelegramVoiceMessage(String audio, String recipient) {
        System.out.println("Sending Telegram voice message to " + recipient + ": " + audio);
    }
}

