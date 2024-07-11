package Qresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println("---");
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        // Regra de fall back abaixo
        // Locale("en", "US");
        //messages_en_US.properties
        //messages_en.properties
        //messages.properties
        //se não achar com messages ele te retorna uma exceção na bica
    }
}
