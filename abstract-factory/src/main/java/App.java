import creator.GUICreator;
import os.OSType;
import window.Window;

public class App {
    public static void main(String[] args) {
        OSType osType = OSType.Linux;

        GUICreator creator = new GUICreator(osType);

        Window window = creator.createWindow();

        System.out.println(window.getClass().getSimpleName());
    }
}
