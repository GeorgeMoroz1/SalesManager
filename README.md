# Менеджер продаж

## Порядок действий:

* Создание публичного репозитория
* Создание локального репозитория:
    * $ git remote add https://github.com/GeorgeMoroz1/SalesManager.git
* Создание файла .gitignore
* Создание класса SalesManager, где используется цикл for и метод public int max():
```java
public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
```
* git commit -m "Сообщение"
* Добавление класса Main
* Добавление файла README.md
* git commit -m "Сообщение 2"
* Выкладываем готовый результат на GitHub!