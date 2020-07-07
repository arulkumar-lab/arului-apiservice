# arului-apiservice
arului-apiservice API REST services using springboot JPA H2 hateoas HAL

<blockquote>Download and install H2 database engine</blockquote>


1. ```mvn install```

2. ```spring-boot:run```

<h3>Country controller - HATEOAS service call</h3>

```http://localhost:2020/arului-service/country```
```http://localhost:2020/arului-service/country?name=xyz```

<h3>PersonRepository - HATEOAS call using RepositoryRestResource</h3>

```http://localhost:2020/arului-service/people```

<h3>Item Controller - REST service call using H2 database engine</h3>

```http://localhost:2020/arului-service/item```