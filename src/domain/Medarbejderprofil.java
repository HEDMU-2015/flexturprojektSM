package domain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Medarbejderprofil {
	
	private String username;
	private String encryptedPassword;
	
	public static String encrypt(String txt) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] mdbytes = md.digest(txt.getBytes());
		return Base64.getEncoder().encodeToString(mdbytes);
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	@Override
	public String toString() {
		return "Medarbejderprofil [username=" + username + ", encryptedPassword=" + encryptedPassword + "]";
	}
}
