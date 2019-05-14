package OCP;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return size == product.getSize();
    }

}
