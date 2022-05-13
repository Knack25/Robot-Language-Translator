import py4j.*;


public class NetEntryPoint {
	
	private NetTranslate net;
	
	public NetEntryPoint() {
		net = new NetTranslate();
	}
	
	public NetTranslate getNet() {
		return net;
	}

	public static void main(String[] args) {
		GatewayServer gatewayServer = new GatewayServer(new NetEntryPoint());
		gatewayServer.start();
		System.out.println("Gateway Server Started");
	}
}