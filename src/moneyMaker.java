import javax.servlet.RequestDispatcher;
import java.io.IOException;

/**
 * Created by rohanayub on 1/11/17.
 */
public class moneyMaker extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String investFirstName = request.getParameter("firstName");
        String investLastName = request.getParameter("lastName");
        int investAmt  = Integer.parseInt(request.getParameter("investAmount"));
        double investRtn  = Double.parseDouble(request.getParameter("investReturn"));

        request.setAttribute("firName" , investFirstName);
        request.setAttribute("lasName" , investLastName);
        request.setAttribute("initialAmount" , investAmt);
        request.setAttribute("investReturn" , investRtn);


        double percentRtn =  investRtn  / (double)investAmt;
        double percentage = percentRtn * 100;


        //System.out.println("Hello" + (investName) + ",");
        String investmentEval;
        if(percentRtn <= .05){
            investmentEval = " likely investment! That's a " + (percentage) + "% return.";
            System.out.println("Your investment is likely! You wanted " + (percentage) +" percent!");
            //request.setAttribute("like" , (percentRtn <= .05));
        }
        else if(percentRtn >= .06 && percentRtn <= .80){
            investmentEval = " little greedy for an investment return! You wanted a " + (percentage) + "% return.";
            System.out.println("You're getting a little greedy! You wanted " + (percentage) + " percent!");
            //request.setAttribute("greed" , (percentRtn >= .06 && percentRtn <= .80));
        }
        else{
            investmentEval = " super greedy investment return! You wanted a " + (percentage) + "% return!";
            System.out.println("You're super greedy. That's " + (percentage) + " percent!");
            //Note** System.out.println only shows up in Java/IntelliJ it does not print out to the web page.
            //Use this command to see if the math is working properly in the program.
            //request.setAttribute("sGreed" )
        }

        request.setAttribute("eval",investmentEval );


        /*request.setAttribute("like" , (percentRtn <=.05));
        request.setAttribute("greed" , else if(percentRtn >= .06 && percentRtn <=.80);
        request.setAttribute("sGreed" , else);*/

        String nextJSP = "/investmentResults.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        ;

    }
}
