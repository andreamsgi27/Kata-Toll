public class TollStation {
    String name;
    String city;
    int collectedTolls;

    public TollStation() {
    }
    public TollStation(String name, String city, int collectedTolls) {
        this.name = name;
        this.city = city;
        this.collectedTolls = collectedTolls;
    }

    //getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCollectedTolls() {
        return collectedTolls;
    }

    public void setCollectedTolls(int collectedTolls) {
        this.collectedTolls = collectedTolls;
    }

    public int singlevehicleToll(Vehicle vehicle) {
        return vehicle.getToll();
        }
}
