import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadBean;

public class FormSrv extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		try
		{
      
			UploadBean ub=new UploadBean();
			ub.setFolderstore("c:\\shylu");
			ub.setOverwrite(false);
			MultipartFormDataRequest nreq=new MultipartFormDataRequest(req);
			ub.store(nreq);
			pw.println("<center><h1>files are uploading successfylly</h1></center>");
			
		}
		catch(Exception e)
		{
			pw.println(e);
		}
		pw.close();
	}
		
		
	}


