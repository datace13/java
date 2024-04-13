package bank.t2308a;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransactionHistory {
    private Long id;
    private LocalDate dayTrading;
    private String description;
    private String beneficiaryAccount;
    private long money;

    public TransactionHistory(String description, String beneficiaryAccount, long money) {
        this.id = IdGenerate.getId(); //ID để tự động tăng
        this.dayTrading = LocalDate.now();//Lấy ngày hiện tại
        this.description = description;
        this.beneficiaryAccount = beneficiaryAccount;
        this.money = money;
    }
    public String getDescription() {return beneficiaryAccount;}

    public void setbeneficiaryAccount(String beneficiaryAccount) {this.beneficiaryAccount = beneficiaryAccount;}
    public Long getId() {return id;}
    public LocalDate getDayTrading() {return dayTrading;}

    public String getBeneficiaryAccount(){return beneficiaryAccount;}

    public void setDescription(String description) {this.description = description;}
    public long getMoney() {return money;}

    public void setMoney(long money) {this.money = money;}

    public String toString(){
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return id + " - " + dayTrading.format(myFormatter) + " - " + description + " - " + Controller.formatMoney(money) + " - " + beneficiaryAccount +"\n";
    }
}
