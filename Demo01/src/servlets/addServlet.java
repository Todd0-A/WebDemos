package servlets;


import dao.FruitDAO;
import dao.impl.FruitDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Fruit;

import java.io.IOException;

public class addServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= req.getParameter("name");
        String priceStr= req.getParameter("price");
        Integer price=Integer.parseInt(priceStr);
        String countStr= req.getParameter("count");
        Integer count= Integer.parseInt(countStr);
        String remark= req.getParameter("remark");

        FruitDAO fruitDAO = new FruitDAOImpl();
        boolean flag = fruitDAO.addFruit(new Fruit(0, name,price,count,remark));
        System.out.println(flag? "Add Successful":"Can Not Add");
    }
}
