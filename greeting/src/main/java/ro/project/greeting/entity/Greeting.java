package ro.project.greeting.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "Greeting")
public class Greeting {
    
    @Id
    @Positive
    @Column(name = "GreetingID")
    private int greetingID;

    @NotNull
    @Column(name = "Description")
    private String description;

    @NotNull
    @Column(name = "Price")
    private double price;

    @Min(1)
    @Max(2)
    @Column(name = "TypeID")
    private int typeID;

    @Min(1)
    @Max(5)
    @Column(name = "CategoryID")
    private int categoryID;

    public int getGreetingID() {
        return greetingID;
    }

    public void setGreetingID(int greetingID) {
        this.greetingID = greetingID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
}

