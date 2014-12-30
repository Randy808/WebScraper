import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class WebScraper 
{
	
	public static void main (String[]  args)
	{
		Document doc;
		try 
		{
			doc = Jsoup.connect("http://serebii.net/index2.shtml").get();//Create a http connection to url, get the DOM, and store it into Document doc
			Elements info = doc.select("p");//Select all the 'a' elements in the document and store it into the Elements variable info
			for (Element i : info)//for each Element i in info
			{
				//System.out.println(i.attr("href"));//print out the attribute of href
				System.out.println(i.html());
			}
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
