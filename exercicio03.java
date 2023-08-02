import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){
        //int[] va = new int[];
        int[] va;
        //int[] vb = new int[];
        int[] vb;
        int n, i, cont = 0;
        Scanner sc = new Scanner(System.in);

         
        System.out.println("Quantos valores? ");
        n = sc.nextInt();
        
        va = new int[n];
        vb = new int[n];

        System.out.println("Entra com 10 valores do Vetor A: ");
        for(i=0;i<va.length;i++){
            va[i] = sc.nextInt();
        }  
        sc.close();

        //procura pelos pares
        for(i=0;i<va.length;i++){
            if(va[i] % 2 == 0){
                vb[cont] = va[i];
                cont++;
            }
        }

        //procura pelos impares
        for(i=0;i<va.length;i++){
            if(va[i] % 2 == 0){
                vb[cont] = va[i];
                cont++;
            }
        }

        //saída
        System.out.println("O vetor B é: ");
        for(i=0;i<vb.length;i++){
            System.out.printf("%d ", vb[i]);
        }
        System.out.println();
    }
}
