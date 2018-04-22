package Games;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/list-games.do")
public class ListGameServlet extends HttpServlet {

	private MainGameService MainGameService = new MainGameService();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("todos", MainGameService.retrieveTodos());
		request.getRequestDispatcher("/WEB-INF/views/list-games.jsp").forward(
				request, response);
	}
}