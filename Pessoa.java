public class Pessoa {
    
    public String nome;
    public int idade;
    public String endereco; 
    public static void main(String args[]){
        Pessoa Pessoa = new Pessoa();
        Pessoa.setNome("Dedé");
        Pessoa.setIdade(18);
        Pessoa.setEndereco("Efapi");
        System.out.println(Pessoa.getNome()+", "+Pessoa.getIdade()+", "+Pessoa.getEndereco());
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
}