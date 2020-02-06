# 配置中心


-----------------------------------

**目录格式**
``` properties
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
```

where application is injected as the spring.config.name in the SpringApplication (what is normally application in a regular Spring Boot app), 
profile is an active profile (or comma-separated list of properties), 
and label is an optional git label (defaults to master

也可以用本地文件指定配置文件路径

spring.profiles.active=native

``` properties
spring.cloud.config.server.native.searchLocations=file:///${user.home}/config-repo
```

	The default value of the searchLocations is identical to a local Spring Boot application (that is, [classpath:/, classpath:/config, file:./, file:./config]). This does not expose the application.properties from the server to all clients, because any property sources present in the server are removed before being sent to the client.