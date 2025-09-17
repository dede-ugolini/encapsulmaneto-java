import java.util.Random;
import java.util.Scanner;

public class Main {
   
    public static void main(String args[]){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Jogador p1 = new Jogador();
        Jogador p2 = new Jogador();
        System.out.println("Digite o número de lados do dado");
        Dados dado = new Dados(scanner.nextInt());
        p1.setName();
        p2.setName();

        if (p1.name.equals(p2.name)) {
            p1.name += "1"; 
            p2.name += "2"; 
        }  

        while (true) {
            p1.number = random.nextInt(dado.getLados());
            p2.number = random.nextInt(dado.getLados());
            
            if (p1.number > p2.number) {
                System.out.println("Jogador " + p1.getName() + " venceu");
                System.out.println("Número do dado " + p1.number);
                break;
            }
            else if(p1.number < p2.number){
                System.out.println("Jogador " + p2.getName() +  " venceu");
                System.out.println("Número do dado " + p2.number);
                break;
            }
            System.out.println("Empate");
        }
    }   
    public static class Jogador {
        String name;
        Scanner scanner = new Scanner(System.in);
        int number;
        public void setName(){
            do {
                System.out.println("Digite o nome do jogador");
                try {
                    this.name = scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Erro ao ler o nome: "+e.getMessage());
                }
            } while(name.trim().isEmpty());
        }
        public String getName(){
            return name;
        }

    }
    public static class Dados {
        int lados;
        public Dados(int lados) {
            if (lados < 1) {
                System.out.println("Número de lados precisa ser maior que 0");
                System.exit(-1);
            }
            this.lados = lados;
        }
        public int getLados(){
            return lados;
        }
        
    }
}