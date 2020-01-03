<template>
	<div id="root">
		<div>
			<div class="themoin-login">
				<div>
					<div class="image-box">
						<img src="https://img.themoin.com/public/img/moin-logo.svg">
					</div>
				</div>
				<div>
					<div class="moin-login">
						<div class="newmoin-text-header">로그인</div>
						<form class="login" method="post" action="/a/v1/member/login" @submit.prevent="onSubmit(cemail, cpwd)">
							<div class="moin-input-group">
								<div class="moin-input">
									<label style="color: rgb(116, 127, 155);">이메일 (Email)</label>
									<input v-model="cemail" class="fs-block" placeholder="youremail@email.com" type="text" tabindex="0" value="">
								</div>
								<p class="moin-error"></p>
							</div>
							<div class="themoin-password-input moin-input-group password">
								<div class="moin-input">
									<label style="color: rgb(116, 127, 155);">비밀번호 (Password)</label>
									<input v-model="cpwd" class="fs-block" placeholder="비밀번호를 입력해주세요." type="password" tabindex="0" maxlength="20" value="">
								</div>
								<p class="moin-error"></p>
							</div>
							<button class="btn-submit" type="submit">로그인</button>
						</form>
						<p style="margin: 30px auto;">
							<a @click="pwd_rem">비밀번호를 잊어버리셨나요?</a>
						</p>
						<div class="divider"></div>
						<p class="or">or</p>
						<div class="buttons">
							<button @click="join2_btn">
								<img src="https://img.themoin.com/public/img/login-email.svg">
								<p class="newmoin-text-text-button">이메일로<br>시작하기</p>
							</button>
							<button>
								<img src="https://img.themoin.com/public/img/login-facebook-2.svg">
								<p class="newmoin-text-text-button">페이스북으로<br>시작하기</p>
							</button>
							<button>
								<img src="https://img.themoin.com/public/img/login-naver-2.svg">
								<p class="newmoin-text-text-button">네이버로<br>시작하기</p>
							</button>
						</div><br><br>
						<div>
							<KakaoLogin
								api-key="<api-key>"
								image="kakao_login_btn_large"
								:on-success=onSuccess
								:on-failure=onFailure
							/>
						</div>
					</div>
				</div>
			</div>
			<div style="display:none"></div>
			<div id="popup-root" v-show="is_show">
				<div class="moin-popup">
					<div class="themoin-reset-password-popup">
						<div class="new-content">
							<a class="moin-close" @click="pwd_rem">
								<img src="https://img.themoin.com/public/img/btn-close.png">
							</a>
							<h1>비밀번호 재설정</h1>
							<p>비밀번호를 변경하고자 하는 아이디를 입력해주세요.</p>
							<form action="/a/v1/member/password/reset/link" method="POST">
								<div class="moin-input-group">
									<div class="moin-input">
										<label style="color: rgb(116, 127, 155);">이메일 (Email)</label>
										<input class="fs-block" placeholder="youremail@email.com" type="text" tabindex="0" value="">
									</div>
									<p class="moin-error"></p>
								</div>
								<input class="popup-btn" type="submit" value="비밀번호 재설정 링크 보내기">
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</template>
<script>

import { mapMutations } from 'vuex'
import KakaoLogin from 'vue-kakao-login'
 
let onSuccess = (data) => {
  alert(data)
  alert("success")
}
let onFailure = (data) => {
  alert(data)
  alert("failure")
}
export default{
	components: {
		KakaoLogin
	},
	data(){
		return {
			is_show : false,
/* 			context : 'http://localhost:8080/',
			result : '',
			cemail : '',
			cpwd : '',
			customer : {} */
			ctx : this.$store.state.common.context,
			msg : ''
		}
	},
	methods : { // ... -> Spread 문법(Spread Syntax, ...)는 대상을 개별 요소로 분리한다. Spread 문법의 대상은 이터러블이어야 한다.
		...mapMutations([
			'increment' // this.increment()를 this.$store.commit('increment')에 매핑합니다.
		]),
		...mapMutations({
			add: 'increment' // this.add()를 this.$store.commit('increment')에 매핑합니다.
		}),
		onSubmit(cemail, cpwd){
			//this.$store.dispatch('login_btn')
			this.$store.dispatch('admin/login', {cemail:cemail, cpwd:cpwd, context: this.ctx})
			.then(()=> this.redirect())
			.catch(({message})=>this.msg = message)
		},
		redirect(){
			this.$router.push(`/main2`)
		},
		join2_btn(){
			this.$router.push('/join2')
		},
		pwd_rem(){
			this.is_show = !this.is_show
		},
		onSuccess,
		onFailure
	}
}
</script>
<style scoped>
</style>