public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        if (largura <= 0|| altura <= 0){
            System.out.println("Altura e lagura precisam ser maiores que zero");
            System.exit(-1);
        }
        this.altura = altura;
        this.largura = largura;
    } 
    public void addAltura(double altura){
        if (altura <= 0) {
            System.out.println("Altura a adicionar precisa ser maior que zero");
            System.exit(-1);
        }
        this.altura += altura;
    }
    public void remAltura(double altura){
        if (altura <= 0 || altura > this.altura) {
            System.out.println("Altura a remover precisa ser maior que zero e menor que altura original");
            System.exit(-1);
        }
        this.altura -= altura;
    }
    public void addLargura(double lagura) {
        if (lagura <= 0) {
            System.out.println("Largura a adicionar precisa ser maior que zero");   
            System.exit(-1);
        }
        this.largura += lagura;
    }
    public void remLargura(double largura) {
        if (largura <= 0 || largura > this.largura) {
            System.out.println("Larga a remover precisa ser maior que zero e menor que a largura original");
            System.exit(-1);
        }
        this.largura -= largura;
    }
    public double area(double altura, double largura) {
        if (altura <= 0 || largura <= 0){
            System.out.println("Largura e altura precisam ser maiores que zero");
            System.exit(-1);
        }
        return altura * largura;
    }
    public double perimetro(double altura, double largura) {
        return (altura * 2) + (largura * 2);
    }
    public void info(){
        System.out.printf("Altura: %.2f, Largura: %.2f, Area: %.2f, Perímetro: %.2f\n", altura, largura, area(altura, largura), perimetro(altura, largura));
    }
    public static void main(String args[]){
        Retangulo Retangulo = new Retangulo(12, 8);
        Retangulo.info();
    }
}