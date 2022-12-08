public class Main {
    public static void main (String[] args) {
      Phone phone1 = new Phone();
        Phone phone2 = new Phone("80297645203", "Nokia" );
        Phone phone3 = new Phone("80297526564", "Iphone", 190);
        Phone phone4 = new Phone();

        phone4.setNumber("80298546768");
        phone4.setModel("Xiomi");
        phone4.setWeight(210);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);

        System.out.println();

        phone1.receiveCall("Natasha ");
        phone1.receiveCall("Vlad ", "88005553535");

        phone1.sendMessage("80297776663 ", "80292814880");

        phone2.receiveCall("Arkadiy ");
        phone2.receiveCall("Ded ", "88005553535");

        phone2.sendMessage("80297776663 ", "80292814880");

        phone3.receiveCall("Tanya ");
        phone3.receiveCall("Zhenya ", "88005553535");

        phone3.sendMessage("80297776663 ", "80292814880");

        phone3.receiveCall("Katya ");
        phone3.receiveCall("Vasya ", "88005553535");

        phone3.sendMessage("80297776663 ", "80292814880");

        phone4.receiveCall("Vitya ");
        phone4.receiveCall("Oleg ", "88005553535");

        phone4.sendMessage("80297776663 ", "80292814880");




    }
}
