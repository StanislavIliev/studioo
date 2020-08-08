package studio.demo.model.binding;

import org.hibernate.validator.constraints.Length;
import studio.demo.model.entity.Manicure;
import studio.demo.model.entity.ManicureType;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class OrderAddBindingModel {

    private String name;
    private String description;
    private BigDecimal price;
    private ManicureType manicure;

    public OrderAddBindingModel() {
    }

    @Length(min = 2, message = "Order name name must be more than 2 characters.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Length(min = 3, message = "Description name must be more than 3 characters.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @DecimalMin(value = "0", message = "Enter valid price.")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @NotNull(message = " Enter valid manicure name.")
    public ManicureType getManicure() {
        return manicure;
    }

    public void setManicure(ManicureType manicure) {
        this.manicure = manicure;
    }
}
