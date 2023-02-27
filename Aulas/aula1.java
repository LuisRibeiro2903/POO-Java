import java.util.Scanner;

//Barbaridades e má prática deve ser tolerado visto que esta é a minha primeira interação com java :)


public class aula1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Ficha1 f = new Ficha1();
        /* System.out.println("Insira nome e saldo");
        String nome = sc.nextLine();
        float saldo = sc.nextFloat();
        String str = f.criaDescricaoConta(nome, saldo); 
        System.out.println(str); */
        /* System.out.println("Insira os graus em Celsius: ");
        float graus = sc.nextFloat();
        double graus_f = f.celsiusParaFarenheit(graus);
        System.out.println(graus_f + " graus Farenheit"); */
        /* System.out.print("Insira 2 números para calcular o maior: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = f.maximoNumeros(a, b);
        System.out.println("\nO maior entre os 2 números é " + c); */
        /* System.out.println("Insira o valor em euros: ");
        double valor = sc.nextDouble();
        System.out.println("Insira a taxa de conversão para libras: ");
        double taxaConversao = sc.nextDouble();
        double valor_final = f.eurosParaLibras(valor, taxaConversao);
        System.out.println("O valor em libras segundo a taxa de conversão fornecida é " + valor_final); */
        /* System.out.println("Insira 2 números para a sua ordem decrescente tanto como a média dos dois: " );
        int a = sc.nextInt();
        int b = sc.nextInt();
        String output = f.ordemEMedia(a, b);
        System.out.println(output); */
        System.out.println("Insira número para receber o seu fatorial: ");
        int num = sc.nextInt();
        long fact = f.factorial(num);
        System.out.println(fact);
        sc.close();
        
    }

    public static class Ficha1
    {
        //Pergunta 1
        public double celsiusParaFarenheit (double graus)
        {
            return graus * 1.8 + 32;
        }

        //Pergunta 2
        public int maximoNumeros (int a, int b)
        {
            return (a > b) ? a : b;
        }
    
        //Pergunta 3
        public String criaDescricaoConta (String nome, float saldo)
        {
            return "Nome associado à conta : " + nome + "\nSaldo da conta: " + saldo;
        }

        //Pergunta 4
        public double eurosParaLibras (double valor, double taxaConversao)
        {
            return valor * taxaConversao;
        }

        //Pergunta 5
        public String ordemEMedia (int a, int b)
        {
            double media = (a + b) / 2.0;
            return (a > b) ? a + " > " + b + " Média : " + media : b + " > " + a + " Média : " + media;
        }

        //Pergunta 6
        public long factorial(int num)
        {
            int a = num;
            long fact = 1;
            while(a > 1)
            {
                fact *= a;
                a--;
            }
            return fact;
        }
    }
}