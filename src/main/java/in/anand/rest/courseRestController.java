package in.anand.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courseRestController {
	
	@GetMapping("/course")
	public String getCourseDetails(@RequestParam("cname") String cname)
	{
		
		String msg="";
		if("SBMS".equals(cname))
		{
			msg="morning classes";
		}else if("JRTP".equals(cname))
		{
			msg="Evening time";
		}else {
			msg="contat admin";
		}
		return msg;
	}
	
	@GetMapping("/Fee")
	public String getCourseFee(@RequestParam("cname") String cname,@RequestParam("tname") String tname) {
		
		String msg="";
		
		msg=cname+" teached by"+tname+" and fee is 5000 INR only";
		return msg;
		
	}

}
