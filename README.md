Требования:
- Java 21+
- Docker и Docker Compose

Инструкция по запуску
1. Клонирование проекта
git clone https://github.com/GeTS01/store.git

2. Переход в директорию проекта
cd store

3. Запуск базы данных
docker-compose up -d

4. Запуск приложения
./gradlew bootRun

5. Проверка работы
Swagger UI:
http://localhost:8081/swagger-ui/index.html
