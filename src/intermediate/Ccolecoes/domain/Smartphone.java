package intermediate.Ccolecoes.domain;

import java.util.Objects;

public class Smartphone implements Comparable<Smartphone> {

    private String serialNumber;
    private String name;
    private Double price;

    public Smartphone(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    public Smartphone(String serialNumber, String name, Double price) {
        this(serialNumber, name);
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone otherSmartphone = (Smartphone) obj;
        return serialNumber!=null && serialNumber.equals(otherSmartphone.serialNumber);
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Smartphone o) {
        return this.serialNumber.compareTo(o.serialNumber);
    }
}
