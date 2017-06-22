package annotation;

public class AnnotationMusicPlayer {

    public void listenMusic(Object music) {
        if (music == null) {
            return;
        }

        if (music.getClass().isAnnotationPresent(Listenable.class)) {
            System.out.println("Playing: " + music.getClass().getSimpleName());
        } else {
            throw new IllegalArgumentException(music.getClass().getName() + ": is not listenable.");
        }
    }
}
