Docker command to run database: 
docker run --name sklepdb -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres
Serwer FTP

docker run -d --name ftp -p 8001:21 -p 21000-21010:21000-21010 -e USERS="sklep|12345678|/home/sklep|10000" delfer/alpine-ftp-server
