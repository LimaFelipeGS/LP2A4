package controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping("/")
    public String base(){
        return "index.jsp";
    }

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        System.out.println((n1+n2));

        ModelAndView mv = new ModelAndView();
        mv.setViewName("novo.jsp");
        mv.addObject("resultado", n1+n2);

        return mv;
    }
}
