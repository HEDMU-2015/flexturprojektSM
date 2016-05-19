package domain;

public class Kundeprofil {
	
	private String kundeID;
	private String cprNummer;
	private String navn;
	private String adresse;
	private int postNummer;
	private String by;
	private int telefonNummer;
	private String email;
	private String kodeord;
	
	
	public String getKundeID() {
		return kundeID;
	}
	public void setKundeID(String kundeID) {
		this.kundeID = kundeID;
	}
	public String getCprNummer() {
		return cprNummer;
	}
	public void setCprNummer(String cprNummer) {
		this.cprNummer = cprNummer;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getPostNummer() {
		return postNummer;
	}
	public void setPostNummer(int postNummer) {
		this.postNummer = postNummer;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public int getTelefonNummer() {
		return telefonNummer;
	}
	public void setTelefonNummer(int telefonNummer) {
		this.telefonNummer = telefonNummer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getKodeord() {
		return kodeord;
	}
	public void setKodeord(String kodeord) {
		this.kodeord = kodeord;
	}
	
	@Override
	public String toString() {
		return "Kundeprofil [kundeID=" + kundeID + ", cprNummer=" + cprNummer + ", navn=" + navn + ", adresse="
				+ adresse + ", postNummer=" + postNummer + ", by=" + by + ", telefonNummer=" + telefonNummer
				+ ", email=" + email + ", kodeord=" + kodeord + "]";
	}

	
}
