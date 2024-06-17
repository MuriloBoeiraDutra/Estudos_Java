package Jpolimorfismo.servico;

import Jpolimorfismo.repositorio.Repositorio;

public class RepositorioBDD implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em BDD");
    }
}
