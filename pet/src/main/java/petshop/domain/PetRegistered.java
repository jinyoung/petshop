package petshop.domain;

import java.util.Date;
import petshop.domain.*;
import petshop.infra.AbstractEvent;

public class PetRegistered extends AbstractEvent {

    private Long id;
    private String name;
    private int appearance;
    private int energyI;
    private String address;

    public PetRegistered() {
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

    public int getEnergyI() {
        return energyI;
    }

    public void setEnergyI(int energyI) {
        this.energyI = energyI;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
