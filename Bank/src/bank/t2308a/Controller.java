package bank.t2308a;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();;

    public static long getBalanceNumber() {
        return balanceNumber;
    }
    public void actionTransfer(){
        //Thức hiện các công việc như nhập số tài khoản thụ hưởng, số tiền mô tả tại đây
    }
    public void getHistory(){
        //In danh sách lịch sử giao dịch
    }
    //Định dạng số tiền theo mình mong muốn
    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###.00");
        //100000->10000000
        return formatter.format(money);
    }
}