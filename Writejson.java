package jsonproject;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Writejson {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
JSONObject obj = new JSONObject();
obj.put("employee id", "123");
obj.put("first name", "vishnu");
obj.put("last name", "priya");
obj.put("country", "India");
FileWriter file = new FileWriter("jsonfile\\test.json",false);
file.write(obj.toJSONString());
file.close();
System.out.println("file has been created");
	}

}
