<template>

    <div class="themoin-mypage">
        <!-- <div class="tab-container">
            <div class="tab">
                <a class="" @click.prevent="cusinfo_a">회원 정보</a>
                <a class="active" @click.prevent="">비밀번호 변경</a>
                <a class="" @click.prevent="authmgmt_a">인증관리</a>
                <a class="" @click.prevent="alarm_a">알림설정</a>
                <a class="" @click.prevent="refmgmt_a">추천인 관리</a>
                <div class="spacer"></div>
                <img src="https://img.themoin.com/public/img/img-man-s.svg">
                <p>rogbest@naver.com</p>
            </div>
        </div> -->
        <div class="themoin-mypage-password">
            <div class="content">
                <h1>비밀번호 변경 안내</h1>
                <p>다른 사이트에서 사용한 적이 없는 비밀번호나 이전에 사용한 적이 없는 비밀번호를 입력해주세요.<br>생일이나 전화번호, 연속된 숫자 등의 알기 쉬운 비밀번호도 피해주세요.</p>
                <form action="/a/v1/member/update" method="post">
                    <div class="form-row">
                        <div class="password">
                            <div class="moin-input">
                                <label style="color: rgb(116, 127, 155);">현재 비밀번호</label>
                                <!-- <input class="fs-block" placeholder="현재 비밀번호를 입력해주세요." type="password" tabindex="0" value="" v-model="cpwd"> -->
                                <input class="fs-block" placeholder="현재 비밀번호를 입력해주세요." type="text" tabindex="0" value="" v-model="cpwd">
                            </div>
                            <p class="moin-error"></p>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="password">
                            <div class="moin-input">
                                <label style="color: rgb(116, 127, 155);">새 비밀번호</label>
                                <input class="fs-block" placeholder="영문 숫자 조합 8~20자" type="password" tabindex="0" value="" v-model="newCpwd">
                            </div>
                            <p class="moin-error"></p>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="repassword">
                            <div class="moin-input">
                                <label style="color: rgb(116, 127, 155);">새 비밀번호 확인</label>
                                <input class="fs-block" placeholder="위 비밀번호와 동일하게 입력해주세요." type="password" tabindex="0" value="" v-model="newCpwdCheck">
                            </div>
                            <p class="moin-error"></p>
                        </div>
                    </div>
                    <div class="form-row submit-row">
                        <div class="submit">
                            <button class="account-send-btn" type="submit" tabindex="0" @click.prevent="cpwd_change_btn">확인</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>

</template>

<script>
import {store} from "../../store"
import Axios from 'axios'
export default {
  data(){
    return {
      context : 'http://localhost:8080/',
      cpwd : store.state.customer.cpwd,
      newCpwd : '',
      newCpwdCheck : ''
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
    },
    cpwd_change_btn(){
      
      if( this.newCpwd === this.newCpwdCheck){
        store.state.customer.cpwd = this.newCpwd
        alert(`비밀번호 일치 - ${store.state.customer.cpwd}`)
        let url = `${this.context}/update`
        let data = store.state.customer
        let headers ={
          'authrization' : 'JWT fefege..',
          'Accept' : 'application/json',
          'content-type' : 'application/json'
        }
        Axios
        .put(url, data, headers)
        .then(res=>{
          if(res.data.result === "SUCCESS"){
            store.state.customer.cpwd = res.data.customer.cpwd
            alert(`비밀번호 수정 성공 - ${store.state.customer.cpwd}`)
            this.$router.push('/cusinfo')
          }else{
            alert('비밀번호 수정  실패')
          }
          //
        })
        .catch(()=>{
          alert(`Axios 실패`)
        })
      }else{
        alert(`비밀번호 불일치`)
      }
    }
	}
}
</script>

<style scoped>
</style>
