package conta.controller;

import java.util.ArrayList;
import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null)
			conta.visualizar();
		else 
			System.out.println("\nA Conta número: " + numero + " não foi encontrada!");
	}

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA conta número: " + conta.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta !=null) {
			
			if (listaContas.remove(conta) == true)
				System.out.println("\nA Conta de número (" + numero + ") foi deletada com sucesso!");
			
		}else
			System.out.println("\nA Conta numero: " + numero + " não foi encontrada!");
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub

	}

	public int gerarNumero() {
		return ++numero;
	}
	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
			
		}
		return null;
	}

}
