import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws IOException {
        while(true) {
            String user = "Lösch dich";
            String error = "imagine Account Stealen";
            String description = "Wilder Skid Code bre";
            URL url = new URL("http://supercraftalex.000webhostapp.com/liquido/crash.php?user=" + replace(user) + "&errs=" + replace(error) + "&exc=" + replace(description));
            url.openConnection();
        }
    }

    public static String replace(String replacement) {
        return replacement.replaceAll("\n", "-----").replaceAll("\\{", "").replaceAll("\\}", "").replaceAll(" ", "%20").replaceAll("<", "-").replaceAll(">", "-").replaceAll("@", "%40");
    }

}
