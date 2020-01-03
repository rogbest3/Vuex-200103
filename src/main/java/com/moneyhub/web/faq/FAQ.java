package com.moneyhub.web.faq;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.moneyhub.web.cus.Customer;
import com.moneyhub.web.pxy.Proxy;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter(AccessLevel.PROTECTED)
@ToString
@Table(name="FAQ")

public class FAQ extends Proxy implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="FAQID") @NotNull
	private Long faqid;
	@Column(name="CEMAIL") @NotNull
	private String cemail;
	@Column(name="COMMENTS") @NotNull
	private String comments;
	@Column(name="IMAGE")
	private String image;
//	@Column(name="MSG")
//	private String msg;
	@Column(name="RATING")
	private String rating;
	@Column(name="BOARDTYPE") @NotNull
	private String boardType;
	@Column(name="TITLE") @NotNull
	private String title;
	@Column(name="CONTENT")
	private String content;
	@Temporal(TemporalType.DATE)
	@Column(name="REGDATE") @NotNull
	private Date regdate;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerid")
    private Customer customerid;
	
	@Builder
	private FAQ(String image, String cemail, String comments, String rating,
				String boardType, String title, String content, Date regdate) {
		
		Assert.hasText(cemail, "cemail must not be empty");
	    Assert.hasText(comments, "comments must not be empty");
	    Assert.hasText(image, "image must not be empty");
	    Assert.hasText(rating, "rating must not be empty");
	    Assert.hasText(boardType, "boardType must not be empty");
	    Assert.hasText(title, "title must not be empty");
	    Assert.hasText(content, "content must not be empty");
	    Assert.hasText(string(regdate), "regdate must not be empty");

	    
		this.image = image;
		this.cemail = cemail;
		this.comments = comments;
		this.rating = rating;
		this.boardType = boardType;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
	}
	
	
	
	
	
}
