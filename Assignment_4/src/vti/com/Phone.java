package vti.com;
import vti.com.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Phone {

    public abstract void insertContact(String name, String phone);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String newPhone);
    public abstract String searchContact(String name);
    private static Scanner in = new Scanner(System.in);

//===================================================================
    public class Contact {
        private String phoneNumber;
        private String name;
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public void setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }
        public Contact() {}

        @Override
        public String toString() {
            return "Contact{" +
                    "phoneNumber='" + phoneNumber + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
// =====================================================

}
