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

![image](https://user-images.githubusercontent.com/56085499/86805428-c6f3f100-c06f-11ea-9c26-0f7b929839cc.png)

![image](https://user-images.githubusercontent.com/56085499/86805652-fb67ad00-c06f-11ea-89f6-248e1535bcee.png)

![image](https://user-images.githubusercontent.com/56085499/86805841-2fdb6900-c070-11ea-9b3a-d8fd2656c68c.png)

![image](https://user-images.githubusercontent.com/56085499/86806040-631df800-c070-11ea-9e5d-6edd31c5d02f.png)

Note:
If any error during build/runtime error related to jsonpath comment below lines from pom.xml and try

```<!--<dependency>
			<groupId>com.jayway.jsonpath</groupId>
			<artifactId>json-path-assert</artifactId>
			<version>2.4.0</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>com.jayway.jsonpath</groupId>
			<artifactId>json-path</artifactId>
			<version>2.4.0</version>
			<scope>test</scope>
		</dependency>-->```
