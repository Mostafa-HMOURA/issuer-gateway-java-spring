package com.login.id.issuer.gateway.issuergateway.controllers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DataController {
    
	public static Map<String, List<Map<String, Object>>> getProviders() {
		Map<String, List<Map<String, Object>>> providers = new HashMap<>();

		// Populate the providers map with the data
		List<Map<String, Object>> sinProviders = List.of(
				createProvider("CIBC Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/cibc.png", "123456789","INSURANCE_NUMBER"),
				createProvider("Royal Bank of Canada", "https://content-gc.signin.interac-id.ca/cbs/images/en/rbc.png","123456789", "INSURANCE_NUMBER"),
				createProvider("Ministry of Transportation","http://t2.gstatic.com/images?q=tbn:ANd9GcQAWGQMKqZCclCN_40EoD8p-pV17k5um56ENbhRjwy8oBKjFnSC","123456789", "INSURANCE_NUMBER"),
				createProvider("Bell Canada","https://logos-download.com/wp-content/uploads/2016/04/Bell_logo-700x420.png", "123456789","INSURANCE_NUMBER"),
				createProvider("Affinity Credit Union","https://content-gc.signin.interac-id.ca/cbs/images/en/affinity.png", "123456789","INSURANCE_NUMBER"),
				createProvider("Tangerine Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/tang.png","123456789", "INSURANCE_NUMBER"));
		
        providers.put("SIN", sinProviders);

		List<Map<String, Object>> dobProviders = List.of(
				createProvider("Ministry of Transportation","http://t2.gstatic.com/images?q=tbn:ANd9GcQAWGQMKqZCclCN_40EoD8p-pV17k5um56ENbhRjwy8oBKjFnSC","18/07/1998", "DATE_OF_BIRTH"),
				createProvider("Bell Canada","https://logos-download.com/wp-content/uploads/2016/04/Bell_logo-700x420.png", "18/07/1998","DATE_OF_BIRTH"),
				createProvider("CIBC Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/cibc.png","18/07/1998", "DATE_OF_BIRTH"),
				createProvider("Royal Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/rbc.png","18/07/1998", "DATE_OF_BIRTH"),
				createProvider("Affinity Credit Union","https://content-gc.signin.interac-id.ca/cbs/images/en/affinity.png", "18/07/1998","DATE_OF_BIRTH"),
				createProvider("Tangerine Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/tang.png","18/07/1998", "DATE_OF_BIRTH"));

		providers.put("Date of Birth", dobProviders);

		List<Map<String, Object>> creditScoreProviders = List.of(
				createProvider("Equifax", "https://assets.equifax.com/global/images/logos/equifax.svg", "300","CREDIT_SCORE"),
				createProvider("TransUnion","https://www.transunion.com/content/dam/transunion/global/common/logos/logo.svg", "300","CREDIT_SCORE"),
				createProvider("Affinity Credit Union","https://content-gc.signin.interac-id.ca/cbs/images/en/affinity.png", "300","CREDIT_SCORE"));

		providers.put("Credit Score", creditScoreProviders);

		List<Map<String, Object>> bankBalanceProviders = List.of(
				createProvider("CIBC Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/cibc.png", "6000","BANK"),
				createProvider("Royal Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/rbc.png", "6000","BANK"),
				createProvider("National Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/nbc.png", "6000","BANK"),
				createProvider("ATB Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/atb.png", "6000","BANK"),
				createProvider("Scotia Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/bns.png", "6000","BANK"),
				createProvider("TD Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/td.png", "6000","BANK"),
				createProvider("BMO Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/bmo.png", "6000","BANK"),
				createProvider("Caisse Alliance", "https://content-gc.signin.interac-id.ca/cbs/images/en/cais.png", "6000","BANK"));

		providers.put("Bank Balance", bankBalanceProviders);

		List<Map<String, Object>> salaryProviders = List.of(
				createProvider("CIBC Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/cibc.png","2000","SALARY"),
				createProvider("Bell Canada","https://logos-download.com/wp-content/uploads/2016/04/Bell_logo-700x420.png", "2000","SALARY"),
				createProvider("Caisse Alliance", "https://content-gc.signin.interac-id.ca/cbs/images/en/cais.png", "2000","SALARY"),
				createProvider("Ministry of Transportation","http://t2.gstatic.com/images?q=tbn:ANd9GcQAWGQMKqZCclCN_40EoD8p-pV17k5um56ENbhRjwy8oBKjFnSC","2000","SALARY"),
				createProvider("ATB Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/atb.png", "2000","SALARY"),
				createProvider("TransUnion","https://www.transunion.com/content/dam/transunion/global/common/logos/logo.svg", "2000","SALARY"),
				createProvider("TD Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/td.png", "2000","SALARY"),
				createProvider("BMO Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/bmo.png", "2000","SALARY"),
				createProvider("Caisse Alliance", "https://content-gc.signin.interac-id.ca/cbs/images/en/cais.png", "2000","SALARY"));

		providers.put("Salary", salaryProviders);

		List<Map<String, Object>> phoneNumberProviders = List.of(
				createProvider("Ministry of Transportation","http://t2.gstatic.com/images?q=tbn:ANd9GcQAWGQMKqZCclCN_40EoD8p-pV17k5um56ENbhRjwy8oBKjFnSC","+1611010114", "PHONE_NUMBER"),
				createProvider("Bell Canada","https://logos-download.com/wp-content/uploads/2016/04/Bell_logo-700x420.png", "+1611010114","PHONE_NUMBER"),
				createProvider("CIBC Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/cibc.png","+1611010114", "PHONE_NUMBER"),
				createProvider("Royal Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/rbc.png","+1611010114", "PHONE_NUMBER"),
				createProvider("Affinity Credit Union","https://content-gc.signin.interac-id.ca/cbs/images/en/affinity.png", "+1611010114","PHONE_NUMBER"));

		providers.put("Phone Number", phoneNumberProviders);

		List<Map<String, Object>> addressProviders = List.of(
				createProvider("Ministry of Transportation","http://t2.gstatic.com/images?q=tbn:ANd9GcQAWGQMKqZCclCN_40EoD8p-pV17k5um56ENbhRjwy8oBKjFnSC","1165 Embro St, Beachville", "ADDRESS"),
				createProvider("Bell Canada","https://logos-download.com/wp-content/uploads/2016/04/Bell_logo-700x420.png", "1165 Embro St, Beachville","ADDRESS"),
				createProvider("CIBC Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/cibc.png","1165 Embro St, Beachville", "ADDRESS"),
				createProvider("Royal Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/rbc.png","1165 Embro St, Beachville", "ADDRESS"),
				createProvider("Affinity Credit Union","https://content-gc.signin.interac-id.ca/cbs/images/en/affinity.png", "1165 Embro St, Beachville","ADDRESS"));

		providers.put("Address", addressProviders);

		List<Map<String, Object>> provinceProviders = List.of(
				createProvider("Ministry of Transportation","http://t2.gstatic.com/images?q=tbn:ANd9GcQAWGQMKqZCclCN_40EoD8p-pV17k5um56ENbhRjwy8oBKjFnSC","Ontario", "PROVINCE"),
				createProvider("Bell Canada","https://logos-download.com/wp-content/uploads/2016/04/Bell_logo-700x420.png", "Ontario","PROVINCE"),
				createProvider("CIBC Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/cibc.png","Ontario", "PROVINCE"),
				createProvider("Royal Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/rbc.png","Ontario", "PROVINCE"),
				createProvider("Affinity Credit Union","https://content-gc.signin.interac-id.ca/cbs/images/en/affinity.png", "Ontario","PROVINCE"));

		providers.put("Province", provinceProviders);

		List<Map<String, Object>> countryProviders = List.of(
				createProvider("Ministry of Transportation","http://t2.gstatic.com/images?q=tbn:ANd9GcQAWGQMKqZCclCN_40EoD8p-pV17k5um56ENbhRjwy8oBKjFnSC","CANADA", "COUNTRY"),
				createProvider("Bell Canada","https://logos-download.com/wp-content/uploads/2016/04/Bell_logo-700x420.png", "CANADA","COUNTRY"),
				createProvider("CIBC Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/cibc.png","CANADA", "COUNTRY"),
				createProvider("Royal Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/rbc.png","CANADA", "COUNTRY"),
				createProvider("Affinity Credit Union","https://content-gc.signin.interac-id.ca/cbs/images/en/affinity.png", "CANADA","COUNTRY"));

		providers.put("Country", countryProviders);

		List<Map<String, Object>> emailProviders = List.of(
				createProvider("Bell Canada","https://logos-download.com/wp-content/uploads/2016/04/Bell_logo-700x420.png","canada@gmail.com", "EMAIL"),
				createProvider("CIBC Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/cibc.png","canada@gmail.com", "EMAIL"),
				createProvider("Royal Bank", "https://content-gc.signin.interac-id.ca/cbs/images/en/rbc.png","canada@gmail.com", "EMAIL"),
				createProvider("Affinity Credit Union","https://content-gc.signin.interac-id.ca/cbs/images/en/affinity.png", "canada@gmail.com","EMAIL"));

		providers.put("Email", emailProviders);

		return providers;
	}

	private static Map<String, Object> createProvider(String name, String image, String sin, String type) {
		Map<String, Object> provider = new HashMap<>();
		provider.put("name", name);
		provider.put("image", image);
		provider.put("value", sin);
		provider.put("type", type);
		return provider;
	}


}
