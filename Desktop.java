package org.system;

public class Desktop extends Computer {
	
	
	public void desktopSize() {
		System.out.println("The size of desktop");
	}

	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		
		desktop.computerModel();
		desktop.processorVersion();
		desktop.desktopSize();
	}

}
