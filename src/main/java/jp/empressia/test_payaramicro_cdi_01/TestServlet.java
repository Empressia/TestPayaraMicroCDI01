package jp.empressia.test_payaramicro_cdi_01;

import javax.enterprise.inject.spi.CDI;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/*")
public class TestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("test");
		CDI.current();
	}

}