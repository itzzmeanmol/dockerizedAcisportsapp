# dockerizedAcisportsapp



#Creating image of mysql
docker run --name news -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=aci -e MYSQL_USER=sa -e MYSQL_PASSWORD=password --publish 4003:3306 -d mysql:latest

#Creating image for spring
docker build -t <imagename> .

#Connecting container of spring and mysql
docker run -p 8087:8087 --link testsql -e spring_datasource_url=jdbc:mysql://testsql/aciworldwidedb?useSSL=false -e spring_datasource_username=root -e spring_datasource_password=Welcome123 -e spring.jpa.hibernate.ddl-auto=none springweb8 .


#Creating image of angular
docker build -t <imagename> .


#Connecting container of angular with spring
docker run --name <containername>-d -p <CrossOriginPort>:80 <AngularImageName>
