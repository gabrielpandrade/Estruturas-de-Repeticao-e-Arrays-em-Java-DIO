import java.util.Objects;
import java.util.Scanner;

public class EstruturasRepeticaoArrays {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /*Estruturas de Repetição:
        * while
        * do-while
        * for
        * */
    }

    public static void Exercicio01(){
        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = in.next();
            if(nome.equals("0"))
                break;
            System.out.println("Idade: ");
            idade = in.nextInt();
        }
    }

    public static void Exercicio02(){
        float nota;

        System.out.println("Insira sua nota entre 0 e 10: ");
        nota = in.nextFloat();

        while(nota<0 || nota>10) {
            System.out.println("Nota inválida, digite novamente sua nota: ");
            nota = in.nextFloat();
        }
    }

    public static void Exercicio03(){
        float valor;
        float total=0;
        float media;
        float maior=0, menor=0;

        for(int i=0;i<5;i++) {
            System.out.println("Insira o "+i+"° valor: ");
            valor = in.nextFloat();
            total += valor;
            if(i==0){
                maior=valor;
                menor=valor;
            }else {
              if(valor>maior) {
                  maior = valor;
              }
              if(valor<menor) {
                  menor = valor;
              }
            }
        }
        media = total / 5;
        System.out.println("A média foi de "+media);
        System.out.println("O menor valor foi "+menor);
        System.out.println("O maior valor foi "+maior);
    }

    public static void Execicio04(){
        int[] vetor = {-5, 0, 4, 8, 15, 50};

        for(int i=(vetor.length-1);i>=0;i--)
            System.out.println(vetor[i]);
    }
}
