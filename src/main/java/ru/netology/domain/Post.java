package ru.netology.domain;

public class Post {
    private String text; // текст поста
    private int replyOwnerId; // идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private String postType;// тип поста (фото, видео, gif)
    private int postID; //ИД поста
    private String coordinates;// локация
    private int likes; // количество лайков
    private int viewsCount; // количество просмотров
    private int signerId;// идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
}
