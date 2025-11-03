class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("France", "Grand Hotel", 2, 150.0, false,
                LocalDate.now(), LocalDate.now().plusDays(7),
                LocalDateTime.now());
    }