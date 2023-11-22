package mosaif.salim.models;

public class Car {
    private Long cId;
    private String cBrand;
    private String cModel;
    private String cColor;
    private String cRegistration;
    private Integer cYear;
    private Integer cPrice;

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getcBrand() {
        return cBrand;
    }

    public void setcBrand(String cBrand) {
        this.cBrand = cBrand;
    }

    public String getcModel() {
        return cModel;
    }

    public void setcModel(String cModel) {
        this.cModel = cModel;
    }

    public String getcColor() {
        return cColor;
    }

    public void setcColor(String cColor) {
        this.cColor = cColor;
    }

    public String getcRegistration() {
        return cRegistration;
    }

    public void setcRegistration(String cRegistration) {
        this.cRegistration = cRegistration;
    }

    public Integer getcYear() {
        return cYear;
    }

    public void setcYear(Integer cYear) {
        this.cYear = cYear;
    }

    public Integer getcPrice() {
        return cPrice;
    }

    public void setcPrice(Integer cPrice) {
        this.cPrice = cPrice;
    }

    public Car(Long cId, String cBrand, String cModel, String cColor, String cRegistration, Integer cYear, Integer cPrice) {
        this.cId = cId;
        this.cBrand = cBrand;
        this.cModel = cModel;
        this.cColor = cColor;
        this.cRegistration = cRegistration;
        this.cYear = cYear;
        this.cPrice = cPrice;
    }
}
