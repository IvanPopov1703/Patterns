package structural_patterns.proxy;

public class MusicServiceImpl implements MusicService{

    private final Music[] musicList = new Music[] {
            new Music(1, "Песня 1"),
            new Music(2, "Песня 2"),
            new Music(3, "Песня 3"),
            new Music(4, "Песня 4"),
    };

    private final User user;

    public MusicServiceImpl(User user) {
        this.user = user;
    }

    @Override
    public void playMusic(Integer musicId) {
        Music music = getMusicById(musicId);
        System.out.println("Пользователь " + this.user.getLogin() + " воспроизводит трек: " + music.getMusicName());
    }

    @Override
    public void addMusic(Integer musicId) {
        Music music = getMusicById(musicId);
        System.out.println("Пользователь " + this.user.getLogin() + " добавил трек: " + music.getMusicName());
    }

    @Override
    public void deleteMusic(Integer musicId) {
        Music music = getMusicById(musicId);
        System.out.println("Пользователь " + this.user.getLogin() + " удалил трек: " + music.getMusicName());
    }

    private Music getMusicById(Integer id) {
        for (Music music : musicList) {
            if (music.getMusicId().equals(id)) {
                return music;
            }
        }
        throw new RuntimeException("Ошибка! Композиции не существует!");
    }
}
