package IInterface.teste;

import IInterface.dominio.DataBaseLoader;
import IInterface.dominio.FileLoader;

public class DataLoaderTeste1 {
    public static void main(String[] args) {
        DataBaseLoader databaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        System.out.println("--");
        databaseLoader.remove();
        fileLoader.remove();
    }
}
