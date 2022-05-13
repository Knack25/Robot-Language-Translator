
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;


public class NetTranslate {

	private NetworkTableInstance inst;
    private NetworkTable table;
    private NetworkTableEntry xEntry;
    private NetworkTableEntry xMinEntry;
    private NetworkTableEntry xMaxEntry;
    private NetworkTableEntry yEntry;
    private NetworkTableEntry yMinEntry;
    private NetworkTableEntry yMaxEntry;
    private NetworkTableEntry nameEntry;
    private NetworkTableEntry cameraAngle;
    private NetworkTableEntry test;
	
	
	
	
	public NetTranslate() {
		inst = NetworkTableInstance.getDefault();
		table = inst.getTable("vision");
		xEntry = table.getEntry("x");
		xMinEntry = table.getEntry("xmin");
		xMaxEntry = table.getEntry("xmax");
		yEntry = table.getEntry("y");
		yMinEntry = table.getEntry("ymin");
		yMaxEntry = table.getEntry("ymax");
		nameEntry = table.getEntry("name");
		cameraAngle = table.getEntry("cameraAngle");
		test = table.getEntry("test");
		inst.startClientTeam(5544);  // where TEAM=190, 294, etc, or use inst.startClient("hostname") or similar
	    inst.startDSClient();  // recommended if running on DS computer; this gets the robot IP from the DS
	}



	public NetworkTableEntry getcameraAngle() {
		return cameraAngle;
	}

	public int getxEntry() {
		return (int) xEntry.getNumber(null);
	}




	public NetworkTableEntry getxMinEntry() {
		return xMinEntry;
	}




	public NetworkTableEntry getxMaxEntry() {
		return xMaxEntry;
	}




	public NetworkTableEntry getyEntry() {
		return yEntry;
	}




	public NetworkTableEntry getyMinEntry() {
		return yMinEntry;
	}




	public NetworkTableEntry getyMaxEntry() {
		return yMaxEntry;
	}




	public NetworkTableEntry getNameEntry() {
		return nameEntry;
	}




	public NetworkTableEntry getTest() {
		return test;
	}


	public void setCameraAngle(int angle) {
		this.cameraAngle.setNumber(angle);
	}
	

	public void setxEntry(int xEntry) {
		this.xEntry.setNumber(xEntry);
	}




	public void setxMinEntry(int xMinEntry) {
		this.xMinEntry.setNumber(xMinEntry);
	}




	public void setxMaxEntry(int xMaxEntry) {
		this.xMaxEntry.setNumber(xMaxEntry);
	}




	public void setyEntry(int yEntry) {
		this.yEntry.setNumber(yEntry);
	}




	public void setyMinEntry(int yMinEntry) {
		this.yMinEntry.setNumber(yMinEntry);
	}




	public void setyMaxEntry(int yMaxEntry) {
		this.yMaxEntry.setNumber(yMaxEntry);
	}




	public void setNameEntry(String nameEntry) {
		this.nameEntry.setString(nameEntry);
	}




	public void setTest(String test) {
		this.test.setString(test);
	}
	
	public void setxEntry(double xEntry) {
		this.xEntry.setNumber(xEntry);
	}




	public void setxMinEntry(double xMinEntry) {
		this.xMinEntry.setNumber(xMinEntry);
	}




	public void setxMaxEntry(double xMaxEntry) {
		this.xMaxEntry.setNumber(xMaxEntry);
	}




	public void setyEntry(double yEntry) {
		this.yEntry.setNumber(yEntry);
	}




	public void setyMinEntry(double yMinEntry) {
		this.yMinEntry.setNumber(yMinEntry);
	}




	public void setyMaxEntry(double yMaxEntry) {
		this.yMaxEntry.setNumber(yMaxEntry);
	}
	
}