
package supertrunfo;


public class Cartas {

    String nome;
    double canhao;
    double potencia;
    double peso;
    double velocidade;
    double comprimento;
    double largura;

    public Cartas() {
        String getnome = null;
        this.nome = getnome;
    }
    
    public String getNome() {
        return nome;
    }

    public double getCanhao() {
        return canhao;
    }

    public double getPotencia() {
        return potencia;
    }

    public double getPeso() {
        return peso;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }
      
    public void status (){
        System.out.println("\n"+"O Nome desse Tanque eh "+ this.nome);
        System.out.println("ele possui o comprimento de "+this.comprimento);
        System.out.println("ele mede uma largura de "+ this.largura);
        System.out.println("ele tem um canhao de "+this.canhao);
        System.out.println("este tanque pesa "+ this.peso);
        System.out.println("ele possui uma potencia de "+ this.potencia);
        System.out.println("A velocidade dele eh de "+this.velocidade+"\n");
        }
}
    