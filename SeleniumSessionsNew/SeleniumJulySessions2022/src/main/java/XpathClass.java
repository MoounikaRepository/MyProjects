
public class XpathClass {
	
	//both the ways we can traverse 
	//foreward and backward  directions
	
	
	//tagname[@attribute="value"]
	
	
	
	//1 //input[@name='username']
	
	//2 //a[text()='Sign Up']
	
	//3 contains --->//a[contains(text(),'Pricing')]
	
	//4 parent to child
	
	//div[@class="input-group"]/child::input[1]--->single slash means  only direct parent or child pointout
	
	//5 child to parent
	
	//h3[text()='Companies & Contacts']//parent::div
	
	//ancestor
	//input[@name="username"]/ancestor::div
	
	//following-sibling:
	
	//input[@name="username"]/following-sibling::input
	
	
	//preceding sibling
	
	//input[@name="password"]/preceding-sibling::input
	

}
