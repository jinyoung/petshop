package petshop.domain;

import java.util.Date;
import petshop.domain.*;
import petshop.infra.AbstractEvent;

public class UnRegistered extends AbstractEvent {

    private Long id;
    private String name;
    private int appearance;
    private int energy;
    private Address address;

    public UnRegistered() {
        super();
    }

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

    public int getAppearance() {
        return appearance;
    }

    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
