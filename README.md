# Тестовое задание Docker + Spring Boot
#### Создание сети для контейнеров
```bash
$ docker network create my-net
```
#### Создание контейнера для БД
```bash
$ docker run -d --name postgres-container --net=my-net -e POSTGRES_PASSWORD=12345 -e POSTGRES_DB=netcrackers postgres:latest
```
#### Создание контейнера для приложения
```bash
$ docker run -it --net=my-net springdocker
```
