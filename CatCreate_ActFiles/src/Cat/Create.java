

import java.io.*;
import javax.swing.*;


public class Create{
    
    //PopupMesseageCreate

    public static void msgbox(String msg,String title){
        JOptionPane.showMessageDialog(null,msg,title,JOptionPane.INFORMATION_MESSAGE,null);
    }

    public static void main(String[] args) {
        
        //rootDirectoryPathCreate
        String dev_path  = "C:\\Users\\theme\\Documents\\Dev_Factory\\" + args[0].toString();

        //root-SubDirectoryPathCreate
        String build_path  = dev_path + "//build";

        String src_path  = dev_path + "//src";

        String web_path  = dev_path + "//web";

        //root-DirectoryAdd_Array
        String[] first_directory = {build_path,src_path,web_path};

        //Web-SubDirectoryPathCreate
        String css_path  = web_path + "//web";
        String js_path  = web_path + "//js";
        String images_path  = web_path + "//images";
        String html_path  = web_path + "//html";
        String jsp_path  = web_path + "//jsp";
        String metaifn_path  = web_path + "//META-INF";
        String webinf_path  = web_path + "//WEB-INF";
        //Web-SubDirectoryPathAdd_Array

        String[] web_directory = {css_path,js_path,images_path,html_path,jsp_path,metaifn_path,webinf_path};

        //WEB-INF-SubDirectoryPathCreate

        String webinf_lib_path  = webinf_path + "//lib";
        String webinf_classes_path  = webinf_path + "//classes";
        String[] webinf_directory = {webinf_lib_path,webinf_classes_path};

        File root_directory = new File(dev_path);

        if (root_directory.mkdir() == false){
            msgbox("Failue","Error");
        }

        //root-SubDirectoryCreate
        for (String path : first_directory) {
            File temp = new File(path);
            temp.mkdir();         
        }

        //web-SubDirectoryCreate
           for (String path : web_directory) {
           File temp = new File(path);
           temp.mkdir();         
        }

        //WEB-INF-SubDirectoryCreate
        for (String path : webinf_directory) {
            File temp = new File(path);
            temp.mkdir();         
         }


        
    }
}

