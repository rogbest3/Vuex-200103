<template>
	<div id="root">
		<div>
			<div class="themoin-signup">
				<div>
					<div class="image-box">
						<img src="https://img.themoin.com/public/img/moin-logo.svg">
					</div>
				</div>
				<div>
					<div class="moin-login">
						<div class="newmoin-text-header">회원가입</div>
						<p class="signup-subtitle">아직 모인 회원이 아니신가요?</p><br>
						<div class="buttons">
							<button @click="join2_btn">
								<img src="https://img.themoin.com/public/img/login-email.svg">
								<p class="newmoin-text-text-button">이메일로<br>시작하기</p>
							</button>
							<button>
								<img src="https://img.themoin.com/public/img/login-facebook.svg">
								<p class="newmoin-text-text-button">페이스북으로<br>시작하기</p>
							</button>
							<button>
								<img src="https://img.themoin.com/public/img/login-naver.svg">
								<p class="newmoin-text-text-button">네이버로<br>시작하기</p>
							</button>
						</div><br>
						<div class="divider"></div>
						<p style="margin: 33px auto 0px;"><router-link to="/login">이미 회원이신가요?</router-link></p>
					</div><br><br><br>
				</div>
			</div>
			<div style="display:none"></div>
		</div>
	</div>
</template>
<script>
export default{
	methods : {
		join2_btn(){
			this.$router.push('/join2')
		}
	}
}
</script>
<style scoped>
</style>