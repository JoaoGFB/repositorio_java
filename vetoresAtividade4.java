import java.util.Scanner;
public class vetoresAtividade4 {
    public static void main(String[] args) {
        int tamanho, aux, p1, p2, n1, n2;
        float soma = 0, media, novaSoma = 0, novaMedia;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Quantos valores você deseja guardar no vetor? ");
            tamanho = scanner.nextInt();
        } while (tamanho <= 0);
        int vet[] = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor");
            aux = scanner.nextInt();
            vet[i] = aux;
        }
        for (int i = 0; i < tamanho; i++) {
            soma += vet[i];
        }
        System.out.println("A soma dos valores digitados é " + soma);
        media = soma/tamanho;
        System.out.println("A média dos valores digitados é " + media);
        int menor = vet[0], maior = vet[0];
        for (int i = 1; i < tamanho; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }
        System.out.println("O menor valor digitado é " + menor);
        System.out.println("O maior valor digitado é " + maior);
        do {
            System.out.println("Digite a posição do primeiro número que quer substituir. Lembre-se, a primeira posição é 0: ");
            p1 = scanner.nextInt();
        } while (p1 < 0 || p1 >= tamanho);
        System.out.println("Digite por qual valor deseja subsituir: ");
        n1 = scanner.nextInt();
        do {
            System.out.println("Digite a posição do segundo número que quer substituir. Lembre-se, a primeira posição é 0: ");
            p2 = scanner.nextInt();
        } while (p2 < 0 || p2 >= tamanho);
        System.out.println("Digite por qual valor deseja substituir: ");
        n2 = scanner.nextInt();
        vet[p1] = n1;
        vet[p2] = n2;
        for (int i = 0; i < tamanho; i++) {
            novaSoma += vet[i];
        }
        System.out.println("A nova soma dos valores do vetor é " + novaSoma);
        novaMedia = novaSoma/tamanho;
        System.out.println("A nova média dos valores do vetor é " + novaMedia);
    }
}
