package com.in28m.springboot.ajaylearnspringboot.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	//Using URL
	@GetMapping("/v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Mamta Yadav");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Mamta", "Yadav"));
	}
	
	//Using parameter
	@GetMapping(path = "/person", params="version=1")
	public PersonV1 personV1Param() {
		return new PersonV1("Mamta Yadav");
	}
	
	@GetMapping(path = "/person", params="version=2")
	public PersonV2 personV2Param() {
		return new PersonV2(new Name("Mamta", "Yadav"));
	}

	
	//Using headers
		@GetMapping(path = "/person", headers="X-API-VERSION=1")
		public PersonV1 personV1Headers() {
			return new PersonV1("Mamta Yadav");
		}
		
		@GetMapping(path = "/person", headers="X-API-VERSION=2")
		public PersonV2 personV2Headers() {
			return new PersonV2(new Name("Mamta", "Yadav"));
		}
		
		//Using media type
				@GetMapping(path = "/person", produces="application/vnd.company.app-v1+json")
				public PersonV1 personV1MediaType() {
					return new PersonV1("Mamta Yadav");
				}
				
				@GetMapping(path = "/person", produces="application/vnd.company.app-v2+json")
				public PersonV2 personV2MediaType() {
					return new PersonV2(new Name("Mamta", "Yadav"));
				}
}
