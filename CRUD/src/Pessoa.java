//Criação da classe Pessoa
public class Pessoa {

	//Atributos da classe
	private Integer id;
	private String nome;
	private Integer idade;

	//public Pessoa() {
	//}

	//Declaração do Construtor
	public Pessoa(Integer id, String nome, Integer idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	@Override //Sobrescrevendo um método e não criando outro
	public String toString() { //Método que retorna os atributos do objeto
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}

	public Integer getId() { //Método que retorna o 'id' do objeto
		return id;
	}

	public void setId(Integer id) { //Método que define/altera o 'id' do objeto
		this.id = id;
	}

	public String getNome() { //Método que retorna o 'nome' do objeto
		return nome;
	}

	public void setNome(String nome) { //Método que define/altera o 'nome' do objeto
		this.nome = nome;
	}

	public Integer getIdade() { //Método que retorna a 'idade' do objeto
		return idade;
	}

	public void setIdade(Integer idade) { //Método que define/altera a 'idade' do objeto
		this.idade = idade;
	}

}