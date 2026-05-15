package TPC;

public class TV {
	
	private int volume = 0; // tv começa no volume 0
	private int canal = 1; // tv começa no canal 1
	private	boolean on = false; // tv está desligada
	private	boolean gravar = false; // tv começa sem gravar
	private int brilho = 10; // opçao para ajustar o brilho da tv
	private boolean wifi = false; // wifi da tv esta desligado
	
	public TV (){
		
	}
	
	public TV (int volume, int canal, boolean gravar, int brilho, boolean wifi) {
		this.volume = volume;
		this.canal = canal;
		this.gravar = gravar;
		this.brilho = brilho;
		this.wifi = wifi;
	}
	
	
	public void ligar() { 
		on = true;
		System.out.println("A Tv está Ligada");
		}
	
	public void desligar() { 
		on = false;
		System.out.println("A Tv está Desligada");
		}
	
	public boolean estadoTV() {
		return on;
	}
	
	public int getCanal() {
		return canal;
	}
	public void mudarCanal (int newCanal) {
		if (on && newCanal >= 1 && newCanal <= 100)
			canal = newCanal;
		System.out.println("Mudou para o novo canal: " + newCanal);
	} 
	
	public void subirCanal() {
		if (on && canal < 100)
			canal++;
		System.out.println("Canal: " + canal);
	}
	
	public void descerCanal() {
		if (on && canal > 1)
			canal--;
		System.out.println("Canal: " + canal);
	}
	
	public int getVolume() {
		return volume;
	}
	public void mudarVolume (int newVolume) {
		if (on && newVolume >= 0 && newVolume <= 100)
			volume = newVolume;
		System.out.println("Mudou para novo volume: " + newVolume);
	}
	
	public void aumentarVolume() {
		if (on && volume <= 100)
			volume += 5;
		System.out.println("Volume: " + volume);
	}
	
	public void diminuirVolume() {
		if(on && volume >= 0) {
			volume -= 5;
			System.out.println("Volume: " + volume);
		}
	}
	
	public int getBrilho() {
		System.out.println("Brilho: " + brilho);
		return brilho;
	}
	
	public void aumentarBrilho(int brilho) {
		if (on && brilho >= 50) {
			brilho++;
			System.out.println("Aumentou o brilho: " + brilho);
		}
	}
	
	public void diminuirBrilho(int brilho) {
		if (on && brilho <= 10) {
			brilho--;
			System.out.println("Diminuiu o brilho: " + brilho);
		}
	}
	
	public boolean getWifi() {
		System.out.println("O wifi está: " + wifi);
		return wifi;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public boolean getGravar() {
		System.out.println("A funcao gravar está: " + gravar);
		return gravar;
	}
	
	public void setGravar(boolean gravar) {
		this.gravar = gravar;
	}
	
	
	
	
	@Override
	public String toString() {
		return "TV [Estado TV = " + on + 
				",\n Canal = " + canal + 
				",\n Volume = " + volume + 
				",\n A gravar = " + gravar + 
				",\n Wifi = " + wifi + 
				",\n Brilho = " + brilho+ "]";
	}
	
}
