package structural_patterns.proxy;

public class Music {

    private final Integer musicId;
    private String musicName;

    public Music(Integer musicId, String musicName) {
        this.musicId = musicId;
        this.musicName = musicName;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }
}
