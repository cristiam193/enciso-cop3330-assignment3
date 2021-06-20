package ex43.base;

public class App {


    public static void main(String[] args) {
        UserInput input = new UserInput();
        input.getInput();
        String path = HtmlBuilder.makeFile(input.getSiteName());
        HtmlBuilder.formatFile(path, input.getSiteName(), input.getAuthor(), input.getJS(), input.getCSS());
        //generate html file
        //format html file
        //print output

    }
}
