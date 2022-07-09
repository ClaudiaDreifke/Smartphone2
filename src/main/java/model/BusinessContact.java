package model;

public class BusinessContact extends Contact {

    String companyName;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String contactName, String companyName) {
        this.contactName = contactName;
        this.companyName = companyName;

    }

    @Override
    public String toString() {
        return "model.BusinessContact{" +
                "companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                '}';
    }
}
