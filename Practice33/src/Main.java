//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
		SmartHomeController smartHomeController = new SmartHomeController();

		Smartlight smartlight = new Smartlight("Door 1");
		Thermostat thermostat = new Thermostat(20);

		smartHomeController.addDevice(smartlight);
		smartHomeController.addDevice(thermostat);

		smartHomeController.allLightsOut();
	}
}
