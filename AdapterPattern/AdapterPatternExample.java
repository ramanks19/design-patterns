//Client code (Smartphone)
public class AdapterPatternExample {
    
    public static void main(String[] args) {
        MicroUsbDevice microUsbDevice = new MicroUsbDevice();
        UsbCDevice usbCDevice = new MicroUsbToUsbCAdapter(microUsbDevice);

        System.out.println("Using USB-C port: ");
        usbCDevice.connectWithUsbC();
    }
}
