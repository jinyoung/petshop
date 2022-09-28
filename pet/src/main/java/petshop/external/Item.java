package petshop.external;

public class Item {

    private Long id;
    private String name;
    private String type;
    private Money price;
    private PetId petId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public PetId getPetId() {
        return petId;
    }

    public void setPetId(PetId petId) {
        this.petId = petId;
    }
}
