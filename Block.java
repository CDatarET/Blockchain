import java.util.Arrays;

public class Block{
    public String[] transactions;
    public int blockHash;
    public int previousBlock;

    public Block(String[] transactions, int previousBlock){
        this.transactions = transactions;
        this.previousBlock = previousBlock;
        this.blockHash = Arrays.hashCode(transactions) + previousBlock;
    }

    //recompute value
    public void recomputeHash(int previousBlock){
        this.blockHash = Arrays.hashCode(transactions) + previousBlock;
    }

    //getters to get values and information
    public String[] getTransactions(){
        return(this.transactions);
    }

    public int getHash(){
        recomputeHash(previousBlock);
        return(this.blockHash);
    }

    public int getPreviousBlock(){
        return(this.previousBlock);
    }

    //setters to set values and information
    public void previousBlock(int previousBlock){
        this.previousBlock = previousBlock;
        recomputeHash(previousBlock);
    }

    public void setTransactions(String[] transactions){
        this.transactions = transactions;
        recomputeHash(previousBlock);
    }
}