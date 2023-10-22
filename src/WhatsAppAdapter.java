class WhatsAppAdapter implements IMessagingService {
    private WhatsAppService whatsappService;

    WhatsAppAdapter(WhatsAppService whatsappService) {
        this.whatsappService = whatsappService;
    }

    @Override
    public void sendMessage(String message, String recipient) {
        whatsappService.sendWhatsAppMessage(message, recipient);
    }

    @Override
    public void sendVoiceMessage(String audio, String recipient) {
        whatsappService.sendWhatsAppVoiceMessage(audio, recipient);
    }

    @Override
    public void sendEmoji(String emoji, String recipient) {
        whatsappService.sendWhatsAppMessage("Emoji: " + emoji, recipient);
    }
}


