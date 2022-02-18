package entities;

public class Ferrari extends Veiculo implements Conversivel {
	private boolean capota;
	public boolean farolNeblina;

	public Ferrari(String name) {
		super(name);
		capota = true;
		farolNeblina = false;

	}

	@Override
	public void acelerar(int i) {
		System.out.println("Ferrari conversivel " + this.getName() + " acelerando com intensidade " + i);

	}

	@Override
	public void freiar(int i) {
		System.out.println("Ferrari conversivel " + this.getName() + " freiando com intensidade " + i);
	}

	@Override
	public boolean abrirCapota() {
		if (!capota) {
			System.out.println(this.getName() + " abrindo capota");
			capota = true;
		} else {
			System.out.println("capota já aberta");
		}
		return capota;
	}

	@Override
	public boolean fecharCapota() {
		if (capota) {
			System.out.println("fechando capota");
			capota = false;
		} else {
			System.out.println("capota já fechada");
		}
		return capota;
	}
	public boolean LigarFarolNeblina() {
		if(!farolNeblina) {
			System.out.println("Ligando farola de neblina");
			farolNeblina = true;
		}else {
			System.out.println("farol já ligado");
		}return farolNeblina;
	}

}
