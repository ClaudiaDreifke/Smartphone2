package model;

public class Friend extends Contact {

    String phoneNumber;

    public Friend(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public Friend() {
    }

    @Override
    public String toString() {
        return "model.Friend{" +
                ", contactName='" + contactName + '\'' +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
