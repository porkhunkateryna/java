package hw7;
import java.util.ArrayList;


public class phone {
    public static class Phone{
        int id;
        String lastName, firstName;
        String address, cardNumber;
        int debit, credit;
        int localMinutes, globalMinutes;

        public Phone(){
            this.id = 0;
            lastName = "";
            firstName = "";
            address = "";
            cardNumber = "";
            debit = 0;
            credit = 0;
            localMinutes = 0;
            globalMinutes = 0;
        }

        public Phone(int id, String lastName, String firstName,
                     String address, String cardNumber,
                     int debit, int credit,
                     int localMinutes, int globalMinutes){
            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
            this.address = address;
            this.cardNumber = cardNumber;
            this.debit = debit;
            this.credit = credit;
            this.localMinutes = localMinutes;
            this.globalMinutes = globalMinutes;
        }

        public void setId(int id) { this.id = id; }
        public void setLastName(String lastName) { this.lastName = lastName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public void setAddress(String address) { this.address = address; }
        public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
        public void setDebit(int debit) { this.debit = debit; }
        public void setCredit(int credit) { this.credit = credit; }
        public void setLocalMinutes(int localMinutes) { this.localMinutes = localMinutes; }
        public void setGlobalMinutes(int globalMinutes) { this.globalMinutes = globalMinutes; }

        public int getId() { return id; }
        public String getLastName() { return lastName; }
        public String getFirstName() { return firstName; }
        public String getAddress() { return address; }
        public String getCardNumber() { return cardNumber; }
        public int getDebit() { return debit; }
        public int getCredit() { return credit; }
        public int getLocalMinutes() { return localMinutes; }
        public int getGlobalMinutes() { return globalMinutes; }

        public String toString() {
            String info = "";
            info += lastName + " " + firstName + ", card number: " + cardNumber;

            return info;
        }
    }

    public static void insertionSort(String[] array){
        int size = array.length;
        String itemToInsert;
        int i, j;

        for (i = 1; i < size; i++){
            itemToInsert = array[i];
            j = i - 1;

            while (j >= 0 && array[j].compareTo(itemToInsert) > 0){
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = itemToInsert;
        }
    }

    public static void a(ArrayList<Phone> phones){

        System.out.println("out of limit ");
        for (Phone phone: phones){
            int locMinutes = phone.getLocalMinutes();
            int limit = phone.getDebit() + phone.getCredit();
            if (locMinutes > limit){
                System.out.println(phone + "; local minutes: " + locMinutes + "  limit: " + limit);
            }
        }
    }

    public static void b(ArrayList<Phone> phones){

        System.out.println("global");
        for (Phone phone: phones){
            int glMinutes = phone.getGlobalMinutes();
            if (glMinutes > 0){
                System.out.println(phone + "; global minutes: " + glMinutes);
            }
        }
    }

    public static void c(ArrayList<Phone> phones){

        System.out.println(" in alphabetical order ");
        String[] strPhones = new String[phones.size()];
        for (int i = 0; i < phones.size(); i++){
            strPhones[i] = phones.get(i).toString();
        }

        insertionSort(strPhones);

        for (int i = 0; i < strPhones.length; i++){
            System.out.println(strPhones[i]);
        }
    }


    public static void main(String[] args) {
        Phone phone_1 = new Phone(1, "porkhun", "kateryna",
                "ADRS1", "12345",
                1000, 500,
                300, 600);
        Phone phone_2 = new Phone(2, "petrova", "sophia",
                "ADRS2", "23433",
                600, 100,
                0, 750);
        Phone phone_3 = new Phone(3, "botvinik", "misha",
                "ADRS3", "77777",
                200, 200,
                0, 50);
        Phone phone_4 = new Phone(4, "kalafitska", "saasha",
                "ADRS4", "09877",
                80, 50,
                140, 15);
        Phone phone_5 = new Phone(5, "invanenko", "vadym",
                "ADRS5", "76854",
                600, 0,
                200, 150);
        Phone phone_6 = new Phone(6, "semenovych", "bohdan",
                "ADRS6", "33442",
                300, 100,
                540, 20);
        Phone phone_7 = new Phone(7, "bodnadrych", "ilona",
                "ADRS7", "09812",
                100, 30,
                0, 150);
        Phone phone_8 = new Phone(8, "yaroslavna", "ivanna",
                "ADRS8", "12376",
                350, 120,
                600, 60);
        Phone phone_9 = new Phone(9, "babcheko", "solomiya",
                "ADRS9", "01926",
                140, 50,
                200, 40);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(phone_1);
        phones.add(phone_2);
        phones.add(phone_3);
        phones.add(phone_4);
        phones.add(phone_5);
        phones.add(phone_6);
        phones.add(phone_7);
        phones.add(phone_8);
        phones.add(phone_9);

        a(phones);
        b(phones);
        c(phones);

    }
}