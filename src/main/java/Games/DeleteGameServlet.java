package Games;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/delete-game.do")
public class DeleteGameServlet extends HttpServlet {

	private MainGameService MainGameService = new MainGameService();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		MainGameService.deleteTodo(new MainGame(request.getParameter("todo"), request
				.getParameter("category")));
		response.sendRedirect("/list-games.do");
	}
}