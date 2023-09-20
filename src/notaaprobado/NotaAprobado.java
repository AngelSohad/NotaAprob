package notaaprobado;
import java.util.Scanner;

public class NotaAprobado {

    public void Notas() {
        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pongale ganas y deme su nota: ");
        nota = entrada.nextInt();
        if(nota>5){
        System.out.println("Ya la hiciste mano");
        }else{
        System.out.println("Echale Ganas mano");
        }
    }
    public static void main(String[] args) {
        NotaAprobado aprob = new NotaAprobado();
        aprob.Notas();
    }
}
