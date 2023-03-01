# Spring-cloud-eureka
Eureka Demo Project For microservice 

1. amazon Service is Eureka Server.
2. amazon-shopping is Eureka Client.
3. payment-service is Eureka Client.

amazon-shopping call the api of payment-service using Application name.

		String url = "http://PAYMENT-SERVICE/";
		return restTemplate.getForObject(url, String.class);
