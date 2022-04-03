package structural_patterns.proxy;

public class MusicServiceProxy implements MusicService{
    
    private final MusicService musicService;
    private final User user;

    public MusicServiceProxy(User user) {
        this.musicService = new MusicServiceImpl(user);
        this.user = user;
    }

    @Override
    public void playMusic(Integer musicId) {
        if (user.isSubscriptionAvailability()) {
            musicService.playMusic(musicId);
        } else {
            System.out.println("Невозможно воспроизвести трек! Оформите подписку!");
        }
    }

    @Override
    public void addMusic(Integer musicId) {
        musicService.addMusic(musicId);
    }

    @Override
    public void deleteMusic(Integer musicId) {
        musicService.deleteMusic(musicId);
    }
}
