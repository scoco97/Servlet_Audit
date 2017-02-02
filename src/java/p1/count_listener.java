/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import javax.servlet.*;
/**
 *
 * @author Yash Jain
 */
public class count_listener implements ServletContextListener  {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        ServletContext sc = sce.getServletContext();
        String count = sc.getInitParameter("count_dd");
        hitCounter c = new hitCounter(Integer.parseInt(count));
        sc.setAttribute("count_dd",c);
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
    
}
