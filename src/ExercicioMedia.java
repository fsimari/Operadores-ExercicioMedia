public class ExercicioMedia {

    public static void main(String[] args) {
        mediaNota();
    }

    private static void mediaNota() {
        int nota1 = 10;
        int nota2 = 10;
        int nota3 = 10;
        int nota4 = 10;
        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aluno foi Aprovado!!");
        }else{
            System.out.println("Alunio foi Reprovado");
        }
    }

}
