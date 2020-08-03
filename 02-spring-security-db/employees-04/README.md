# MySQL adatbázis elõkészítése 

```
docker run -d -e MYSQL_DATABASE=employees -e MYSQL_USER=employees -e MYSQL_PASSWORD=employees -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -p 3306:3306 --name employees-mysql mysql
```