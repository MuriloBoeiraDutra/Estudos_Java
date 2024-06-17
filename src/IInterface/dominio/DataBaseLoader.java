package IInterface.dominio;

public class DataBaseLoader implements DataLoader, DataRemove {
    @Override
    public void load(){
        System.out.println("Carregando dados de um BDD");
    }

    @Override
    public void remove(){
        System.out.println("Removendo do BDD");
    }

}