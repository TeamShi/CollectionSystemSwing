import view.*;
import javax.swing.*;

public class Controller {

    protected static MyFrame frame;
    private static int FRAME_WIDTH = 800;
    private static int FRAME_HEIGHT = 680;

    public static void init(boolean isVisible) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            frame = new MyFrame("钻探数据采集系统-参数配置",FRAME_WIDTH,FRAME_HEIGHT);
            frame.setVisible(isVisible);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        init(true);
    }
}
