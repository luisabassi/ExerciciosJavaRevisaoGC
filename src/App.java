import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do(a) aluno(a):");
        aluno.setNome(sc.nextLine());

        System.out.println("Digite a nota da prova 1:");
        aluno.setProva1(sc.nextDouble());

        System.out.println("Digite a nota da prova 2:");
        aluno.setProva2(sc.nextDouble());

        System.out.println("Digite a nota do trabalho:");
        aluno.setTrabalho1(sc.nextDouble());

        System.out.println("\nDados do aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota da prova 1: " + aluno.getProva1());
        System.out.println("Nota da prova 2: " + aluno.getProva2());
        System.out.println("Nota do trabalho: " + aluno.getTrabalho1());
        System.out.printf("Média: %.2f%n", aluno.calcularMedia());

        if (aluno.aprovado()) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.printf("Reprovado. Faltam %.2f pontos de média para passar.%n",
                    aluno.faltaParaPassar());
        }

        sc.close();
    }
}