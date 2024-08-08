package io.arif.assignment.model;

public class Image {

    private Integer id;
    private String imageUrl;
    private Integer size;

    public Image() {
    }

    public Image(Integer id, String imageUrl, Integer size) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageUrl='" + imageUrl + '\'' +
                ", size=" + size +
                '}';
    }
}
