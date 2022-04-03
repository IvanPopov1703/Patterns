package structural_patterns.proxy;

public class RunProxy {

    public static void main(String[] args) {
        User userIvan = new User("Ivan", "Popov");
        MusicService musicService = new MusicServiceProxy(userIvan);
        musicService.addMusic(1);
        musicService.playMusic(1);
        userIvan.setSubscriptionAvailability(true);
        musicService.playMusic(1);
        musicService.deleteMusic(1);
    }
}
