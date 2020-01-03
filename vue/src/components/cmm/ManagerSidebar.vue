<template>
	<div class="themoin-mypage">
		<div class="tab-container">
			<div class="tab">
				<!-- <a v-for="i of list" :key="i."></a> -->
				<a class="active" @click.prevent="admin_a">관리자 변경</a>
				<a class="" @click.prevent="pwdchg_a">비밀번호 변경</a>
				<a class="" @click.prevent="studentList_a">학생 목록</a>
				<a class="" @click.prevent="studentsFindSome_a">조건별 학생 검색</a>
				<a class="" @click.prevent="scoreEdit_a">학생 성적 수정</a>
				<a class="" @click.prevent="idSearch_a">ID 학생 검색</a>
				
				<div class="spacer"></div>
				<img src="https://img.themoin.com/public/img/img-man-s.svg">
				<p>{{cemail}}</p>
			</div>
		</div>
	</div>
</template>
<script>
import {store} from "../../store"
export default {
	data(){
		return {
			active : '',
			cemail : store.state.customer.cemail,
/*			sidebar : [ { isShow : false, aclick : 'admin_a', text : '관리자 변경' },
				{ isShow : false, aclick : 'admin_a', text : '비밀번호 변경' },
				{ isShow : false, aclick : 'admin_a', text : '학생 목록' },
				{ isShow : false, aclick : 'admin_a', text : '관리자 변경' },
				{ isShow : false, aclick : 'admin_a', text : '관리자 변경' } ] */
		}
	},
	methods : {	// cusinfo_a, pwdchg_a, authmgmt_a, alarm_a, refmgmt_a
		admin_a(){
			this.$router.push('/admin')	
		},
		pwdchg_a(){
			this.$router.push('/pwdchg')
		},
		studentList_a(){
			this.$router.push('/studentlist')
		},
		studentsFindSome_a(){
			this.$router.push('/studentsFindSome')
		},
		banList_a(){
			this.$router.push('/banlist')
		}, 
		idSearch_a(){
			this.$router.push('')
		}
	}
}
</script>
<style scoped></style>