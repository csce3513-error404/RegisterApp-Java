package edu.uark.registerapp.controllers;

import java.lang.annotation.Repeatable;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.uark.registerapp.commands.products.ProductQuery;
import edu.uark.registerapp.controllers.enums.ViewModelNames;
import edu.uark.registerapp.controllers.enums.ViewNames;
import edu.uark.registerapp.models.api.Product;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@Controller
@RequestMapping(value ="/mainMenu")
public class MainMenuRouteController extends HttpServlet
{
    @RequestMapping(method = RequestMethod.GET)
    public String mapSS(@RequestParam Map<String, String> objectName)
    {
        protected void httpServ(HttpServletRequest request, HttpServletResponse response)
                             throws ServletException, IOException
        {
            HttpSession session = request.getSession();
            HttpSession user = request.getRemoteUser();

            if (session != null && user != null)
            {
            }

            else
            {
                response.sendRedirect("/signIn");
                System.out.println("No active user");
            }
        }
        return;
    }
}
