package be.vdab;

import java.io.File;
import java.net.URL;
import java.util.Locale;

public class ClassA implements InterfaceA {
	@Override
	public String getBoodschap() {
		return "ClassA object";
	}
	
	private String telefoonNrHelpDesk;

	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}

	public void setTelefoonNrHelpDesk(String telefoonNrHelpDesk) {
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
	}
	
	private URL koersenURL;
	private Locale defaultTaalEnLand;
	private File importData;
	private BladRichtingInPrinter defaultBladRichting;

	public URL getKoersenURL() {
		return koersenURL;
	}

	public void setKoersenURL(URL koersenURL) {
		this.koersenURL = koersenURL;
	}

	public Locale getDefaultTaalEnLand() {
		return defaultTaalEnLand;
	}

	public void setDefaultTaalEnLand(Locale defaultTaalEnLand) {
		this.defaultTaalEnLand = defaultTaalEnLand;
	}

	public File getImportData() {
		return importData;
	}

	public void setImportData(File importData) {
		this.importData = importData;
	}

	public BladRichtingInPrinter getDefaultBladRichting() {
		return defaultBladRichting;
	}

	public void setDefaultBladRichting(BladRichtingInPrinter defaultBladRichting) {
		this.defaultBladRichting = defaultBladRichting;
	}
}