package test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//https://www.rakuten.com/ct/stores/tocfeature.aspx?loc=67031
//https://global.rakuten.com/en/search/

/*
 *         <div class="b-content b-text-overflow">
 *        <span class="b-text-small b-text-sub">
 *           Shop
 *           <a href="/en/store/cherrybell/">cherrybell</a>
 *         </span>
 *       </div>
 *       
 *        <div class="b-header-col b-header-col-fluid">
 *        <div class="b-nav-search">
 *           <div class="b-dropdown" id="search_header_category">
 *             <select class="b-select-transparent" id="tl" name="tl"><option value="0">All Categories</option>
 *	          <option value="101240">Music &amp; Video</option>
 *	          <option value="100804">Home Decor, Housewares &amp; Furniture</option>
 */
 
public class joup_test {

	public static void main(String argv[]) {
			Document doc = null;
			 try {
				  doc = Jsoup.connect("https://global.rakuten.com/en/search/").get();
				  //doc = Jsoup.connect("http://yahoo.com").get();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   Elements links = doc.select("a[href*=global.rakuten.com/en/category/]");
			   for (Element link : links) {
				   System.err.println("link : " + link);
			   } 

			 
			//System.out.println("HTMLparsed :\n" + doc);
	}			
}
