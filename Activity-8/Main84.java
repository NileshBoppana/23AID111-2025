interface MediaPlayer {
    void play();
}

class AudioPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Playing audio...");
    }
}

class VideoPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Playing video...");
    }
}

public class Main84 {
    public static void main(String[] args) {
        AudioPlayer a = new AudioPlayer();
        VideoPlayer v = new VideoPlayer();

        a.play();
        v.play();
    }
}
