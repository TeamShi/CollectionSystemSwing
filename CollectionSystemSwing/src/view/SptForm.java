package view;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import model.ConfigBean;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

/**
 * Created by jishshi on 2015/6/11.
 */
public class SptForm {
    public JPanel getFormPanel() {
        return formPanel;
    }

    public void setFormPanel(JPanel formPanel) {
        this.formPanel = formPanel;
    }

    private JPanel formPanel;
    private JFormattedTextField table1Field2;
    private JFormattedTextField table1Field1;
    private JFormattedTextField table1Field3;
    private JLabel table1Title;
    private JTextPane table2Area;
    private JFormattedTextField table2Field1;
    private JFormattedTextField table2Field2;
    private JFormattedTextField table2Field3;
    private JFormattedTextField table3Field1;
    private JFormattedTextField table3Field2;
    private JFormattedTextField table3Field3;
    private JLabel table3Title;
    private JLabel table2Title;
    private JTextPane table3Area;
    private JFormattedTextField table1Field4;
    private JTextPane table1Area;
    private JFormattedTextField table1Field5;

    private void updateAreas() {
        String area1 = "标准贯入击数:" + "    N≤" + this.table1Field1.getText() + "\t" + this.table1Field1.getText() + "<N≤" + this.table1Field2.getText() + "\t  " + this.table1Field2.getText() + "<N≤" + this.table1Field3.getText() + "\t" + this.table1Field3.getText() + "<N≤" + this.table1Field4.getText() + "\t   " + this.table1Field4.getText() + "<N≤" + this.table1Field5.getText() + "       " + "N>" + this.table1Field5.getText() + "\n" +
                "稠度:       " + "\t    流动" + "\t软塑" + "\t  软可塑" + "\t  硬可塑" + "\t     硬塑" + "\t            坚硬\t";
        this.table1Area.setText(area1);

        String area2 = "标准贯入击数:" + "    N≤" + this.table2Field1.getText() + "\t\t" + this.table2Field1.getText() + "<N≤" + this.table2Field2.getText() + "\t" + this.table2Field2.getText() + "<N≤" + this.table1Field3.getText() + "\t\t" + "N>" + this.table1Field3.getText() + "\n" +
                "稠度:       " + "\t     松散\t" + "\t稍密\t" + "\t中密\t" + "\t密实\t";
        this.table2Area.setText(area2);

        String area3 = "标准贯入击数:" + "    N≤" + this.table3Field1.getText() + "\t\t" + this.table3Field1.getText() + "<N≤" + this.table3Field2.getText() + "\t" + this.table3Field2.getText() + "<N≤" + this.table1Field3.getText() + "\t\t" + "N>" + this.table1Field3.getText() + "\n" +
                "稠度:       " + "\t     松散\t" + "\t稍密\t" + "\t中密\t" + "\t密实\t";
        this.table3Area.setText(area3);

    }

    public SptForm() {
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

        this.table1Field1.getDocument().addDocumentListener(documentListener);
        this.table1Field2.getDocument().addDocumentListener(documentListener);
        this.table1Field3.getDocument().addDocumentListener(documentListener);
        this.table1Field4.getDocument().addDocumentListener(documentListener);
        this.table1Field5.getDocument().addDocumentListener(documentListener);

        this.table2Field1.getDocument().addDocumentListener(documentListener);
        this.table2Field2.getDocument().addDocumentListener(documentListener);
        this.table2Field3.getDocument().addDocumentListener(documentListener);

        this.table3Field1.getDocument().addDocumentListener(documentListener);
        this.table3Field2.getDocument().addDocumentListener(documentListener);
        this.table3Field3.getDocument().addDocumentListener(documentListener);
        
    }

    public JFormattedTextField getTable1Field2() {
        return table1Field2;
    }

    public void setTable1Field2(JFormattedTextField table1Field2) {
        this.table1Field2 = table1Field2;
    }

    public JFormattedTextField getTable1Field1() {
        return table1Field1;
    }

    public void setTable1Field1(JFormattedTextField table1Field1) {
        this.table1Field1 = table1Field1;
    }

    public JFormattedTextField getTable1Field3() {
        return table1Field3;
    }

    public void setTable1Field3(JFormattedTextField table1Field3) {
        this.table1Field3 = table1Field3;
    }

    public JLabel getTable1Title() {
        return table1Title;
    }

    public void setTable1Title(JLabel table1Title) {
        this.table1Title = table1Title;
    }

    public JTextPane getTable2Area() {
        return table2Area;
    }

    public void setTable2Area(JTextPane table2Area) {
        this.table2Area = table2Area;
    }

    public JFormattedTextField getTable2Field1() {
        return table2Field1;
    }

    public void setTable2Field1(JFormattedTextField table2Field1) {
        this.table2Field1 = table2Field1;
    }

    public JFormattedTextField getTable2Field2() {
        return table2Field2;
    }

    public void setTable2Field2(JFormattedTextField table2Field2) {
        this.table2Field2 = table2Field2;
    }

    public JFormattedTextField getTable2Field3() {
        return table2Field3;
    }

    public void setTable2Field3(JFormattedTextField table2Field3) {
        this.table2Field3 = table2Field3;
    }

    public JFormattedTextField getTable3Field1() {
        return table3Field1;
    }

    public void setTable3Field1(JFormattedTextField table3Field1) {
        this.table3Field1 = table3Field1;
    }

    public JFormattedTextField getTable3Field2() {
        return table3Field2;
    }

    public void setTable3Field2(JFormattedTextField table3Field2) {
        this.table3Field2 = table3Field2;
    }

    public JFormattedTextField getTable3Field3() {
        return table3Field3;
    }

    public void setTable3Field3(JFormattedTextField table3Field3) {
        this.table3Field3 = table3Field3;
    }

    public JLabel getTable3Title() {
        return table3Title;
    }

    public void setTable3Title(JLabel table3Title) {
        this.table3Title = table3Title;
    }

    public JLabel getTable2Title() {
        return table2Title;
    }

    public void setTable2Title(JLabel table2Title) {
        this.table2Title = table2Title;
    }

    public JTextPane getTable3Area() {
        return table3Area;
    }

    public void setTable3Area(JTextPane table3Area) {
        this.table3Area = table3Area;
    }

    public JFormattedTextField getTable1Field4() {
        return table1Field4;
    }

    public void setTable1Field4(JFormattedTextField table1Field4) {
        this.table1Field4 = table1Field4;
    }

    public JTextPane getTable1Area() {
        return table1Area;
    }

    public void setTable1Area(JTextPane table1Area) {
        this.table1Area = table1Area;
    }

    public JFormattedTextField getTable1Field5() {
        return table1Field5;
    }

    public void setTable1Field5(JFormattedTextField table1Field5) {
        this.table1Field5 = table1Field5;
    }

    public void setData(ConfigBean data) {
        table1Field2.setText(data.getTable1Field2());
        table1Field1.setText(data.getTable1Field1());
        table1Field3.setText(data.getTable1Field3());
        table2Field2.setText(data.getTable2Field2());
        table2Field1.setText(data.getTable2Field1());
        table2Field3.setText(data.getTable2Field3());
        table3Field2.setText(data.getTable3Field2());
        table3Field1.setText(data.getTable3Field1());
        table3Field3.setText(data.getTable3Field3());
        table1Field4.setText(data.getTable1Field4());
        table1Field5.setText(data.getTable1Field5());
    }

    public void getData(ConfigBean data) {
        data.setTable1Field2(table1Field2.getText());
        data.setTable1Field1(table1Field1.getText());
        data.setTable1Field3(table1Field3.getText());
        data.setTable2Field2(table2Field2.getText());
        data.setTable2Field1(table2Field1.getText());
        data.setTable2Field3(table2Field3.getText());
        data.setTable3Field2(table3Field2.getText());
        data.setTable3Field1(table3Field1.getText());
        data.setTable3Field3(table3Field3.getText());
        data.setTable1Field4(table1Field4.getText());
        data.setTable1Field5(table1Field5.getText());
    }

    public boolean isModified(ConfigBean data) {
        if (table1Field2.getText() != null ? !table1Field2.getText().equals(data.getTable1Field2()) : data.getTable1Field2() != null)
            return true;
        if (table1Field1.getText() != null ? !table1Field1.getText().equals(data.getTable1Field1()) : data.getTable1Field1() != null)
            return true;
        if (table1Field3.getText() != null ? !table1Field3.getText().equals(data.getTable1Field3()) : data.getTable1Field3() != null)
            return true;
        if (table2Field2.getText() != null ? !table2Field2.getText().equals(data.getTable2Field2()) : data.getTable2Field2() != null)
            return true;
        if (table2Field1.getText() != null ? !table2Field1.getText().equals(data.getTable2Field1()) : data.getTable2Field1() != null)
            return true;
        if (table2Field3.getText() != null ? !table2Field3.getText().equals(data.getTable2Field3()) : data.getTable2Field3() != null)
            return true;
        if (table3Field2.getText() != null ? !table3Field2.getText().equals(data.getTable3Field2()) : data.getTable3Field2() != null)
            return true;
        if (table3Field1.getText() != null ? !table3Field1.getText().equals(data.getTable3Field1()) : data.getTable3Field1() != null)
            return true;
        if (table3Field3.getText() != null ? !table3Field3.getText().equals(data.getTable3Field3()) : data.getTable3Field3() != null)
            return true;
        if (table1Field4.getText() != null ? !table1Field4.getText().equals(data.getTable1Field4()) : data.getTable1Field4() != null)
            return true;
        if (table1Field5.getText() != null ? !table1Field5.getText().equals(data.getTable1Field5()) : data.getTable1Field5() != null)
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
        formPanel = new JPanel();
        formPanel.setLayout(new FormLayout("left:56dlu:noGrow,left:31dlu:noGrow,left:89px:noGrow,left:32dlu:noGrow,fill:84px:noGrow,left:4dlu:noGrow,fill:32dlu:noGrow,left:4dlu:noGrow,fill:max(d;4px):noGrow,left:4dlu:noGrow,fill:58px:noGrow,left:4dlu:noGrow,fill:max(d;4px):noGrow,left:4dlu:noGrow,fill:66px:noGrow", "center:d:noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,fill:53px:noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:49px:noGrow,top:6px:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:50px:noGrow"));
        formPanel.setBackground(new Color(-6047008));
        table1Title = new JLabel();
        table1Title.setBackground(new Color(-6047008));
        table1Title.setText("黏性土的稠度与标准贯入击数的关系");
        CellConstraints cc = new CellConstraints();
        formPanel.add(table1Title, cc.xyw(1, 1, 5, CellConstraints.FILL, CellConstraints.FILL));
        final JLabel label1 = new JLabel();
        label1.setText("贯入击数参数一");
        formPanel.add(label1, cc.xy(1, 3));
        final JLabel label2 = new JLabel();
        label2.setText("贯入击数参数二");
        formPanel.add(label2, cc.xy(3, 3, CellConstraints.LEFT, CellConstraints.DEFAULT));
        final JLabel label3 = new JLabel();
        label3.setText("贯入击数参数三");
        formPanel.add(label3, cc.xy(5, 3));
        table1Field2 = new JFormattedTextField();
        table1Field2.setText("");
        formPanel.add(table1Field2, cc.xy(4, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        table1Field1 = new JFormattedTextField();
        formPanel.add(table1Field1, cc.xy(2, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        table1Field3 = new JFormattedTextField();
        table1Field3.setText("");
        formPanel.add(table1Field3, cc.xy(7, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        table2Title = new JLabel();
        table2Title.setBackground(new Color(-6047008));
        table2Title.setText("黏性土的稠度与标准贯入击数的关系");
        formPanel.add(table2Title, cc.xyw(1, 7, 5));
        final JLabel label4 = new JLabel();
        label4.setText("贯入击数参数一");
        formPanel.add(label4, cc.xy(1, 9));
        final JLabel label5 = new JLabel();
        label5.setText("贯入击数参数二");
        formPanel.add(label5, cc.xy(3, 9, CellConstraints.LEFT, CellConstraints.DEFAULT));
        final JLabel label6 = new JLabel();
        label6.setText("贯入击数参数三");
        formPanel.add(label6, cc.xy(5, 9));
        table2Field2 = new JFormattedTextField();
        table2Field2.setText("");
        formPanel.add(table2Field2, cc.xy(4, 9, CellConstraints.FILL, CellConstraints.DEFAULT));
        table2Field1 = new JFormattedTextField();
        table2Field1.setText("");
        formPanel.add(table2Field1, cc.xy(2, 9, CellConstraints.FILL, CellConstraints.DEFAULT));
        table2Field3 = new JFormattedTextField();
        formPanel.add(table2Field3, cc.xy(7, 9, CellConstraints.FILL, CellConstraints.DEFAULT));
        table3Title = new JLabel();
        table3Title.setBackground(new Color(-6047008));
        table3Title.setText("黏性土的稠度与标准贯入击数的关系");
        formPanel.add(table3Title, cc.xyw(1, 13, 5));
        final JLabel label7 = new JLabel();
        label7.setText("贯入击数参数一");
        formPanel.add(label7, cc.xy(1, 15));
        final JLabel label8 = new JLabel();
        label8.setText("贯入击数参数二");
        formPanel.add(label8, cc.xy(3, 15, CellConstraints.LEFT, CellConstraints.DEFAULT));
        final JLabel label9 = new JLabel();
        label9.setText("贯入击数参数三");
        formPanel.add(label9, cc.xy(5, 15));
        table3Field2 = new JFormattedTextField();
        formPanel.add(table3Field2, cc.xy(4, 15, CellConstraints.FILL, CellConstraints.DEFAULT));
        table3Field1 = new JFormattedTextField();
        table3Field1.setText("");
        formPanel.add(table3Field1, cc.xy(2, 15, CellConstraints.FILL, CellConstraints.DEFAULT));
        table3Field3 = new JFormattedTextField();
        table3Field3.setText("");
        formPanel.add(table3Field3, cc.xy(7, 15, CellConstraints.FILL, CellConstraints.DEFAULT));
        table1Area = new JTextPane();
        table1Area.setEditable(false);
        table1Area.setText("");
        formPanel.add(table1Area, cc.xyw(1, 5, 15, CellConstraints.FILL, CellConstraints.FILL));
        final JLabel label10 = new JLabel();
        label10.setText("贯入击数参数四");
        formPanel.add(label10, cc.xy(9, 3));
        table1Field4 = new JFormattedTextField();
        table1Field4.setDragEnabled(false);
        table1Field4.setText("");
        formPanel.add(table1Field4, cc.xy(11, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        final JLabel label11 = new JLabel();
        label11.setText("贯入击数参数二");
        formPanel.add(label11, cc.xy(13, 3, CellConstraints.LEFT, CellConstraints.DEFAULT));
        table1Field5 = new JFormattedTextField();
        formPanel.add(table1Field5, cc.xy(15, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        table2Area = new JTextPane();
        table2Area.setEditable(false);
        table2Area.setText("");
        formPanel.add(table2Area, cc.xyw(1, 11, 15, CellConstraints.FILL, CellConstraints.FILL));
        table3Area = new JTextPane();
        table3Area.setEditable(false);
        table3Area.setText("");
        formPanel.add(table3Area, cc.xyw(1, 17, 15, CellConstraints.FILL, CellConstraints.FILL));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return formPanel;
    }
}
