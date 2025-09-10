public class Carro  {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public void acelerar(int speed){
        if (speed <= 0) {
            System.out.println("Velocidade precisa ser maior que 0");
            System.exit(-1);
        }
        if (speed > 200) {
            System.out.println("Velocidade "+speed+" está acima do permitido");
            System.exit(-1);
        }
        velocidadeAtual += speed;
    }
    public void frear(int speed) {
        if (speed <= 0) {
            System.out.println("Velocidade para reduzir precisa ser maior que 0");
            System.exit(-1);
        }
        if (speed > velocidadeAtual) {
            System.out.println("Velocidade a reduzir precisa ser menor ou igual a velocidade atual");
            System.exit(-1);
        }
        velocidadeAtual -= speed;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public int getVelocidade(){
        return velocidadeAtual;
    }
    public static void main(String args[]) {
        Carro Carro = new Carro();
        Carro.acelerar(80);
        Carro.frear(40);
        Carro.setMarca("BMW");
        Carro.setModelo("320i");
        System.out.println(Carro.getVelocidade()+" "+Carro.getMarca()+" "+Carro.getModelo());
    }
}
