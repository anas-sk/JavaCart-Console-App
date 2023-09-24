package OnlineStoreProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Products 
class Product {
	String productColor;
	String productBrand;
	String productName;
	private double ProductPrice;

	public double getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(double ProductPrice) {
		this.ProductPrice = ProductPrice;
	}
}

// HeadPhones
class HeadPhones extends Product {
	String Connectivity;
	boolean MicroPhone;
	String headphoneJacks;
	String EarCups;
	boolean NoiseCancellation;
	String headPhoneBattery;
	String CableQuality;
	boolean Gaming;
	
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setEarCups(String EarCups) {
		this.EarCups = EarCups;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public void setHeadphoneJacks(String headphoneJacks) {
		this.headphoneJacks = headphoneJacks;
	}

	public void setNoiseCancellation(boolean NoiseCancellation) {
		this.NoiseCancellation = NoiseCancellation;
	}

	public void setGaming(boolean Gaming) {
		this.Gaming = Gaming;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public void setHeadPhoneBattery(String headPhoneBattery) {
		this.headPhoneBattery = headPhoneBattery;
	}

	public void setProductPrice(double ProductPrice) {
		super.setProductPrice(ProductPrice);
	}

	public void setConnectivity(String Connectivity) {
		this.Connectivity = Connectivity;
	}

	public void setMicroPhone(boolean MicroPhone) {
		this.MicroPhone = MicroPhone;
	}

	public void setCableQuality(String CableQuality) {
		this.CableQuality = CableQuality;
	}

	public void DisplayHeadPhoneDetails() {
		System.out.println("Product Name : " + this.productName);
		System.out.println("Company : " + this.productBrand);
		System.out.println("Price : $" + this.getProductPrice());
		System.out.println("Color : " + this.productColor);
		System.out.println("Connectivity : " + Connectivity);
		System.out.println("MicroPhone : " + (MicroPhone == true ? "built-in microphone" : "No microphone included"));
		System.out.println(
				(headphoneJacks == "No" ? ("HeadPhone Jacks : " + headphoneJacks) : "Wired connection: Supported"));
		System.out.println("Ear Cups : " + EarCups);
		System.out.println(NoiseCancellation == true ? "Active noise cancellation" : "No active noise cancellation");
		System.out.println(
				Gaming == true ? "Gaming : Compatible with gaming consoles" : "Designed for music enthusiasts");
		System.out.println(headPhoneBattery == "N/A" ? ("Battery Life : " + headPhoneBattery) : "");
		System.out.println(CableQuality == "wireless" ? "" : ("Cable Qualiy : " + CableQuality));
	}

	public void DisplayHeadPhoneNames() {
		System.out.println("Product : " + this.productName);
	}
}

// Sony Headphone
class Sony extends HeadPhones {
	public void Sony1() {
		setProductName("Sony WH-1000XM4 Wireless Noise-Cancelling Headphones");
		setEarCups("Over-Ear");
		setProductColor("Black");
		setHeadphoneJacks("No");
		setNoiseCancellation(true);
		setGaming(false);
		setProductBrand("Sony");
		setHeadPhoneBattery("30 hours");
		setProductPrice(349.99);
		setConnectivity("Wireless");
		setMicroPhone(true);
		setCableQuality("Wireless");
	}

	public void Sony2() {
		setProductName("Sony PlayStation Pulse 3D Wireless Headset");
		setEarCups("On-Ear");
		setProductColor("Blue");
		setHeadphoneJacks("USB Type-C wireless dongle");
		setNoiseCancellation(false);
		setGaming(true);
		setProductBrand("Sony");
		setHeadPhoneBattery("15 hours");
		setProductPrice(99.99);
		setConnectivity("Wired");
		setMicroPhone(false);
		setCableQuality("Standard");
	}

	public void Sony3() {
		setProductName("Sony MDR-XB450AP Extra Bass On-Ear Headphones");
		setEarCups("On-Ear");
		setProductColor("Red");
		setHeadphoneJacks("3.5mm audio cable");
		setNoiseCancellation(false);
		setGaming(false);
		setProductBrand("Sony");
		setHeadPhoneBattery("N/A");
		setProductPrice(49.99);
		setConnectivity("Wired");
		setMicroPhone(true);
		setCableQuality("Standard");
	}
	// public void sonyDisplay(){
	// System.out.println("Product Name : " + this.productName);
	// System.out.println("Company : " + this.productBrand);
	// System.out.println("Price : $" + this.getProductPrice());
	// System.out.println("Color : " + this.productColor);
	// System.out.println("Connectivity : " + Connectivity);
	// System.out.println("MicroPhone : "+(MicroPhone==true?"built-in
	// microphone":"No microphone included"));
	// System.out.println((headphoneJacks=="No"? ("HeadPhone Jacks : " +
	// headphoneJacks):"Wired connection: Supported"));
	// System.out.println("Ear Cups : " + EarCups);
	// System.out.println(NoiseCancellation==true? "Active noise cancellation":"No
	// active noise cancellation");
	// System.out.println(Gaming==true?"Gaming : Compatible with gaming consoles"
	// :"Designed for music enthusiasts");
	// System.out.println(headPhoneBattery=="N/A"?("Battery Life : " +
	// headPhoneBattery):"");
	// System.out.println(CableQuality=="wireless"?"":("Cable Qualiy : " +
	// CableQuality));
	// }
	// public void sonyAllDisplay(){
	// System.out.println("Product : " + this.productName);
	// }
}

// Bose Headphone
class Bose extends HeadPhones {
	public void Bose1() {
		setProductName("Bose QuietComfort 35 II Wireless Noise-Cancelling Headphones");
		setEarCups("Over-Ear");
		setProductColor("Silver");
		setHeadphoneJacks("No");
		setNoiseCancellation(true);
		setGaming(false);
		setHeadPhoneBattery("20 hours");
		setProductBrand("Bose");
		setProductPrice(299.99);
		setConnectivity("Wireless");
		setMicroPhone(true);
		setCableQuality("Wireless");
	}

	public void Bose2() {
		setProductName("Bose SoundSport Free Wireless Headphones");
		setEarCups("In-Ear");
		setProductColor("Black");
		setHeadphoneJacks("No");
		setNoiseCancellation(false);
		setGaming(false);
		setProductBrand("Bose");
		setHeadPhoneBattery("5 hours");
		setProductPrice(179.99);
		setConnectivity("Wireless");
		setMicroPhone(true);
		setCableQuality("Wireless");
	}

	public void Bose3() {
		setProductName("Bose QuietComfort Earbuds");
		setEarCups("In-Ear");
		setProductColor("Triple Black");
		setHeadphoneJacks("No");
		setNoiseCancellation(true);
		setGaming(false);
		setProductBrand("Bose");
		setHeadPhoneBattery("6 hours");
		setProductPrice(279.99);
		setConnectivity("Wireless");
		setMicroPhone(true);
		setCableQuality("wireless");
	}
	// public void BoseDisplay(){
	// System.out.println("Product Name : " + this.productName);
	// System.out.println("Company : " + this.productBrand);
	// System.out.println("Price : $" + this.getProductPrice());
	// System.out.println("Color : " + this.productColor);
	// System.out.println("Connectivity : " + Connectivity);
	// System.out.println("MicroPhone : "+(MicroPhone==true?"built-in
	// microphone":"No microphone included"));
	// System.out.println((headphoneJacks=="No"? ("HeadPhone Jacks : " +
	// headphoneJacks):"Wired connection: Supported"));
	// System.out.println("Ear Cups : " + EarCups);
	// System.out.println(NoiseCancellation==true? "Active noise cancellation":"No
	// active noise cancellation");
	// System.out.println(Gaming==true?"Gaming : Compatible with gaming consoles"
	// :"Designed for music enthusiasts");
	// System.out.println(headPhoneBattery=="N/A"?("Battery Life : " +
	// headPhoneBattery):"");
	// System.out.println(CableQuality=="wireless"?"":("Cable Qualiy : " +
	// CableQuality));
	// }
	// public void BoseAllDisplay(){
	// System.out.println("Product : " + this.productName);
	// }
}

// JBL HeadPhone
class JBL extends HeadPhones {
	public void JBL1() {
		setProductName("JBL Quantum 800 Wireless Gaming Headset");
		setEarCups("Over-Ear");
		setProductColor("Black");
		setHeadphoneJacks("No");
		setNoiseCancellation(true);
		setGaming(true);
		setProductBrand("JBL");
		setHeadPhoneBattery("14 hours");
		setProductPrice(149.99);
		setConnectivity("Wireless");
		setMicroPhone(true);
		setCableQuality("wireless");
	}

	public void JBL2() {
		setProductName("JBL TUNE 750BTNC Wireless Over-Ear Headphones");
		setEarCups("Over-Ear");
		setProductColor("Blue");
		setHeadphoneJacks("No");
		setNoiseCancellation(true);
		setGaming(false);
		setProductBrand("JBL");
		setHeadPhoneBattery("15 hours");
		setProductPrice(99.99);
		setConnectivity("Wireless");
		setMicroPhone(true);
		setCableQuality("wireless");
	}

	public void JBL3() {
		setProductName("JBL Endurance SPRINT Waterproof Wireless In-Ear Sport Headphones");
		setEarCups("In-Ear");
		setProductColor("Teal");
		setHeadphoneJacks("No");
		setNoiseCancellation(false);
		setGaming(false);
		setProductBrand("JBL");
		setHeadPhoneBattery("8 hours");
		setProductPrice(49.99);
		setConnectivity("Wireless");
		setMicroPhone(true);
		setCableQuality("wireless");
	}
	// public void JBLDisplay(){
	// System.out.println("Product Name : " + this.productName);
	// System.out.println("Company : " + this.productBrand);
	// System.out.println("Price : $" + this.getProductPrice());
	// System.out.println("Color : " + this.productColor);
	// System.out.println("Connectivity : " + Connectivity);
	// System.out.println("MicroPhone : "+(MicroPhone==true?"built-in
	// microphone":"No microphone included"));
	// System.out.println((headphoneJacks=="No"? ("HeadPhone Jacks : " +
	// headphoneJacks):"Wired connection: Supported"));
	// System.out.println("Ear Cups : " + EarCups);
	// System.out.println(NoiseCancellation==true? "Active noise cancellation":"No
	// active noise cancellation");
	// System.out.println(Gaming==true?"Gaming : Compatible with gaming consoles"
	// :"Designed for music enthusiasts");
	// System.out.println(headPhoneBattery=="N/A"?("Battery Life : " +
	// headPhoneBattery):"");
	// System.out.println(CableQuality=="wireless"?"":("Cable Qualiy : " +
	// CableQuality));
	// }
	// public void JBLAllDisplay(){
	// System.out.println("Product : " + this.productName);
	// }
}

// Boat Headphone
class Boat extends HeadPhones {
	public void Boat1() {
		setProductName("Boat Rockerz 510 Wireless Headphones");
		setEarCups("On-Ear");
		setProductColor("Black");
		setHeadphoneJacks("No");
		setNoiseCancellation(false);
		setGaming(false);
		setProductBrand("Boat");
		setHeadPhoneBattery("10 hours");
		setProductPrice(39.99);
		setConnectivity("Wireless");
		setMicroPhone(true);
		setCableQuality("wireless");
	}

	public void Boat2() {
		setProductName("Boat Bassheads 900 Wired Headphones");
		setEarCups("Over-Ear");
		setProductColor("Red");
		setHeadphoneJacks("Yes");
		setNoiseCancellation(false);
		setGaming(false);
		setProductBrand("Boat");
		setHeadPhoneBattery("N/A");
		setProductPrice(29.99);
		setConnectivity("Wired");
		setMicroPhone(true);
		setCableQuality("Regular");
	}

	public void Boat3() {
		setProductName("Boat Airdopes 281 Pro Wireless Earbuds");
		setEarCups("In-Ear");
		setProductColor("White");
		setHeadphoneJacks("No");
		setNoiseCancellation(true);
		setGaming(false);
		setProductBrand("Boat");
		setHeadPhoneBattery("5 hours");
		setProductPrice(49.99);
		setConnectivity("Wireless");
		setMicroPhone(true);
		setCableQuality("wireless");
	}
	// public void BoatDisplay(){
	// System.out.println("Product Name : " + this.productName);
	// System.out.println("Company : " + this.productBrand);
	// System.out.println("Price : $" + this.getProductPrice());
	// System.out.println("Color : " + this.productColor);
	// System.out.println("Connectivity : " + Connectivity);
	// System.out.println("MicroPhone : "+(MicroPhone==true?"built-in
	// microphone":"No microphone included"));
	// System.out.println((headphoneJacks=="No"? ("HeadPhone Jacks : " +
	// headphoneJacks):"Wired connection: Supported"));
	// System.out.println("Ear Cups : " + EarCups);
	// System.out.println(NoiseCancellation==true? "Active noise cancellation":"No
	// active noise cancellation");
	// System.out.println(Gaming==true?"Gaming : Compatible with gaming consoles"
	// :"Designed for music enthusiasts");
	// System.out.println(headPhoneBattery=="N/A"?("Battery Life : " +
	// headPhoneBattery):"");
	// System.out.println(CableQuality=="wireless"?"":("Cable Qualiy : " +
	// CableQuality));
	// }
	// public void BoatAllDisplay(){
	// System.out.println("Product : " + this.productName);
	// }
}

// SmartPhone
class SmartPhone extends Product {
	String smartPhoneModel;
	String smartPhoneScreenSize;
	String smartPhoneDisplayType;
	String smartPhoneResolution;
	String smartPhoneProcessor;
	String smartPhoneRAM;
	String smartPhoneStorage;
	String smartPhoneRearCamera;
	String smartPhoneFrontCamera;
	String smartPhoneBattery;
	String smartPhoneOperatingSystem;
	

	public void setproductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public void setSmartPhoneModel(String smartPhoneModel) {
		this.smartPhoneModel = smartPhoneModel;
		this.productName = productBrand + " " + smartPhoneModel;
	}

	public void setSmartPhoneScreenSize(String smartPhoneScreenSize) {
		this.smartPhoneScreenSize = smartPhoneScreenSize;
	}

	public void setSmartPhoneDisplayType(String smartPhoneDisplayType) {
		this.smartPhoneDisplayType = smartPhoneDisplayType;
	}

	public void setSmartPhoneResolution(String smartPhoneResolution) {
		this.smartPhoneResolution = smartPhoneResolution;
	}

	public void setSmartPhoneProcessor(String smartPhoneProcessor) {
		this.smartPhoneProcessor = smartPhoneProcessor;
	}

	public void setSmartPhoneRAM(String smartPhoneRAM) {
		this.smartPhoneRAM = smartPhoneRAM;
	}

	public void setSmartPhoneStorage(String smartPhoneStorage) {
		this.smartPhoneStorage = smartPhoneStorage;
	}

	public void setSmartPhoneRearCamera(String smartPhoneRearCamera) {
		this.smartPhoneRearCamera = smartPhoneRearCamera;
	}

	public void setSmartPhoneFrontCamera(String smartPhoneFrontCamera) {
		this.smartPhoneFrontCamera = smartPhoneFrontCamera;
	}

	public void setSmartPhoneBattery(String smartPhoneBattery) {
		this.smartPhoneBattery = smartPhoneBattery;
	}

	public void setSmartPhoneOperatingSystem(String smartPhoneOperatingSystem) {
		this.smartPhoneOperatingSystem = smartPhoneOperatingSystem;
	}
	

	//
	public void DisplaySmartPhoneDetails() {
		System.out.println("Name : " + productBrand + " " + smartPhoneModel);
		System.out.println("Color : " + productColor);
		System.out.println("Price : $" + getProductPrice());
		System.out.println("Model : " + smartPhoneModel);
		System.out.println("Screen Size : " + smartPhoneScreenSize);
		System.out.println("Display Type : " + smartPhoneDisplayType);
		System.out.println("Resolution : " + smartPhoneResolution);
		System.out.println("Processor : " + smartPhoneProcessor);
		System.out.println("Ram : " + smartPhoneRAM);
		System.out.println("Storage : " + smartPhoneStorage);
		System.out.println("Rear Camera : " + smartPhoneRearCamera);
		System.out.println("Front Camera : " + smartPhoneFrontCamera);
		System.out.println("Battery : " + smartPhoneBattery);
		System.out.println("Operating System : " + smartPhoneOperatingSystem);
	}

	public void DisplaySmartPhoneNames() {
		System.out.println("the " + productBrand + " " + smartPhoneModel);
	}
	
}

// Apple SmartPhone
class ApplePhones extends SmartPhone {
	public void ApplePhones1() {
		setproductBrand("Apple");
		setProductColor("Graphite");
		setProductPrice(1499.0);
		setSmartPhoneModel("iPhone 13 Pro Max");
		setSmartPhoneScreenSize("6.7 inches");
		setSmartPhoneDisplayType("Super Retina XDR ProMotion OLED");
		setSmartPhoneResolution("2778 x 1284 pixels");
		setSmartPhoneProcessor("A15 Bionic chip with 5G support");
		setSmartPhoneRAM("6 GB");
		setSmartPhoneStorage("512 GB");
		setSmartPhoneRearCamera(
				"Triple 12 MP (wide, ultra-wide, and telephoto), with LiDAR scanner and 4K ProRes video recording");
		setSmartPhoneFrontCamera("12 MP, with TrueDepth camera system and 4K Dolby Vision HDR recording");
		setSmartPhoneBattery("4352 mAh, with fast charging and MagSafe wireless charging support");
		setSmartPhoneOperatingSystem("iOS 15");
	}

	public void ApplePhones2() {
		setproductBrand("Apple");
		setProductColor("Red");
		setProductPrice(599.0);
		setSmartPhoneModel("iPhone SE (2nd generation)");
		setSmartPhoneScreenSize("4.7 inches");
		setSmartPhoneDisplayType("Retina IPS LCD");
		setSmartPhoneResolution("1334 x 750 pixels");
		setSmartPhoneProcessor("A13 Bionic chip with 4G LTE support");
		setSmartPhoneRAM("3 GB");
		setSmartPhoneStorage("256 GB");
		setSmartPhoneRearCamera("Single 12 MP (wide), with portrait mode and 4K video recording");
		setSmartPhoneFrontCamera(" 7 MP, with portrait mode and 1080p HD video recording");
		setSmartPhoneBattery("1821 mAh, with fast charging and wireless charging support");
		setSmartPhoneOperatingSystem("iOS 14");
	}

	public void ApplePhones3() {
		setproductBrand("Apple");
		setProductColor("Coral");
		setProductPrice(649.0);
		setSmartPhoneModel("iPhone XR");
		setSmartPhoneScreenSize("6.1 inches");
		setSmartPhoneDisplayType("Liquid Retina LCD");
		setSmartPhoneResolution("1792 x 828 pixels");
		setSmartPhoneProcessor("A12 Bionic chip with 4G LTE support");
		setSmartPhoneRAM("3 GB");
		setSmartPhoneStorage("128 GB");
		setSmartPhoneRearCamera("Single 12 MP (wide), with portrait mode and 4K video recording");
		setSmartPhoneFrontCamera(" 7 MP, with portrait mode and 1080p HD video recording");
		setSmartPhoneBattery("2942 mAh, with fast charging and wireless charging support");
		setSmartPhoneOperatingSystem("iOS 13");
	}
}

// Samsung SmartPhone
class SamsungPhones extends SmartPhone {
	public void SamsungPhones1() {
		setproductBrand("Samsung");
		setProductColor("Phantom Black");
		setProductPrice(1299.0);
		setSmartPhoneModel("Galaxy S21 Ultra");
		setSmartPhoneScreenSize("6.8 inches");
		setSmartPhoneDisplayType("Dynamic AMOLED 2X");
		setSmartPhoneResolution("3200 x 1440 pixels");
		setSmartPhoneProcessor("Exynos 2100 5G");
		setSmartPhoneRAM("12 GB");
		setSmartPhoneStorage("256 GB");
		setSmartPhoneRearCamera(
				"Quad 108 MP (wide), 10 MP (periscope telephoto), 10 MP (telephoto), and 12 MP (ultra-wide), with 8K video recording");
		setSmartPhoneFrontCamera("40 MP, with 4K video recording");
		setSmartPhoneBattery("5000 mAh, with fast charging and wireless charging support");
		setSmartPhoneOperatingSystem("Android 11");
	}

	public void SamsungPhones2() {
		setproductBrand("Samsung");
		setProductColor("Phantom Silver");
		setProductPrice(899.0);
		setSmartPhoneModel("Galaxy S21");
		setSmartPhoneScreenSize("6.2 inches");
		setSmartPhoneDisplayType("Dynamic AMOLED 2X");
		setSmartPhoneResolution("2400 x 1080 pixels");
		setSmartPhoneProcessor("Exynos 2100 5G");
		setSmartPhoneRAM("8 GB");
		setSmartPhoneStorage("128 GB");
		setSmartPhoneRearCamera(
				"Triple 12 MP (wide), 12 MP (ultra-wide), and 64 MP (telephoto), with 8K video recording");
		setSmartPhoneFrontCamera("10 MP, with 4K video recording");
		setSmartPhoneBattery("4000 mAh, with fast charging and wireless charging support");
		setSmartPhoneOperatingSystem("Android 11");
	}

	public void SamsungPhones3() {
		setproductBrand("Samsung");
		setProductColor("Cloud Pink");
		setProductPrice(499.0);
		setSmartPhoneModel("Galaxy A52 5G");
		setSmartPhoneScreenSize("6.5 inches");
		setSmartPhoneDisplayType("Super AMOLED");
		setSmartPhoneResolution("2400 x 1080 pixels");
		setSmartPhoneProcessor("Snapdragon 750G 5G");
		setSmartPhoneRAM("6 GB");
		setSmartPhoneStorage("128 GB");
		setSmartPhoneRearCamera(
				"Quad 64 MP (wide), 12 MP (ultra-wide), 5 MP (macro), and 5 MP (depth), with 4K video recording");
		setSmartPhoneFrontCamera("32 MP, with 4K video recording");
		setSmartPhoneBattery("4500 mAh, with fast charging and wireless charging support");
		setSmartPhoneOperatingSystem("Android 11");
	}
}

// Google SmartPhone
class GooglePhones extends SmartPhone {
	public void GooglePhones1() {
		setproductBrand("Google");
		setProductColor("Just Black");
		setProductPrice(899.0);
		setSmartPhoneModel("Pixel 6 Pro");
		setSmartPhoneScreenSize("6.7 inches");
		setSmartPhoneDisplayType("LTPO OLED, 120Hz");
		setSmartPhoneResolution("3120 x 1440 pixels");
		setSmartPhoneProcessor("Google Tensor chip with 5G support");
		setSmartPhoneRAM("12 GB");
		setSmartPhoneStorage("512 GB");
		setSmartPhoneRearCamera(
				"Triple 50 MP (wide, ultra-wide, and telephoto), with Google's AI-powered computational photography features and 4K video recording");
		setSmartPhoneFrontCamera("11 MP, with computational photography and 1080p HD video recording");
		setSmartPhoneBattery("5000 mAh, with fast charging and wireless charging support");
		setSmartPhoneOperatingSystem("Android 12");
	}

	public void GooglePhones2() {
		setproductBrand("Google");
		setProductColor("Clearly White");
		setProductPrice(449.0);
		setSmartPhoneModel("Pixel 4a");
		setSmartPhoneScreenSize("5.8 inches");
		setSmartPhoneDisplayType("OLED");
		setSmartPhoneResolution("2340 x 1080 pixels");
		setSmartPhoneProcessor("Qualcomm Snapdragon 730G");
		setSmartPhoneRAM("6 GB");
		setSmartPhoneStorage("128 GB");
		setSmartPhoneRearCamera("Single 12.2 MP (wide), with Night Sight mode and 4K video recording");
		setSmartPhoneFrontCamera("8 MP, with Night Sight mode and 1080p HD video recording");
		setSmartPhoneBattery("3140 mAh, with 18W fast charging support");
		setSmartPhoneOperatingSystem("Android 11");
	}

	public void GooglePhones3() {
		setproductBrand("Google");
		setProductColor("Not Pink");
		setProductPrice(699.0);
		setSmartPhoneModel("Pixel 3 XL");
		setSmartPhoneScreenSize("6.3 inches");
		setSmartPhoneDisplayType("P-OLED");
		setSmartPhoneResolution("2960 x 1440 pixels");
		setSmartPhoneProcessor("Qualcomm Snapdragon 845");
		setSmartPhoneRAM("4 GB");
		setSmartPhoneStorage("64 GB");
		setSmartPhoneRearCamera("Single 12.2 MP (wide), with Night Sight mode and 4K video recording");
		setSmartPhoneFrontCamera("Dual 8 MP (wide and ultra-wide), with Night Sight mode and 1080p HD video recording");
		setSmartPhoneBattery("3430 mAh, with 18W fast charging support");
		setSmartPhoneOperatingSystem("Android 9.0 Pie");
	}
}

// OnePlus SmartPhone
class OnePlusPhones extends SmartPhone {
	public void OneplusPhone1() {
		setproductBrand("Oneplus");
		setProductColor("Black");
		setProductPrice(999.0);
		setSmartPhoneModel("Oneplus 10 Pro");
		setSmartPhoneScreenSize("6.8 inches");
		setSmartPhoneDisplayType("Fluid AMOLED LTPO");
		setSmartPhoneResolution("3216 x 1440 pixels");
		setSmartPhoneProcessor("Qualcomm Snapdragon 8 Gen 1");
		setSmartPhoneRAM("8 GB");
		setSmartPhoneStorage("256 GB");
		setSmartPhoneRearCamera("Quad 50 MP (wide), 48 MP (ultra-wide), 8 MP (telephoto), 2 MP (monochrome)");
		setSmartPhoneFrontCamera("16 MP, with auto-HDR and 1080p 30fps video recording");
		setSmartPhoneBattery("5000 mAh, with Warp Charge 65T and Warp Charge 50 Wireless support");
		setSmartPhoneOperatingSystem("OxygenOS 13, based on Android 12");
	}

	public void OneplusPhone2() {
		setproductBrand("Oneplus");
		setProductColor("Silver");
		setProductPrice(799.0);
		setSmartPhoneModel("Oneplus Nord 2");
		setSmartPhoneScreenSize("6.43 inches");
		setSmartPhoneDisplayType("Fluid AMOLED");
		setSmartPhoneResolution("2400 x 1080 pixels");
		setSmartPhoneProcessor("MediaTek Dimensity 1200-AI");
		setSmartPhoneRAM("12 GB");
		setSmartPhoneStorage("256 GB");
		setSmartPhoneRearCamera("Triple 50 MP (wide), 8 MP (ultra-wide), 2 MP (monochrome)");
		setSmartPhoneFrontCamera("32 MP, with auto-HDR and 1080p@30fps video recording");
		setSmartPhoneBattery("4500 mAh, with Warp Charge 65 support");
		setSmartPhoneOperatingSystem("OxygenOS 11.3, based on Android 11");
	}

	public void OneplusPhone3() {
		setproductBrand("Oneplus");
		setProductColor("Blue");
		setProductPrice(599.0);
		setSmartPhoneModel("Oneplus Nord CE 5G");
		setSmartPhoneScreenSize("6.43 inches");
		setSmartPhoneDisplayType("Fluid AMOLED");
		setSmartPhoneResolution("2400 x 1080 pixels");
		setSmartPhoneProcessor("Qualcomm Snapdragon 750G 5G");
		setSmartPhoneRAM("8 GB");
		setSmartPhoneStorage("128 GB");
		setSmartPhoneRearCamera("Triple 64 MP (wide), 8 MP (ultra-wide), 2 MP (monochrome)");
		setSmartPhoneFrontCamera("16 MP, with auto-HDR and 1080p@30fps video recording");
		setSmartPhoneBattery("4500 mAh, with Warp Charge 30T Plus support");
		setSmartPhoneOperatingSystem("OxygenOS 11, based on Android 11");
	}
}

// Laptops
class Laptops extends Product {
	String laptopProcessor;
	String laptopGraphics;
	String laptopRAM;
	String laptopStorage;
	String laptopScreenSize;
	String laptopScreenResolution;
	String laptopOperatingSystem;
	String laptopBatteryLife;
	String laptopWeight;
	String laptopConnectivity;

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public void setLaptopProcessor(String laptopProcessor) {
		this.laptopProcessor = laptopProcessor;
	}

	public void setLaptopGraphics(String laptopGraphics) {
		this.laptopGraphics = laptopGraphics;
	}

	public void setLaptopRAM(String laptopRAM) {
		this.laptopRAM = laptopRAM;
	}

	public void setLaptopStorage(String laptopStorage) {
		this.laptopStorage = laptopStorage;
	}

	public void setLaptopScreenSize(String laptopScreenSize) {
		this.laptopScreenSize = laptopScreenSize;
	}

	public void setLaptopScreenResolution(String laptopScreenResolution) {
		this.laptopScreenResolution = laptopScreenResolution;
	}

	public void setLaptopOperatingSystem(String laptopOperatingSystem) {
		this.laptopOperatingSystem = laptopOperatingSystem;
	}

	public void setLaptopBatteryLife(String laptopBatteryLife) {
		this.laptopBatteryLife = laptopBatteryLife;
	}

	public void setLaptopWeight(String laptopWeight) {
		this.laptopWeight = laptopWeight;
	}

	public void setLaptopConnectivity(String laptopConnectivity) {
		this.laptopConnectivity = laptopConnectivity;
	}

	public void DisplayLaptopDetails() {
		System.out.println("Name : " + productName);
		System.out.println("Color : " + productColor);
		System.out.println("Brand : " + productBrand);
		System.out.println("Price : $" + getProductPrice());
		System.out.println("Processor : " + laptopProcessor);
		System.out.println("Graphics : " + laptopGraphics);
		System.out.println("RAM : " + laptopRAM);
		System.out.println("Storage : " + laptopStorage);
		System.out.println("Screen Size : " + laptopScreenSize);
		System.out.println("Screen Resolution : " + laptopScreenResolution);
		System.out.println("Operating System : " + laptopOperatingSystem);
		System.out.println("Battery Life : " + laptopBatteryLife);
		System.out.println("Weight : " + laptopWeight);
		System.out.println("Connectivity : " + laptopConnectivity);
	}

	public void DisplayLaptopName() {
		System.out.println("the " + productName);
	}
}

// Apple Laptop
class AppleLaptop extends Laptops {
	public void AppleLaptop1() {
		setProductName("MacBook Air");
		setProductColor("Gold");
		setProductBrand("Apple");
		setProductPrice(999.00);
		setLaptopProcessor("Apple M1 chip");
		setLaptopGraphics("Apple M1 chip");
		setLaptopRAM("8GB");
		setLaptopStorage("256GB SSD");
		setLaptopScreenSize("13.3 inches");
		setLaptopScreenResolution("2560x1600 pixels");
		setLaptopOperatingSystem("macOS Big Sur");
		setLaptopBatteryLife("Up to 15 hours");
		setLaptopWeight("1.29 kg");
		setLaptopConnectivity("Wi-Fi 6, Bluetooth 5.0, 2x Thunderbolt 3 (USB-C) ports");
	}

	public void AppleLaptop2() {
		setProductName("MacBook Pro");
		setProductColor("Space Gray");
		setProductBrand("Apple");
		setProductPrice(1299.00);
		setLaptopProcessor("Intel Core i5");
		setLaptopGraphics("Intel Iris Plus Graphics 645");
		setLaptopRAM("8GB");
		setLaptopStorage("512GB SSD");
		setLaptopScreenSize("13.3 inches");
		setLaptopScreenResolution("2560x1600 pixels");
		setLaptopOperatingSystem("macOS Big Sur");
		setLaptopBatteryLife("Up to 10 hours");
		setLaptopWeight("1.4 kg");
		setLaptopConnectivity("Wi-Fi 5, Bluetooth 5.0, 4x Thunderbolt 3 (USB-C) ports");
	}

	public void AppleLaptop3() {
		setProductName("MacBook Pro");
		setProductColor("Silver");
		setProductBrand("Apple");
		setProductPrice(2399.00);
		setLaptopProcessor("Intel Core i7");
		setLaptopGraphics("AMD Radeon Pro 5300M with 4GB of GDDR6 memory");
		setLaptopRAM("16GB");
		setLaptopStorage("1TB SSD");
		setLaptopScreenSize("16 inches");
		setLaptopScreenResolution("3072x1920 pixels");
		setLaptopOperatingSystem("macOS Big Sur");
		setLaptopBatteryLife("Up to 11 hours");
		setLaptopWeight("2.0 kg");
		setLaptopConnectivity("Wi-Fi 6, Bluetooth 5.0, 4x Thunderbolt 3 (USB-C) ports");
	}
}

// Asus Laptop
class AsusLaptop extends Laptops {
	public void AsusLaptop1() {
		setProductName("Asus VivoBook");
		setProductColor("Slate Grey");
		setProductBrand("Asus");
		setProductPrice(799.99);
		setLaptopProcessor("Intel Core i7-1165G7");
		setLaptopGraphics("Intel Iris Xe Graphics");
		setLaptopRAM("16GB");
		setLaptopStorage("512GB NVMe SSD");
		setLaptopScreenSize("14 inches");
		setLaptopScreenResolution("1920x1080 pixels");
		setLaptopOperatingSystem("Windows 11");
		setLaptopBatteryLife("10 hours");
		setLaptopWeight("1.4 kg");
		setLaptopConnectivity("Wi-Fi 6, Bluetooth 5.2, USB Type-C, HDMI, microSD card reader");
	}

	public void AsusLaptop2() {
		setProductName("Asus ZenBook");
		setProductColor("Royal Blue");
		setProductBrand("Asus");
		setProductPrice(1199.99);
		setLaptopProcessor("Intel Core i9-11900H");
		setLaptopGraphics("Nvidia GeForce RTX 3050 Ti");
		setLaptopRAM("32GB");
		setLaptopStorage("1TB PCIe NVMe SSD");
		setLaptopScreenSize("15.6 inches");
		setLaptopScreenResolution("3840x2160 pixels");
		setLaptopOperatingSystem("Windows 11");
		setLaptopBatteryLife("12 hours");
		setLaptopWeight("1.6 kg");
		setLaptopConnectivity("Wi-Fi 6, Bluetooth 5.2, Thunderbolt 4, USB Type-C, HDMI");
	}

	public void AsusLaptop3() {
		setProductName("Asus TUF Gaming");
		setProductColor("Eclipse Gray");
		setProductBrand("Asus");
		setProductPrice(899.99);
		setLaptopProcessor("AMD Ryzen 7 5800H");
		setLaptopGraphics("Nvidia GeForce GTX 1650");
		setLaptopRAM("16GB");
		setLaptopStorage("512GB PCIe NVMe SSD");
		setLaptopScreenSize("15.6 inches");
		setLaptopScreenResolution("1920x1080 pixels");
		setLaptopOperatingSystem("Windows 10 Home");
		setLaptopBatteryLife("8 hours");
		setLaptopWeight("2.3 kg");
		setLaptopConnectivity("Wi-Fi 5, Bluetooth 5.1, USB Type-C, HDMI, Ethernet");
	}
}

// Dell Laptop
class DellLaptop extends Laptops {
	public void DellLaptop1() {
		setProductName("Dell XPS 13");
		setProductColor("Silver");
		setProductBrand("Dell");
		setProductPrice(1299.99);
		setLaptopProcessor("Intel Core i5-1135G7");
		setLaptopGraphics("Intel Iris Xe Graphics");
		setLaptopRAM("8GB LPDDR4x");
		setLaptopStorage("256GB PCIe NVMe SSD");
		setLaptopScreenSize("13.4 inches");
		setLaptopScreenResolution("FHD+ (1920 x 1200)");
		setLaptopOperatingSystem("Windows 10 Home");
		setLaptopBatteryLife("Up to 14 hours");
		setLaptopWeight("2.64 pounds");
		setLaptopConnectivity(
				"2 x Thunderbolt 4 (USB-C), 1 x USB-C 3.2, 3.5mm headphone/microphone combo jack, Wi-Fi 6, Bluetooth 5.1");
	}

	public void DellLaptop2() {
		setProductName("Dell Inspiron 15 3000");
		setProductColor("Black");
		setProductBrand("Dell");
		setProductPrice(599.99);
		setLaptopProcessor("Intel Core i3-1115G4");
		setLaptopGraphics("Intel UHD Graphics");
		setLaptopRAM("4GB DDR4");
		setLaptopStorage("256GB PCIe NVMe SSD");
		setLaptopScreenSize("15.6 inches");
		setLaptopScreenResolution("HD (1366 x 768)");
		setLaptopOperatingSystem("Windows 10 Home");
		setLaptopBatteryLife("Up to 7.5 hours");
		setLaptopWeight("4.16 pounds");
		setLaptopConnectivity(
				"1 x USB 2.0, 2 x SuperSpeed USB 3.2 Gen 1 Type-A, 1 x HDMI 1.4b, 1 x RJ45, 1 x SD card reader, Wi-Fi 5, Bluetooth 4.2");

	}

	public void DellLaptop3() {
		setProductName("Dell XPS 15");
		setProductColor("Platinum Silver with Black Carbon Fiber Palmrest");
		setProductBrand("Dell");
		setProductPrice(2399.99);
		setLaptopProcessor("Intel Core i9-11900H");
		setLaptopGraphics("NVIDIA GeForce RTX 3050 Ti 4GB GDDR6");
		setLaptopRAM("32GB DDR4-3200MHz");
		setLaptopStorage("1TB PCIe NVMe x4 SSD");
		setLaptopScreenSize("15.6 inches");
		setLaptopScreenResolution("UHD+ (3840 x 2400)");
		setLaptopOperatingSystem("Windows 11 Home");
		setLaptopBatteryLife("Up to 9.5 hours");
		setLaptopWeight("4.18 pounds");
		setLaptopConnectivity(
				"2 x Thunderbolt 4 (USB-C), 1 x USB-C 3.2 Gen 2, 1 x HDMI 2.0, SD card reader, Wi-Fi 6E, Bluetooth 5.1");

	}
}

// Hp Laptop
class HpLaptop extends Laptops {
	public void HpLaptop1() {
		setProductName("HP Pavilion");
		setProductColor("Black");
		setProductBrand("HP");
		setProductPrice(849.99);
		setLaptopProcessor("Intel Core i7-1165G7");
		setLaptopGraphics("NVIDIA GeForce MX450");
		setLaptopRAM("16GB DDR4");
		setLaptopStorage("512GB PCIe NVMe SSD");
		setLaptopScreenSize("15.6 inches");
		setLaptopScreenResolution("FHD (1920 x 1080)");
		setLaptopOperatingSystem("Windows 11 Home");
		setLaptopBatteryLife("Up to 8 hours");
		setLaptopWeight("4.08 pounds");
		setLaptopConnectivity(
				"2 x SuperSpeed USB Type-A, 1 x USB Type-C, HDMI, RJ-45, SD card reader, Wi-Fi 6, Bluetooth 5.2");
	}

	public void HpLaptop2() {
		setProductName("HP Pavilion 14");
		setProductColor("Natural Silver");
		setProductBrand("HP");
		setProductPrice(799.99);
		setLaptopProcessor("Intel Core i5-1135G7");
		setLaptopGraphics("Intel Iris Xe Graphics");
		setLaptopRAM("8GB DDR4-3200 SDRAM");
		setLaptopStorage("512GB PCIe NVMe M.2 SSD");
		setLaptopScreenSize("14 inches");
		setLaptopScreenResolution("FHD IPS (1920 x 1080)");
		setLaptopOperatingSystem("Windows 10 Home");
		setLaptopBatteryLife("Up to 8.5 hours");
		setLaptopWeight("3.42 pounds");
		setLaptopConnectivity(
				"1 x SuperSpeed USB Type-C, 2 x SuperSpeed USB Type-A, 1 x HDMI 1.4b, 1 x RJ-45, 1 x AC smart pin, 1 x headphone/microphone combo, Wi-Fi 6, Bluetooth 5");
	}

	public void HpLaptop3() {
		setProductName("HP Spectre x360");
		setProductColor("Nightfall Black");
		setProductBrand("HP");
		setProductPrice(1699.99);
		setLaptopProcessor("Intel Core i7-1165G7");
		setLaptopGraphics("Intel Iris Xe Graphics");
		setLaptopRAM("16GB LPDDR4x-4266 SDRAM");
		setLaptopStorage("512GB PCIe NVMe M.2 SSD");
		setLaptopScreenSize("13.3 inches");
		setLaptopScreenResolution("FHD IPS Touchscreen (1920 x 1080)");
		setLaptopOperatingSystem("Windows 11 Home");
		setLaptopBatteryLife("Up to 16 hours");
		setLaptopWeight("2.87 pounds");
		setLaptopConnectivity(
				"2 x Thunderbolt 4 (USB-C), 1 x USB 3.2 Gen 1 Type-A, 1 x headphone/microphone combo, Wi-Fi 6E, Bluetooth 5.2");
	}
}

// Smart Watch
class SmartWatch extends Product {
	String smartWatchModel;
	String smartWatchDisplay;
	String smartWatchCompatibility;
	String smartWatchConnectivity;
	String smartWatchBatteryLife;
	String smartWatchWaterResistance;
	String smartWatchSensors;
	String smartWatchNotifications;
	String smartWatchFitnessTracking;
	String smartWatchOtherFeatures;
	String smartWatchDimensions;
	String smartWatchWeight;
	String smartWatchWarranty;

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public void setSmartWatchModel(String smartWatchModel) {
		this.smartWatchModel = smartWatchModel;
		this.productName = productBrand + " " + smartWatchModel;
	}

	public void setSmartWatchDisplay(String smartWatchDisplay) {
		this.smartWatchDisplay = smartWatchDisplay;
	}

	public void setSmartWatchCompatibility(String smartWatchCompatibility) {
		this.smartWatchCompatibility = smartWatchCompatibility;
	}

	public void setSmartWatchConnectivity(String smartWatchConnectivity) {
		this.smartWatchConnectivity = smartWatchConnectivity;
	}

	public void setSmartWatchBatteryLife(String smartWatchBatteryLife) {
		this.smartWatchBatteryLife = smartWatchBatteryLife;
	}

	public void setSmartWatchWaterResistance(String smartWatchWaterResistance) {
		this.smartWatchWaterResistance = smartWatchWaterResistance;
	}

	public void setSmartWatchSensors(String smartWatchSensors) {
		this.smartWatchSensors = smartWatchSensors;
	}

	public void setSmartWatchNotifications(String smartWatchNotifications) {
		this.smartWatchNotifications = smartWatchNotifications;
	}

	public void setSmartWatchFitnessTracking(String smartWatchFitnessTracking) {
		this.smartWatchFitnessTracking = smartWatchFitnessTracking;
	}

	public void setSmartWatchOtherFeatures(String smartWatchOtherFeatures) {
		this.smartWatchOtherFeatures = smartWatchOtherFeatures;
	}

	public void setSmartWatchDimensions(String smartWatchDimensions) {
		this.smartWatchDimensions = smartWatchDimensions;
	}

	public void setSmartWatchWeight(String smartWatchWeight) {
		this.smartWatchWeight = smartWatchWeight;
	}

	public void setSmartWatchWarranty(String smartWatchWarranty) {
		this.smartWatchWarranty = smartWatchWarranty;
	}

	public void DisplaySmartWatchDetails() {
		System.out.println("Name : " + smartWatchModel);
		System.out.println("Price : $" + getProductPrice());
		System.out.println("Display : " + smartWatchDisplay);
		System.out.println("Compatibility : " + smartWatchCompatibility);
		System.out.println("Connectivity : " + smartWatchConnectivity);
		System.out.println("Battery Life : " + smartWatchBatteryLife);
		System.out.println("Water Resistance : " + smartWatchWaterResistance);
		System.out.println("Sensors : " + smartWatchSensors);
		System.out.println("Notifications : " + smartWatchNotifications);
		System.out.println("Fitness Tracking : " + smartWatchFitnessTracking);
		System.out.println("Other Features : " + smartWatchOtherFeatures);
		System.out.println("Dimensions : " + smartWatchDimensions);
		System.out.println("Weight : " + smartWatchWeight);
		System.out.println("Warranty : " + smartWatchWarranty);
	}

	public void DisplaySmartWatchName() {
		System.out.println("the " + smartWatchModel);
	}
}

// Apple Smart Watch
class AppleSmartWatch extends SmartWatch {
	public void AppleSmartWatch1() {
		setProductBrand("Apple");
		setProductPrice(199);
		setSmartWatchModel("Apple Watch Series 1");
		setSmartWatchDisplay("Retina OLED display");
		setSmartWatchCompatibility("iOS devices");
		setSmartWatchConnectivity("Wi-Fi and Bluetooth");
		setSmartWatchBatteryLife("Up to 18 hours");
		setSmartWatchWaterResistance("Water resistant up to 50 meters");
		setSmartWatchSensors("Accelerometer, Gyroscope, Heart rate sensor");
		setSmartWatchNotifications("Call and message notifications");
		setSmartWatchFitnessTracking("Activity tracking, Workout detection");
		setSmartWatchOtherFeatures("Siri, Apple Pay");
		setSmartWatchDimensions("38mm or 42mm case size");
		setSmartWatchWeight("28.2g to 34.2g");
		setSmartWatchWarranty("1 year");
	}

	public void AppleSmartWatch2() {
		setProductBrand("Apple");
		setProductPrice(299);
		setSmartWatchModel("Apple Watch Series 2");
		setSmartWatchDisplay("Retina OLED display");
		setSmartWatchCompatibility("iOS devices");
		setSmartWatchConnectivity("Wi-Fi and Bluetooth");
		setSmartWatchBatteryLife("Up to 18 hours");
		setSmartWatchWaterResistance("Water resistant up to 50 meters");
		setSmartWatchSensors("Accelerometer, Gyroscope, Heart rate sensor");
		setSmartWatchNotifications("Call and message notifications");
		setSmartWatchFitnessTracking("Activity tracking, Workout detection, Built-in GPS");
		setSmartWatchOtherFeatures("Siri, Apple Pay");
		setSmartWatchDimensions("38mm or 42mm case size");
		setSmartWatchWeight("28.2g to 34.2g");
		setSmartWatchWarranty("1 year");
	}

	public void AppleSmartWatch3() {
		setProductBrand("Apple");
		setProductPrice(399);
		setSmartWatchModel("Apple Watch Series 3");
		setSmartWatchDisplay("Retina OLED display");
		setSmartWatchCompatibility("iOS devices");
		setSmartWatchConnectivity("Wi-Fi and Bluetooth");
		setSmartWatchBatteryLife("Up to 18 hours");
		setSmartWatchWaterResistance("Water resistant up to 50 meters");
		setSmartWatchSensors("Accelerometer, Gyroscope, Heart rate sensor, Barometer, Altimeter");
		setSmartWatchNotifications("Call and message notifications");
		setSmartWatchFitnessTracking("Activity tracking, Workout detection, Built-in GPS, Elevation");
		setSmartWatchOtherFeatures("Siri, Apple Pay");
		setSmartWatchDimensions("38mm or 42mm case size");
		setSmartWatchWeight("26.7g to 32.3g");
		setSmartWatchWarranty("1 year");
	}
}

// Samsung Smart Watch
class SamsungSmartWatch extends SmartWatch {
	public void SamsungSmartWatch1() {
		setProductBrand("Samsung");
		setProductPrice(349);
		setSmartWatchModel("Galaxy Watch");
		setSmartWatchDisplay("Super AMOLED display");
		setSmartWatchCompatibility("Android and iOS devices");
		setSmartWatchConnectivity("Wi-Fi, Bluetooth, and LTE");
		setSmartWatchBatteryLife("Up to 4 days");
		setSmartWatchWaterResistance("Water resistant up to 50 meters");
		setSmartWatchSensors("Accelerometer, Gyroscope, Heart rate sensor, Barometer, Ambient light sensor");
		setSmartWatchNotifications("Call and message notifications, Social media notifications");
		setSmartWatchFitnessTracking("Activity tracking, Built-in GPS, Elevation, Heart rate monitoring");
		setSmartWatchOtherFeatures("Samsung Pay, Bixby, Voice commands");
		setSmartWatchDimensions("42mm or 46mm case size");
		setSmartWatchWeight("49g to 63g");
		setSmartWatchWarranty("1 year");
	}

	public void SamsungSmartWatch2() {
		setProductBrand("Samsung");
		setProductPrice(399);
		setSmartWatchModel("Galaxy Watch Active2");
		setSmartWatchDisplay("Super AMOLED display");
		setSmartWatchCompatibility("Android and iOS devices");
		setSmartWatchConnectivity("Wi-Fi, Bluetooth, and LTE");
		setSmartWatchBatteryLife("Up to 2 days");
		setSmartWatchWaterResistance("Water resistant up to 50 meters");
		setSmartWatchSensors(
				"Accelerometer, Gyroscope, Heart rate sensor, Barometer, Ambient light sensor, ECG sensor");
		setSmartWatchNotifications("Call and message notifications, Social media notifications");
		setSmartWatchFitnessTracking(
				"Activity tracking, Built-in GPS, Elevation, Heart rate monitoring, Running coach");
		setSmartWatchOtherFeatures("Samsung Pay, Bixby, Voice commands");
		setSmartWatchDimensions("40mm or 44mm case size");
		setSmartWatchWeight("26g to 30g");
		setSmartWatchWarranty("1 year");
	}

	public void SamsungSmartWatch3() {
		setProductBrand("Samsung");
		setProductPrice(249);
		setSmartWatchModel("Galaxy Watch Active");
		setSmartWatchDisplay("Super AMOLED display");
		setSmartWatchCompatibility("Android and iOS devices");
		setSmartWatchConnectivity("Wi-Fi, Bluetooth, and LTE");
		setSmartWatchBatteryLife("Up to 2 days");
		setSmartWatchWaterResistance("Water resistant up to 50 meters");
		setSmartWatchSensors("Accelerometer, Gyroscope, Heart rate sensor, Barometer, Ambient light sensor");
		setSmartWatchNotifications("Call and message notifications, Social media notifications, Email notifications");
		setSmartWatchFitnessTracking(
				"Activity tracking, Built-in GPS, Elevation, Heart rate monitoring, Running coach, Sleep tracking");
		setSmartWatchOtherFeatures("Samsung Pay, Bixby, Voice commands, Music player, Stopwatch, Timer");
		setSmartWatchDimensions("41mm or 45mm case size");
		setSmartWatchWeight("25g to 30g");
		setSmartWatchWarranty("2 years");
	}
}

// fitbit Smart Watch
class FitbitSmartWatch extends SmartWatch {
	public void FitbitSmartWatch1() {
		setProductBrand("Fitbit");
		setProductPrice(199);
		setSmartWatchModel("Versa 3");
		setSmartWatchDisplay("AMOLED display");
		setSmartWatchCompatibility("Android and iOS devices");
		setSmartWatchConnectivity("Wi-Fi, Bluetooth, and NFC");
		setSmartWatchBatteryLife("Up to 6 days");
		setSmartWatchWaterResistance("Water resistant up to 50 meters");
		setSmartWatchSensors("Accelerometer, Gyroscope, Heart rate sensor, Blood oxygen sensor");
		setSmartWatchNotifications("Call and message notifications, Social media notifications, Email notifications");
		setSmartWatchFitnessTracking(
				"Activity tracking, Built-in GPS, Elevation, Heart rate monitoring, Running coach, Sleep tracking");
		setSmartWatchOtherFeatures("Fitbit Pay, Alexa, Music control, Stopwatch, Timer");
		setSmartWatchDimensions("40mm or 44mm case size");
		setSmartWatchWeight("28g to 35g");
		setSmartWatchWarranty("1 year");
	}

	public void FitbitSmartWatch2() {
		setProductBrand("Fitbit");
		setProductPrice(99);
		setSmartWatchModel("Inspire 2");
		setSmartWatchDisplay("OLED display");
		setSmartWatchCompatibility("Android and iOS devices");
		setSmartWatchConnectivity("Bluetooth");
		setSmartWatchBatteryLife("Up to 10 days");
		setSmartWatchWaterResistance("Water resistant up to 50 meters");
		setSmartWatchSensors("Accelerometer, Gyroscope, Heart rate sensor, Blood oxygen sensor");
		setSmartWatchNotifications("Call and message notifications, Calendar reminders");
		setSmartWatchFitnessTracking("Activity tracking, Heart rate monitoring, Sleep tracking");
		setSmartWatchOtherFeatures("Fitbit Pay, Timer");
		setSmartWatchDimensions("35mm or 40mm case size");
		setSmartWatchWeight("21g to 27g");
		setSmartWatchWarranty("1 year");
	}

	public void FitbitSmartWatch3() {
		setProductBrand("Fitbit");
		setProductPrice(299);
		setSmartWatchModel("Sense");
		setSmartWatchDisplay("AMOLED display");
		setSmartWatchCompatibility("Android and iOS devices");
		setSmartWatchConnectivity("Wi-Fi, Bluetooth, and NFC");
		setSmartWatchBatteryLife("Up to 6 days");
		setSmartWatchWaterResistance("Water resistant up to 50 meters");
		setSmartWatchSensors(
				"Accelerometer, Gyroscope, Heart rate sensor, Blood oxygen sensor, EDA sensor, Skin temperature sensor");
		setSmartWatchNotifications("Call and message notifications, Social media notifications, Email notifications");
		setSmartWatchFitnessTracking(
				"Activity tracking, Built-in GPS, Elevation, Heart rate monitoring, Running coach, Sleep tracking");
		setSmartWatchOtherFeatures("Fitbit Pay, Alexa, Music control, Stopwatch, Timer, Voice assistant");
		setSmartWatchDimensions("40mm or 44mm case size");
		setSmartWatchWeight("28g to 35g");
		setSmartWatchWarranty("1 year");
	}

}

// fossil Smart Watch
class FossilSmartWatch extends SmartWatch {
	public void FossilSmartWatch1() {
		setProductBrand("Fossil");
		setProductPrice(199);
		setSmartWatchModel("Gen 5 Carlyle HR");
		setSmartWatchDisplay("1.28 inch AMOLED display");
		setSmartWatchCompatibility("Android and iOS devices");
		setSmartWatchConnectivity("Wi-Fi, Bluetooth, and NFC");
		setSmartWatchBatteryLife("Up to 24 hours");
		setSmartWatchWaterResistance("Water resistant up to 30 meters");
		setSmartWatchSensors("Accelerometer, Gyroscope, Heart rate sensor, Barometer, Ambient light sensor, GPS");
		setSmartWatchNotifications("Call and message notifications, Social media notifications, Email notifications");
		setSmartWatchFitnessTracking("Activity tracking, Built-in GPS, Heart rate monitoring, Sleep tracking");
		setSmartWatchOtherFeatures("Google Pay, Google Assistant, Voice commands, Music player, Stopwatch, Timer");
		setSmartWatchDimensions("44mm case size, 12mm thickness");
		setSmartWatchWeight("98g");
		setSmartWatchWarranty("2 years");
	}

	public void FossilSmartWatch2() {
		setProductBrand("Fossil");
		setProductPrice(279);
		setSmartWatchModel("Gen 6 Touchscreen");
		setSmartWatchDisplay("1.28 inch AMOLED display");
		setSmartWatchCompatibility("Android and iOS devices");
		setSmartWatchConnectivity("Wi-Fi, Bluetooth, and NFC");
		setSmartWatchBatteryLife("Up to 36 hours");
		setSmartWatchWaterResistance("Water resistant up to 50 meters");
		setSmartWatchSensors("Accelerometer, Gyroscope, Heart rate sensor, Barometer, Ambient light sensor, GPS");
		setSmartWatchNotifications("Call and message notifications, Social media notifications, Email notifications");
		setSmartWatchFitnessTracking("Activity tracking, Built-in GPS, Heart rate monitoring, Sleep tracking");
		setSmartWatchOtherFeatures("Google Pay, Google Assistant, Voice commands, Music player, Stopwatch, Timer");
		setSmartWatchDimensions("44mm case size, 12mm thickness");
		setSmartWatchWeight("91g");
		setSmartWatchWarranty("2 years");
	}

	public void FossilSmartWatch3() {
		setProductBrand("Fossil");
		setProductPrice(279);
		setSmartWatchModel("Gen 6 Touchscreen");
		setSmartWatchDisplay("1.28 inch AMOLED display");
		setSmartWatchCompatibility("Android and iOS devices");
		setSmartWatchConnectivity("Wi-Fi, Bluetooth, and NFC");
		setSmartWatchBatteryLife("Up to 36 hours");
		setSmartWatchWaterResistance("Water resistant up to 50 meters");
		setSmartWatchSensors("Accelerometer, Gyroscope, Heart rate sensor, Barometer, Ambient light sensor, GPS");
		setSmartWatchNotifications("Call and message notifications, Social media notifications, Email notifications");
		setSmartWatchFitnessTracking("Activity tracking, Built-in GPS, Heart rate monitoring, Sleep tracking");
		setSmartWatchOtherFeatures("Google Pay, Google Assistant, Voice commands, Music player, Stopwatch, Timer");
		setSmartWatchDimensions("44mm case size, 12mm thickness");
		setSmartWatchWeight("91g");
		setSmartWatchWarranty("2 years");
	}
}

class Users{
	static String UserName;
	static String PassWord;
	static String userAddress;
	static long userPhoneNumber;
	int n = 0;
	static ArrayList arr = new ArrayList();
	static ArrayList arrPsw = new ArrayList();
	static Scanner scanner = new Scanner(System.in);
//	Users(String UserName , String PassWord){
//		this.UserName = UserName;
//		this.PassWord = PassWord;
//		ArrayList arr = new ArrayList();
//		arr.add(UserName);
//	}
	public static boolean SetPassword(String password, String Confpassword){
		boolean campsw ; 
		if (password.equals(Confpassword))
		{
			campsw = true;
		}
		else {
			campsw = false;
		}
		return campsw;
	}
	public void SignIN() {
		
		boolean WrongInput = false;
		System.out.print("Enter Your Address :. ");
		userAddress = scanner.nextLine();
		do {
			WrongInput = false;
			System.out.print("Enter Your Phone Number :. ");
			try {
				userPhoneNumber = scanner.nextLong();
				if(userPhoneNumber>=1111111111 && userPhoneNumber<=9999999999l)
				{
					
				}
				else {
					System.out.println("Please enter a valid phone number! \n");
					WrongInput=true;
				}
			}
			catch(InputMismatchException mismatchError) {
				System.out.println("You have entered Wrong Input! \n");
				WrongInput = true;
				scanner.nextLine(); 
			}
			
		}while(WrongInput==true);
		this.userAddress = userAddress;
		this.userPhoneNumber = userPhoneNumber;
	}
	public void UserFound(String UserName , String PassWord){
		this.UserName = UserName;
		this.PassWord = PassWord;
		if(arr.contains(UserName))
		{	
			if(arrPsw.get((arr.indexOf(UserName)))==PassWord) {
			System.out.println("You have Login successfully ");
			}
			else {
				boolean WrongPWD;
				do {
					WrongPWD = false;
					System.out.println("invalid input");
					System.out.print("Please enter correct password :. ");
					String Pwd = scanner.next();
//					System.out.println(arrPsw.get((arr.indexOf(UserName))));
					if(arrPsw.get((arr.indexOf(UserName))).equals(Pwd))
					{
						System.out.println("You have Login successfully ");
					}
					else
					{
						WrongPWD = true;
					}
				}while(WrongPWD==true);
			}
		}
		else
		{
			System.out.println("Couldn't find your Account");
			arr.add(UserName);
			arrPsw.add(PassWord);
			SignIN();
		}
	}
	public void CreateAccount() {
		boolean checkPass ;
		String UserPass;
		String ConfUserPass;
		Scanner scanner = new Scanner(System.in);
		boolean UsernameLoop;
		do {
			UsernameLoop = false;
			System.out.print("Enter User Name :. ");
			String UserName = scanner.next();
			if(arr.contains(UserName)) {
				System.out.println("Sorry, that username is already taken. Please choose a different username. \n");
				UsernameLoop = true;
			}
		}while(UsernameLoop==true);
		do {
			System.out.print("Enter Password :. ");
			UserPass = scanner.next();
			System.out.print("Confirmed Password :. ");
			ConfUserPass = scanner.next();
			checkPass = SetPassword(UserPass,ConfUserPass);
			if(checkPass==false)
			{
				System.out.println("Those passwords didn't match. Try again \n");
			}
		}while(checkPass==false);
		this.UserName = UserName;
		this.PassWord = UserPass;
		SignIN();
	}
	public void UserFound(String UserName , String PassWord,String userAddress, long userPhoneNumber) {
		this.UserName = UserName;
		this.PassWord = PassWord;
		this.userAddress = userAddress;
		this.userPhoneNumber = userPhoneNumber;
		arr.add(UserName);
		arrPsw.add(PassWord);
	}
}
class Login extends Users{
	static Users userRef = new Users();
//	Login(String UserName, String PassWord) {
//		super(UserName, PassWord);
//	}
	public void accountsE() {
		this.UserFound("sheela","123456789","Xyz colony near xyz market city stat 0000000",1234567890);
		this.UserFound("leela","987654321","Xyz colony near xyz market city stat 0000000",1234567890);
	}
	
	public void LoginFuc() {
		accountsE();
		boolean checkPass ;
		String UserPass;
		String ConfUserPass;
		Scanner scanner = new Scanner(System.in);
		boolean UsernameLoop;
		System.out.print("Enter User Name :. ");
		String UserName = scanner.next();
		do {
			System.out.print("Enter Password :. ");
			UserPass = scanner.next();
			System.out.print("Confirmed Password :. ");
			ConfUserPass = scanner.next();
			checkPass = SetPassword(UserPass,ConfUserPass);
			if(checkPass==false)
			{
				System.out.println("Those passwords didn't match. Try again\n");
			}
		}while(checkPass==false);
		this.UserFound(UserName,UserPass);
	}
		
}

// Driver class
class OnlineStore {
	static Login LoginRef = new Login();
	static Users UsersRef = new Users();
	boolean WrongInput;
	static ArrayList bucketListRef = new ArrayList(); 
	static ArrayList bucketListPriceRef = new ArrayList();
	static boolean ReturnMainMenu;
	
	public void PrintBill(String ProductName) {
		System.out.println("====================================================");
		System.out.println("Please proceed with the login process first");
		System.out.println("Press 1 for Existing user");
		System.out.println("Press 2 for Sign up");
		do {
			System.out.print("Please enter your selection: ");
			Scanner scanner = new Scanner(System.in);
			String LogRef = scanner.next();
			WrongInput = false;
			System.out.println("====================================================");
			switch(LogRef) {
				case "1" :
					LoginRef.LoginFuc();	
					break ;
				case "2" :
					LoginRef.CreateAccount();
					break ;
				default :
					System.out.println("Sorry, incorrect input. Please try again.");
					WrongInput = true;
			}
		}while(WrongInput);
		
//		System.out.println(LoginRef.UserName);
//		System.out.println(LoginRef.userAddress);
//		System.out.println(LoginRef.userPhoneNumber);
		
//		System.out.println(bucketListRef);
//		System.out.println(bucketListPriceRef);
		
//		String message = "--------------------------------------------------------------------------------\n"
//				+ " Dear Mr. and Mrs. " + userName + "                                             \n"
//				+ " We are pleased to inform you that your order for " + ProductCount + "\n " + ProductName
//				+ "\n has been successfully placed. Your order will be shipped                     \n"
//				+ " to your apartment located at the following address:                            \n " + userAddress
//				+ "                                                                \n"
//				+ "                                                                                \n"
//				+ " We will send you an email with further details regarding your                  \n"
//				+ " order and shipping information to your email ID " + userEmailID + "            \n"
//				+ " Please keep an eye on your inbox for this information.        				 \n"
//				+ "                                                            					 \n"
//				+ " Thank you for choosing our company for your needs. We  					     \n"
//				+ " appreciate your business and look forward to serving you    					 \n"
//				+ " again in the future.                                        					 \n"
//				+ "                                                             					 \n"
//				+ " Best regards,                                               					 \n"
//				+ " Online Shopping Store                                       					 \n"
//				+ "--------------------------------------------------------------------------------\n";
//		
		String bill1 =
					  "=============================================================================\n"
					+ "                                ONLINE STORE                                 \n"
					+ "=============================================================================\n"
					+ "Username: " + LoginRef.UserName + "\n"
					+ "Address: " + LoginRef.userAddress + "\n"
					+ "Phone Number: " + LoginRef.userPhoneNumber + "\n"
					+ "Date: March 24, 2023 /n"
					+ "\n"
					+ "=============================================================================\n"
					+ "                               ORDER DETAILS                                 \n"
					+ "=============================================================================\n"
					+ "| Product Name" + "\n\t\t\t|Price      |"
					+ "\n-----------------------------------------------------------------------------\n";
		System.out.println(bill1);
		double Total = 0 ;
					for(int i=0;i<(bucketListRef.size());i++) {
						System.out.println("| " + bucketListRef.get(i) + "\\n\\t\\t\\t|" + bucketListPriceRef.get(i) + "  |");
						double t = (double) bucketListPriceRef.get(i);
						Total = t + Total ;
					}
		String bill3 =
					 "-----------------------------------------------------------------------------\n"
				   + "| Total" + "\\n\\t\\t\\t|"+ Total +"  |"
				   + "\n=============================================================================\n"
				   + "\n\nThank you for your purchase!";
		System.out.println(bill3);
		System.out.println("\n\n\n\n\n");
					
	}

	public static void Menu() {
		
		boolean WrongInput;
		boolean WrongInput1;
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("Please select the desired category of products by using the following prompts:");
		System.out.println("Press 1 for Headphons");
		System.out.println("Press 2 for Smart Phone");
		System.out.println("Press 3 for Laptop");
		System.out.println("Press 4 for Smart Watch");
		System.out.println("Press 5 for Cart");
		System.out.print("Please enter your selection: ");
		String UserMenuInput = scanner.next();
		System.out.println();

		// all product menu
		switch (UserMenuInput) {
		case "1":
			do {
			System.out.println(
					"=========================================================================================");
			System.out.println("We offer a variety of headphone products to suit your needs. Please find below a list of our available options:");
			System.out.println("Here are some Product related to Headphons");
			System.out.println("Press  1 for Fillter Headphone Brands");

			// show all the Sony Product Name
			Sony SonyBrandRef = new Sony();
			System.out.print("Press  2 for ");
			SonyBrandRef.Sony1();
			SonyBrandRef.DisplayHeadPhoneNames();
			System.out.print("Press  3 for ");
			SonyBrandRef.Sony2();
			SonyBrandRef.DisplayHeadPhoneNames();
			System.out.print("Press  4 for ");
			SonyBrandRef.Sony3();
			SonyBrandRef.DisplayHeadPhoneNames();

			// show all the Bose Product Name
			Bose boseBrandRef = new Bose();
			System.out.print("Press  5 for ");
			boseBrandRef.Bose1();
			boseBrandRef.DisplayHeadPhoneNames();
			System.out.print("Press  6 for ");
			boseBrandRef.Bose2();
			boseBrandRef.DisplayHeadPhoneNames();
			System.out.print("Press  7 for ");
			boseBrandRef.Bose3();
			boseBrandRef.DisplayHeadPhoneNames();

			// show all the JBL Product Name
			JBL JBLBrandRef = new JBL();
			System.out.print("Press  8 for ");
			JBLBrandRef.JBL1();
			JBLBrandRef.DisplayHeadPhoneNames();
			System.out.print("Press  9 for ");
			JBLBrandRef.JBL2();
			JBLBrandRef.DisplayHeadPhoneNames();
			System.out.print("Press 10 for ");
			JBLBrandRef.JBL3();
			JBLBrandRef.DisplayHeadPhoneNames();

			// show all the Boat Product Name
			Boat BoatBrandRef = new Boat();
			System.out.print("Press 11 for ");
			BoatBrandRef.Boat1();
			BoatBrandRef.DisplayHeadPhoneNames();
			System.out.print("Press 12 for ");
			BoatBrandRef.Boat2();
			BoatBrandRef.DisplayHeadPhoneNames();
			System.out.print("Press 13 for ");
			BoatBrandRef.Boat3();
			BoatBrandRef.DisplayHeadPhoneNames();
			// fillter headphone brands
			
				System.out.print("Please enter your selection: ");
				String HeadphonsMenuOptions = scanner.next();
				 //scanner.next();
				
				System.out.println(
						"=========================================================================================");
				System.out.println();
				WrongInput = false;
				switch (HeadphonsMenuOptions) {
				case "1":
					do {
						System.out.println("We offer a range of headphone brands to choose from. Please use the following prompts to filter your selection:");
						System.out.println("Press 1 for Sony");
						System.out.println("Press 2 for Bose");
						System.out.println("Press 3 for JBL");
						System.out.println("Press 4 for Boat");

						// show fillted brand product

						System.out.print("Please enter your selection: ");
						String brandfillterHeadphoneInput = scanner.next();
						System.out.println();
						WrongInput = false;

						switch (brandfillterHeadphoneInput) {
						case "1":

							do {
								//
								System.out.print("Press 1 for ");
								SonyBrandRef.Sony1();
								SonyBrandRef.DisplayHeadPhoneNames();
								System.out.print("Press 2 for ");
								SonyBrandRef.Sony2();
								SonyBrandRef.DisplayHeadPhoneNames();
								System.out.print("Press 3 for ");
								SonyBrandRef.Sony3();
								SonyBrandRef.DisplayHeadPhoneNames();
								//
								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String SonyProductDetailInput = scanner.next();
								System.out.println();

								switch (SonyProductDetailInput) {	
								case "1":
									do {
										SonyBrandRef.Sony1();
										SonyBrandRef.DisplayHeadPhoneDetails();
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											System.out.println();
											SonyBrandRef.Sony1();
											bucketListRef.add(SonyBrandRef.productName);
											bucketListPriceRef.add(SonyBrandRef.getProductPrice());
											OnlineStore OnlineStoreRef = new OnlineStore();
											OnlineStoreRef.PrintBill((SonyBrandRef.productName));
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										} 
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(SonyBrandRef.productName);
											bucketListPriceRef.add(SonyBrandRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);

									break;
								case "2":

									do {// <
										SonyBrandRef.Sony2();
										SonyBrandRef.DisplayHeadPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											System.out.println();
											// <
											SonyBrandRef.Sony2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(SonyBrandRef.productName);
											bucketListPriceRef.add(SonyBrandRef.getProductPrice());
											OnlineStoreRef.PrintBill((SonyBrandRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										} 
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(SonyBrandRef.productName);
											bucketListPriceRef.add(SonyBrandRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":

									do {// <
										SonyBrandRef.Sony3();
										SonyBrandRef.DisplayHeadPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											SonyBrandRef.Sony3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(SonyBrandRef.productName);
											bucketListPriceRef.add(SonyBrandRef.getProductPrice());
											OnlineStoreRef.PrintBill((SonyBrandRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										} 
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(SonyBrandRef.productName);
											bucketListPriceRef.add(SonyBrandRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						case "2":
							do {
								System.out.print("Press 1 for ");
								boseBrandRef.Bose1();
								boseBrandRef.DisplayHeadPhoneNames();
								System.out.print("Press 2 for ");
								boseBrandRef.Bose2();
								boseBrandRef.DisplayHeadPhoneNames();
								System.out.print("Press 3 for ");
								boseBrandRef.Bose3();
								boseBrandRef.DisplayHeadPhoneNames();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String BoseProductDetailInput = scanner.next();
								System.out.println();

								switch (BoseProductDetailInput) {
								case "1":

									do {// <
										boseBrandRef.Bose1();
										boseBrandRef.DisplayHeadPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											boseBrandRef.Bose1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(boseBrandRef.productName);
											bucketListPriceRef.add(boseBrandRef.getProductPrice());
											OnlineStoreRef.PrintBill((boseBrandRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(boseBrandRef.productName);
											bucketListPriceRef.add(boseBrandRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":

									do {// <
										boseBrandRef.Bose2();
										boseBrandRef.DisplayHeadPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											boseBrandRef.Bose2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(boseBrandRef.productName);
											bucketListPriceRef.add(boseBrandRef.getProductPrice());
											OnlineStoreRef.PrintBill((boseBrandRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										} 
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(boseBrandRef.productName);
											bucketListPriceRef.add(boseBrandRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":

									do {// <
										boseBrandRef.Bose3();
										boseBrandRef.DisplayHeadPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											boseBrandRef.Bose3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(boseBrandRef.productName);
											bucketListPriceRef.add(boseBrandRef.getProductPrice());
											OnlineStoreRef.PrintBill((boseBrandRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										} 
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(boseBrandRef.productName);
											bucketListPriceRef.add(boseBrandRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						case "3":
							do {
								System.out.print("Press 1 for ");
								JBLBrandRef.JBL1();
								JBLBrandRef.DisplayHeadPhoneNames();
								System.out.print("Press 2 for ");
								JBLBrandRef.JBL2();
								JBLBrandRef.DisplayHeadPhoneNames();
								System.out.print("Press 3 for ");
								JBLBrandRef.JBL3();
								JBLBrandRef.DisplayHeadPhoneNames();
 
								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String JBLProductDetailInput = scanner.next();
								System.out.println();

								switch (JBLProductDetailInput) {
								case "1":

									do {// <
										JBLBrandRef.JBL1();
										JBLBrandRef.DisplayHeadPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											JBLBrandRef.JBL1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(JBLBrandRef.productName);
											bucketListPriceRef.add(JBLBrandRef.getProductPrice());
											OnlineStoreRef.PrintBill((JBLBrandRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										} 
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(JBLBrandRef.productName);
											bucketListPriceRef.add(JBLBrandRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":

									do {// <
										JBLBrandRef.JBL2();
										JBLBrandRef.DisplayHeadPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											JBLBrandRef.JBL2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(JBLBrandRef.productName);
											bucketListPriceRef.add(JBLBrandRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((JBLBrandRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}else if(LastInputMenu.equals("3")) {
											bucketListRef.add(JBLBrandRef.productName);
											bucketListPriceRef.add(JBLBrandRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":

									do {// <
										JBLBrandRef.JBL3();
										JBLBrandRef.DisplayHeadPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											JBLBrandRef.JBL3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(JBLBrandRef.productName);
											bucketListPriceRef.add(JBLBrandRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((JBLBrandRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}else if(LastInputMenu.equals("3")) {
											bucketListRef.add(JBLBrandRef.productName);
											bucketListPriceRef.add(JBLBrandRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						case "4":
							do {
								System.out.print("Press 1 for ");
								BoatBrandRef.Boat1();
								BoatBrandRef.DisplayHeadPhoneNames();
								System.out.print("Press 2 for ");
								BoatBrandRef.Boat2();
								BoatBrandRef.DisplayHeadPhoneNames();
								System.out.print("Press 3 for ");
								BoatBrandRef.Boat3();
								BoatBrandRef.DisplayHeadPhoneNames();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String BoatProductDetailInput = scanner.next();
								System.out.println();

								switch (BoatProductDetailInput) {
								case "1":

									do {// <
										BoatBrandRef.Boat1();
										BoatBrandRef.DisplayHeadPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											BoatBrandRef.Boat1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(BoatBrandRef.productName);
											bucketListPriceRef.add(BoatBrandRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((BoatBrandRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}else if(LastInputMenu.equals("3")) {
											bucketListRef.add(BoatBrandRef.productName);
											bucketListPriceRef.add(BoatBrandRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":

									do {// <
										BoatBrandRef.Boat2();
										BoatBrandRef.DisplayHeadPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											BoatBrandRef.Boat2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(BoatBrandRef.productName);
											bucketListPriceRef.add(BoatBrandRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((BoatBrandRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}else if(LastInputMenu.equals("3")) {
											bucketListRef.add(BoatBrandRef.productName);
											bucketListPriceRef.add(BoatBrandRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":

									do {// <
										BoatBrandRef.Boat3();
										BoatBrandRef.DisplayHeadPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											BoatBrandRef.Boat3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(BoatBrandRef.productName);
											bucketListPriceRef.add(BoatBrandRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((BoatBrandRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}else if(LastInputMenu.equals("3")) {
											bucketListRef.add(BoatBrandRef.productName);
											bucketListPriceRef.add(BoatBrandRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						default:
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput = true;
							// Menu();
						}
					} while (WrongInput == true);
					break;
				// show all the Sony Product Name
				case "2":
					do {//
						SonyBrandRef.Sony1();
						SonyBrandRef.DisplayHeadPhoneDetails();
						//
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							//
							SonyBrandRef.Sony1();
							bucketListRef.add(SonyBrandRef.productName);
							bucketListPriceRef.add(SonyBrandRef.getProductPrice());
							//
							OnlineStore OnlineStoreRef = new OnlineStore();
							OnlineStoreRef.PrintBill((SonyBrandRef.productName));
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(SonyBrandRef.productName);
							bucketListPriceRef.add(SonyBrandRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "3":
					do {// <
						SonyBrandRef.Sony2();
						SonyBrandRef.DisplayHeadPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							SonyBrandRef.Sony2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(SonyBrandRef.productName);
							bucketListPriceRef.add(SonyBrandRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((SonyBrandRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(SonyBrandRef.productName);
							bucketListPriceRef.add(SonyBrandRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput == true);
					break;
				case "4":
					do {// <
						SonyBrandRef.Sony3();
						SonyBrandRef.DisplayHeadPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							SonyBrandRef.Sony3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(SonyBrandRef.productName);
							bucketListPriceRef.add(SonyBrandRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((SonyBrandRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(SonyBrandRef.productName);
							bucketListPriceRef.add(SonyBrandRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				// show all the Bose Product Name
				case "5":
					do {// <
						boseBrandRef.Bose1();
						boseBrandRef.DisplayHeadPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							boseBrandRef.Bose1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(boseBrandRef.productName);
							bucketListPriceRef.add(boseBrandRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((boseBrandRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(boseBrandRef.productName);
							bucketListPriceRef.add(boseBrandRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "6":
					do {// <
						boseBrandRef.Bose2();
						boseBrandRef.DisplayHeadPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							boseBrandRef.Bose2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(boseBrandRef.productName);
							bucketListPriceRef.add(boseBrandRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((boseBrandRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}else if(LastInputMenu.equals("3")) {
							bucketListRef.add(boseBrandRef.productName);
							bucketListPriceRef.add(boseBrandRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "7":
					do {// <
						boseBrandRef.Bose3();
						boseBrandRef.DisplayHeadPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							boseBrandRef.Bose3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(boseBrandRef.productName);
							bucketListPriceRef.add(boseBrandRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((boseBrandRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}else if(LastInputMenu.equals("3")) {
							bucketListRef.add(boseBrandRef.productName);
							bucketListPriceRef.add(boseBrandRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				// show all the JBL Product Name
				case "8":
					do {// <
						JBLBrandRef.JBL1();
						JBLBrandRef.DisplayHeadPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							JBLBrandRef.JBL1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(JBLBrandRef.productName);
							bucketListPriceRef.add(JBLBrandRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((JBLBrandRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(JBLBrandRef.productName);
							bucketListPriceRef.add(JBLBrandRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "9":
					do {// <
						JBLBrandRef.JBL2();
						JBLBrandRef.DisplayHeadPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							JBLBrandRef.JBL2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(JBLBrandRef.productName);
							bucketListPriceRef.add(JBLBrandRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((JBLBrandRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(JBLBrandRef.productName);
							bucketListPriceRef.add(JBLBrandRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "10":
					do {// <
						JBLBrandRef.JBL3();
						JBLBrandRef.DisplayHeadPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							JBLBrandRef.JBL3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(JBLBrandRef.productName);
							bucketListPriceRef.add(JBLBrandRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((JBLBrandRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(JBLBrandRef.productName);
							bucketListPriceRef.add(JBLBrandRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				// show all the Boat Product Name
				case "11":
					do {// <						BoatBrandRef.Boat1();
						BoatBrandRef.DisplayHeadPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							BoatBrandRef.Boat1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(BoatBrandRef.productName);
							bucketListPriceRef.add(BoatBrandRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((BoatBrandRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(BoatBrandRef.productName);
							bucketListPriceRef.add(BoatBrandRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "12":
					do {// <
						BoatBrandRef.Boat2();
						BoatBrandRef.DisplayHeadPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							BoatBrandRef.Boat2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(BoatBrandRef.productName);
							bucketListPriceRef.add(BoatBrandRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((BoatBrandRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(BoatBrandRef.productName);
							bucketListPriceRef.add(BoatBrandRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "13":
					do {// <
						BoatBrandRef.Boat3();
						BoatBrandRef.DisplayHeadPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							BoatBrandRef.Boat3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(BoatBrandRef.productName);
							bucketListPriceRef.add(BoatBrandRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((BoatBrandRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(BoatBrandRef.productName);
							bucketListPriceRef.add(BoatBrandRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;

				default:
					System.out.println();
					System.out.println("Sorry, incorrect input.");
					System.out.println("Please Try agin ");
					WrongInput = true;
				}
			} while (WrongInput == true);
			break;
		case "2":
			do {
				// case 2 start
				System.out.println(
						"=========================================================================================");
				System.out.println("Here are some Product related to Smart Phone");
				System.out.println("Press  1 for Fillter Smart Phone Brands");
				// Apple Smart Phones
				ApplePhones ApplePhonesRef = new ApplePhones();
				System.out.print("press  2 for ");
				ApplePhonesRef.ApplePhones1();
				ApplePhonesRef.DisplaySmartPhoneNames();
				System.out.print("press  3 for ");
				ApplePhonesRef.ApplePhones2();
				ApplePhonesRef.DisplaySmartPhoneNames();
				System.out.print("press  4 for ");
				ApplePhonesRef.ApplePhones3();
				ApplePhonesRef.DisplaySmartPhoneNames();

				// Samsung Smart Phones
				SamsungPhones SamsungPhonesRef = new SamsungPhones();
				System.out.print("press  5 for ");
				SamsungPhonesRef.SamsungPhones1();
				SamsungPhonesRef.DisplaySmartPhoneNames();
				System.out.print("press  6 for ");
				SamsungPhonesRef.SamsungPhones2();
				SamsungPhonesRef.DisplaySmartPhoneNames();
				System.out.print("press  7 for ");
				SamsungPhonesRef.SamsungPhones3();
				SamsungPhonesRef.DisplaySmartPhoneNames();
				// Google Smart Phones
				GooglePhones GooglePhonesRef = new GooglePhones();
				System.out.print("press  8 for ");
				GooglePhonesRef.GooglePhones1();
				GooglePhonesRef.DisplaySmartPhoneNames();
				System.out.print("press  9 for ");
				GooglePhonesRef.GooglePhones2();
				GooglePhonesRef.DisplaySmartPhoneNames();
				System.out.print("press 10 for ");
				GooglePhonesRef.GooglePhones3();
				GooglePhonesRef.DisplaySmartPhoneNames();
				// OnePlus Smart Phones
				OnePlusPhones OnePlusPhonesRef = new OnePlusPhones();
				System.out.print("press 11 for ");
				OnePlusPhonesRef.OneplusPhone1();
				OnePlusPhonesRef.DisplaySmartPhoneNames();
				System.out.print("press 12 for ");
				OnePlusPhonesRef.OneplusPhone2();
				OnePlusPhonesRef.DisplaySmartPhoneNames();
				System.out.print("press 13 for ");
				OnePlusPhonesRef.OneplusPhone3();
				OnePlusPhonesRef.DisplaySmartPhoneNames();
				WrongInput = false;
				System.out.print("Please enter your selection: ");
				String MainPhoneInput = scanner.next();
				System.out.println(
						"=========================================================================================");
				System.out.println();
				switch (MainPhoneInput) {
				case "1":
					do {
						System.out.println("We offer a range of SmartPhone brands to choose from. Please use the following prompts to filter your selection:");
						System.out.println("Press 1 for Apple");
						System.out.println("Press 2 for Samsung");
						System.out.println("Press 3 for Google");
						System.out.println("Press 4 for OnePlus");

						WrongInput = false;
						System.out.print("Please enter your selection: ");
						String brandfillterSmartPhoneInput = scanner.next();
						System.out.println();
						switch (brandfillterSmartPhoneInput) {
						case "1":
							do {
								System.out.print("press 1 for ");
								ApplePhonesRef.ApplePhones1();
								ApplePhonesRef.DisplaySmartPhoneNames();
								System.out.print("press 2 for ");
								ApplePhonesRef.ApplePhones2();
								ApplePhonesRef.DisplaySmartPhoneNames();
								System.out.print("press 3 for ");
								ApplePhonesRef.ApplePhones3();
								ApplePhonesRef.DisplaySmartPhoneNames();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String AppleSmartPhoneInput = scanner.next();
								System.out.println();
								switch (AppleSmartPhoneInput) {
								case "1":

									do {// <
										ApplePhonesRef.ApplePhones1();
										ApplePhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											ApplePhonesRef.ApplePhones1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(ApplePhonesRef.productName);
											bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((ApplePhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(ApplePhonesRef.productName);
											bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":

									do {// <
										ApplePhonesRef.ApplePhones2();
										ApplePhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											ApplePhonesRef.ApplePhones2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(ApplePhonesRef.productName);
											bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((ApplePhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(ApplePhonesRef.productName);
											bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":

									do {// <
										ApplePhonesRef.ApplePhones3();
										ApplePhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											ApplePhonesRef.ApplePhones3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(ApplePhonesRef.productName);
											bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((ApplePhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(ApplePhonesRef.productName);
											bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);

							break;
						case "2":
							do {
								System.out.print("press 1 for ");
								SamsungPhonesRef.SamsungPhones1();
								SamsungPhonesRef.DisplaySmartPhoneNames();
								System.out.print("press 2 for ");
								SamsungPhonesRef.SamsungPhones2();
								SamsungPhonesRef.DisplaySmartPhoneNames();
								System.out.print("press 3 for ");
								SamsungPhonesRef.SamsungPhones3();
								SamsungPhonesRef.DisplaySmartPhoneNames();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String samsungSmartPhoneInput = scanner.next();
								System.out.println();
								switch (samsungSmartPhoneInput) {
								case "1":

									do {// <
										SamsungPhonesRef.SamsungPhones1();
										SamsungPhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											SamsungPhonesRef.SamsungPhones1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(SamsungPhonesRef.productName);
											bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((SamsungPhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(SamsungPhonesRef.productName);
											bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":

									do {// <
										SamsungPhonesRef.SamsungPhones2();
										SamsungPhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											SamsungPhonesRef.SamsungPhones2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(SamsungPhonesRef.productName);
											bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((SamsungPhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(SamsungPhonesRef.productName);
											bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":

									do {// <
										SamsungPhonesRef.SamsungPhones3();
										SamsungPhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											SamsungPhonesRef.SamsungPhones3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(SamsungPhonesRef.productName);
											bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((SamsungPhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(SamsungPhonesRef.productName);
											bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;

								}
							} while (WrongInput == true);
							break;
						case "3":
							do {
								System.out.print("press 1 for ");
								GooglePhonesRef.GooglePhones1();
								GooglePhonesRef.DisplaySmartPhoneNames();
								System.out.print("press 2 for ");
								GooglePhonesRef.GooglePhones2();
								GooglePhonesRef.DisplaySmartPhoneNames();
								System.out.print("press 3 for ");
								GooglePhonesRef.GooglePhones3();
								GooglePhonesRef.DisplaySmartPhoneNames();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String GoogleSmartPhoneInput = scanner.next();
								System.out.println();
								switch (GoogleSmartPhoneInput) {
								case "1":

									do {// <
										GooglePhonesRef.GooglePhones1();
										GooglePhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											GooglePhonesRef.GooglePhones1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(GooglePhonesRef.productName);
											bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((GooglePhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(GooglePhonesRef.productName);
											bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":

									do {// <
										GooglePhonesRef.GooglePhones2();
										GooglePhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											GooglePhonesRef.GooglePhones2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(GooglePhonesRef.productName);
											bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((GooglePhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(GooglePhonesRef.productName);
											bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":

									do {// <
										GooglePhonesRef.GooglePhones3();
										GooglePhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											GooglePhonesRef.GooglePhones3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(GooglePhonesRef.productName);
											bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((GooglePhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(GooglePhonesRef.productName);
											bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;

								}
							} while (WrongInput == true);
							break;
						case "4":
							do {
								System.out.print("press 1 for ");
								OnePlusPhonesRef.OneplusPhone1();
								OnePlusPhonesRef.DisplaySmartPhoneNames();
								System.out.print("press 2 for ");
								OnePlusPhonesRef.OneplusPhone2();
								OnePlusPhonesRef.DisplaySmartPhoneNames();
								System.out.print("press 3 for ");
								OnePlusPhonesRef.OneplusPhone3();
								OnePlusPhonesRef.DisplaySmartPhoneNames();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String OnePlusSmartPhoneInput = scanner.next();
								System.out.println();
								switch (OnePlusSmartPhoneInput) {
								case "1":

									do {// <
										OnePlusPhonesRef.OneplusPhone1();
										OnePlusPhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											OnePlusPhonesRef.OneplusPhone1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(OnePlusPhonesRef.productName);
											bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((OnePlusPhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(OnePlusPhonesRef.productName);
											bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":
									do {// <
										OnePlusPhonesRef.OneplusPhone2();
										OnePlusPhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											OnePlusPhonesRef.OneplusPhone2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(OnePlusPhonesRef.productName);
											bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((OnePlusPhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(OnePlusPhonesRef.productName);
											bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);

									break;
								case "3":

									do {// <
										OnePlusPhonesRef.OneplusPhone3();
										OnePlusPhonesRef.DisplaySmartPhoneDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											OnePlusPhonesRef.OneplusPhone3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(OnePlusPhonesRef.productName);
											bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((OnePlusPhonesRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(OnePlusPhonesRef.productName);
											bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						default:
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput = true;
						}
					} while (WrongInput == true);
					break;
				case "2":
					do {// <
						ApplePhonesRef.ApplePhones1();
						ApplePhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							ApplePhonesRef.ApplePhones1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(ApplePhonesRef.productName);
							bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((ApplePhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						} 
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(ApplePhonesRef.productName);
							bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "3":
					do {// <
						ApplePhonesRef.ApplePhones2();
						ApplePhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							ApplePhonesRef.ApplePhones2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(ApplePhonesRef.productName);
							bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((ApplePhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(ApplePhonesRef.productName);
							bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "4":
					do {// <
						ApplePhonesRef.ApplePhones3();
						ApplePhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							ApplePhonesRef.ApplePhones3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(ApplePhonesRef.productName);
							bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((ApplePhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(ApplePhonesRef.productName);
							bucketListPriceRef.add(ApplePhonesRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "5":
					do {// <
						SamsungPhonesRef.SamsungPhones1();
						SamsungPhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							SamsungPhonesRef.SamsungPhones1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(SamsungPhonesRef.productName);
							bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((SamsungPhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(SamsungPhonesRef.productName);
							bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "6":
					do {// <
						SamsungPhonesRef.SamsungPhones2();
						SamsungPhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							SamsungPhonesRef.SamsungPhones2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(SamsungPhonesRef.productName);
							bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((SamsungPhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(SamsungPhonesRef.productName);
							bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "7":
					do {// <
						SamsungPhonesRef.SamsungPhones3();
						SamsungPhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							SamsungPhonesRef.SamsungPhones3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(SamsungPhonesRef.productName);
							bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((SamsungPhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(SamsungPhonesRef.productName);
							bucketListPriceRef.add(SamsungPhonesRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "8":
					do {// <
						GooglePhonesRef.GooglePhones1();
						GooglePhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							GooglePhonesRef.GooglePhones1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(GooglePhonesRef.productName);
							bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((GooglePhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(GooglePhonesRef.productName);
							bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "9":
					do {// <
						GooglePhonesRef.GooglePhones2();
						GooglePhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							GooglePhonesRef.GooglePhones2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(GooglePhonesRef.productName);
							bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((GooglePhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(GooglePhonesRef.productName);
							bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "10":
					do {// <
						GooglePhonesRef.GooglePhones3();
						GooglePhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							GooglePhonesRef.GooglePhones3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(GooglePhonesRef.productName);
							bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((GooglePhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(GooglePhonesRef.productName);
							bucketListPriceRef.add(GooglePhonesRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "11":
					do {// <
						OnePlusPhonesRef.OneplusPhone1();
						OnePlusPhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							OnePlusPhonesRef.OneplusPhone1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(OnePlusPhonesRef.productName);
							bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((OnePlusPhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(OnePlusPhonesRef.productName);
							bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "12":
					do {// <
						OnePlusPhonesRef.OneplusPhone2();
						OnePlusPhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							OnePlusPhonesRef.OneplusPhone2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(OnePlusPhonesRef.productName);
							bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((OnePlusPhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(OnePlusPhonesRef.productName);
							bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "13":
					do {// <
						OnePlusPhonesRef.OneplusPhone3();
						OnePlusPhonesRef.DisplaySmartPhoneDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							OnePlusPhonesRef.OneplusPhone3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(OnePlusPhonesRef.productName);
							bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((OnePlusPhonesRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(OnePlusPhonesRef.productName);
							bucketListPriceRef.add(OnePlusPhonesRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				default:
					System.out.println();
					System.out.println("Sorry, incorrect input.");
					System.out.println("Please Try agin ");
					WrongInput = true;
				}
			} while (WrongInput == true);
			// case 2 ends
			break;
		case "3":
			do {
				System.out.println(
						"=========================================================================================");
				System.out.println("Here are some Product related to Laptop");
				System.out.println("Press  1 for Fillter Laptop Brands");
				// Apple Laptop
				AppleLaptop AppleLaptopRef = new AppleLaptop();
				System.out.print("Press  2 for ");
				AppleLaptopRef.AppleLaptop1();
				AppleLaptopRef.DisplayLaptopName();
				System.out.print("Press  3 for ");
				AppleLaptopRef.AppleLaptop2();
				AppleLaptopRef.DisplayLaptopName();
				System.out.print("Press  4 for ");
				AppleLaptopRef.AppleLaptop3();
				AppleLaptopRef.DisplayLaptopName();
				// Asus Laptop
				AsusLaptop AsusLaptopRef = new AsusLaptop();
				System.out.print("Press  5 for ");
				AsusLaptopRef.AsusLaptop1();
				AsusLaptopRef.DisplayLaptopName();
				System.out.print("Press  6 for ");
				AsusLaptopRef.AsusLaptop2();
				AsusLaptopRef.DisplayLaptopName();
				System.out.print("Press  7 for ");
				AsusLaptopRef.AsusLaptop3();
				AsusLaptopRef.DisplayLaptopName();
				// Dell Laptop
				DellLaptop DellLaptopRef = new DellLaptop();
				System.out.print("Press  8 for ");
				DellLaptopRef.DellLaptop1();
				DellLaptopRef.DisplayLaptopName();
				System.out.print("Press  9 for ");
				DellLaptopRef.DellLaptop2();
				DellLaptopRef.DisplayLaptopName();
				System.out.print("Press 10 for ");
				DellLaptopRef.DellLaptop3();
				DellLaptopRef.DisplayLaptopName();
				// Hp Laptop
				HpLaptop HpLaptopRef = new HpLaptop();
				System.out.print("Press 11 for ");
				HpLaptopRef.HpLaptop1();
				HpLaptopRef.DisplayLaptopName();
				System.out.print("Press 12 for ");
				HpLaptopRef.HpLaptop2();
				HpLaptopRef.DisplayLaptopName();
				System.out.print("Press 13 for ");
				HpLaptopRef.HpLaptop3();
				HpLaptopRef.DisplayLaptopName();
				WrongInput = false;
				System.out.print("Please enter your selection: ");
				String LaptopMenuOptions = scanner.next();
				System.out.println(
						"=========================================================================================");
				System.out.println();
				switch (LaptopMenuOptions) {
				case "1":
					do {
						System.out.println("We offer a range of Laptop brands to choose from. Please use the following prompts to filter your selection:");
						System.out.println("Press 1 for Apple");
						System.out.println("Press 2 for Asus");
						System.out.println("Press 3 for Dell");
						System.out.println("Press 4 for HP");

						WrongInput = false;
						System.out.print("Please enter your selection: ");
						String brandfillterLaptopInput = scanner.next();
						System.out.println();
						switch (brandfillterLaptopInput) {
						case "1":
							do {
								System.out.print("Press 1 for ");
								AppleLaptopRef.AppleLaptop1();
								AppleLaptopRef.DisplayLaptopName();
								System.out.print("Press 2 for ");
								AppleLaptopRef.AppleLaptop2();
								AppleLaptopRef.DisplayLaptopName();
								System.out.print("Press 3 for ");
								AppleLaptopRef.AppleLaptop3();
								AppleLaptopRef.DisplayLaptopName();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String ApplefillterLaptopInput = scanner.next();
								System.out.println();
								switch (ApplefillterLaptopInput) {
								case "1":

									do {// <
										AppleLaptopRef.AppleLaptop1();
										AppleLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											AppleLaptopRef.AppleLaptop1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(AppleLaptopRef.productName);
											bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((AppleLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										} 
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(AppleLaptopRef.productName);
											bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":

									do {// <
										AppleLaptopRef.AppleLaptop2();
										AppleLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											AppleLaptopRef.AppleLaptop2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(AppleLaptopRef.productName);
											bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
											// <
												OnlineStoreRef.PrintBill((AppleLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										} 
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(AppleLaptopRef.productName);
											bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":
									do {// <
										AppleLaptopRef.AppleLaptop3();
										AppleLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											AppleLaptopRef.AppleLaptop3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(AppleLaptopRef.productName);
											bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((AppleLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										} 
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(AppleLaptopRef.productName);
											bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						case "2":
							do {
								System.out.print("Press 1 for ");
								AsusLaptopRef.AsusLaptop1();
								AsusLaptopRef.DisplayLaptopName();
								System.out.print("Press 2 for ");
								AsusLaptopRef.AsusLaptop2();
								AsusLaptopRef.DisplayLaptopName();
								System.out.print("Press 3 for ");
								AsusLaptopRef.AsusLaptop3();
								AsusLaptopRef.DisplayLaptopName();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String AsusfillterLaptopInput = scanner.next();
								System.out.println();
								switch (AsusfillterLaptopInput) {
								case "1":

									do {// <
										AsusLaptopRef.AsusLaptop1();
										AsusLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											AsusLaptopRef.AsusLaptop1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(AsusLaptopRef.productName);
											bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((AsusLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(AsusLaptopRef.productName);
											bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":
									do {// <
										AsusLaptopRef.AsusLaptop2();
										AsusLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											AsusLaptopRef.AsusLaptop2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(AsusLaptopRef.productName);
											bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((AsusLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(AsusLaptopRef.productName);
											bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":
									do {// <
										AsusLaptopRef.AsusLaptop3();
										AsusLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											AsusLaptopRef.AsusLaptop3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(AsusLaptopRef.productName);
											bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((AsusLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(AsusLaptopRef.productName);
											bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						case "3":
							do {
								System.out.print("Press 1 for ");
								DellLaptopRef.DellLaptop1();
								DellLaptopRef.DisplayLaptopName();
								System.out.print("Press 2 for ");
								DellLaptopRef.DellLaptop2();
								DellLaptopRef.DisplayLaptopName();
								System.out.print("Press 3 for ");
								DellLaptopRef.DellLaptop3();
								DellLaptopRef.DisplayLaptopName();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String DellfillterLaptopInput = scanner.next();
								System.out.println();
								switch (DellfillterLaptopInput) {
								case "1":

									do {// <
										DellLaptopRef.DellLaptop1();
										DellLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											DellLaptopRef.DellLaptop1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(DellLaptopRef.productName);
											bucketListPriceRef.add(DellLaptopRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((DellLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(DellLaptopRef.productName);
											bucketListPriceRef.add(DellLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":
									do {// <
										DellLaptopRef.DellLaptop2();
										DellLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											DellLaptopRef.DellLaptop2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(DellLaptopRef.productName);
											bucketListPriceRef.add(DellLaptopRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((DellLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(DellLaptopRef.productName);
											bucketListPriceRef.add(DellLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":
									do {// <
										DellLaptopRef.DellLaptop3();
										DellLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											DellLaptopRef.DellLaptop3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(DellLaptopRef.productName);
											bucketListPriceRef.add(DellLaptopRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((DellLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(DellLaptopRef.productName);
											bucketListPriceRef.add(DellLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						case "4":
							do {
								System.out.print("Press 1 for ");
								HpLaptopRef.HpLaptop1();
								HpLaptopRef.DisplayLaptopName();
								System.out.print("Press 2 for ");
								HpLaptopRef.HpLaptop2();
								HpLaptopRef.DisplayLaptopName();
								System.out.print("Press 3 for ");
								HpLaptopRef.HpLaptop3();
								HpLaptopRef.DisplayLaptopName();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String HpfillterLaptopInput = scanner.next();
								System.out.println();
								switch (HpfillterLaptopInput) {
								case "1":

									do {// <
										HpLaptopRef.HpLaptop1();
										HpLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											HpLaptopRef.HpLaptop1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(HpLaptopRef.productName);
											bucketListPriceRef.add(HpLaptopRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((HpLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(HpLaptopRef.productName);
											bucketListPriceRef.add(HpLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":
									do {// <
										HpLaptopRef.HpLaptop2();
										HpLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											HpLaptopRef.HpLaptop2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(HpLaptopRef.productName);
											bucketListPriceRef.add(HpLaptopRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((HpLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(HpLaptopRef.productName);
											bucketListPriceRef.add(HpLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":
									do {// <
										HpLaptopRef.HpLaptop3();
										HpLaptopRef.DisplayLaptopDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											HpLaptopRef.HpLaptop3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(HpLaptopRef.productName);
											bucketListPriceRef.add(HpLaptopRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((HpLaptopRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(HpLaptopRef.productName);
											bucketListPriceRef.add(HpLaptopRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						default:
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput = true;
						}
					} while (WrongInput == true);
					break;
				case "2":
					do {// <
						AppleLaptopRef.AppleLaptop1();
						AppleLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							AppleLaptopRef.AppleLaptop1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(AppleLaptopRef.productName);
							bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((AppleLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(AppleLaptopRef.productName);
							bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "3":
					do {// <
						AppleLaptopRef.AppleLaptop2();
						AppleLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							AppleLaptopRef.AppleLaptop2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(AppleLaptopRef.productName);
							bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((AppleLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(AppleLaptopRef.productName);
							bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "4":
					do {// <
						AppleLaptopRef.AppleLaptop3();
						AppleLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							AppleLaptopRef.AppleLaptop3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(AppleLaptopRef.productName);
							bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((AppleLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(AppleLaptopRef.productName);
							bucketListPriceRef.add(AppleLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "5":
					do {// <
						AsusLaptopRef.AsusLaptop1();
						AsusLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							AsusLaptopRef.AsusLaptop1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(AsusLaptopRef.productName);
							bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((AsusLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(AsusLaptopRef.productName);
							bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "6":
					do {// <
						AsusLaptopRef.AsusLaptop2();
						AsusLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							AsusLaptopRef.AsusLaptop2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(AsusLaptopRef.productName);
							bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((AsusLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(AsusLaptopRef.productName);
							bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "7":
					do {// <
						AsusLaptopRef.AsusLaptop3();
						AsusLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							AsusLaptopRef.AsusLaptop3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(AsusLaptopRef.productName);
							bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((AsusLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(AsusLaptopRef.productName);
							bucketListPriceRef.add(AsusLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "8":
					do {// <
						DellLaptopRef.DellLaptop1();
						DellLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							DellLaptopRef.DellLaptop1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(DellLaptopRef.productName);
							bucketListPriceRef.add(DellLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((DellLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(DellLaptopRef.productName);
							bucketListPriceRef.add(DellLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "9":
					do {// <
						DellLaptopRef.DellLaptop2();
						DellLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							DellLaptopRef.DellLaptop2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(DellLaptopRef.productName);
							bucketListPriceRef.add(DellLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((DellLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(DellLaptopRef.productName);
							bucketListPriceRef.add(DellLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "10":
					do {// <
						DellLaptopRef.DellLaptop3();
						DellLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							DellLaptopRef.DellLaptop3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(DellLaptopRef.productName);
							bucketListPriceRef.add(DellLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((DellLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(DellLaptopRef.productName);
							bucketListPriceRef.add(DellLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "11":
					do {// <
						HpLaptopRef.HpLaptop1();
						HpLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							HpLaptopRef.HpLaptop1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(HpLaptopRef.productName);
							bucketListPriceRef.add(HpLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((HpLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(HpLaptopRef.productName);
							bucketListPriceRef.add(HpLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "12":
					do {// <
						HpLaptopRef.HpLaptop2();
						HpLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							HpLaptopRef.HpLaptop2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(HpLaptopRef.productName);
							bucketListPriceRef.add(HpLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((HpLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(HpLaptopRef.productName);
							bucketListPriceRef.add(HpLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "13":
					do {// <
						HpLaptopRef.HpLaptop3();
						HpLaptopRef.DisplayLaptopDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							HpLaptopRef.HpLaptop3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(HpLaptopRef.productName);
							bucketListPriceRef.add(HpLaptopRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((HpLaptopRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(HpLaptopRef.productName);
							bucketListPriceRef.add(HpLaptopRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				default:
					System.out.println();
					System.out.println("Sorry, incorrect input.");
					System.out.println("Please Try agin ");
					WrongInput = true;
				}
			} while (WrongInput == true);

			break;
		case "4":
			do {
				System.out.println(
						"=========================================================================================");
				System.out.println("Here are some Product related to Samart Watch");
				System.out.println("Press  1 for Fillter Smart Watch Brands");
				// Apple Smart Watch
				System.out.print("Press  2 for ");
				AppleSmartWatch AppleSmartWatchRef = new AppleSmartWatch();
				AppleSmartWatchRef.AppleSmartWatch1();
				AppleSmartWatchRef.DisplaySmartWatchName();
				System.out.print("Press  3 for ");
				AppleSmartWatchRef.AppleSmartWatch2();
				AppleSmartWatchRef.DisplaySmartWatchName();
				System.out.print("Press  4 for ");
				AppleSmartWatchRef.AppleSmartWatch3();
				AppleSmartWatchRef.DisplaySmartWatchName();
				// Samsung Smart Watch
				SamsungSmartWatch SamsungSmartWatchRef = new SamsungSmartWatch();
				System.out.print("Press  5 for ");
				SamsungSmartWatchRef.SamsungSmartWatch1();
				SamsungSmartWatchRef.DisplaySmartWatchName();
				System.out.print("Press  6 for ");
				SamsungSmartWatchRef.SamsungSmartWatch2();
				SamsungSmartWatchRef.DisplaySmartWatchName();
				System.out.print("Press  7 for ");
				SamsungSmartWatchRef.SamsungSmartWatch3();
				SamsungSmartWatchRef.DisplaySmartWatchName();
				// fitbit Smart Watch
				FitbitSmartWatch FitbitSmartWatchRef = new FitbitSmartWatch();
				System.out.print("Press  8 for ");
				FitbitSmartWatchRef.FitbitSmartWatch1();
				FitbitSmartWatchRef.DisplaySmartWatchName();
				System.out.print("Press  9 for ");
				FitbitSmartWatchRef.FitbitSmartWatch2();
				FitbitSmartWatchRef.DisplaySmartWatchName();
				System.out.print("Press 10 for ");
				FitbitSmartWatchRef.FitbitSmartWatch3();
				FitbitSmartWatchRef.DisplaySmartWatchName();
				// fossil Smart Watch
				FossilSmartWatch FossilSmartWatchRef = new FossilSmartWatch();
				System.out.print("Press 11 for ");
				FossilSmartWatchRef.FossilSmartWatch1();
				FossilSmartWatchRef.DisplaySmartWatchName();
				System.out.print("Press 12 for ");
				FossilSmartWatchRef.FossilSmartWatch2();
				FossilSmartWatchRef.DisplaySmartWatchName();
				System.out.print("Press 13 for ");
				FossilSmartWatchRef.FossilSmartWatch3();
				FossilSmartWatchRef.DisplaySmartWatchName();

				// fillter Smart Watch brands

				System.out.print("Please enter your selection: ");
				String SmartWatchMenuOptions = scanner.next();
				System.out.println(
						"=========================================================================================");
				System.out.println();
				WrongInput = false;
				switch (SmartWatchMenuOptions) {
				case "1":
					do {
						System.out.println("We offer a range of Smart Watch brands to choose from. Please use the following prompts to filter your selection:");
						System.out.println("Press 1 for Apple");
						System.out.println("Press 2 for Samsung");
						System.out.println("Press 3 for Fitbit");
						System.out.println("Press 4 for Fossil");

						// show fillted brand product

						System.out.print("Please enter your selection: ");
						String brandfillterSmartWatchInput = scanner.next();
						System.out.println();
						WrongInput = false;

						switch (brandfillterSmartWatchInput) {
						case "1":
							do {
								System.out.print("Press 1 for ");
								AppleSmartWatchRef.AppleSmartWatch1();
								AppleSmartWatchRef.DisplaySmartWatchName();
								System.out.print("Press 2 for ");
								AppleSmartWatchRef.AppleSmartWatch2();
								AppleSmartWatchRef.DisplaySmartWatchName();
								System.out.print("Press 3 for ");
								AppleSmartWatchRef.AppleSmartWatch3();
								AppleSmartWatchRef.DisplaySmartWatchName();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String FillterdAppleSmartWatchDetailInput = scanner.next();
								System.out.println();

								switch (FillterdAppleSmartWatchDetailInput) {
								case "1":
									do {//
										AppleSmartWatchRef.AppleSmartWatch1();
										AppleSmartWatchRef.DisplaySmartWatchDetails();
										//
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											//
											AppleSmartWatchRef.AppleSmartWatch1();
											bucketListRef.add(AppleSmartWatchRef.productName);
											bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
											//
											OnlineStore OnlineStoreRef = new OnlineStore();
											OnlineStoreRef.PrintBill((AppleSmartWatchRef.productName));
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(AppleSmartWatchRef.productName);
											bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);

									break;
								case "2":

									do {//
										AppleSmartWatchRef.AppleSmartWatch2();
										AppleSmartWatchRef.DisplaySmartWatchDetails();
										//
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											//
											AppleSmartWatchRef.AppleSmartWatch2();
											bucketListRef.add(AppleSmartWatchRef.productName);
											bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
											//
											OnlineStore OnlineStoreRef = new OnlineStore();
											OnlineStoreRef.PrintBill((AppleSmartWatchRef.productName));
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(AppleSmartWatchRef.productName);
											bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":

									do {//
										AppleSmartWatchRef.AppleSmartWatch3();
										AppleSmartWatchRef.DisplaySmartWatchDetails();
										//
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											//
											AppleSmartWatchRef.AppleSmartWatch3();
											bucketListRef.add(AppleSmartWatchRef.productName);
											bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
											//
											OnlineStore OnlineStoreRef = new OnlineStore();
											OnlineStoreRef.PrintBill((AppleSmartWatchRef.productName));
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(AppleSmartWatchRef.productName);
											bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						case "2":
							do {
								System.out.print("Press 1 for ");
								SamsungSmartWatchRef.SamsungSmartWatch1();
								SamsungSmartWatchRef.DisplaySmartWatchName();
								System.out.print("Press 2 for ");
								SamsungSmartWatchRef.SamsungSmartWatch2();
								SamsungSmartWatchRef.DisplaySmartWatchName();
								System.out.print("Press 3 for ");
								SamsungSmartWatchRef.SamsungSmartWatch3();
								SamsungSmartWatchRef.DisplaySmartWatchName();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String FillterdSamsungSmartWatchDetailInput = scanner.next();
								System.out.println();

								switch (FillterdSamsungSmartWatchDetailInput) {
								case "1":

									do {// <
										SamsungSmartWatchRef.SamsungSmartWatch1();
										SamsungSmartWatchRef.DisplaySmartWatchDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											SamsungSmartWatchRef.SamsungSmartWatch1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(SamsungSmartWatchRef.productName);
											bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((SamsungSmartWatchRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(SamsungSmartWatchRef.productName);
											bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":

									do {// <
										SamsungSmartWatchRef.SamsungSmartWatch2();
										SamsungSmartWatchRef.DisplaySmartWatchDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											SamsungSmartWatchRef.SamsungSmartWatch2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(SamsungSmartWatchRef.productName);
											bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((SamsungSmartWatchRef.productName));
											// >
										} else if(LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(SamsungSmartWatchRef.productName);
											bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":

									do {// <
										SamsungSmartWatchRef.SamsungSmartWatch3();
										SamsungSmartWatchRef.DisplaySmartWatchDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											SamsungSmartWatchRef.SamsungSmartWatch3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(SamsungSmartWatchRef.productName);
											bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((SamsungSmartWatchRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(SamsungSmartWatchRef.productName);
											bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										} else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						case "3":
							do {
								System.out.print("Press 1 for ");
								FitbitSmartWatchRef.FitbitSmartWatch1();
								FitbitSmartWatchRef.DisplaySmartWatchName();
								System.out.print("Press 2 for ");
								FitbitSmartWatchRef.FitbitSmartWatch2();
								FitbitSmartWatchRef.DisplaySmartWatchName();
								System.out.print("Press 3 for ");
								FitbitSmartWatchRef.FitbitSmartWatch3();
								FitbitSmartWatchRef.DisplaySmartWatchName();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String filltedFitbitSmartWatchDetailInput = scanner.next();
								System.out.println();

								switch (filltedFitbitSmartWatchDetailInput) {
								case "1":
									do {// <
										FitbitSmartWatchRef.FitbitSmartWatch1();
										FitbitSmartWatchRef.DisplaySmartWatchDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											FitbitSmartWatchRef.FitbitSmartWatch1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(FitbitSmartWatchRef.productName);
											bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((FitbitSmartWatchRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(FitbitSmartWatchRef.productName);
											bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":

									do {// <
										FitbitSmartWatchRef.FitbitSmartWatch2();
										FitbitSmartWatchRef.DisplaySmartWatchDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											FitbitSmartWatchRef.FitbitSmartWatch2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(FitbitSmartWatchRef.productName);
											bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((FitbitSmartWatchRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(FitbitSmartWatchRef.productName);
											bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":

									do {// <
										FitbitSmartWatchRef.FitbitSmartWatch3();
										FitbitSmartWatchRef.DisplaySmartWatchDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											FitbitSmartWatchRef.FitbitSmartWatch3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(FitbitSmartWatchRef.productName);
											bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((FitbitSmartWatchRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(FitbitSmartWatchRef.productName);
											bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						case "4":
							do {
								System.out.print("Press 1 for ");
								FossilSmartWatchRef.FossilSmartWatch1();
								FossilSmartWatchRef.DisplaySmartWatchName();
								System.out.print("Press 2 for ");
								FossilSmartWatchRef.FossilSmartWatch2();
								FossilSmartWatchRef.DisplaySmartWatchName();
								System.out.print("Press 3 for ");
								FossilSmartWatchRef.FossilSmartWatch3();
								FossilSmartWatchRef.DisplaySmartWatchName();

								WrongInput = false;
								System.out.print("Please enter your selection: ");
								String FillterFossilSmartWatchDetailInput = scanner.next();
								System.out.println();

								switch (FillterFossilSmartWatchDetailInput) {
								case "1":

									do {// <
										FossilSmartWatchRef.FossilSmartWatch1();
										FossilSmartWatchRef.DisplaySmartWatchDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											FossilSmartWatchRef.FossilSmartWatch1();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(FossilSmartWatchRef.productName);
											bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((FossilSmartWatchRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(FossilSmartWatchRef.productName);
											bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "2":

									do {// <
										FossilSmartWatchRef.FossilSmartWatch2();
										FossilSmartWatchRef.DisplaySmartWatchDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											FossilSmartWatchRef.FossilSmartWatch2();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(FossilSmartWatchRef.productName);
											bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((FossilSmartWatchRef.productName));
											// >
										} else if (LastInputMenu.equals("2")) {
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(FossilSmartWatchRef.productName);
											bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										}  else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								case "3":

									do {// <
										FossilSmartWatchRef.FossilSmartWatch3();
										FossilSmartWatchRef.DisplaySmartWatchDetails();
										// >
										WrongInput1 = false;
										System.out.println();
										System.out.println(
												"=========================================================================================");
										System.out.println("To proceed with purchasing this product, please press 1.");
										System.out.println("To return to the previous menu, please press 2.");
										System.out.println("To add the item to your cart and return to the main menu, please press 3.");
										System.out.print("Please enter your selection: ");
										String LastInputMenu = scanner.next();
										System.out.println();
										if (LastInputMenu.equals("1")) {
											 
											 
											System.out.println();
											// <
											FossilSmartWatchRef.FossilSmartWatch3();
											// >
											OnlineStore OnlineStoreRef = new OnlineStore();
											bucketListRef.add(FossilSmartWatchRef.productName);
											bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
											// <
											OnlineStoreRef.PrintBill((FossilSmartWatchRef.productName));
											// >
										} 
										else if (LastInputMenu.equals("2")) 
										{
											WrongInput = true;
										}  
										else if(LastInputMenu.equals("3")) {
											bucketListRef.add(FossilSmartWatchRef.productName);
											bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
											ReturnMainMenu = true;
										}  
										else {
											System.out.println();
											System.out.println("Sorry, incorrect input.");
											System.out.println("Please Try agin ");
											WrongInput1 = true;
											System.out.println();
										}
									} while (WrongInput1 == true);
									break;
								default:
									System.out.println();
									System.out.println("Sorry, incorrect input.");
									System.out.println("Please Try agin ");
									WrongInput = true;
								}
							} while (WrongInput == true);
							break;
						default:
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput = true;
							// Menu();
						}
					} while (WrongInput == true);
					break;
				case "2":
					do {//
						AppleSmartWatchRef.AppleSmartWatch1();
						AppleSmartWatchRef.DisplaySmartWatchDetails();
						//
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							//
							AppleSmartWatchRef.AppleSmartWatch1();
							//
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(AppleSmartWatchRef.productName);
							bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
							OnlineStoreRef.PrintBill((AppleSmartWatchRef.productName));
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(AppleSmartWatchRef.productName);
							bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "3":
					do {//
						AppleSmartWatchRef.AppleSmartWatch2();
						AppleSmartWatchRef.DisplaySmartWatchDetails();
						//
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							//
							AppleSmartWatchRef.AppleSmartWatch2();
							//
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(AppleSmartWatchRef.productName);
							bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
							OnlineStoreRef.PrintBill((AppleSmartWatchRef.productName));
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(AppleSmartWatchRef.productName);
							bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "4":
					do {//
						AppleSmartWatchRef.AppleSmartWatch3();
						AppleSmartWatchRef.DisplaySmartWatchDetails();
						//
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							//
							AppleSmartWatchRef.AppleSmartWatch3();
							//
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(AppleSmartWatchRef.productName);
							bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
							OnlineStoreRef.PrintBill((AppleSmartWatchRef.productName));
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(AppleSmartWatchRef.productName);
							bucketListPriceRef.add(AppleSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;

				case "5":
					do {// <
						SamsungSmartWatchRef.SamsungSmartWatch1();
						SamsungSmartWatchRef.DisplaySmartWatchDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							SamsungSmartWatchRef.SamsungSmartWatch1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(SamsungSmartWatchRef.productName);
							bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((SamsungSmartWatchRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(SamsungSmartWatchRef.productName);
							bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "6":
					do {// <
						SamsungSmartWatchRef.SamsungSmartWatch2();
						SamsungSmartWatchRef.DisplaySmartWatchDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							SamsungSmartWatchRef.SamsungSmartWatch2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(SamsungSmartWatchRef.productName);
							bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((SamsungSmartWatchRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(SamsungSmartWatchRef.productName);
							bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "7":
					do {// <
						SamsungSmartWatchRef.SamsungSmartWatch3();
						SamsungSmartWatchRef.DisplaySmartWatchDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							SamsungSmartWatchRef.SamsungSmartWatch3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(SamsungSmartWatchRef.productName);
							bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((SamsungSmartWatchRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(SamsungSmartWatchRef.productName);
							bucketListPriceRef.add(SamsungSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "8":
					do {// <
						FitbitSmartWatchRef.FitbitSmartWatch1();
						FitbitSmartWatchRef.DisplaySmartWatchDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							FitbitSmartWatchRef.FitbitSmartWatch1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(FitbitSmartWatchRef.productName);
							bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((FitbitSmartWatchRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(FitbitSmartWatchRef.productName);
							bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "9":
					do {// <
						FitbitSmartWatchRef.FitbitSmartWatch2();
						FitbitSmartWatchRef.DisplaySmartWatchDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							FitbitSmartWatchRef.FitbitSmartWatch2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(FitbitSmartWatchRef.productName);
							bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((FitbitSmartWatchRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(FitbitSmartWatchRef.productName);
							bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "10":
					do {// <
						FitbitSmartWatchRef.FitbitSmartWatch3();
						FitbitSmartWatchRef.DisplaySmartWatchDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							FitbitSmartWatchRef.FitbitSmartWatch3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(FitbitSmartWatchRef.productName);
							bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((FitbitSmartWatchRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(FitbitSmartWatchRef.productName);
							bucketListPriceRef.add(FitbitSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						} else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;

				case "11":
					do {// <
						FossilSmartWatchRef.FossilSmartWatch1();
						FossilSmartWatchRef.DisplaySmartWatchDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							FossilSmartWatchRef.FossilSmartWatch1();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(FossilSmartWatchRef.productName);
							bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((FossilSmartWatchRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(FossilSmartWatchRef.productName);
							bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "12":
					do {// <
						FossilSmartWatchRef.FossilSmartWatch2();
						FossilSmartWatchRef.DisplaySmartWatchDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							FossilSmartWatchRef.FossilSmartWatch2();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(FossilSmartWatchRef.productName);
							bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
							// <
							OnlineStoreRef.PrintBill((FossilSmartWatchRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(FossilSmartWatchRef.productName);
							bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				case "13":
					do {// <
						FossilSmartWatchRef.FossilSmartWatch3();
						FossilSmartWatchRef.DisplaySmartWatchDetails();
						// >
						WrongInput1 = false;
						System.out.println();
						System.out.println(
								"=========================================================================================");
						System.out.println("To proceed with purchasing this product, please press 1.");
						System.out.println("To return to the previous menu, please press 2.");
						System.out.println("To add the item to your cart and return to the main menu, please press 3.");
						System.out.print("Please enter your selection: ");
						String LastInputMenu = scanner.next();
						System.out.println();
						if (LastInputMenu.equals("1")) {
							 
							 
							System.out.println();
							// <
							FossilSmartWatchRef.FossilSmartWatch3();
							// >
							OnlineStore OnlineStoreRef = new OnlineStore();
							bucketListRef.add(FossilSmartWatchRef.productName);
							bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
							OnlineStoreRef.PrintBill((FossilSmartWatchRef.productName));
							// >
						} else if (LastInputMenu.equals("2")) {
							WrongInput = true;
						}  
						else if(LastInputMenu.equals("3")) {
							bucketListRef.add(FossilSmartWatchRef.productName);
							bucketListPriceRef.add(FossilSmartWatchRef.getProductPrice());
							ReturnMainMenu = true;
						}  else {
							System.out.println();
							System.out.println("Sorry, incorrect input.");
							System.out.println("Please Try agin ");
							WrongInput1 = true;
							System.out.println();
						}
					} while (WrongInput1 == true);
					break;
				default:
					System.out.println();
					System.out.println("Sorry, incorrect input.");
					System.out.println("Please Try agin ");
					WrongInput = true;
				}
			} while (WrongInput == true);
			break;
		case "5":
			
			if(bucketListRef.size()<=0) {
				WrongInput = false;
				do {
					System.out.println("Empty Bucket!");
					System.out.println("Press 1 to Return Back to Main Menu");
					String UserRetrunInput = scanner.next() ;
					if(UserRetrunInput.equals("1")) {
						ReturnMainMenu = true;
					}
					else
					{
						WrongInput = true;
					}
				}while(WrongInput);
			}else {
				System.out.println("Press 1 for View Item");
				System.out.println("Press 2 for Add Item");
				System.out.println("Press 3 for Remove Item");
				System.out.print("Please enter your selection: ");
				String CartInput = scanner.next();
				switch(CartInput){
				case "1" :
					System.out.println("View Item");
					for(Object obj : bucketListRef) {
						System.out.println(obj);
					}
					WrongInput = false;
					do {
						System.out.println("Press 1 to Return Back to Main Menu");
						String UserRetrunInput = scanner.next() ;
						if(UserRetrunInput.equals("1")) {
							ReturnMainMenu = true;
						}
						else
						{
							WrongInput = true;
						}
					}while(WrongInput);
					break;
				case "2" :
					System.out.println("Add Item");
					ReturnMainMenu = true;
					break;
				case "3" :	
					boolean returnRemoveBlock;
					do {
						returnRemoveBlock = false;
						System.out.println("Remove Item");
						int i = 1;
						for(Object obj : bucketListRef) {
							System.out.println("Press " + i + " to remove " + obj);
							i++;
						}
						try {
							int ItemRemoveInput = scanner.nextInt() ;
							//
							if(ItemRemoveInput <= (bucketListRef.size())){
								bucketListRef.remove((ItemRemoveInput-1));
								bucketListPriceRef.remove((ItemRemoveInput-1));
								System.out.println("Press 1 to Return Back to Main Menu");
								System.out.println("Press 2 to Remove More Item");
								System.out.println("Press 3 to Remove all Items and Go back to the Main Menu");
								String UserRetrunInput = scanner.next() ;
								switch(UserRetrunInput) {
								case "1":
									ReturnMainMenu = true;
									break;
								case "2":
									returnRemoveBlock = true;
									break;
								case "3":
									bucketListRef.clear();
									ReturnMainMenu = true;
									break;
								default:
									System.out.println("Invalid input Input!");
									returnRemoveBlock = true;
								}
							}
							else {
								System.out.println("Invalid input Input!");
								returnRemoveBlock = true;
							}
							
							//
						}catch(InputMismatchException error1) {
							System.out.println("Invalid input Input!");
							returnRemoveBlock = true;
						}
					}while(returnRemoveBlock==true);
					
					break;
				default:
					System.out.println("Wrong Input");
					returnRemoveBlock = true;
				}
			}
		
		
			break;
		default:
			System.out.println();
			System.out.println("Sorry, incorrect input.");
			System.out.println("Please Try agin ");
//			Menu();
			ReturnMainMenu = true;
		}
		}while(ReturnMainMenu);
	}

	public static void main(String[] args) {
		Menu();
	}

	static {
		System.out.println("------------------------------------------------------------------------------------------");
		for (int i = 1; i <= 20; i++) {
			if (i == 11) {
				System.out.println(
						"|                               Welcome to Our Online Store                              |");
			}

			System.out.println(
						"|                                                                                        |");

		}
//		System.out.println("|                                                          Developed by : Anas Shaikh    |");
		System.out
				.println("------------------------------------------------------------------------------------------");
	}
}