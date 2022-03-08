package com.restwebservice.sample3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Used as controller Class which can control a url request. 
// when the request hits server, @Restcontroller classes will be 
public class GreetingController {
	
	
@GetMapping("greeting")
public String getGreeting() {
	return "Hello World";
}

@GetMapping ("/getmessage/{name}")
public String getMessage(@PathVariable String name) {
	return "Hello "+ name;
}

//@PathVariable is a Spring annotation which indicates that a method parameter
//should be bound to a URI template variable.

@GetMapping("/getsum/{fno}/{sno}")
public String getSum(@PathVariable  int fno, @PathVariable int sno) {
	return "sum = " + (fno+sno);
}


@GetMapping("/usingrequestparam")
public String reqParam(@RequestParam (value = "id", defaultValue = "001") String id) {
	return "ID = " + id;
	
	//http://localhost:8080/usingrequestparam?id=5866
	//http://localhost:8080/usingrequestparam?id=
}

// create a class DisplayMessage and pass private id and content in it.
@GetMapping("/message")
public DisplayMessage getValues() {
	// create an object of the class to access the variables..
	DisplayMessage message= new DisplayMessage();
	
	message.setId(5);
	message.setContent("Hello user");
	// setting values to the variables. 
	return message;
	// return object of the created class. 
}



@GetMapping("/secondgreeting")
public DisplayMessage getCustomMessage(@RequestParam (value="name", defaultValue = "jeni") String name) {
	DisplayMessage secondMessage= new DisplayMessage();
	secondMessage.setContent("hello "+name);
	return secondMessage;
	//http://localhost:8080/secondgreeting?name
	//http://localhost:8080/secondgreeting?name=sam
	
	
}
@GetMapping ("contents")
//http://localhost:8080/contents?content=hello%20abin
public DisplayMessage contentChange(@RequestParam(value="content", defaultValue = "abin") String content ) {
	DisplayMessage contents=new DisplayMessage();
	contents.setContent(content);
	return contents;
	// http://localhost:8080/contents?content=%20sam
}

}
