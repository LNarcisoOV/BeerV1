package br.com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

@SuppressWarnings("serial")
public class BeerSelectedServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{		
		
		//boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        //if(isMultipart) {
            try {
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                @SuppressWarnings("unchecked")
				List<FileItem> items = (List<FileItem>) upload.getItemIterator(request);
                for(FileItem item : items) {
                    if(item.isFormField()) {
                        //se for um campo normal de form
                        response.getWriter().println("Form field");
                        response.getWriter().println("Name:"+item.getFieldName());
                        response.getWriter().println("Value:"+item.getString());
                    } else {
                        //caso seja um campo do tipo file
                        response.getWriter().println("NOT Form field");
                        response.getWriter().println("Name:"+item.getFieldName());
                        response.getWriter().println("FileName:"+item.getName());
                        response.getWriter().println("Size:"+item.getSize());
                        response.getWriter().println("ContentType:"+item.getContentType());
                    }
                }
            } catch (Exception e) {
                response.getWriter().println("ocorreu um problema ao fazer o upload: " + e.getMessage());
            }
 
       // }
		
		
		
		
		
		//Beers cerveja = new Beers();
//		String cor = request.getParameter("nameCervejas");		
//	
//		List<String> listaResultadoCervejas = cerveja.retornaCervejas(cor);
//			
//		request.setAttribute("resultadoCervejas", listaResultadoCervejas);
//		RequestDispatcher view = getServletContext().getRequestDispatcher("/resultBeer.jsp");
//		view.forward(request, response);
//		listaResultadoCervejas = null;
		
		
		
		//BeersDao dao = new BeersDao();
//		
//		try {
//			ResultSet rs = new BeersDao().listaCervejas();
//		
//			while(rs.next()){
//				rs.getString("ID_ATENDIMENTO");
//			}		
//		
//		} catch (SQLException e) {
//			e.getMessage();
//			e.printStackTrace();
//			System.out.println("NAO EXIBIU NADA!");
//		}
		
		
		

		
	}
}