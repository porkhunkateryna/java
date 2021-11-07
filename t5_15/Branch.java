package t5_15;

class Branch extends Leaf {
	protected String type;

    Branch(String type) {
        this.type = type;
    }

    @Override
    void bloom() {
        System.out.println("it is blooming");
    }
    @Override
    void fall() {
        System.out.println("leaves fell off the branch");
    }
    @Override
    void frost() {
        System.out.println("leaves are covered with frost");
    }
    @Override
    void yellow() {
        System.out.println("it is yellow");
    }

   
    public String ToString() {
        return "Branch is " + this.type + ".";
    }

}
