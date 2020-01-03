package com.moneyhub.web.cus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.moneyhub.web.faq.FAQ;
import com.moneyhub.web.pxy.Proxy;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AccessLevel;

@Component
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter(AccessLevel.PROTECTED)
@ToString
@Table(name="CUSTOMER", 
		uniqueConstraints={
		@UniqueConstraint(
				columnNames={"CEMAIL"}	//	CEMAIL 유니크
			)
		})
//	private String cno,
//	cemail,
//	cpwd,
//	cname,
//	cntcd,		// 고객 국가 코드
//	cphone,
//	cstcd,		// 고객상태코드
//	sdate,		// 가입일
//	wdate,		// 탈퇴일
//	udate;		// 수정일

	/*	private String 
	  CNO, CEMAIL, CPWD, CNAME, CNTCD, 
	  CPHONE, CSTCD, SDATE, WDATE, UDATE;		*/
	
public class Customer extends Proxy implements Serializable{	
	
	// @Data에 Serializable 생략한 것, @Data 사용하지 않기 때문에 사용, 통신 시  
	private static final long serialVersionUID = 1L;
	@Id		
	@GeneratedValue(strategy = GenerationType.AUTO) // 전략 패턴, 전략 패턴에 사용되는 값이 ID, 제네릭 사용 자동
	@Column(name="CUSTOMERID")  @NotNull
	private Long customerid;
	@Column(name="CEMAIL") @NotNull
	private String cemail;
	@Column(name="CPWD") @NotNull
	private String cpwd;
	@Column(name="CNAME") @NotNull
	private String cname;
	@Column(name="CNTCD")
	private String cntcd;
	@Column(name="CPHONE") @NotNull
	private String cphone;
	@Column(name="CSTCD") 
	private String cstcd;
	@Temporal(TemporalType.DATE)
	@Column(name="SDATE") @NotNull
	private Date sdate;
	@Column(name="WDATE")
	private String wdate;
	@Column(name="UDATE") 
	private String udate;
	
	@Column(name="MALE") @NotNull
	private boolean male;
	@Column(name="HAK") @NotNull
	private int hak;
	@Column(name="BAN") @NotNull
	private int ban;
	@Column(name="SCORE") @NotNull
	private int score;
	@Column(name="ROLE") @NotNull
	private String role;

	enum Level{ HIGH, MID, LOW }
	
	 @OneToMany(mappedBy = "customerid",
			 cascade = CascadeType.ALL, 
			 orphanRemoval = true)
	 private List<FAQ> faqs = new ArrayList<>();
	 
	// allargs임 
	@Builder // class에 @Builder를 사용하면 전부 걸리기 때문에 필요한 것만 사용
	private Customer(String cemail, String cpwd, String cname, String cphone,
					String cstcd, Date sdate, String wdate, String udate, 
					boolean male, int hak, int ban, int score, String role) {	
		
		Assert.hasText(cemail, "bankName must not be empty");
	    Assert.hasText(cpwd, "accountNumber must not be empty");
	    Assert.hasText(cname, "accountHolder must not be empty");
	    Assert.hasText(cphone, "accountHolder must not be empty");
	    Assert.hasText(cstcd, "accountHolder must not be empty");
	    Assert.hasText(string(sdate), "accountHolder must not be empty");
	    Assert.hasText(wdate, "accountHolder must not be empty");
	    Assert.hasText(udate, "accountHolder must not be empty");
	    Assert.hasText(string(male), "accountHolder must not be empty");
	    Assert.hasText(string(hak), "accountHolder must not be empty");
	    Assert.hasText(string(ban), "accountHolder must not be empty");
	    Assert.hasText(string(score), "accountHolder must not be empty");
	    Assert.hasText(role, "accountHolder must not be empty");

		this.cemail = cemail;
		this.cpwd = cpwd;
		this.cname = cname;
		this.cphone = cphone;
		this.cstcd = cstcd;
		this.sdate = sdate;
		this.wdate = wdate;
		this.udate = udate;
		this.male = male;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
		this.role = role;
		
	} 
}

