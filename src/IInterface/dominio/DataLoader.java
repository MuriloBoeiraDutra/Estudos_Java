package IInterface.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10; //Observe a redundancia
    void load();
    // O java entende que dentro de interfaces os metódos são abstratos por padrao, logo é reduntante escrever
    //"public abstract void load"

    //E as interfaces atuam como contratos com as classes(aparentemente) VISTO QUE TODOS OS METÓDOS SÃO ABSTRATOS

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissão");
    }
}
