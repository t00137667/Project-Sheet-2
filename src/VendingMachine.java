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



    public void tokenInserted(){
        if(getCansCount()==0)
            JOptionPane.showMessageDialog(null,"Error, The vending machine is empty.");
        else
        {
            //Release Can
            setCans(getCansCount()-1);
            setTokens(getTokensCount()+1);
        }
    }

    public void fillUp(int cans){
        setCans(getCansCount()+cans);
    }

    @Override
    public String toString() {
        return super.toString();
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
