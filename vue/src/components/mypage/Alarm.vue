<template>
		<div class="themoin-mypage">
			<!-- <div class="tab-container">
				<div class="tab">
					<a class="" @click.prevent="cusinfo_a">회원 정보</a>
					<a class="" @click.prevent="pwdchg_a">비밀번호 변경</a>
					<a class="" @click.prevent="authmgmt_a">인증관리</a>
					<a class="active" @click.prevent="">알림설정</a>
					<a class="" @click.prevent="refmgmt_a">추천인 관리</a>
					<div class="spacer"></div>
					<img src="https://img.themoin.com/public/img/img-man-s.svg">
					<p>rogbest@naver.com</p>
				</div>
			</div> -->
			<div class="themoin-mypage-notification">
				<div class="content">
					<h1>알림 설정 안내</h1>
					<p>이벤트, 할인 소식 등 다양한 모인의 소식 및 알림을 받기 위한 설정을 할 수 있습니다.<br>송금 진행상황과 관련된 사항은 알림 동의 여부와 상관없이 발송됩니다.</p>
					<form action="/a/v1/member/update" method="post">
						<div class="form-row">
							<div>
								<div class="moin-input">
									<label style="color: rgb(116, 127, 155);">알림을 받을 이메일</label>
									<input disabled="" class="fs-block" type="text" tabindex="0" readonly="" value="rogbest@naver.com">
								</div>
								<p class="moin-error"></p>
							</div>
						</div>
						<div class="form-row">
							<div>
								<div class="moin-input">
									<label style="color: rgb(116, 127, 155);">알림을 받을 휴대전화번호</label>
									<input disabled="" class="fs-block" type="text" tabindex="0" readonly="" value="01042234683">
								</div>
								<p class="moin-error"></p>
							</div>
						</div>
						<div class="form-row">
							<div class="checkbox">
								<input type="checkbox">
								<span class="caption">위의 연락처로 이벤트, 할인 소식 등 다양한 모인의 소식 및 알림을 받겠습니다.</span>
							</div>
						</div>
						<div class="form-row submit-row">
							<div class="submit">
								<button class="account-send-btn" type="submit" tabindex="0">저장</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>

</template>

<script>

export default {
	methods : {	// cusinfo_a, pwdchg_a, authmgmt_a, alarm_a, refmgmt_a
		
		cusinfo_a(){
			this.$router.push('/cusinfo')
		},
		pwdchg_a(){
			this.$router.push('/pwdchg')
		},
		authmgmt_a(){
			this.$router.push('/authmgmt')
		},
		alarm_a(){
			this.$router.push('/alarm')
		},
		refmgmt_a(){
			this.$router.push('/refmgmt')
		}
	}
}
</script>

<style scoped>
</style>
