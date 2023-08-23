//Adapter Class
public class MicroUsbToUsbCAdapter implements UsbCDevice{

    private MicroUsbDevice microUsbDevice;

    public MicroUsbToUsbCAdapter(MicroUsbDevice microUsbDevice) {
        this.microUsbDevice = microUsbDevice;
    }

    @Override
    public void connectWithUsbC() {
        System.out.println("Using Adapter: Converting Micro USB to USB-C");
        microUsbDevice.connectWithMicroUsb();
    }
    
}
