public class Room {

    //create the instance variables
    private int numberOfBeds;
    private int price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, int price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    //create derived methods
    public boolean isAvailable(){
        if (!this.isOccupied && !this.isDirty){
            return true;
        }
        return false;
    }

    //Creating getters and setters for the room class
    public int getNumberOfBeds(){
        return numberOfBeds;
    }

    public int getPrice(){
        return price;
    }

    public boolean getIsOccupied(){
        return isOccupied;
    }

    public boolean getIsDirty(){
        return isDirty;
    }

}
