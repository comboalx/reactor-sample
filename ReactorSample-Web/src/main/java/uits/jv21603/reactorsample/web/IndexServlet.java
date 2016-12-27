package uits.jv21603.reactorsample.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uits.jv21603.reactorsample.domain.Author;
import uits.jv21603.reactorsample.service.AuthorServiceImpl;

/**
 *
 * @author stan
 */
@WebServlet(name = "IndexServlet", urlPatterns = {"/"})
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Author> authors = new AuthorServiceImpl().list();
        req.setAttribute("authors", authors);
        req.setAttribute("test", "jasdjfknandfaksndfjajdfbjkafjabdfbadbfjab");
        req.getRequestDispatcher("/authors.jsp").forward(req, resp);
    }
    
}
