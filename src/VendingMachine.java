import javax.swing.*;

public class VendingMachine {
    private int tokens;
    private int cans;

    VendingMachine(){
        this(0,0);
    }
    VendingMachine(int cans,int tokens){
        setCans(cans);
        setTokens(tokens);
    }



    public void tokenInserted(int tokens){
        int count=0;
        for (int i = 0; i<tokens;i++){
            if(getCansCount()==0)
                JOptionPane.showMessageDialog(null,"Error, The vending machine is empty.");
            else
            {
                //Release Can
                setCans(getCansCount()-1);
                setTokens(getTokensCount()+1);
                count++;
            }
        }
        System.out.println("Can(s) released: " + count);

    }

    public void fillUp(int cans){
        setCans(getCansCount()+cans);
    }

    @Override
    public String toString() {
        return "Cans: "+getCansCount()+ " Tokens: " +getTokensCount();
    }

    public int getTokensCount() {
        return tokens;
    }

    public int getCansCount() {
        return cans;
    }

    public void setCans(int cans) {
        this.cans = cans;
    }

    public void setTokens(int token) {
        this.tokens = token;
    }
}
