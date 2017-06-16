package marker;

import marker.interfaze.MusicPlayer;
import marker.interfaze.RapMusic;
import marker.interfaze.RockMusic;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MusicPlayerTest {

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
        MusicPlayer player = new MusicPlayer();
        RockMusic music = new RockMusic();
        player.listenMusic(new RockMusic());
        assertEquals(outContent.toString(), "Playing: " + music.getClass().getSimpleName() + "\r\n");
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void listenRapMusic() {
        MusicPlayer player = new MusicPlayer();
        RapMusic music = new RapMusic();
        exception.expect(IllegalArgumentException.class);
        player.listenMusic(music);

    }

}