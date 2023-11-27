# Springboot 3.1.* Basic Authentication backend with register/login flow, dockerication and swagger

### Project requires JDK21(GraalVM preffered)
#### to build project:
    ./gradlew clean build
#### (in case windows use gradlew.bat)

#### to build image:
    docker build -t basic-auth-example .

#### to run:
    docker compose up

#### Service is exposed on port 8080

#### Swagger is available under:
    http://localhost:8080/swagger-ui/index.html
