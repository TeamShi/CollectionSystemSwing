package util;

import com.teamshi.collectionsystem3.datastructure.Configuration;
import model.ConfigBean;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by
 * jishshi on 2015/6/18.
 */
public class Utility {
    public static void model2bean(ConfigBean configBean, Configuration configuration){
        //spt
        configBean.setTable1Field1(String.valueOf(configuration.getSptTable1Argument1()));
        configBean.setTable1Field2(String.valueOf(configuration.getSptTable1Argument2()));
        configBean.setTable1Field3(String.valueOf(configuration.getSptTable1Argument3()));
        configBean.setTable1Field4(String.valueOf(configuration.getSptTable1Argument4()));
        configBean.setTable1Field5(String.valueOf(configuration.getSptTable1Argument5()));

        configBean.setTable2Field1(String.valueOf(configuration.getSptTable2Argument1()));
        configBean.setTable2Field2(String.valueOf(configuration.getSptTable2Argument2()));
        configBean.setTable2Field3(String.valueOf(configuration.getSptTable2Argument3()));

        configBean.setTable3Field1(String.valueOf(configuration.getSptTable3Argument1()));
        configBean.setTable3Field2(String.valueOf(configuration.getSptTable3Argument2()));
        configBean.setTable3Field3(String.valueOf(configuration.getSptTable3Argument3()));

        //dst
        configBean.setTable4Field1(String.valueOf(configuration.getDstTable1_63_5_Argument2()));//not override arg1
        configBean.setTable4Field2(String.valueOf(configuration.getDstTable1_63_5_Argument3()));
        configBean.setTable4Field3(String.valueOf(configuration.getDstTable1_63_5_Argument4()));

        configBean.setTable5Field1(String.valueOf(configuration.getDstTable1_120_Argument2()));//not override arg1
        configBean.setTable5Field2(String.valueOf(configuration.getDstTable1_120_Argument3()));
        configBean.setTable5Field3(String.valueOf(configuration.getDstTable1_120_Argument4()));
        configBean.setTable5Field4(String.valueOf(configuration.getDstTable1_120_Argument5()));


        configBean.setTable6Field1(String.valueOf(configuration.getDstTable2_63_6_Argument1()));
        configBean.setTable6Field2(String.valueOf(configuration.getDstTable2_63_6_Argument2()));
        configBean.setTable6Field3(String.valueOf(configuration.getDstTable2_63_6_Argument3()));

        configBean.setTable7Field1(String.valueOf(configuration.getDstTable2_63_7_Argument1()));
        configBean.setTable7Field2(String.valueOf(configuration.getDstTable2_63_7_Argument2()));
        configBean.setTable7Field3(String.valueOf(configuration.getDstTable2_63_7_Argument3()));

        configBean.setTable8Field1(String.valueOf(configuration.getDstTable2_63_8_Argument1()));
        configBean.setTable8Field2(String.valueOf(configuration.getDstTable2_63_8_Argument2()));
        configBean.setTable8Field3(String.valueOf(configuration.getDstTable2_63_8_Argument3()));

        // template
        configBean.setTemplateDictionary(configuration.getTemplateDictionary());

    }

    public static void bean2model(Configuration configuration, ConfigBean configBean) {
        //spt
        configuration.setSptTable1Argument1(Double.parseDouble(configBean.getTable1Field1()));
        configuration.setSptTable1Argument2(Double.parseDouble(configBean.getTable1Field2()));
        configuration.setSptTable1Argument3(Double.parseDouble(configBean.getTable1Field3()));
        configuration.setSptTable1Argument4(Double.parseDouble(configBean.getTable1Field4()));
        configuration.setSptTable1Argument5(Double.parseDouble(configBean.getTable1Field5()));

        configuration.setSptTable2Argument1(Double.parseDouble(configBean.getTable2Field1()));
        configuration.setSptTable2Argument2(Double.parseDouble(configBean.getTable2Field2()));
        configuration.setSptTable2Argument3(Double.parseDouble(configBean.getTable2Field3()));

        configuration.setSptTable3Argument1(Double.parseDouble(configBean.getTable3Field1()));
        configuration.setSptTable3Argument2(Double.parseDouble(configBean.getTable3Field2()));
        configuration.setSptTable3Argument3(Double.parseDouble(configBean.getTable3Field3()));


        //dst
        configuration.setDstTable1_63_5_Argument2(Double.parseDouble(configBean.getTable4Field1()));//not override arg1
        configuration.setDstTable1_63_5_Argument3(Double.parseDouble(configBean.getTable4Field2()));
        configuration.setDstTable1_63_5_Argument4(Double.parseDouble(configBean.getTable4Field3()));

        configuration.setDstTable1_120_Argument2(Double.parseDouble(configBean.getTable5Field1()));//not override arg1
        configuration.setDstTable1_120_Argument3(Double.parseDouble(configBean.getTable5Field2()));
        configuration.setDstTable1_120_Argument4(Double.parseDouble(configBean.getTable5Field3()));
        configuration.setDstTable1_120_Argument5(Double.parseDouble(configBean.getTable5Field4()));


        configuration.setDstTable2_63_6_Argument1(Double.parseDouble(configBean.getTable6Field1()));
        configuration.setDstTable2_63_6_Argument2(Double.parseDouble(configBean.getTable6Field2()));
        configuration.setDstTable2_63_6_Argument3(Double.parseDouble(configBean.getTable6Field3()));

        configuration.setDstTable2_63_7_Argument1(Double.parseDouble(configBean.getTable7Field1()));
        configuration.setDstTable2_63_7_Argument2(Double.parseDouble(configBean.getTable7Field2()));
        configuration.setDstTable2_63_7_Argument3(Double.parseDouble(configBean.getTable7Field3()));

        configuration.setDstTable2_63_8_Argument1(Double.parseDouble(configBean.getTable8Field1()));
        configuration.setDstTable2_63_8_Argument2(Double.parseDouble(configBean.getTable8Field2()));
        configuration.setDstTable2_63_8_Argument3(Double.parseDouble(configBean.getTable8Field3()));
        configuration.setTemplateDictionary(configBean.getTemplateDictionary());

    }

    public static boolean exportConfig(Configuration configuration,String path) {
        try {
            File file = new File(path);
            ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(file));
            oo.writeObject(configuration);
            oo.flush();
            oo.close();
            System.out.println("对象序列化成功！");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
