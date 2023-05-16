package oops;

public class Address {
    //Data Members or Instance variables or class variables
    private String name;
    private String doorNo;
    private String street;
    private String city;
    private int zipCode;
    private boolean isThisHomeAddress;

    //Default Constructors
    private Address() {
        name = "Raja";
        doorNo = "D100";
        street = "ABC Street";
        city = "Bangalore";
        zipCode = 686531;
    }
    private Address(String name1, String doorNo1, String street1, String city1, int zipCode1, boolean isThisHomeAddress1){
//        this.name=name;
//        this.doorNo=doorNo;
//        this.street=street;
//        this.city=city;
//        this.zipCode=zipCode;
//        this.isThisHomeAddress=isThisHomeAddress;
        name=name1;
        doorNo=doorNo1;
        street=street1;
        city=city1;
        zipCode=zipCode1;
        isThisHomeAddress=isThisHomeAddress1;
    }

    private Address(String name2, String doorNo2){
        name=name2;
        doorNo=doorNo2;
    }
    private Address(String name3, String doorNo3, String street3){
        name=name3;
        doorNo=doorNo3;
        street=street3;
    }

    //Methods
    private void printAddress() {
        System.out.println();
        System.out.println(name);
        System.out.println(doorNo);
        System.out.println(street);
        System.out.println(city);
        System.out.println(zipCode);
        System.out.println(isThisHomeAddress);

    }

    public static void main(String[] args) {
        //Create an object
        Address address = new Address();
        Address address1 = new Address();
        Address address2 = new Address("Raja4", "D400", "Jalan2/109c", "Pune", 686003, true);
        Address address3 = new Address("Raja5", "D500", "Jalan3/109f", "Delhi", 686033, false);
        Address address4 = new Address("Raja6", "D600");
        Address address5 = new Address("Raja7", "D700", "Tun razak");
//        address.printAddress();
//        address1.printAddress();
        address1.name = "Raja1";
        address1.doorNo = "D200";
        address1.street = "XYZ Street";
        address1.city = "Bangalore";
        address1.zipCode = 58100;
        address1.printAddress();
//        address.printAddress();
        address.name = "Raja12";
        address.doorNo = "D300";
        address.street = "Pune Street";
        address.city = "Tumkur";
        address.zipCode = 50100;
        address.isThisHomeAddress = true;
//        address.printAddress();
        address2.printAddress();
        address3.printAddress();
        address4.printAddress();
        address5.printAddress();

        // Call the members of the class using object
    }
}
