package ru.netology.domain;

public class User {
    private int ownerId;// ИД пользоователя разместившего пост
    private  int fromId;//идентификатор автора записи (от чьего имени опубликована запись).
    private String userImage;//фото пользователя
    private  String userUrl;// ссылка н астраницу пользователя
}
