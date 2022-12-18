package pr13;

import java.util.StringTokenizer;

public class Address {
    private String county;
    private String region;
    private String city;
    private String street;
    private String homeNumber;
    private String buildingNumber;
    private String apartmentNumber;

    public Address() {
    }

    public void setAddress1(String info) {
        String[] info_mas = info.split(", ");

        this.county = info_mas[0];
        this.region = info_mas[1];
        this.city = info_mas[2];
        this.street = info_mas[3];
        this.homeNumber = info_mas[4];
        this.buildingNumber = info_mas[5];
        this.apartmentNumber = info_mas[6];
    }

    public void setAddress2(String info) {
        StringTokenizer st = new StringTokenizer(info, " ;,.");

        this.county = st.nextToken();
        this.region = st.nextToken();
        this.city = st.nextToken();
        this.street = st.nextToken();
        this.homeNumber = st.nextToken();
        this.buildingNumber = st.nextToken();
        this.apartmentNumber = st.nextToken();
    }

    public String getCounty() {
        return county;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }
}
