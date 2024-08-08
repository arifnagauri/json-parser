package io.arif.assignment.model;

import java.util.ArrayList;
import java.util.List;

public class Property {

    private Integer id;
    private String name;
    private Float price;
    /** Enum type */
    private PriceDenomination priceDenomination;
    private String description;
    private Integer averageRating;
    /** Another Object type */
    private Location location;
    /** List of Objects */
    private List<Image> images = new ArrayList<>();

    public Property() {
    }

    public Property(Integer id, String name, Float price, String description, Integer averageRating,
                    Location location, List<Image> images) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.averageRating = averageRating;
        this.location = location;
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public PriceDenomination getPriceDenomination() {
        return priceDenomination;
    }

    public void setPriceDenomination(PriceDenomination priceDenomination) {
        this.priceDenomination = priceDenomination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Integer averageRating) {
        this.averageRating = averageRating;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", priceDenomination=" + priceDenomination +
                ", description='" + description + '\'' +
                ", averageRating=" + averageRating +
                ", location=" + location +
                ", images=" + images +
                '}';
    }
}
