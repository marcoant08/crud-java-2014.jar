
package trabalho;


public class Cliente {
    public String Nome, Endereco, Area;
    public int Cpf;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        this.Area = area;
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int cpf) {
        this.Cpf = cpf;
    }
}
