package ex43.base;
import java.util.Scanner;
public class UserInput {
    private static String siteName;
    private static String siteAuthor;
    private static char siteJS;
    private static char siteCSS;
    private static String path;

    private static final Scanner in = new Scanner(System.in);

    public void setSiteName(String name) {
        siteName = name;
    }
    public String getSiteName() {
        return siteName;
    }
    public void setAuthor(String author) {
        siteAuthor = author;
    }
    public String getAuthor() {
        return siteAuthor;
    }
    public void setJS(char js) {
        siteJS = js;
    }
    public char getJS() {
        return siteJS;
    }
    public void setCSS(char css) {
        siteCSS = css;
    }
    public char getCSS() {
        return siteCSS;
    }


    public void getInput() {
        System.out.print("Site name: ");
        setSiteName(in.nextLine());
        System.out.print("Author: ");
        setAuthor(in.nextLine());
        System.out.print("Do you want a folder for JavaScript? ");
        setJS(in.next().charAt(0));
        System.out.print("Do you want a folder for CSS? ");
        setCSS(in.next().charAt(0));

    }

}
