###  WorldTimeApi is deprecated, TimeApi is used insted

### Post endpoint
```
curl --request POST \
--url http://localhost:8080/addUser \
--header 'Content-Type: application/json' \
--data '{
"firstName": "Daniel",
"lastName": "Craig",
"membershipId": 1234
}'
```

### Get endpoint

```
curl --request GET \
--url http://localhost:8080/getuser/Daniel
```

### Delete endpoint
```
curl --request DELETE \
--url http://localhost:8080/deleteUser/Daniel
```

### Docker and MySql commands
```
docker run -e MYSQL_ROOT_PASSWORD=test -e MYSQL_DATABASE=test -p 3306:3306 --name mysql -d mysql:latest
docker exec -it mysql bash

mysql -u root -p

CREATE DATABASE test;
USE test;
DESCRIBE user_entity;
SHOW TABLES;

SELECT * FROM user_entity;

docker kill mysql && docker rm mysql
```

### MySql table
```
CREATE TABLE user_entity(
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NOT NULL,
membership_id INTEGER,
creation_time VARCHAR(100) NOT NULL
);
```
---

