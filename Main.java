
package TPC;

public class Main {
	public static void main(String[] args) {
		
		TV tv1 = new TV();
		tv1.ligar(); // ligo a tv
		tv1.getBrilho(); // vejo o brilho atual
		tv1.getGravar(); // vejo a funçao de gravar
		tv1.setWifi(true); // ativo o wifi da tv
		tv1.setGravar(true); // ativo o gravar da tv
		
		
		
		tv1.mudarCanal(20); // mudei para o canal 20
		tv1.mudarVolume(50); // mudei o volume para 50
		tv1.diminuirVolume(); // diminuo o volume de 5 em 5 (45)
		tv1.aumentarBrilho(10); // aumento o brilho?
		
		tv1.descerCanal(); // desço 1 canal (20 para 19)
		tv1.subirCanal(); // subo 1 canal (19 para 20)
		tv1.subirCanal(); // subo 1 canal (20 para 21)
		tv1.subirCanal(); // subo 1 canal (20 para 22)
		
		tv1.getBrilho(); // vejo o brilho atual apos mudar?
		tv1.diminuirVolume(); // diminuo 5 do volume passa para 40
		tv1.desligar(); //Desligo a tv
		
		System.out.println("==========================================");
		System.out.println(tv1.toString()); //Me mostra os dados da tv
		
			
	}
}
