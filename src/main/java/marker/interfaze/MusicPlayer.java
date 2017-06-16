package marker.interfaze;

public class MusicPlayer {
    public void listenMusic(Object music) {
        if (music instanceof Listenable) {
            System.out.println("Playing: " + music.getClass().getSimpleName());
        } else {
            throw new IllegalArgumentException(music.getClass().getName() + ": is not listenable.");
        }
    }
}
