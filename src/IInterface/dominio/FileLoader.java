package IInterface.dominio;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void load(){
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do arquivo");
    }
}
