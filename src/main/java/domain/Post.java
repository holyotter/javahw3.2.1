package domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int date;
    private int postponedId;

    private String title;
    private String imageUrl;
    private String text;

    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;

    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private Geo geo;
    private Donut donut;
}
