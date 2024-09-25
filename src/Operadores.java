public class Operadores {

    public static void main(String[] args) {
        operacoesAritmeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
    }

    private static void operacoesRelacionais() {
        System.out.println("****Operadores Relacinais***");
        int num1=10;
        int num2=10;

        boolean isMaior = num1>num2;
        boolean isIgual = num1 ==num2;
        boolean isDiff = num1 !=num2;

        System.out.println("isMaior " + isMaior);
        System.out.println("isIgual " + isIgual);
        System.out.println("isDiff " + isDiff);

        System.out.println("****Operador E***");

        boolean isDentro10 = num1 >=1 && num2<=10;//  && significa e
        System.out.println("Dentro de 1 a 10:  " + isDentro10);


        System.out.println("****Operador ou***");
        boolean isDentro_10 = num1 >=1 || num2<=9;//  || significa ou
        System.out.println("Valida apenas o primeiro numero pois || é ou: " + isDentro_10);

        System.out.println("****Operadore NOT ***");

        boolean isNot = num1 >=1 || num2<=9;//  || significa ou
        System.out.println("Nego a senteça com o !: " + !isNot);
    }


    private static void operacoesIncrementoDecremento() {
        System.out.println("****Operacoes Incremento e Decremento");
         int num1 = 10;
         System.out.println("numero 1 = " + num1);
         num1 ++;
         System.out.println("Numero 1 usando ++ = " + num1);
         num1 --;
         System.out.println("Numero 1 usando -- = " + num1);
    }

    private static void operacoesAtribuicoes() {
        System.out.println("****Operacoes Atribuicoes***");
        System.out.println("Aqui atribuimos valores apos ter seu valor ja definido ");

        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println("num3 = soma de num1 + num2, ambos valendo 10 : " + numero3);
        numero3 += numero3;
        int numero4 = numero3 + 20;
        System.out.println("Aqui num3 + num3 : " + numero3);
        System.out.println("numero 4 = num3+ 20 : " + numero4);

    }

    public static void operacoesAritmeticas() {
        System.out.println("****Operacoes Aritmeticas****");
        int num1 = 100;
        int num2 = 10;

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int divisao = num1 / num2;
        int multiplicacao = num1 * num2;
        int sobraDivisao = num1 % num2;
        double divisaoDecimal = (double) num1 / num2;
        int num8 = (10 + 10)/2;

        System.out.println("Temos as operações de + - * / % num1=100 e 2=10" );
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Sobra Divisao: "+ sobraDivisao);
        System.out.println("Divisão (decimal): " + divisaoDecimal);
        System.out.println(num8);

    }
}
