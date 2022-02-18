package entities;

public class Panther extends Veiculo implements VeiculoAnfibio,TracaoIntegral,Conversivel{
	
	private boolean capotaFechada;
	private boolean tracao;
	private boolean rodasRecolhidas;
	private int tempRefrigerador ;
	
	public Panther(String name) {
		super(name);
		tracao = false;
		capotaFechada = true;
		rodasRecolhidas = false;
		tempRefrigerador = 15;
		
	}

	@Override
	public void esvaziarLastro() {
		System.out.println("evaziando Lastro do veiculo "+this.getName());
		
	}

	@Override
	public void acelerar(int i) {
		System.out.println("Panther " + this.getName() + " acelerando com intensidade " + i);

	}

	@Override
	public void freiar(int i) {
		System.out.println("Panther " + this.getName() + " freiando com intensidade " + i);
		
	}

	@Override
	public boolean abrirCapota() {
		if(capotaFechada) {
			capotaFechada = false;
		}else {
			System.out.println("capota já aberta");
		}
		return capotaFechada;
	}

	@Override
	public boolean fecharCapota() {
		if(!capotaFechada) {
			System.out.println("fechando capota do Panther "+this.getName());
		}else {
			System.out.println("capota já fechada");
		}
		return capotaFechada;
	}

	@Override
	public boolean ativarDesativarTracao() {
		if(tracao) {
			System.out.println("desligando tração do "+this.getName());
		}else {
			System.out.println("ligando tração");
		}
		return tracao;
	}

	@Override
	public boolean recolherRodas() {
		if(!rodasRecolhidas) {
			System.out.println("recolhendo rodas");
		}else {
			System.out.println("rodas já recolhidas");
		}
		return rodasRecolhidas;
	}

	@Override
	public boolean abrirRodas() {
		if(rodasRecolhidas) {
			System.out.println("abrindo rodas ");
		}else {
			System.out.println("rodas já abertas");
		}
		return rodasRecolhidas;
	}
	public void setTempRefri(int i) {
		tempRefrigerador = i;
		System.out.println(tempRefrigerador);
	}

}
