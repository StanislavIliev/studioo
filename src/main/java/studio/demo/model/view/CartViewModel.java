package studio.demo.model.view;

import studio.demo.model.entity.Procedure;
import studio.demo.model.entity.Product;

import javax.persistence.ManyToMany;
import java.util.List;

public class CartViewModel extends BaseViewModel {
    private List<ProcedureViewModel> procedures;
    private List<ProductViewModel> products;


    public CartViewModel() {
    }

    public List<ProcedureViewModel> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<ProcedureViewModel> procedures) {
        this.procedures = procedures;
    }

    public List<ProductViewModel> getProducts() {
        return products;
    }

    public void setProducts(List<ProductViewModel> products) {
        this.products = products;
    }
}