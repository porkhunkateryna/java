package cw10;

abstract class Book implements Edition {
    @Override
    public void printb(){
        System.out.println("Book is printing");
    }
    @Override
    public void advertise(){
        System.out.println("Book is advertised");
    }
    public void popular(){
        System.out.println("Book now is very popular");
    }



}