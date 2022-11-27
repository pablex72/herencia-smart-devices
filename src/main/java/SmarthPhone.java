public class SmarthPhone extends SmarthDevice{

    Boolean buttons;

    public SmarthPhone(Boolean tactil, Boolean bluetooth, String marca, int fabricacion, Boolean camara, Boolean buttons) {
        super(tactil, bluetooth, marca, fabricacion, camara);
        this.buttons = buttons;
    }

    public SmarthPhone() {
        super();
    }

    @Override
    public String toString() {
        return "SmarthPhone{" +
                "tactil=" + tactil +
                ", bluetooth=" + bluetooth +
                ", marca='" + marca + '\'' +
                ", fabricacion=" + fabricacion +
                ", camara=" + camara +
                ", buttons=" + buttons +
                '}';
    }
}
