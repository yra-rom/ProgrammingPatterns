package marker.interfaze;


public class InterfaceMusicPlayer {

    public void listenMusic(Object music) {
        if(music == null){
            return;
        }

        if (music instanceof Listenable) {
            System.out.println("Playing: " + music.getClass().getSimpleName());
        } else {
            throw new IllegalArgumentException(music.getClass().getName() + ": is not listenable.");
        }
    }
}
