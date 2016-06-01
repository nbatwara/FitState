package src;

import...

public class CommWithServer(){
	
	private string url = "http://proj-308-11.cd.iastate.edu/";
	private URL                url; 
	private URLConnection      urlConn; 
	private DataOutputStream   dos; 
	private DataInputStream    dis;
	
	class CommWithServer(){
		try {
			url; 
			urlConn; 
			dos; 
			dis;
		  } // end of "try"

		  catch (MalformedURLException mue) { 
			addTextField.setText("mue error"); 
		  } 
		  catch (IOException ioe) { 
			addTextField.setText("IO Exception"); 
		  }
	}
	
	public 
	
	/*url = new URL("http://proj-308-11.cd.iastate.edu/"); 
			urlConn = url.openConnection(); 
			urlConn.setDoInput(true); 
			urlConn.setDoOutput(true); 
			urlConn.setUseCaches(false); 
			urlConn.setRequestProperty ("Content-Type", "application/x-www-form-urlencoded");

			dos = new DataOutputStream (urlConn.getOutputStream()); 
			String message = "NEW_ITEM=" + URLEncoder.encode(addTextField.getText()); 
			dos.writeBytes(message); 
			dos.flush(); 
			dos.close();

			// the server responds by saying 
			// "SUCCESS" or "FAILURE"

			dis = new DataInputStream(urlConn.getInputStream()); 
			String s = dis.readLine(); 
			dis.close(); 
		  
			if (s.equals("SUCCESS")) { 
			  toDoList.addItem(addTextField.getText()); 
			  addTextField.setText(""); 
			} else { 
			  addTextField.setText("Post Error!"); 
			}

	*/
}