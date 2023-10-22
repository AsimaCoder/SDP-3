class TelegramAdapter implements IMessagingService {
    private TelegramService telegramService;

    TelegramAdapter(TelegramService telegramService) {
        this.telegramService = telegramService;
    }

    @Override
    public void sendMessage(String message, String recipient) {
        telegramService.sendTelegramMessage(message, recipient);
    }

    @Override
    public void sendVoiceMessage(String audio, String recipient) {
        telegramService.sendTelegramVoiceMessage(audio, recipient);
    }

    @Override
    public void sendEmoji(String emoji, String recipient) {
        telegramService.sendTelegramMessage("Emoji: " + emoji, recipient);
    }
}
