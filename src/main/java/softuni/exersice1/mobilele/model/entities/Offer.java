package softuni.exersice1.mobilele.model.entities;

import softuni.exersice1.mobilele.enums.EngineEnum;
import softuni.exersice1.mobilele.enums.transmissionEnum;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name ="offers" )

public class Offer extends BaseEntity{

    private String description;
    @Enumerated(EnumType.STRING)
    private EngineEnum engine;
    private String imgURL;
    private int mileage;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private transmissionEnum transmission;
    private int year;
    @ManyToOne
    private Model car;
    @ManyToOne
    private User seller;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public transmissionEnum getTransmission() {
        return transmission;
    }

    public void setTransmission(transmissionEnum transmission) {
        this.transmission = transmission;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Model getCar() {
        return car;
    }

    public void setCar(Model car) {
        this.car = car;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                ", description='" + description + '\'' +
                ", engine=" + engine +
                ", imgURL='" + imgURL + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                ", transmission=" + transmission +
                ", year=" + year +
                ", car=" + car +
                ", seller=" + seller +
                '}';
    }
}
