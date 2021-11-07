package t5_15;

class Tree extends Branch {
	private String name;

    Tree(String type, String name) {
        super(type);
        this.name = name;
    }

    @Override
    void bloom() {
        System.out.println("it is blooming");
    }
    @Override
    void fall() {
        System.out.println("leaves fell off the tree");
    }
    @Override
    void frost() {
        System.out.println("tree is covered with frost");
    }
    @Override
    void yellow() {
        System.out.println("it is yellow");
    }
    @Override
    public String ToString() {
        return "Tree is " + this.name + " with type " + this.type + ".";
    }


}
