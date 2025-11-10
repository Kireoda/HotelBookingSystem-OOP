import java.time.LocalDate;

public class HotelRoom {
    private String hotelName;
    private String roomNumber;
    private String roomType; //single, double, suite, family
    private int capacity;// amount of people
    private double pricePerNight;
    private boolean isBooked;
    private LocalDate lastMaintenanceDate;
    private LocalDate nextAvailableDate;
    private int hotelRating;

    //region Constructors
    public HotelRoom(String hotelName, String roomNumber, String roomType, int capacity,
                     double pricePerNight, boolean isBooked, LocalDate lastMaintenanceDate,
                     LocalDate nextAvailableDate, int hotelRating) {
        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.isBooked = isBooked;
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.nextAvailableDate = nextAvailableDate;
        this.hotelRating = hotelRating;
    }

    public HotelRoom() {
        this.hotelName = "";
        this.roomNumber = "";
        this.roomType = "";
        this.capacity = 0;
        this.pricePerNight = 0.0;
        this.isBooked = false;
        this.lastMaintenanceDate = LocalDate.now();
        this.nextAvailableDate = LocalDate.now();
        this.hotelRating = 0;
    }
    //endregion

    //region Getters and Setters
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public LocalDate getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(LocalDate lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public LocalDate getNextAvailableDate() {
        return nextAvailableDate;
    }

    public void setNextAvailableDate(LocalDate nextAvailableDate) {
        this.nextAvailableDate = nextAvailableDate;
    }

    public int getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(int hotelRating) {
        this.hotelRating = hotelRating;
    }
    //endregion

    //region Methods
    public double bookRoom(LocalDate checkInDate, int nights) {
        //marks room as booked and updates next available date
    }

    public void cancelRoomBooking() {
        //frees a room isbooked set to false and updates nextavailabledate
    }

    public void isRoomAvailable(LocalDate date){
        //returns if room is available on specific date
    }

    public double calculateTotalPrice(int nights) {
        //returns price per night * number of nights
    }

    public void updatePrice(double newPrice){
        //changes the price for room
    }

    public void updateRating(int rating){
        //updates hotel rating and validates it to be 0 - 5
    }

    public void performMaintenance(LocalDate maintenanceDate) {
        //updates lastmaintencance date and updates nextavailabledate
    }

    public boolean needMaintenance(){
        //returns true if the room requires maintenance eg. hasnt had maintenance for 6 or more months also sets avilablility to false
    }

    public void SortPrice(){
       //sorts rooms by price from lowest to highest
    }

    public void SortRating(){
        //sorts rooms by rating from lowest to highest
    }

    public void SortAvailability(){
      //sorts rooms by availability from lowest to highest
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "hotelName='" + hotelName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomType='" + roomType + '\'' +
                ", capacity=" + capacity +
                ", pricePerNight=" + pricePerNight +
                ", isBooked=" + isBooked +
                ", lastMaintenanceDate=" + lastMaintenanceDate +
                ", nextAvailableDate=" + nextAvailableDate +
                ", hotelRating=" + hotelRating +
                '}';
    }
}

