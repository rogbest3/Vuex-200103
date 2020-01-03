<template>

		<div class="themoin-mypage">
			<!-- <div class="tab-container">
				<div class="tab">
					<a class="" @click.prevent="cusinfo_a">회원 정보</a>
					<a class="" @click.prevent="pwdchg_a">비밀번호 변경</a>
					<a class="" @click.prevent="authmgmt_a">인증관리</a>
					<a class="" @click.prevent="alarm_a">알림설정</a>
					<a class="active" @click.prevent="">추천인 관리</a>
					<div class="spacer"></div>
					<img src="https://img.themoin.com/public/img/img-man-s.svg">
					<p>rogbest@naver.com</p>
				</div>
			</div> -->
			<div class="themoin-mypage-refer">
				<div class="content">
					<h1>나의 추천인 코드</h1>
					<p>1. 친구에게 추천코드를 알려준다.(무제한으로 가능)<br>2. 친구가 가입시 추천코드를 넣고 첫 송금 완료시, 수수료 감면 쿠폰을 받는다.</p><br><br>
					<p class="fs-block">FNO9W</p>
					<input type="text" value="FNO9W" style="opacity: 0; height: 0px;">
					<form>
						<div class="form-row submit-row">
							<div class="submit" style="margin-top: 0px;">
								<button class="account-send-btn" type="submit" tabindex="0">추천인 코드 복사하기</button>
							</div>
						</div>
						<br>
						<p style="padding: 0px 10px;">- 모인을 사용해 본 이력이 없는 사용자만 추천코드를 등록할 수 있습니다.<br>- 본인이 본인을 추천한 경우 리워드로 지급된 쿠폰 사용이 불가합니다.<br>- 친구 추천 이벤트는 사전에 통지 없이 변경 또는 중지 될 수 있습니다.</p>
					</form>
					<div class="horizontal-divider"></div>
					<h1>추천인 등록</h1>
					<p>추천인 코드를 등록해 모인 해외송금 시 수수료 혜택을 받아보세요!<br>첫 송금 완료시 수수료 감면 쿠폰이 발급되며, 추천인에게는 감사쿠폰이 발급됩니다.<br>추천인 코드는 첫 송금전 단, 1회 등록할 수 있습니다. </p>
					<form action="/a/v1/member/update" method="post">
						<div class="form-row">
							<div class="code">
								<div class="moin-input">
									<label style="color: rgb(116, 127, 155);">추천인 코드</label>
									<input class="fs-block" placeholder="영문 숫자 조합 5자" type="text" tabindex="0" maxlength="5" value="">
								</div>
								<p class="moin-error"></p>
							</div>
						</div>
						<div class="form-row submit-row">
							<div class="submit">
								<button class="account-send-btn" type="submit" tabindex="0">확인</button>
							</div>
						</div>
						<br>
						<p style="padding: 0px 10px;">- 모인을 사용해 본 이력이 없는 사용자를 추천할 경우에만 리워드가 지급됩니다.<br>- 제휴업체 추천코드와 추천인 코드 중복 사용은 불가능합니다.<br>- 본인이 본인을 추천한 경우 리워드로 지급된 쿠폰사용이 불가합니다.<br>- 친구 추천 이벤트는 사전에 통지 없이 변경 또는 중지 될 수 있습니다.</p>
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
