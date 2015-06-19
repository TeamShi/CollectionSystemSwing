package view;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import model.ConfigBean;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

/**
 * Created by jishshi on 2015/6/10.
 */
public class DstForm {


    public JPanel getFormPanel() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    private JPanel panel1;
    private JPanel formPanel;
    private JLabel table4Title;
    private JFormattedTextField table4Field2;
    private JFormattedTextField table4Field1;
    private JFormattedTextField table4Field3;
    private JLabel table5Title;
    private JFormattedTextField table5Field2;
    private JFormattedTextField table5Field1;
    private JFormattedTextField table5Field3;
    private JTextPane table5Area;
    private JLabel table6Title;
    private JFormattedTextField table6Field2;
    private JFormattedTextField table6Field1;
    private JFormattedTextField table6Field3;
    private JTextPane table6Area;
    private JTextPane table4Area;
    private JFormattedTextField table5Field4;
    private JLabel table7Title;
    private JFormattedTextField table7Field2;
    private JFormattedTextField table7Field1;
    private JLabel table8Title;
    private JFormattedTextField table8Field2;
    private JFormattedTextField table8Field1;
    private JFormattedTextField table8Field3;
    private JTextPane table8Area;
    private JTextPane table7Area;
    private JFormattedTextField table7Field3;

    private void updateAreas() {
        String area4 = "动力触探击数:" + "    N63.5≤" + this.table4Field1.getText() + "\t" + this.table4Field1.getText() + "<N63.5≤" + this.table4Field2.getText() + "\t" + this.table4Field2.getText() + "<N63.5≤" + this.table4Field3.getText() + "\t" + "N63.5>" + this.table4Field3.getText() + "\n" +
                "密实度:     " + "\t     松散\t" + "\t稍密\t" + "\t中实\t" + "\t密实\t";
        this.table4Area.setText(area4);
        String area5 = "动力触探击数:" + "    N120 ≤" + this.table5Field1.getText() + "\t" + this.table5Field1.getText() + "<N120 ≤" + this.table5Field2.getText() + "\t" + this.table5Field2.getText() + "<N120 ≤" + this.table5Field3.getText() + "\t" + this.table5Field3.getText() + "<N120 ≤" + this.table5Field4.getText() + "\t" + "N120>" + this.table5Field4.getText() + "\n" +
                "密实度:     " + "\t     松散\t" + "\t稍密\t" + "\t中密\t" + "\t密实\t" + "\t很密\t";
        this.table5Area.setText(area5);
        String area6 = "动力触探击数:" + "    N63.6≤" + this.table6Field1.getText() + "\t" + this.table6Field1.getText() + "<N63.6≤" + this.table6Field2.getText() + "\t" + this.table6Field2.getText() + "<N63.6≤" + this.table4Field3.getText() + "\t" + "N63.6>" + this.table4Field3.getText() + "\n" +
                "密实度:     " + "\t     松散\t" + "\t稍密\t" + "\t中密\t" + "\t密实\t";
        this.table6Area.setText(area6);
        String area7 = "动力触探击数:" + "    N63.7≤" + this.table7Field1.getText() + "\t" + this.table7Field1.getText() + "<N63.7≤" + this.table7Field2.getText() + "\t" + this.table7Field2.getText() + "<N63.7≤" + this.table7Field3.getText() + "\t" + "N63.7>" + this.table7Field3.getText() + "\n" +
                "密实度:     " + "\t     松散\t" + "\t稍密\t" + "\t中密\t" + "\t密实\t";
        this.table7Area.setText(area7);
        String area8 = "动力触探击数:" + "    N83.8≤" + this.table8Field1.getText() + "\t" + this.table8Field1.getText() + "<N83.8≤" + this.table8Field2.getText() + "\t" + this.table8Field2.getText() + "<N83.8≤" + this.table8Field3.getText() + "\t" + "N83.8>" + this.table8Field3.getText() + "\n" +
                "密实度:     " + "\t     松散\t" + "\t稍密\t" + "\t中密\t" + "\t密实\t";
        this.table8Area.setText(area8);

    }

    public DstForm() {
        DocumentListener documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {//这是更改操作的处理
                updateAreas();
            }

            public void insertUpdate(DocumentEvent e) {//这是插入操作的处理
                updateAreas();
            }

            public void removeUpdate(DocumentEvent e) {//这是删除操作的处理
                updateAreas();
            }
        };

        this.table4Field1.getDocument().addDocumentListener(documentListener);
        this.table4Field2.getDocument().addDocumentListener(documentListener);
        this.table4Field3.getDocument().addDocumentListener(documentListener);

        this.table5Field1.getDocument().addDocumentListener(documentListener);
        this.table5Field2.getDocument().addDocumentListener(documentListener);
        this.table5Field3.getDocument().addDocumentListener(documentListener);
        this.table5Field3.getDocument().addDocumentListener(documentListener);

        this.table6Field1.getDocument().addDocumentListener(documentListener);
        this.table6Field2.getDocument().addDocumentListener(documentListener);
        this.table6Field3.getDocument().addDocumentListener(documentListener);

        this.table7Field1.getDocument().addDocumentListener(documentListener);
        this.table7Field2.getDocument().addDocumentListener(documentListener);
        this.table7Field3.getDocument().addDocumentListener(documentListener);

        this.table8Field1.getDocument().addDocumentListener(documentListener);
        this.table8Field2.getDocument().addDocumentListener(documentListener);
        this.table8Field3.getDocument().addDocumentListener(documentListener);

    }

    public void setData(ConfigBean data) {
        table4Field2.setText(data.getTable4Field2());
        table4Field1.setText(data.getTable4Field1());
        table4Field3.setText(data.getTable4Field3());
        table5Field2.setText(data.getTable5Field2());
        table5Field1.setText(data.getTable5Field1());
        table5Field3.setText(data.getTable5Field3());
        table6Field2.setText(data.getTable6Field2());
        table6Field1.setText(data.getTable6Field1());
        table6Field3.setText(data.getTable6Field3());
        table5Field4.setText(data.getTable5Field4());
        table7Field2.setText(data.getTable7Field2());
        table7Field1.setText(data.getTable7Field1());
        table7Field3.setText(data.getTable7Field3());
        table8Field2.setText(data.getTable8Field2());
        table8Field1.setText(data.getTable8Field1());
        table8Field3.setText(data.getTable8Field3());
    }

    public void getData(ConfigBean data) {
        data.setTable4Field2(table4Field2.getText());
        data.setTable4Field1(table4Field1.getText());
        data.setTable4Field3(table4Field3.getText());
        data.setTable5Field2(table5Field2.getText());
        data.setTable5Field1(table5Field1.getText());
        data.setTable5Field3(table5Field3.getText());
        data.setTable6Field2(table6Field2.getText());
        data.setTable6Field1(table6Field1.getText());
        data.setTable6Field3(table6Field3.getText());
        data.setTable5Field4(table5Field4.getText());
        data.setTable7Field2(table7Field2.getText());
        data.setTable7Field1(table7Field1.getText());
        data.setTable7Field3(table7Field3.getText());
        data.setTable8Field2(table8Field2.getText());
        data.setTable8Field1(table8Field1.getText());
        data.setTable8Field3(table8Field3.getText());
    }

    public boolean isModified(ConfigBean data) {
        if (table4Field2.getText() != null ? !table4Field2.getText().equals(data.getTable4Field2()) : data.getTable4Field2() != null)
            return true;
        if (table4Field1.getText() != null ? !table4Field1.getText().equals(data.getTable4Field1()) : data.getTable4Field1() != null)
            return true;
        if (table4Field3.getText() != null ? !table4Field3.getText().equals(data.getTable4Field3()) : data.getTable4Field3() != null)
            return true;
        if (table5Field2.getText() != null ? !table5Field2.getText().equals(data.getTable5Field2()) : data.getTable5Field2() != null)
            return true;
        if (table5Field1.getText() != null ? !table5Field1.getText().equals(data.getTable5Field1()) : data.getTable5Field1() != null)
            return true;
        if (table5Field3.getText() != null ? !table5Field3.getText().equals(data.getTable5Field3()) : data.getTable5Field3() != null)
            return true;
        if (table6Field2.getText() != null ? !table6Field2.getText().equals(data.getTable6Field2()) : data.getTable6Field2() != null)
            return true;
        if (table6Field1.getText() != null ? !table6Field1.getText().equals(data.getTable6Field1()) : data.getTable6Field1() != null)
            return true;
        if (table6Field3.getText() != null ? !table6Field3.getText().equals(data.getTable6Field3()) : data.getTable6Field3() != null)
            return true;
        if (table5Field4.getText() != null ? !table5Field4.getText().equals(data.getTable5Field4()) : data.getTable5Field4() != null)
            return true;
        if (table7Field2.getText() != null ? !table7Field2.getText().equals(data.getTable7Field2()) : data.getTable7Field2() != null)
            return true;
        if (table7Field1.getText() != null ? !table7Field1.getText().equals(data.getTable7Field1()) : data.getTable7Field1() != null)
            return true;
        if (table7Field3.getText() != null ? !table7Field3.getText().equals(data.getTable7Field3()) : data.getTable7Field3() != null)
            return true;
        if (table8Field2.getText() != null ? !table8Field2.getText().equals(data.getTable8Field2()) : data.getTable8Field2() != null)
            return true;
        if (table8Field1.getText() != null ? !table8Field1.getText().equals(data.getTable8Field1()) : data.getTable8Field1() != null)
            return true;
        if (table8Field3.getText() != null ? !table8Field3.getText().equals(data.getTable8Field3()) : data.getTable8Field3() != null)
            return true;
        return false;
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new FormLayout("fill:d:grow", "center:d:noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow"));
        panel1.setBackground(new Color(-6047008));
        panel1.setFont(new Font("Times New Roman", panel1.getFont().getStyle(), 16));
        formPanel = new JPanel();
        formPanel.setLayout(new FormLayout("left:56dlu:noGrow,left:32dlu:noGrow,left:92px:noGrow,left:34dlu:noGrow,fill:84px:noGrow,left:4dlu:noGrow,fill:40dlu:noGrow,left:4dlu:noGrow,fill:max(d;4px):noGrow,left:4dlu:noGrow,fill:39dlu:noGrow,left:4dlu:noGrow,fill:d:grow", "center:d:noGrow,top:4dlu:noGrow,center:p:noGrow,top:4dlu:noGrow,fill:50px:noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:50px:noGrow,top:4dlu:noGrow,center:17px:noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:50px:noGrow"));
        formPanel.setBackground(new Color(-6047008));
        CellConstraints cc = new CellConstraints();
        panel1.add(formPanel, cc.xy(1, 1));
        table4Title = new JLabel();
        table4Title.setBackground(new Color(-6047008));
        table4Title.setText("碎石土的密实度与触探击数的关系（N63.5）");
        formPanel.add(table4Title, cc.xyw(1, 1, 5, CellConstraints.FILL, CellConstraints.FILL));
        final JLabel label1 = new JLabel();
        label1.setText("触探击数参数一");
        formPanel.add(label1, cc.xy(1, 3));
        final JLabel label2 = new JLabel();
        label2.setText("触探击数参数二");
        formPanel.add(label2, cc.xy(3, 3, CellConstraints.LEFT, CellConstraints.DEFAULT));
        final JLabel label3 = new JLabel();
        label3.setText("触探击数参数三");
        formPanel.add(label3, cc.xy(5, 3));
        table4Field2 = new JFormattedTextField();
        table4Field2.setText("");
        formPanel.add(table4Field2, cc.xy(4, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        table4Field1 = new JFormattedTextField();
        table4Field1.setText("");
        formPanel.add(table4Field1, cc.xy(2, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        table4Field3 = new JFormattedTextField();
        table4Field3.setText("");
        formPanel.add(table4Field3, cc.xy(7, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        table5Title = new JLabel();
        table5Title.setBackground(new Color(-6047008));
        table5Title.setText("碎石土的密实度与触探击数的关系（N120）");
        formPanel.add(table5Title, cc.xyw(1, 7, 5));
        final JLabel label4 = new JLabel();
        label4.setText("触探击数参数一");
        formPanel.add(label4, cc.xy(1, 9));
        final JLabel label5 = new JLabel();
        label5.setText("触探击数参数二");
        formPanel.add(label5, cc.xy(3, 9, CellConstraints.LEFT, CellConstraints.DEFAULT));
        final JLabel label6 = new JLabel();
        label6.setText("触探击数参数三");
        formPanel.add(label6, cc.xy(5, 9));
        table5Field2 = new JFormattedTextField();
        table5Field2.setText("");
        formPanel.add(table5Field2, cc.xy(4, 9, CellConstraints.FILL, CellConstraints.DEFAULT));
        table5Field1 = new JFormattedTextField();
        table5Field1.setText("");
        formPanel.add(table5Field1, cc.xy(2, 9, CellConstraints.FILL, CellConstraints.DEFAULT));
        table5Field3 = new JFormattedTextField();
        formPanel.add(table5Field3, cc.xy(7, 9, CellConstraints.FILL, CellConstraints.DEFAULT));
        table6Title = new JLabel();
        table6Title.setBackground(new Color(-6047008));
        table6Title.setText("砂土的密实度与触探击数的关系（N63.6）");
        formPanel.add(table6Title, cc.xyw(1, 13, 5));
        final JLabel label7 = new JLabel();
        label7.setText("触探击数参数一");
        formPanel.add(label7, cc.xy(1, 15));
        final JLabel label8 = new JLabel();
        label8.setText("触探击数参数二");
        formPanel.add(label8, cc.xy(3, 15, CellConstraints.LEFT, CellConstraints.DEFAULT));
        final JLabel label9 = new JLabel();
        label9.setText("触探击数参数三");
        formPanel.add(label9, cc.xy(5, 15));
        table6Field2 = new JFormattedTextField();
        formPanel.add(table6Field2, cc.xy(4, 15, CellConstraints.FILL, CellConstraints.DEFAULT));
        table6Field1 = new JFormattedTextField();
        table6Field1.setText("");
        formPanel.add(table6Field1, cc.xy(2, 15, CellConstraints.FILL, CellConstraints.DEFAULT));
        table6Field3 = new JFormattedTextField();
        table6Field3.setText("");
        formPanel.add(table6Field3, cc.xy(7, 15, CellConstraints.FILL, CellConstraints.DEFAULT));
        table4Area = new JTextPane();
        table4Area.setBackground(new Color(-1));
        table4Area.setEditable(false);
        table4Area.setText("");
        formPanel.add(table4Area, cc.xyw(1, 5, 13, CellConstraints.FILL, CellConstraints.FILL));
        final JLabel label10 = new JLabel();
        label10.setText("触探击数参数四");
        formPanel.add(label10, cc.xy(9, 9));
        table5Field4 = new JFormattedTextField();
        formPanel.add(table5Field4, cc.xy(11, 9, CellConstraints.FILL, CellConstraints.DEFAULT));
        table5Area = new JTextPane();
        table5Area.setBackground(new Color(-1));
        table5Area.setEditable(false);
        table5Area.setText("");
        formPanel.add(table5Area, cc.xyw(1, 11, 13, CellConstraints.FILL, CellConstraints.FILL));
        table6Area = new JTextPane();
        table6Area.setBackground(new Color(-1));
        table6Area.setEditable(false);
        table6Area.setText("");
        formPanel.add(table6Area, cc.xyw(1, 17, 13, CellConstraints.FILL, CellConstraints.FILL));
        table7Title = new JLabel();
        table7Title.setBackground(new Color(-6047008));
        table7Title.setText("砂土的密实度与触探击数的关系（N63.7）");
        panel1.add(table7Title, cc.xy(1, 3, CellConstraints.LEFT, CellConstraints.DEFAULT));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new FormLayout("left:56dlu:noGrow,left:31dlu:noGrow,left:89px:noGrow,left:36dlu:noGrow,fill:84px:noGrow,left:4dlu:noGrow,fill:44dlu:noGrow,left:4dlu:noGrow,fill:d:grow", "center:max(d;4px):noGrow,top:4dlu:noGrow,fill:50px:noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:50px:noGrow"));
        panel2.setBackground(new Color(-6047008));
        panel1.add(panel2, cc.xy(1, 5));
        final JLabel label11 = new JLabel();
        label11.setText("触探击数参数一");
        panel2.add(label11, cc.xy(1, 1));
        final JLabel label12 = new JLabel();
        label12.setText("触探击数参数二");
        panel2.add(label12, cc.xy(3, 1, CellConstraints.LEFT, CellConstraints.DEFAULT));
        final JLabel label13 = new JLabel();
        label13.setText("触探击数参数三");
        panel2.add(label13, cc.xy(5, 1));
        table7Field2 = new JFormattedTextField();
        table7Field2.setText("");
        panel2.add(table7Field2, cc.xy(4, 1, CellConstraints.FILL, CellConstraints.DEFAULT));
        table7Field1 = new JFormattedTextField();
        panel2.add(table7Field1, cc.xy(2, 1, CellConstraints.FILL, CellConstraints.DEFAULT));
        table7Field3 = new JFormattedTextField();
        table7Field3.setText("");
        panel2.add(table7Field3, cc.xy(7, 1, CellConstraints.FILL, CellConstraints.DEFAULT));
        table8Title = new JLabel();
        table8Title.setBackground(new Color(-6047008));
        table8Title.setText("砂土的密实度与触探击数的关系（N63.8）");
        panel2.add(table8Title, cc.xyw(1, 5, 5));
        final JLabel label14 = new JLabel();
        label14.setText("触探击数参数一");
        panel2.add(label14, cc.xy(1, 7));
        final JLabel label15 = new JLabel();
        label15.setText("触探击数参数二");
        panel2.add(label15, cc.xy(3, 7, CellConstraints.LEFT, CellConstraints.DEFAULT));
        final JLabel label16 = new JLabel();
        label16.setText("触探击数参数三");
        panel2.add(label16, cc.xy(5, 7));
        table8Field2 = new JFormattedTextField();
        table8Field2.setText("");
        panel2.add(table8Field2, cc.xy(4, 7, CellConstraints.FILL, CellConstraints.DEFAULT));
        table8Field1 = new JFormattedTextField();
        table8Field1.setText("");
        panel2.add(table8Field1, cc.xy(2, 7, CellConstraints.FILL, CellConstraints.DEFAULT));
        table8Field3 = new JFormattedTextField();
        panel2.add(table8Field3, cc.xy(7, 7, CellConstraints.FILL, CellConstraints.DEFAULT));
        table7Area = new JTextPane();
        table7Area.setBackground(new Color(-1));
        table7Area.setEditable(false);
        table7Area.setText("");
        panel2.add(table7Area, cc.xyw(1, 3, 9, CellConstraints.FILL, CellConstraints.FILL));
        table8Area = new JTextPane();
        table8Area.setBackground(new Color(-1));
        table8Area.setEditable(false);
        table8Area.setText("");
        panel2.add(table8Area, cc.xyw(1, 9, 9, CellConstraints.FILL, CellConstraints.FILL));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
