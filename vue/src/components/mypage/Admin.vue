<template>
			<div class="themoin-mypage">
				<!-- <div class="tab-container">
					<div class="tab">
						<a class="active" @click.prevent="admin_a">관리자 변경</a>
						<a class="" @click.prevent="cusinfo_a">회원 정보</a>
						<a class="" @click.prevent="pwdchg_a">비밀번호 변경</a>
						<a class="" @click.prevent="authmgmt_a">인증관리</a>
						<a class="" @click.prevent="alarm_a">알림설정</a>
						<a class="" @click.prevent="refmgmt_a">추천인 관리</a>
						<div class="spacer"></div>
						<img src="https://img.themoin.com/public/img/img-man-s.svg">
						<p>rogbest@naver.com</p>
					</div>
				</div> -->
				<div class="themoin-mypage-profile"><br>
					<h1>관리자</h1><br>
					<p class="newmoin-text-text-button" style="text-align: center;">기입한 연락처로 송금 관련 알림이 발송됩니다. 중요한 안내를 받지 못하는 일이 없도록 정확히 입력해주세요.<br>회원정보는 개인정보처리방침에 따라 안전하게 보호되며, 회원님의 동의없이 공개되지 않습니다.<br>정보 수정을 원하시면 하단의 수정하기 버튼을 눌러주세요.<br></p><br>
					<div class="themoin-info-preview">
						<div class="head">로그인 정보</div>
						<ol>
							<li>
								<p>ID</p>
								<p class="fs-block">{{cemail}}</p>
							</li>
						</ol>
						<div class="head">관리자</div>
						<ol>
							<li>
								<p>이름</p>
								<p class="fs-block">{{cname}}</p>
							</li>
							<li>
								<p>국가</p>
								<p class="fs-block">+82 (South Korea)</p>
							</li>
							<li>
								<p>우편번호</p>
								<p class="fs-block"></p>
							</li>
							<li>
								<p>집주소</p>
								<p class="fs-block"></p>
							</li>
							<li>
								<p>상세주소</p>
								<p class="fs-block"></p>
							</li>
							<li>
								<p>생년월일</p>
								<p class="fs-block">{{sdate}}</p>
								<!-- <p class="fs-block">{{sdate.substring(0, 10)}}</p> -->
							</li>
							<li>
								<p>휴대전화</p>
								<p class="fs-block">{{cphone}}</p>
							</li>
							<li>
								<p>성별</p>
								<p class="fs-block">{{gender}}</p>
							</li>
							<li>
								<p>학년</p>
								<p class="fs-block">{{hak}}</p>
							</li>
							<li>
								<p>학번</p>
								<p class="fs-block">{{ban}}</p>
							</li>
							<li>
								<p>성적</p>
								<p class="fs-block">{{score}}</p>
							</li>
							<li>
								<p>role</p>
								<p class="fs-block">{{role}}</p>
							</li>
						</ol>
					</div><br>
					<button @click.prevent="adminChg_btn" class="next">정보수정하기</button><br><br>
				</div>
			</div>
</template>

<script>
import {store} from "../../store"
export default {
	data(){
		return {
			cemail : store.state.customer.cemail,
			cpwd : store.state.customer.cpwd,
			cname : store.state.customer.cname,
			cphone : store.state.customer.cphone,
			gender : store.state.customer.gender,
			hak : store.state.customer.hak,
			ban : store.state.customer.ban,
			score : store.state.customer.score,
			sdate : store.state.customer.sdate,
			role : store.state.customer.role
		}
	},
	methods : {	// cusinfo_a, pwdchg_a, authmgmt_a, alarm_a, refmgmt_a

		adminChg_btn(){
			this.$router.push('/adminchg')
		}
	}
}
</script>

<style scoped>
</style>
