/*
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
*/
package CodingBat;

public class HTMLstring {

	private String makeTags(String tag, String word) {
		return "<"+tag+">"+word+"</"+tag+">";
	}
	
	public static void main(String[] args) {
		
		HTMLstring html = new HTMLstring();
		
		System.out.println(html.makeTags("i", "Yay"));
		System.out.println(html.makeTags("i", "Hello"));
		System.out.println(html.makeTags("city", "Yay"));
	}
}
