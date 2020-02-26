# dockerizedAcisportsapp

#Creating image of mysql

docker run --name (container-name) -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=(Database-name) -e MYSQL_USER=(user-name) -e MYSQL_PASSWORD=(user-password) --publish 4003:3306 -d mysql:latest

#Creating image for spring

docker build -t (imagename) .

#Connecting container of spring and mysql

docker run -p 8087:8087 --link (mysql-container-name) -e spring_datasource_url=jdbc:mysql://(mysql-container-name)/(mysql-database-name)?useSSL=false -e spring_datasource_username=root -e spring_datasource_password=Welcome123 -e spring.jpa.hibernate.ddl-auto=none (spring-image-name) .


-------if you are getting public key retrival error, do following----------

docker run -p 8087:8087 --link (mysql-container-name) -e spring_datasource_url=jdbc:mysql://(mysql-container-name)/(mysql-database-name)?allowPublicKeyRetrieval=true -e spring_datasource_username=root -e spring_datasource_password=Welcome123 -e spring.jpa.hibernate.ddl-auto=none (spring-image-name) .




#Creating image of angular

docker build -t (imagename) .


#Connecting container of angular with spring

docker run --name (containername) -d -p (CrossOriginPort-generally:4200):80 (AngularImage-name)





#To go in mysql running container
docker exec -ti (ContainerID) bash
and then...
mysql -u(username) -p(password)

 
