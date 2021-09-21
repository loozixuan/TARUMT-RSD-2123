package entity;

import adt.*;
import java.util.Objects;
import java.util.logging.Logger;

public class Owner {

    private String name;
    private ListInterface<Property> propertyList;
    private static final Logger LOG = Logger.getLogger(Owner.class.getName());

    public Owner() {
        propertyList = new ArrayList<>();
    }

    public Owner(String name) {
        this.name = name;
        propertyList = new ArrayList<>();
    }

    public Owner(String name, ListInterface<Property> propertyList) {
        this.name = name;
        this.propertyList = propertyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInterface<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(ListInterface<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public void addProperty(Property p) {
        propertyList.add(p);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Owner other = (Owner) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\nPropertyList : " + propertyList;
    }
}
