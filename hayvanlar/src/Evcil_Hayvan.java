

public class Evcil_Hayvan {

	public Evcil_Hayvan(String isim)
	{
		this.isim = isim;
		System.out.println(isim +"Oyun Oynuyor");
	}
	
	private String isim;
	public String oyna()
	{
		return this.isim + "Oynamakatan Yoruldu";
		
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
}
