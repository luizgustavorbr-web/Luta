package exercicio02.pkg16_05;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
                   int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void apresentar() {
        System.out.println("Lutador: " + nome);
        System.out.println("Origem: " + nacionalidade);
        System.out.println(idade + " anos");
        System.out.println(altura + " m de altura");
        System.out.println("Pesando: " + peso + " Kg");
        System.out.println("Ganhou: " + vitorias);
        System.out.println("Perdeu: " + derrotas);
        System.out.println("Empatou: " + empates);
    }

    public void status() {
        System.out.println(nome + " é um peso " + categoria);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Empates: " + empates);
    }

    public void ganharLuta() {
        this.vitorias++;
    }

    public void perderLuta() {
        this.derrotas++;
    }

    public void empatarLuta() {
        this.empates++;
    }

    public String getNome() {
        return nome;
    }
}