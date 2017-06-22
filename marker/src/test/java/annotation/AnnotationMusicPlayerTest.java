package annotation;

import music.RapMusic;
import music.RockMusic;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class AnnotationMusicPlayerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void listenRockMusic() {
        AnnotationMusicPlayer player = new AnnotationMusicPlayer();
        RockMusic music = new RockMusic();
        player.listenMusic(new RockMusic());
        assertEquals(outContent.toString(), "Playing: " + music.getClass().getSimpleName() + "\r\n");
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void listenRapMusic() {
        AnnotationMusicPlayer player = new AnnotationMusicPlayer();
        RapMusic music = new RapMusic();
        exception.expect(IllegalArgumentException.class);
        player.listenMusic(music);

    }

}