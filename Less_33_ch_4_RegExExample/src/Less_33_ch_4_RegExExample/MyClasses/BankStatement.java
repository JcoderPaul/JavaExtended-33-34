package Less_33_ch_4_RegExExample.MyClasses;

public class BankStatement {

    protected String tapeOfOperation;
    protected String numberOfOperation;
    protected String currency;
    protected String dataOfOperation;
    protected String referenceOfOperation;
    // Поля (переменные) описанные выше не используются в программе!
    protected String descriptionOfOperation;
    protected Double incomeDebit;
    protected Double outcomeСredit;

    public BankStatement(String descriptionOfOperation, Double incomeDebit, Double outcomeСredit) {
        this.descriptionOfOperation = descriptionOfOperation;
        this.incomeDebit = incomeDebit;
        this.outcomeСredit = outcomeСredit;
    }

    public String getDescriptionOfOperation() {
        return descriptionOfOperation;
    }

    public void setDescriptionOfOperation(String descriptionOfOperation) {
        this.descriptionOfOperation = descriptionOfOperation;
    }

    public double getIncomeDebit() {
        return incomeDebit;
    }

    public void setIncomeDebit(double incomeDebit) {
        this.incomeDebit = incomeDebit;
    }

    public double getOutcomeСredit() {
        return outcomeСredit;
    }

    public void setOutcomeСredit(double outcomeСredit) {
        this.outcomeСredit = outcomeСredit;
    }

    @Override
    public String toString() {
        return "BankStatement { [" +
                "descriptionOfOperation = '" + descriptionOfOperation + '\'' +
                " ] , [ incomeDebit = " + incomeDebit +
                " ] , [ outcomeСredit = " + outcomeСredit + " ] " +
                '}';
    }
}