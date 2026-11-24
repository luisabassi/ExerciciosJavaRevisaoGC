public class Aluno {
    private String matricula;
    private String nome;
    private double prova1;
    private double prova2;
    private double trabalho1;
    private final double mediaNecessaria = 6.0;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, double prova1, double prova2, double trabalho1) {
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho1 = trabalho1;
    }

    // Média ponderada: pesos 2.5, 2.5 e 2 (soma = 7)
    public double calcularMedia() {
        return (prova1 * 2.5 + prova2 * 2.5 + trabalho1 * 2) / 7;
    }

    public boolean aprovado() {
        return calcularMedia() >= mediaNecessaria;
    }

    // Quanto falta de média para passar (0 se já passou)
    public double faltaParaPassar() {
        return Math.max(0, mediaNecessaria - calcularMedia());
    }

    // getters e setters (iguais aos seus)
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getProva1() { return prova1; }
    public void setProva1(double prova1) { this.prova1 = prova1; }
    public double getProva2() { return prova2; }
    public void setProva2(double prova2) { this.prova2 = prova2; }
    public double getTrabalho1() { return trabalho1; }
    public void setTrabalho1(double trabalho1) { this.trabalho1 = trabalho1; }
}