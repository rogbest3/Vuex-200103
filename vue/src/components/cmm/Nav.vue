<template>
	<nav class="themoin-header">
		<div>
			<a class="logo"><img src="https://img.themoin.com/public/img/img-new-moin-logo.svg"></a>
			<div class="spacer"></div>
			<a class="menu">
				<div class="line1"></div>
				<div class="line2"></div>
			</a>
			<ul class="">
				<li><a @click.prevent="mgmt_a">내 계정 관리</a></li>
				<li><a @click.prevent="logout">로그아웃</a></li>
				<li><a @click.prevent="withdrawal">회원탈퇴</a></li>
				<li class="mobile">
					<div class="themoin-language-dropdown" tabindex="0">
						<img class="ic-flag" src="https://img.themoin.com/public/img/ic-flag-ko.svg">
						<a> <!-- -->한국어<!-- --> </a>
						<img class="btn-open-list-blue" src="https://img.themoin.com/public/img/btn-open-list-blue.svg">
						<ul>
							<li>
								<div class="spacer"></div>
								<a><img src="https://img.themoin.com/public/img/ic-flag-ko.svg">한국어</a>
							</li>
							<li>
								<div class="spacer"></div>
								<a><img src="https://img.themoin.com/public/img/ic-flag-en.svg">English</a>
							</li>
						</ul>
					</div>
				</li>
			</ul>
			<div class="language">
				<div class="themoin-language-dropdown" tabindex="0">
					<img class="ic-flag" src="https://img.themoin.com/public/img/ic-flag-ko.svg">
					<a> <!-- -->한국어<!-- --> </a>
					<img class="btn-open-list-blue" src="https://img.themoin.com/public/img/btn-open-list-blue.svg">
					<ul>
						<li>
							<div class="spacer"></div>
							<a><img src="https://img.themoin.com/public/img/ic-flag-ko.svg">한국어</a>
						</li>
						<li>
							<div class="spacer"></div>
							<a><img src="https://img.themoin.com/public/img/ic-flag-en.svg">English</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="notification">
				<button>
					<img src="https://img.themoin.com/public/img/noticenter-icon.svg">
					<span class="">0</span>
				</button>
			</div>
		</div>
	</nav>
</template>
<script>
import Axios from 'axios'
import {store} from "../../store"
export default{
	data(){
		return {
			cname : store.state.customer.cname,
			context : 'http://localhost:8080/',
			role: store.state.customer.role
		}
	},
	methods : {
		mgmt_a(){
			store.state.admin.showSidebar = true
			this.$router.push('/cusinfo')
		},
		logout(){
			store.state.customer.cemail = ''
			store.state.customer.cpwd = ''
			store.state.customer.cname = ''
			store.state.customer.cphone = ''
			store.state.customer.id = ''
			store.state.admin.authCheck = false
			store.state.admin.showSidebar = false
			alert(`loginedCemail : ${store.state.customer.cemail}, loginedCpwd : ${store.state.customer.cpwd}`)
			this.$router.push('/')
		},
		withdrawal(){	// 자바에 정보가 하나도 없기 때문에 정보를 전부 줘야함 -> POST 사용
			alert('회원탈퇴')
			
			Axios
			.delete(`${this.context}/withdrawal/${store.state.customer.cemail}`)
			.then(()=>{
				alert(`회원탈퇴 성공`)
				store.state.authCheck = false
				this.$router.push('/')
			})
			.catch(()=>{
				alert('AXIOS 실패')
			})
			
		}
	}
}
</script>
<style scoped>

</style>