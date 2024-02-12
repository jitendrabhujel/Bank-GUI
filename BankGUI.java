/**
 * Programming coursework first year (Second semester)
 *Islington college
 * @author 22066719 Jitendra Bhujel(N6)
 * @version (1.0)
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class BankGUI implements ActionListener

{
  ArrayList<Bank_Card> bank_arraylist = new  ArrayList<Bank_Card> ();        
   private JFrame frame;
   private JPanel panel;
   private JLabel title$, card_id, clientname, issuerbank,pin,withdrawalamount, creditlimit,bankaccount,balanceamount,cvcnumber,intrestrate,graceperiod,withdrawaldate,expiredate;
   private JTextField card_id1, clientname1, issuerbank1,pin1,withdrawalamount1, creditlimit1,bankaccount1,balanceamount1,cvcnumber1,intrestrate1,graceperiod1;
   private JComboBox<String>DT1, DT2, DT3, DT001,DT002,DT003,DT0001,DT0002,DT0003 ;
   private JButton CREDIT,DEBIT,WITHDRAWAL,LIMIT,CANCEL,GRACE,DISPLAYD,DISPLAYC,CLEAR;  
   

   
 public BankGUI(){
     
       frame = new JFrame("Bank_GUI");
       panel = new JPanel();
       title$ = new JLabel("Sanima Bank LTD.");
       title$.setBounds(600,50,170,30);
       
       card_id = new JLabel("Card ID");
       card_id1 = new JTextField();
       
      card_id.setBounds(97,89,48,20);
      card_id1.setBounds(229,83,149,32);
           
                 
       clientname = new JLabel("Client Name : ");
       clientname1 = new JTextField();
       clientname.setBounds(97,158,77,20);
       clientname1.setBounds(229,155,149,32);
               
       issuerbank = new JLabel("Issuer Bank : ");
       issuerbank1 = new JTextField();
         
      issuerbank.setBounds(97,227,74,20);
      issuerbank1.setBounds(229,221,149,32);
               
        pin = new JLabel("Pin Number : ");
        pin1 = new JTextField();
         pin.setBounds(97,476,77,20);
         pin1.setBounds(234,468,149,32);
               
        withdrawalamount= new JLabel("Withdrawal Amount : ");
        withdrawalamount1 = new JTextField();
       
        withdrawalamount.setBounds(628,424,121,20);
        withdrawalamount1.setBounds(777,418,149,32);
       
        bankaccount = new JLabel("Bank Account : ");
        bankaccount1 = new JTextField();
         
          bankaccount.setBounds(97,296,85,20);
          bankaccount1.setBounds(229,292,149,32);
       
        balanceamount = new JLabel("Balance Amount : ");
        balanceamount1 = new JTextField();
   
         balanceamount.setBounds(97,386,102,20);
        balanceamount1.setBounds(229,380,149,32);
       
         
        cvcnumber = new JLabel("CVC Number : ");
        cvcnumber1 = new JTextField();
       
          cvcnumber.setBounds(606,239,83,20);
          cvcnumber1.setBounds(746,227,149,32);
       
        creditlimit= new JLabel("credit limit : ");
        creditlimit1= new JTextField();
   
          creditlimit.setBounds(1062,83,66,20);
          creditlimit1.setBounds(1199,77,149,32);
               
        intrestrate = new JLabel("Intrest rate (%) : ");
        intrestrate1= new JTextField();
       
          intrestrate.setBounds(606,167,80,20);
          intrestrate1.setBounds(746,155,149,32);
         
        graceperiod = new JLabel("grace period : ");
        graceperiod1 = new JTextField();
       
          graceperiod.setBounds(1062,145,81,20);
          graceperiod1.setBounds(1205,139,149,32);
         
       
       
   

         
           
              //an array of Address
        JLabel Date = new JLabel("Date");
         String[] Day = {"Day","1","2","3","4","5","7","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","29","30"};
         String[] Month ={"Month","1","2","3","4","5","6","7","8","9","10","11","12"};
         String[] Year = {"Year","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};

           DT1=new JComboBox<>(Year);
            DT2=new JComboBox(Day);
            DT3 =new JComboBox(Month);
           
           Date.setBounds(1120,15,80,30);
           DT1.setBounds(1230,15,80,30);
            DT2.setBounds(1315,15,80,30);
            DT3.setBounds(1400,15,80,30);
                   
                       
        JLabel Withdrawal_Date  = new JLabel("Withdrawal_Date");
          String[] DaY001= {"Day","1","2","3","4","5","7","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","29","30"};
          String[] Month002 ={"Month","1","2","3","4","5","6","7","8","9","10","11","12"};
          String[] Year003 = {"Year","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};

             DT001=new JComboBox<>(Year);
             DT002=new JComboBox<>(Day);
             DT003 =new JComboBox<>(Month);
             
            Withdrawal_Date .setBounds(480,465,150,30);
             DT001.setBounds(600,465,80,30);
             DT002.setBounds(680,465,80,30);
             DT003.setBounds(760,465,80,30);
         
           
        JLabel Expiration_Date  = new JLabel(" Expiration_Date");
           String[] Day01= {"Day","1","2","3","4","5","7","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","29","30"};
           String[] Month02={"Month","1","2","3","4","5","6","7","8","9","10","11","12"};
           String[] Year03 = {"Year","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028"};

             DT0001=new JComboBox(Year);
             DT0002=new JComboBox(Day);
             DT0003 =new JComboBox(Month);
       
               Expiration_Date .setBounds(850,360,150,30);
              DT0001.setBounds(960,360,80,30);
              DT0002.setBounds(1040,360,80,30);
              DT0003.setBounds(1120,360,80,30);
             
             
                 
           
           
           
       
           
   
                     //Button
                DEBIT =new JButton("Add Debit Card");
                 DEBIT.setBounds(174,596,120,32);
                CREDIT =new JButton("Add Credit Card");
                   CREDIT.setBounds(1187,292,131,32);
                WITHDRAWAL =new JButton("WithdrawaL");
                  WITHDRAWAL.setBounds(684,556,120,32);
                LIMIT =new JButton("Set Credit Limit");
                  LIMIT.setBounds(1071,206,136,32);
                CANCEL =new JButton("Cancel Credit limit");
                 CANCEL.setBounds(1262,206,145,32);
                DISPLAYD =new JButton("DISPLAY Debit");
                 DISPLAYD.setBounds(577,726,120,32);
                DISPLAYC =new JButton("DISPLAY Credit");
                   DISPLAYC.setBounds(757,726,120,32);
                   CLEAR =new JButton("Clear");
                    CLEAR.setBounds(1095,596,120,32);
       
                     
                     
           
                panel.add(Date);
                panel.add(DT1);
                panel.add(DT2);
                panel.add(DT3);
                panel.add(Withdrawal_Date);
                panel.add(DT001);
                panel.add(DT002);
                panel.add(DT003);
               
               
                 
                panel.add(Expiration_Date);
                panel.add(DT0001);
                panel.add(DT0002);
                panel.add(DT0003);
               
                panel.add(title$);
                panel.add(card_id);
                panel.add(card_id1);
                panel.add(clientname);
                panel.add(clientname1);
                panel.add(issuerbank);
                panel.add(issuerbank1);
                panel.add(pin);
                panel.add(pin1);
                panel.add(withdrawalamount);
                panel.add(withdrawalamount1);
                panel.add(bankaccount);
                panel.add(bankaccount1);
                panel.add(balanceamount);
                panel.add(balanceamount1);
                panel.add(cvcnumber);
                panel.add(cvcnumber1);
                panel.add(creditlimit);
                panel.add(creditlimit1);
                panel.add(intrestrate);
                panel.add(intrestrate1);
                panel.add(graceperiod);
                panel.add(graceperiod1);
      
                panel.add(CREDIT);
                panel.add(DEBIT);
                panel.add(WITHDRAWAL);
                panel.add(CANCEL);
                panel.add(LIMIT);
                panel.add(DISPLAYD);
                panel.add(DISPLAYC);
                panel.add(CLEAR);
                DEBIT.addActionListener(this);
                CREDIT.addActionListener(this);
                WITHDRAWAL.addActionListener(this);
                LIMIT.addActionListener(this);
                CANCEL.addActionListener(this);
                DISPLAYD.addActionListener(this);
                DISPLAYC.addActionListener(this);
                CLEAR.addActionListener(this);
               
               
       
                 
      
       
            panel.setLayout(null);
            panel.setSize(1550,850);
            frame.add(panel);
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setSize(1550,850);
            frame.setBackground(Color.BLACK);            
     
 }
  public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == DEBIT)
    {
          if (card_id.getText().isEmpty ()|| clientname1.getText().isEmpty ()||issuerbank1.getText().isEmpty ()||balanceamount1.getText().isEmpty() ||bankaccount1.getText().isEmpty ()||pin1.getText().isEmpty ())
          {
              JOptionPane.showMessageDialog(frame, "Empty text !","Alert", JOptionPane.ERROR_MESSAGE);
          }
          else
          {
            try {
                int card_id = Integer.parseInt(card_id1.getText());
                String clientname = clientname1.getText();
                String isseuerbank  = issuerbank1.getText();
                double balanceamount = Double.parseDouble(balanceamount1.getText());
                String bankaccount  = bankaccount1.getText();
                int pinnum = Integer.parseInt(pin1.getText());
                boolean bull = true ;
                for(Bank_Card eachdebit : bank_arraylist)
                {
                     if(eachdebit instanceof Debit_Card )
                     {    
                         Debit_Card db = (Debit_Card) eachdebit;
                         if (card_id==db.getCard_Id())
                         {
                             bull = false ;
                         }
                     }
                       
                }
                if(bull == true)
                     {
                         Debit_Card raw = new Debit_Card(card_id,bankaccount,clientname,isseuerbank,balanceamount,pinnum);
                         bank_arraylist.add(raw);
                        //JOptionPane.showMessageDialog(frame, "Debit sucessfull Addedd \n CARD ID: \n Client Name:  \n Issuer Bank: " + card_id  +clientname + issuerbank  ,"Alert", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(frame, "Debit  added:\n\nCard ID: " + card_id + "\nClient Name: " + clientname + "\nIssuer Bank: " + isseuerbank + "\nBalance Amount: " + balanceamount + "\nBank Account: " + bankaccount + "\nPin_Number: " + pinnum    ,  "Alert", JOptionPane.INFORMATION_MESSAGE);

                     }
                else{
                         JOptionPane.showMessageDialog(frame, "debit of this  card id is already exit t", "Alert", JOptionPane.ERROR_MESSAGE);
                    }
           
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers in the textboxes!", "Alert", JOptionPane.ERROR_MESSAGE);
            }
          }
    }
    else if(ae.getSource() ==CREDIT)
    {
        if( card_id.getText().isEmpty ()|| clientname1.getText().isEmpty ()||issuerbank1.getText().isEmpty ()||balanceamount1.getText().isEmpty() ||issuerbank1.getText().isEmpty ()||pin1.getText().isEmpty()||cvcnumber1.getText().isEmpty() || DT0001.getSelectedItem(

        )=="Year" ||DT0002.getSelectedItem()=="Day" ||  DT0003.getSelectedItem() =="Month")
        {
             JOptionPane.showMessageDialog(frame, "Empty text !","Alert", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
              try {
                    int card_id = Integer.parseInt(card_id1.getText());
                    String clientname = clientname1.getText();
                    String isseuerbank  = issuerbank1.getText();
                    double balanceamount = Double.parseDouble(balanceamount1.getText());
                    String bankaccount  = bankaccount1.getText();
                    int pinnum = Integer.parseInt(pin1.getText());
                    int cvcnum = Integer.parseInt(cvcnumber1.getText());
                    int intrest =Integer.parseInt(intrestrate1.getText());
                    String jcombo1 =(String) DT0001.getSelectedItem();
                    String jcombo2 =(String) DT0002.getSelectedItem();
                    String jcombo3=(String) DT0003.getSelectedItem();
                    String time = jcombo1 + " " + jcombo2 + " " +jcombo3;
                    boolean bull = true;
                    for(Bank_Card eachcredit : bank_arraylist)
                        {
                         if(eachcredit instanceof Credit_Card ){
                             
                             Credit_Card db = (Credit_Card) eachcredit;
                             if (card_id==db.getCard_Id())
                             {
                                 bull = false ;
                             }
                          }
                    }
                     if(bull == true)
                         {
                             Credit_Card raw = new Credit_Card(card_id,clientname,isseuerbank,bankaccount,balanceamount,cvcnum,intrest,time);
                             bank_arraylist.add(raw);
                              JOptionPane.showMessageDialog(frame, "Credit added successful: \n\nCard ID: " + card_id + "\nClient Name: " + clientname + "\nIssuer Bank: " + isseuerbank + "\nBalance Amount: " + balanceamount + "\nBank Account: " + bankaccount + "\nPin_Number: " + pinnum + "\nCvc   Number: " + cvcnum  + "\nIntrest Rate: " + intrest + "\n Expire Date: " + time ,  "Alert", JOptionPane.INFORMATION_MESSAGE);

                            //JOptionPane.showMessageDialog(frame, " credit sucessfull Addedd\n Cardid: " + card_id ,"Alert", JOptionPane.INFORMATION_MESSAGE);
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(frame, "credit of this  card id is already exit !", "Alert", JOptionPane.ERROR_MESSAGE);
                         }  
           
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers in the textboxes!", "", JOptionPane.ERROR_MESSAGE);
                }
        }
    }
     else if (ae.getSource() == WITHDRAWAL)
    {
           if(card_id1.getText().isEmpty ()||withdrawalamount1.getText().isEmpty ()||  pin1.getText().isEmpty ()|| DT001.getSelectedItem()=="Year" ||DT002.getSelectedItem()=="Day" ||  DT003.getSelectedItem() =="Month")
             
        {
           JOptionPane.showMessageDialog(frame, "Empty text !","Alert", JOptionPane.ERROR_MESSAGE);
         
    }
       else
        {
              try {
                int card_id = Integer.parseInt(card_id1.getText());
                double withdrawalamount = Double.parseDouble(withdrawalamount1.getText());
                int pinnum = Integer.parseInt(pin1.getText());
                String jcombo1 =(String) DT001.getSelectedItem();
                String jcombo2 =(String) DT002.getSelectedItem();
                String jcombo3=(String) DT003.getSelectedItem();
                String time = jcombo1 + " " + jcombo2 + " " +jcombo3;
                boolean bull = true;
                    for(Bank_Card withdraw : bank_arraylist)
                        {
                         if(withdraw instanceof Debit_Card ){    
                         Debit_Card db = (Debit_Card) withdraw;
                        if (card_id==db.getCard_Id())
                        {
                            bull = true ;
                            if(pinnum == db.getPIN_Number())
                             {
                                 if(withdrawalamount <= db.getBalance_Amount())
                                 {
                                     db.Withdraw(withdrawalamount,time,pinnum);
                                      JOptionPane.showMessageDialog(frame, "sucessfull withdrawal Done: \n\n Card Id:  "  + card_id + "\nWithdrawal Amount: " + withdrawalamount + "\nPin Number: " + pinnum + "\nTime: " + time  , "Alert", JOptionPane.INFORMATION_MESSAGE);
                                 
                                }
                                 else
                                 {
                                     JOptionPane.showMessageDialog(frame, "insufficent balance", "Alert", JOptionPane.ERROR_MESSAGE);
                                 }
                             }
                             else
                             {
                             JOptionPane.showMessageDialog(frame, "Incorrect pin", "Alert", JOptionPane.ERROR_MESSAGE);
                                 }
                            break;
                        }
                        else{
                            bull = false;
                        }
                    }
                }
                if(bull ==false )
                {
                JOptionPane.showMessageDialog(frame, "Card_id not found", "Alert", JOptionPane.ERROR_MESSAGE);
                }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "Number format exception", "Alert", JOptionPane.ERROR_MESSAGE);
                }
        }
    }
    else if(ae.getSource() ==LIMIT)
    {
        if( card_id.getText().isEmpty ()|| creditlimit1.getText().isEmpty ()||graceperiod1.getText().isEmpty ())
        {
             JOptionPane.showMessageDialog(frame, "Empty text !","Alert", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
              try {
                    int card_id = Integer.parseInt(card_id1.getText());
                    int newperiod = Integer.parseInt(graceperiod1.getText());
                    int newlimit = Integer.parseInt(creditlimit1.getText());
                    boolean Bull = false;
                    for(Bank_Card limit : bank_arraylist)
                        {
                          if(limit instanceof Credit_Card )
                          {
                                 Credit_Card c = (Credit_Card) limit;
                                 if (card_id==c.getCard_Id())
                                 {
                                     Bull = true ;
                                     if(newlimit <= 2.5 * c. getBalance_Amount())
                                     {
                                         c.setCredit_limit(newlimit,newperiod);
                                        JOptionPane.showMessageDialog(frame, "credit limit sucessfull: \n\n Card ID: "  + card_id + "\nnew period"  + newperiod  + "\n New Limit: " + newlimit , "Alert", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                     else
                                     {
                                         JOptionPane.showMessageDialog(frame, "credit limit too high", "Alert", JOptionPane.ERROR_MESSAGE);
                                     }  
                                     break;
                                 }
                           else{
                            Bull = false;
                            }
                        }
                    }
                    if(Bull ==false )
                        {
                            JOptionPane.showMessageDialog(frame, "Card_id not found", "Alert", JOptionPane.ERROR_MESSAGE);
                        }
                    }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "number format exception!", "", JOptionPane.ERROR_MESSAGE);
                }
        }
    }
    else if(ae.getSource() ==CANCEL)
    {
        if( card_id.getText().isEmpty ())
        {
             JOptionPane.showMessageDialog(frame, "Empty text !","Alert", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
              try {
                int card_id = Integer.parseInt(card_id1.getText());
                boolean BL3 = false;
                for(Bank_Card sid3 : bank_arraylist)
                    {    
                        if(sid3 instanceof Credit_Card ){
                            Credit_Card cd = (Credit_Card) sid3;
                            if (card_id== cd.getCard_Id())
                            {
                                cd.cancelCredit_Card ();
                                 BL3 = true;
                                 break;
                                }
                                else{
                                    BL3= false;
                                }
                            }            
                    }                              
                 if(BL3 == true)
                 {
                  JOptionPane.showMessageDialog(frame, "Cancel sucessfull: \n\n Card ID: "  + card_id , "Alert", JOptionPane.INFORMATION_MESSAGE);
                  }
                 else
                 {
                 JOptionPane.showMessageDialog(frame, "No card id", "Alert", JOptionPane.ERROR_MESSAGE);
                             }
                }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "number format exception!", "", JOptionPane.ERROR_MESSAGE);
                }
        }
    }
    else if (ae.getSource() == DISPLAYD)
    { try{
           for(Bank_Card sid : bank_arraylist)
                {    
                if(sid instanceof Debit_Card )
                   {
                     Debit_Card dc = (Debit_Card)sid ;
                     dc.display();
                     
                  }            
             }
            }catch (NumberFormatException e)
            {
                    JOptionPane.showMessageDialog(frame, "number format exception!", "", JOptionPane.ERROR_MESSAGE);
             }
    }
    else if (ae.getSource() == DISPLAYC)
    {
        try{
           
             for(Bank_Card sid : bank_arraylist)
             
            {    
                    if(sid instanceof Credit_Card )
                   {
                     Credit_Card dc = (Credit_Card)sid ;
                     dc.dispayDetails();
                     
                  }            
             }
        }
       
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "number format exception!", "", JOptionPane.ERROR_MESSAGE);
            }
    }
    else if (ae.getSource() == CLEAR)
    {
        card_id1.setText(" ");
        clientname1.setText(" ");
        issuerbank1.setText(" ");
        bankaccount1.setText(" ");
        balanceamount1.setText(" ");
        pin1.setText(" ");
        withdrawalamount1.setText(" ");
        creditlimit1.setText(" ");
        bankaccount1.setText(" ");
        cvcnumber1.setText(" ");
        intrestrate1.setText(" ");
        graceperiod1.setText(" ");
        DT001.setSelectedIndex(0);
        DT0002.setSelectedIndex(0);
        DT0003.setSelectedIndex(0);
        DT0001.setSelectedIndex(0);
        DT0002.setSelectedIndex(0);
        DT0003.setSelectedIndex(0);
        {
             JOptionPane.showMessageDialog(frame, "Clear sucessfull" , "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
       
    }
    }
public static void main(String []args){
        BankGUI frame = new BankGUI();

   
 }
}
