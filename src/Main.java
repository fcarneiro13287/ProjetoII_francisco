import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean run_code = true;

        while (run_code) {
            System.out.printf("%S %n", "1. Ler ficheiro 1.txt com BD");
            System.out.printf("%S %n", "2. Inserir Album na BD");
            System.out.printf("%S %n", "3. Gravar ficheiro .txt com BD");
            System.out.printf("%S %n", "4. Efectuar consulta da BD");
            System.out.printf("%S %n", "5. Exit programa");

            Scanner in = new Scanner(System.in);
            int s = in.nextInt();
            if (s == 1){
                System.out.println("call ficheiro");
                lerFicheiro();
            } else if (s==2){
                System.out.println("inserir Album na biblioteca");
            } else if (s==3){
                System.out.println("Gravar elementos da BD num ficheiro .txt");
            } else if(s==4){
                System.out.println("Efectuar consultas");
            } else {
                System.out.println("Obrigado pela sua consulta");
                run_code = false;
            }
        }
    }
    static void lerFicheiro() {

        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
    }
}
