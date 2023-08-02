import java.util.Scanner;

class exercicio02 {
    public static void main(String[] args){
        //variáveis vetores
        int[] va = {0,0,0,0,0,0,0,0,0,0};
        int[] vb = {0,0,0,0,0,0,0,0,0,0};
        int[] vc = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        
        //variaveis
        int tam_va = 10, tam_vb = 10, tam_vc = 20, i, cont_vc = 0;
        
        //Scanner
        Scanner entrada = new Scanner(System.in);

        //entrada
        System.out.println("Entre com 10 valores do Vetor A: ");
        for(i=0;i<tam_va;i++){
            va[i] = entrada.nextInt();
        }
        System.out.println("Entre com 10 valores Vetor B");
        for(i=0;i<tam_vb;i++){
            vb[i] = entrada.nextInt();
        }

        entrada.close();

        //process
        for(i=0;i<tam_va;i++){
            vc[cont_vc] = va[i];
            cont_vc++;
            vc[cont_vc] = vb[i];
            cont_vc++;
        }
        
        //saída
        System.out.println("O vetor C é: ");
        for(i=0;i<tam_vc;i++){
            System.out.printf("%d ", vc[i]);
        }
        System.out.println();
    }
}