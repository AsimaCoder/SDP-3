class SnapchatAdapter implements IMessagingService {
    private SnapchatService snapchatService;

    SnapchatAdapter(SnapchatService snapchatService) {
        this.snapchatService = snapchatService;
    }

    @Override
    public void sendMessage(String message, String recipient) {
        snapchatService.sendSnapchatMessage(message, recipient);
    }

    @Override
    public void sendVoiceMessage(String audio, String recipient) {
        snapchatService.sendSnapchatEmoji("Voice Message", recipient);
    }

    @Override
    public void sendEmoji(String emoji, String recipient) {
        snapchatService.sendSnapchatEmoji(emoji, recipient);
    }
}
