//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String [] args){
		DeliveryTruck shopee = new DeliveryTruck();

		StandardPackage standardPackage = new StandardPackage("0926", 6.9);
		ExpressPackage expressPackage =  new ExpressPackage("1110", 9.0);

		shopee.loadPackage(standardPackage);
		shopee.loadPackage(expressPackage);
		shopee.printManifest();
	}

}
