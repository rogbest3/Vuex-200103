<template>
	<div class="themoin-mypage">
		<div class="tab-container">
			<div class="tab">
				<a class="active" @click.prevent="cusinfo_a">회원 정보</a>
				<a class="" @click.prevent="pwdchg_a">비밀번호 변경</a>
				<a class="" @click.prevent="authmgmt_a">인증관리</a>
				<a class="" @click.prevent="alarm_a">알림설정</a>
				<a class="" @click.prevent="refmgmt_a">추천인 관리</a>
				<div class="spacer"></div>
				<img src="https://img.themoin.com/public/img/img-man-s.svg">
				<p>rogbest@naver.com</p>
			</div>
		</div>
	</div>
</template>
<script>
export default {
	data(){
		return {
			active : ''
		}
	},
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
<style scoped></style>