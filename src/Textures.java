import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Textures {
    public int[] pixels;
    private final String loc;
    public final int SIZE;

    public Textures(String location, int size) {
        loc = location;
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        load();
    }

    private void load() {
        try {
            BufferedImage image = ImageIO.read(new File(loc));
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, pixels, 0, w);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Textures wood = new Textures("res/wood.png", 64);
    public static Textures brick = new Textures("res/brick.png", 64);
    public static Textures stone = new Textures("res/stone.png", 64);
    public static Textures sandstone = new Textures("res/sandstone.png", 64);
}
