package ex43.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class HtmlBuilder {
    private static String currentPath;

    public static String makeFile(String siteName) {
        currentPath = System.getProperty("user.dir");
        currentPath += "\\" + siteName;


        return currentPath;
    }

    public static void formatFile(String currentPath, String siteName, String author, char js, char css) {
        File website = new File(currentPath);
        boolean websiteCreated = website.mkdir();
        if(websiteCreated) {
            System.out.println("Created" + currentPath);
            try{
                FileWriter skeletonWriter = new FileWriter(new File(currentPath + "\\index.html"));
                skeletonWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                skeletonWriter.write("\t<meta author=\""+author+"\">\n");
                skeletonWriter.write("\t<title>"+siteName+"</title>\n");
                skeletonWriter.write("</head>\n<body>\n\n</body>\n</html>");
                skeletonWriter.close();
                System.out.println("Created" +currentPath + "\\index.html");
                if(js == 'y' || js == 'Y') {
                    File jsFolder = new File(currentPath + "\\js");
                    boolean jsCreated = jsFolder.mkdir();
                    if(jsCreated) {
                        System.out.println("Created" + jsFolder + "\\");
                    }
                    else {
                        System.out.println("Js folder not created");
                    }
                }
                if(css == 'y' || css == 'Y') {
                    File cssFolder = new File(currentPath + "\\css");
                    boolean cssCreated = cssFolder.mkdir();
                    if(cssCreated) {
                        System.out.println("Created" + cssFolder + "\\");
                    }
                    else {
                        System.out.println("CSS folder not created");
                    }
                }
            }
            catch(IOException e) {
                System.out.println("index.html not created");
            }
        }
        else {
            System.out.println("Website folder not created");
        }

    }

}
