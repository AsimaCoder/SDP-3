class WhatsAppService {
    void sendWhatsAppMessage(String message, String recipient) {
        System.out.println("Sending WhatsApp message to " + recipient + ": " + message);
    }

    void sendWhatsAppVoiceMessage(String audio, String recipient) {
        System.out.println("Sending WhatsApp voice message to " + recipient + ": " + audio);
    }
    void sendEmoji(String emoji, String recipient) {
        System.out.println("Sending WhatsApp message message to " + recipient + ": " + emoji);
    }
}

