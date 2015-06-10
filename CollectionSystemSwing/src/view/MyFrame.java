package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jishshi on 2015/6/10.
 */
public class MyFrame extends JFrame {
    private JPanel myPanel;
    private JButton exportBtn;
    private JLabel exportMsg;
    private JTabbedPane tabbedPane1;

    public MyFrame(String title, int width, int height) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);                          // 设置窗口大小
        Dimension displaySize = Toolkit.getDefaultToolkit().getScreenSize(); // 获得显示器大小对象
        Dimension frameSize = this.getSize();             // 获得窗口大小对象
        if (frameSize.width > displaySize.width)
            frameSize.width = displaySize.width;           // 窗口的宽度不能大于显示器的宽度
        this.setLocation((displaySize.width - frameSize.width) / 3,
                (displaySize.height - frameSize.height) / 4); // 设置窗口居中显示器显示
        //frame.pack();     //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents


        this.setContentPane(myPanel);

        this.setResizable(false);
    }

}
