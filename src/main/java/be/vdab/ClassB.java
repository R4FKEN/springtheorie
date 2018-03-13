package be.vdab;

public class ClassB implements InterfaceB {
	@Override
	public String getBoodschap() {
		return "ClassB object";
	}
	
	private final String telefoonNrHelpDesk; // je maakt zelf een getter
	private final int aantalPogingenUpdateKlant; // je maakt zelf een getter
	
	ClassB(String telefoonNrHelpDesk, int aantalPogingenUpdateKlant) {
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
		this.aantalPogingenUpdateKlant = aantalPogingenUpdateKlant;
	}
	
	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}
	
	public int getAantalPogingenUpdateKlant() {
		return aantalPogingenUpdateKlant;
	}
}