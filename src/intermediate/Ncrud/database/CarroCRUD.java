package intermediate.Ncrud.database;

import intermediate.Ncrud.classes.Carro;
import intermediate.Ncrud.classes.Comprador;
import intermediate.Ncrud.test.CompradorCRUD;

import java.util.List;
import java.util.Scanner;

public class CarroCRUD {
    private static Scanner teclado = new Scanner(System.in);

    public static void executar(int op) {
        switch (op) {
            case 1:
                inserir();
                break;
            case 2:
                atualizar();
            case 3:
                listar();
                break;
            case 4:
                System.out.println("Digite um nome: ");
                buscarPorNome(teclado.nextLine());
                break;
            case 5:
                deletar();
                break;
        }
    }

    private static void inserir() {
        Carro carro = new Carro();
        System.out.println("Nome: ");
        carro.setNome(teclado.nextLine());
        System.out.println("Placa: ");
        carro.setPlaca(teclado.nextLine());
        System.out.println("Selecione um dos compradores abaixo:");
        List<Comprador> compradorList = CompradorCRUD.listar();
        carro.setComprador(compradorList.get(Integer.parseInt(teclado.nextLine())));
        CarroDAO.save(carro);
    }

    private static void atualizar() {
        System.out.println("Selecione um dos carros abaixo:");
        List<Carro> carroList = listar();
        Carro carro = carroList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou enter para manter o mesmo.");
        String nome = teclado.nextLine();
        System.out.println("Nova placa ou enter para manter o mesmo");
        String placa = teclado.nextLine();
        if (!nome.isEmpty()) {
            carro.setNome(nome);
        }
        if (!placa.isEmpty()) {
            carro.setPlaca(placa);
        }
        CarroDAO.update(carro);


    }

    private static List<Carro> listar() {
        List<Carro> carroList = CarroDAO.selectAll();
        for (int i = 0; i < carroList.size(); i++) {
            Carro carro = carroList.get(i);
            System.out.println("[" + i + "] " + carro.getNome() + " " + carro.getPlaca()+ " "+carro.getComprador().getNome());
        }
        return carroList;
    }

    private static void buscarPorNome(String nome) {
        List<Carro> carroList = CarroDAO.seachByName(nome);
        for (int i = 0; i < carroList.size(); i++) {
            Carro carro = carroList.get(i);
            System.out.println("[" + i + "] " + carro.getNome() + " "+ carro.getPlaca()+ " "+carro.getComprador().getNome());
        }
    }

    public static void deletar() {
        System.out.println("Selecione um dos carros abaixo para deletar:");
        List<Carro> carroList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza? S/N");
        String op = teclado.nextLine();
        if (op.startsWith("s")) {
            CarroDAO.deletar(index);
        }

    }
}
