package com.example.lib;

import java.util.Scanner;

public class BankingJava {
    String accountHoldersName;
    int accountNumber;
    int balance;
    int money;
    BankingJava() {
        accountHoldersName = "benjo";
        accountNumber = 12345578;
        balance = 5000;
        money = 0;

    }
    void Services() {

        System.out.println("1)withdraw 2)Check Balance 3)account holders name 4)Account number 5)deposit");
        Scanner Variable = new Scanner(System.in);
        int option = Variable.nextInt();
        switch (option) {

            case 1:
                    WithDraw();
                break;
            case 2:
                CheckBalance();
                break;
            case 3:
                System.out.println(accountHoldersName);
                break;
            case 4:
                System.out.println(accountNumber);
                break;
            case 5:
                 Deposit();
                     break;
            default:
                System.out.println("invalid option");
        }
    }
  void WithDraw()
  {
      Scanner obj=new Scanner(System.in);
      money = obj.nextInt();
      int balanceLeft = balance - money;
      System.out.println(balanceLeft);
  }
  void CheckBalance(){
      int balanceLeft2 = balance - money;
      System.out.println(balanceLeft2);
  }
void Deposit(){
    int newBalance;
    Scanner obj=new Scanner(System.in);
    money = obj.nextInt();
    newBalance=balance+money;
    System.out.println(newBalance);
       }

}
