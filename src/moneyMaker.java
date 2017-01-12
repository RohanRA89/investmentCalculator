import java.io.IOException;

/**
 * Created by rohanayub on 1/11/17.
 */
public class moneyMaker extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String investName = request.getParameter("firstName");
        int investAmt  = Integer.parseInt(request.getParameter("investAmount"));
        int investRtn  = Integer.parseInt(request.getParameter("investReturn"));
        double percentRtn = (investRtn - investAmt) / investAmt;
        double percentage = percentRtn * 100;

        System.out.println("Hello" + (investName) + ",");

        if(percentRtn <= .05){
            System.out.println("Your investment is likely! You wanted" + (percentage) +"percent!");
        }
        else if(percentRtn >= .06 && percentRtn <= .80){
            System.out.println("You're getting a little greedy! You wanted" + (percentage) + "percent!");
        }
        else{
            System.out.println("You're super greedy. That's" + (percentage) + "percent!");
        }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
