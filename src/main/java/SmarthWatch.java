public class SmarthWatch extends SmarthDevice{

    Boolean calendario;

    public SmarthWatch(Boolean tactil, Boolean bluetooth, String marca, int fabricacion, Boolean camara, Boolean calendario) {
        super(tactil, bluetooth, marca, fabricacion, camara);
        this.calendario = calendario;
    }

    public SmarthWatch() {
        super();
    }

    @Override
    public String toString() {
        return "SmarthWatch{" +
                "tactil=" + tactil +
                ", bluetooth=" + bluetooth +
                ", marca='" + marca + '\'' +
                ", fabricacion=" + fabricacion +
                ", camara=" + camara +
                ", calendario=" + calendario +
                '}';
    }
}
