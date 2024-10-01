public class CinemaConfig {
    private String cinemaName;
    private static CinemaConfig cinemaConfig;
    private int numberOfScreens;
    private String operatingHours;
    private CinemaConfig() {
        cinemaName = "Default Cinema";
        numberOfScreens = 3;
        operatingHours = "10:00 AM - 21:00 PM";
    }
    public static CinemaConfig getInstance() {
        if (cinemaConfig == null) {
            cinemaConfig = new CinemaConfig();
        }
        return cinemaConfig;
    }
    public String getCinemaName() {
        return cinemaName;
    }
    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }
    public int getNumberOfScreens() {
        return numberOfScreens;
    }
    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }
    public String getOperatingHours() {
        return operatingHours;
    }
    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }
}
