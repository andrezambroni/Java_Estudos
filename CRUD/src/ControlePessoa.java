//Classe Principal - Main
public class ControlePessoa {

	private Pessoa[] pessoas; //Declara array

	public Pessoa[] getPessoas() { //Método que retorna os valores do array pessoas.
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) { //Método que define/altera um objeto Pessoa
		this.pessoas = pessoas;
	}

	public Boolean vetorVazio() { //Método que verifica se o array está vazio
		if (this.pessoas.length == 0) { 
			System.out.println("Array Vazio!!!");
			return true; //Array Vazio
		} else {
			return false; //Array não Vazio
		}

	}

	//Método que adiciona novas pessoas a lista/array vazia
	public void adicionarPessoaVazio(Integer n, Pessoa... p) {
		if (n == 0) { //verifica informações válidas
			System.out.println("Adicao invalida!!!");
		} else {
			this.pessoas = new Pessoa[n]; //Instancia classe Pessoa
			int i = 0;
			for (Pessoa x : p) { 
				if (i > (this.pessoas.length - 1)) {
					throw new ArrayIndexOutOfBoundsException("Numero de registros excede o tamanho do Array!!!");
				} else { //Criação de um novo objeto
					this.pessoas[i] = new Pessoa(x.getId(), x.getNome(), x.getIdade());
					i++;
				}
			} 
		}
	}

	//Método que adiciona novas pessoas a lista/array Pessoa
	public void adicionarPessoa(Integer n, Pessoa... p) {
		if (this.pessoas.length == 0) { //Array inexistente
			System.out.println("Necessario criar o Array primeiro!!!");
		} else { //Array exeistente
			int i = 0;
			while ((i < this.pessoas.length) && (this.pessoas[i] != null)) {
				i++;
			}
			if (i > (this.pessoas.length - 1)) { //Array cheio
				System.out.println("Array cheio!!!");
			} else {
				if ((this.pessoas.length - i) < n) { //Registro maior que o array
					System.out.println("Numero de registros excede o tamanho do Array!!!");
				} else {
					for (Pessoa x : p) { //Criação de um novo objeto
						this.pessoas[i] = new Pessoa(x.getId(), x.getNome(), x.getIdade());
						i++;
					}
				}
			}
		}
	}

	//Método que lista elementos presentes no lista/array Pessoa
	public void listarPessoa() {

		if (!vetorVazio()) { //Verifica se o array está vazio (! = diferente de vazio)
			//Percorre o array
			for (int i = 0; i < this.pessoas.length; i++) {
				
				//Imprime elementos do array
				if (pessoas[i] != null) { 
				System.out.println(i + " : " + pessoas[i]);
				} else {
				System.out.println(i + " : Espaco vazio");
				}
			}
		}
	}

	//Método que atualiza elementos presentes no lista/array Pessoa
	public void atualizarPessoa(Pessoa p) {
		int achado = 0;
		if (!vetorVazio()) { //Verifica se o array está vazio (! = diferente de vazio)
			//Percorre o array
			for (int i = 0; i < this.pessoas.length; i++) {
				//Identiica e atualiza elemento
				if ((this.pessoas[i] != null) && (this.pessoas[i].getId().equals(p.getId()))) {
					this.pessoas[i] = p;
					achado++;
				}
			}
		}
		if (achado == 0) { //Para pessoa informada não encontrada no array
			System.out.println("Pessoa nao encontrada!!!");
		}
	}

	//Método que remove elementos presentes no lista/array Pessoa
	public void removerPessoa(Pessoa p) {
		int achado = 0;
		if (!vetorVazio()) { //Verifica se o array está vazio (! = diferente de vazio)
			//Percorre o array
			for (int i = 0; i < this.pessoas.length; i++) {
				//Identiica elemento
				if ((this.pessoas[i] != null) && (this.pessoas[i].getId().equals(p.getId()))) {
					achado++;
					//Remove elemento - substitui posição de memória
					for (int j = i; j < this.pessoas.length; j++) {
						if (this.pessoas[j] != null)
						pessoas[j] = pessoas[j + 1];
					}
				}
			}
		}
		if (achado == 0) { //Para pessoa informada não encontrada no array
			System.out.println("Pessoa nao encontrada!!!");
		}
	}

	//Método main da função principal(Main)
	public static void main(String[] args) {

		//Instanciação de objetos Pessoa
		Pessoa p1 = new Pessoa(10, "P1", 30);
		Pessoa p2 = new Pessoa(11, "P2", 31);
		Pessoa p3 = new Pessoa(12, "P3", 32);

		//Instanciação dos métodos da classe ControlePessoa
		ControlePessoa cp = new ControlePessoa();

		// cp.adicionarPessoaVazio(10, p1, p2, p3);
		cp.adicionarPessoaVazio(10, p1, p2, p3); //posições do vetor - n:10
		cp.adicionarPessoa(2, p1, p2);

		// cp.removerPessoa(new Pessoa(12, null, null));
	 	cp.atualizarPessoa(new Pessoa(12, "atualizou", 50));
		cp.listarPessoa(); //Visualização de dados
	}
}
