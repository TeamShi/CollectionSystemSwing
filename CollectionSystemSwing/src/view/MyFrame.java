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
        this.setSize(width, height);                          // ���ô��ڴ�С
        Dimension displaySize = Toolkit.getDefaultToolkit().getScreenSize(); // �����ʾ����С����
        Dimension frameSize = this.getSize();             // ��ô��ڴ�С����
        if (frameSize.width > displaySize.width)
            frameSize.width = displaySize.width;           // ���ڵĿ�Ȳ��ܴ�����ʾ���Ŀ��
        this.setLocation((displaySize.width - frameSize.width) / 3,
                (displaySize.height - frameSize.height) / 4); // ���ô��ھ�����ʾ����ʾ
        //frame.pack();     //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents


        this.setContentPane(myPanel);

        this.setResizable(false);
    }

}
