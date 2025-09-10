public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setPages(int paginas){
        if (paginas <= 0){
            System.out.println("Numero de paginas não pode ser menor ou igual a zero");
            System.exit(-1);
        }
        this.paginas = paginas;
    }
    public int getPages(){
        return paginas;
    }
    public void info(){
        System.out.println("Título do livro: "+getTitulo());
        System.out.println("Nome do autor "+getAutor());
        System.out.println("Numero de paginas: "+getPages());
    }
    public static void main(String args[]){
        Livro livro = new Livro("The C programing Language", "Brian Kernighan", 228);
        livro.info();
    }
}
