# usefultricks приложение с примерами

## Что необходимо для запуска:
1. Установить плагин Lombok для вашей IDE
2. Создать новую базу данных "usfl" в PostgreSQL (настройки в resources/application.yml)

### Liquibase 
Содержит примеры работы с системой миграций Liquibase:
- способ подключения и настройки
  - обычное подключение по умолчанию с помощью application.yml
  - подключение с помощью SpringLiquibase, такая миграция будет выполняться уже после миграции по умолчанию
- создание файлов-миграции
- заполнение таблицы двоичными данными

Данный пример был основан на проекте печатных форм. 
Для начала создается таблица с мета-данными, туда записываются файлы, необхоимые для работы
с печатными формами. Далее создаются остальные таблицы и заполняются файлами из первой таблицы.

### Feign-client
С помощью декларативного HTTP-клиента Feign-client можно генерировать API запросы и мапить ответ 
на Java классы. Это позволяет эмулирую работу какого-либо сервиса или просто создавать заглушки.
Данный репозиторий содержит примеры работы с Feign-client:
- настройка и подключение клиента
- пример работы (от самого создания клиента до использования его в сервисе) 
[Ссылка](https://github.com/DmitryGontarenko/usefultricks/tree/master/src/main/java/com/accenture/usefultricks/feign)
