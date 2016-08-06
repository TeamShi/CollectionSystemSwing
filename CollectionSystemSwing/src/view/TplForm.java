package view;

import model.ConfigBean;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Set;

/**
 * Created by
 * yueyue on 16/8/2.
 */

public class TplForm {
    private JList myList;
    private JPanel formPanel;
    private JTextPane previewDesc;
    private JTextField nameTextField;
    private JTextArea descTextArea;
    private JButton deleteButton;
    private JButton addButton;
    private Map<String, String> templateDictionary;

    public TplForm() {


        //set single selection mode
        myList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        myList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String templateName = (String) myList.getSelectedValue();
                previewDesc.setText(templateDictionary.get(templateName));
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String templateName = nameTextField.getText();
                if (null == templateName || templateName.trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "模版名称不可为空");
                    return;
                }

                templateName = templateName.trim();
                if (templateDictionary.containsKey(templateName)) {
                    JOptionPane.showMessageDialog(null, "模版名称" + templateName + "已存在");
                    return;
                }

                String templateDesc = descTextArea.getText();
                if (null == templateDesc || templateDesc.trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "模版内容不可为空");
                    return;
                }

                templateDesc = templateDesc.trim();
                templateDictionary.put(templateName, templateDesc);
                JOptionPane.showMessageDialog(null, "新模版添加成功");
                descTextArea.setText("");
                nameTextField.setText("");

                updateList();
                myList.setSelectedValue(templateName,false);

            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) myList.getSelectedValue();
                int selectedIndex = myList.getSelectedIndex();
                if (null == selected) {
                    JOptionPane.showMessageDialog(null, "请选择有效的模版名称");
                    return;
                }

                templateDictionary.remove(selected);
                JOptionPane.showMessageDialog(null, "模版删除成功");

                updateList();
                myList.setSelectedIndex(--selectedIndex);

            }
        });

    }

    public JPanel getFormPanel() {
        return formPanel;
    }

    public void setFormPanel(JPanel formPanel) {
        this.formPanel = formPanel;
    }


    public void setData(ConfigBean bean) {
        this.templateDictionary = bean.getTemplateDictionary();
        updateList();
    }

    private void updateList(){
        DefaultListModel listModel = new DefaultListModel();
        Set<Map.Entry<String, String>> entrySet = templateDictionary.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            listModel.addElement(entry.getKey());
        }

        myList.setModel(listModel);

    }
}
