public class BlogPost {

  String authorName;
  String title;
  String content;
  String publicationDate;

  @Override
  public String toString() {
    return title + " titled by " + authorName + " posted at " + publicationDate + "\n\t" + content;
  }

  public BlogPost(String authorName, String title, String content, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.content = content;
    this.publicationDate = publicationDate;

  }

}
