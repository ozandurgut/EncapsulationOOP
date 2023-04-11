import java.util.Random;

public class TCKN {
	
	private Long id;
	private String dogumYeri;
	private String tckn;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDogumYeri() {
		return dogumYeri;
	}
	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}
	public String getTckn() {
		return tckn;
	}
	
	boolean kontrol = true;
	
	public void setTckn(String tckn) {
		if(tckn.length()==11)
		{
			for(int i =0;i<tckn.length();i++)
			{
				char karakter = tckn.charAt(i);
				if(Character.isDigit(karakter)) {
					kontrol = true;
				}else {
					kontrol = false;
					break;
				}
			}
			if(kontrol) {
				Random random = new Random();
				
				// 0-100 arası random değer.
				this.tckn = tckn;
				int giseNo = random.nextInt(100);
				sonucYazdir("Gişe no :"+giseNo);
			}else {
				sonucYazdir("Lütfen bütün karakterleri rakam olarak giriniz.");
			}
		}
		else {
			sonucYazdir("TCKN 11 Haneli olmak zorundadır.");
		}
		
	}
	
	public void sonucYazdir(String sonuc) {
		System.out.println(sonuc);
	}
	
}
