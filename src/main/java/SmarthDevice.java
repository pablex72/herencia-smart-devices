public class SmarthDevice {

    Boolean tactil;
    Boolean bluetooth;
    String marca;
    int fabricacion;
    Boolean camara;

    public SmarthDevice(Boolean tactil, Boolean bluetooth, String marca, int fabricacion, Boolean camara) {
        this.tactil = tactil;
        this.bluetooth = bluetooth;
        this.marca = marca;
        this.fabricacion = fabricacion;
        this.camara = camara;
    }

    public SmarthDevice() {
    }

}
