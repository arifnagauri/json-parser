package io.arif.assignment.model;

public class Location {

    private Integer id;
    private String address;

    public Location() {
    }

    public Location(Integer id, String address) {
        this.id = id;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Location{" +
                "address='" + address + '\'' +
                '}';
    }
}
