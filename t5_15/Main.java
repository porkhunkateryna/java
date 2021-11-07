package t5_15;

public class Main {
	public static void main(String[] args) {

        Tree tree = new Tree("arboreous","maple");
        System.out.println(tree.ToString());
        tree.bloom();
        tree.fall();
        tree.frost();
        tree.yellow();
       
        System.out.println("\n\n");

        Branch branch = new Branch("sprout");
        System.out.println(branch.ToString());
        branch.bloom();
        branch.fall();
        branch.frost();
        branch.yellow();
    }

}
