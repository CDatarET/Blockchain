public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        String[] t1 = {"a","b","c"};
        Block block1 = new Block(t1,0);

        String[] t2 = {"d","e","f"};
        Block block2 = new Block(t2,block1.getHash());

        String[] t3 = {"g","h","i"};
        Block block3 = new Block(t3,block2.getHash());

        System.out.println("block 1 hash: "+block1.getHash());
        System.out.println("block 2 hash: "+block2.getHash());
        System.out.println("block 3 hash: "+block3.getHash());

        String[] dummyT = {"something","is","not","right"};
        block2.setTransactions(dummyT);
        System.out.println("block 2 changed hash: "+block2.getHash());

        block3.previousBlock(block2.getHash());
        System.out.println("block 3 changed hash: "+block3.getHash());
    }
}