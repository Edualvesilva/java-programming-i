
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }

    }

    public int priceDifference(Apartment compared) {
        int apart1 = (this.princePerSquare * this.squares);
        int apart2 = (compared.princePerSquare * compared.squares);

        if (apart1 > apart2) {
            return apart1 - apart2;
        } else {
            return apart2 - apart1;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {

        if (this.princePerSquare > compared.princePerSquare) {
            return true;
        } else {
            return false;
        }

    }

}
