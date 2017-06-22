import annotation.AnnotationMusicPlayer;
import interfaze.InterfaceMusicPlayer;
import music.RockMusic;

public class App {
    public static void main(String[] args) {
        annotation();
        interfaze();
    }

    private static void interfaze() {
        InterfaceMusicPlayer player = new InterfaceMusicPlayer();
        player.listenMusic(new RockMusic());
    }

    private static void annotation() {
        AnnotationMusicPlayer player = new AnnotationMusicPlayer();
        player.listenMusic(new RockMusic());
    }
}
