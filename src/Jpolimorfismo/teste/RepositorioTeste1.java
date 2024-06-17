package Jpolimorfismo.teste;

import Jpolimorfismo.repositorio.Repositorio;
import Jpolimorfismo.servico.RepositorioBDD;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste1 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBDD();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Kuririn");
        System.out.println(list);
    }
}
