package entities;

public class Pampa extends Veiculo implements TracaoIntegral{
	public boolean cacambaFechada;
	public boolean tracao;
	
	public Pampa(String name) {
		super(name);
		cacambaFechada = true;
		tracao = false;
		
	}

	@Override
	public void acelerar(int i) {
		System.out.println("pampa "+this.getName()+" acelerando com intesidade "+i);
		
	}

	@Override
	public void freiar(int i) {
		System.out.println("pampa "+this.getName()+" frenando com intesidade "+i);
		
	}

	@Override
	public boolean ativarDesativarTracao() {
		tracao = !tracao;
		System.out.println("tracao integral da pampa "+this.getName()+" está: "+tracao);
		return tracao;
	}
	public boolean abrirCacamba() {
		if(cacambaFechada) {
			System.out.println("abrindo caçamba da pamba "+this.getName());
			cacambaFechada = false;
			return true;
		}
		System.out.println("Caçamba já estava aberta");
		return false;
	}
}
	