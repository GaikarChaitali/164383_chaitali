package StreamAssignment;

public class News {
	int newsId;
	String postedByUser,commentByUser,comment;

	public News( int newsId, String postedByUser, String commentByUser, String comment) {
		this.comment=comment;
		this.newsId=newsId;
		this.commentByUser=commentByUser;
		this.postedByUser=postedByUser;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser
				+ ", commentByUser=" + commentByUser + ", comment=" + comment
				+ "]";
	}

}
