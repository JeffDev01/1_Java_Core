package basic.Yresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("nome"));

        ResourceBundle bundleEnglish = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundleEnglish.getString("nome"));



    }
}
