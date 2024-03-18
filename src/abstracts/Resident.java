package abstracts;

public abstract class Resident {

    private double residentCost;
    private int houseSize;
    private int roomQuantity;
    private int loungeQuantity;

    public Resident(double residentCost, int houseSize, int roomQuantity, int loungeQuantity) {
        this.residentCost = residentCost;
        this.houseSize = houseSize;
        this.roomQuantity = roomQuantity;
        this.loungeQuantity = loungeQuantity;
    }

    public double calculateResidentCost() {
        return 0;
    }

    public double getResidentCost() {
        return residentCost;
    }

    public int getHouseSize() {
        return houseSize;
    }

    public int getRoomQuantity() {
        return roomQuantity;
    }

    public int getLoungeQuantity() {
        return loungeQuantity;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + " " + "Resident{" +
                "Konut Fiyatı= " + residentCost + " TL " +
                "Konut Büyüklüğü= " + houseSize + " m2 " +
                "Oda Sayısı= " + roomQuantity + " oda " +
                "Salon Sayısı= " + loungeQuantity + " salon " +
                '}' + "\n";
    }
}
