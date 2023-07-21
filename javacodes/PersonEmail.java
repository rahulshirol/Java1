class PersonEmail{
	static String getEmailByName(String personName){
		System.out.println("invoking getEmailByName in PersonEmail");
		if(personName!=null){
			System.out.println("getAgeByName is valid");
			if("rahulshirol"==personName){
			return "rahulshirol@gmail.com";
		    }
		    if("Santhu"==personName){
			return "santhosha@gmail.com";
		    }
		    if("Janu"==personName){
			return "janus@gmail.com";
		    }
		    if("raju"==personName){
			return "ranju@gmail.com";
		    }
		    if("Jaya"==personName){
			return "jaya@gmail.com";
		    }
		    if("yallu"==personName){
			return "yallu@gmail.com";
		    }
			if("Shravya"==personName){
			return "shravyan@gmail.com";
		    }
			if("rohit"==personName){
			return "rohit@gmail.com";
		    }
			if("Prashant"==personName){
			return "prashant@gmail.com";
		    }
			if("Prakash"==personName){
			return "prakashk@gmail.com";
		    }
			
		else{
			System.err.println("getEmailByName is in valid");
		    }
			
		}
		return "none@gmail.com";
		
	}
	
}