package ch1403core;

import java.io.File;

/**
 * Created by EunHan on 2017-04-17.
 */
public class ImageList {

    public  String[] getI(){
        String path = "D:\\programs\\workplace\\intellijworkspace\\csc201_ch1403_jsp\\card images";
        File f = new File(path);
        String[] fileList = f.list();

        return fileList;

    }

    public void main(String[] s){
        for(String s1:new ImageList().getI()){
            System.out.println(s1);
        }
    }
}
