package marker.interfaze;

import marker.music.RapMusic;
import marker.music.RockMusic;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class InterfaceMusicPlayerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void listenRockMusic() {
        InterfaceMusicPlayer player = new InterfaceMusicPlayer();
        RockMusic music = new RockMusic();
        player.listenMusic(new RockMusic());
        assertEquals(outContent.toString(), "Playing: " + music.getClass().getSimpleName() + "\r\n");
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void listenRapMusic() {
        InterfaceMusicPlayer player = new InterfaceMusicPlayer();
        RapMusic music = new RapMusic();
        exception.expect(IllegalArgumentException.class);
        player.listenMusic(music);

    }
}