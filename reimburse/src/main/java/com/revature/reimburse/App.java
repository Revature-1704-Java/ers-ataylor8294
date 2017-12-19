package com.revature.reimburse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "You must login to open or view reimbursements. Please login" );
        boolean x = ExpenseDao.login();
        while (!x) {
        	System.out.println("The login credentials you provided were incorrect");
        }
        
    }
}
