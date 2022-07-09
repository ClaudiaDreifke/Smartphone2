import model.Friend;
import model.Smartphone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestSmartphone {


    @Test
    void testIfContactIsAddedToMap(){
        // given
        Friend friend1 = new Friend("Lena", "123");
        Map<String,String> allContacts = new HashMap<String, String>();
        Smartphone phone1 = new Smartphone("iPhone", "Apple", allContacts);

        // when
        phone1.addContact(friend1);
        String actual = allContacts.toString();

        // then
        Assertions.assertNotNull(actual);
    }
    @Test
    void testIfGetPhoneNumberWorks(){
        // given
        Friend friend1 = new Friend("Lena", "123");
        Map<String,String> allContacts = new HashMap<String, String>();
        Smartphone phone1 = new Smartphone("iPhone", "Apple", allContacts);

        // when
        phone1.addContact(friend1);
        String actual = phone1.getPhoneNumberByContactMap(friend1);
        System.out.println(actual);

        // then
        Assertions.assertEquals(friend1.getPhoneNumber(), actual);
    }


}
