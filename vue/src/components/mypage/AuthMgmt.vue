<template>
          <div class="themoin-mypage">
              <!-- <div class="tab-container">
                  <div class="tab">
                      <a class="" @click.prevent="cusinfo_a">회원 정보</a>
                      <a class="" @click.prevent="pwdchg_a">비밀번호 변경</a>
                      <a class="active" @click.prevent="">인증관리</a>
                      <a class="" @click.prevent="alarm_a">알림설정</a>
                      <a class="" @click.prevent="refmgmt_a">추천인 관리</a>
                      <div class="spacer"></div>
                      <img src="https://img.themoin.com/public/img/img-man-s.svg">
                      <p>rogbest@naver.com</p>
                  </div>
              </div> -->
              <div><br>
                  <h1>인증관리</h1><br>
                  <div class="themoin-info-preview">
                      <div class="head">신분증 관리</div>
                      <ol>
                          <li>
                              <p>분류</p>
                              <p class="fs-block">한국인/개인사업자</p>
                          </li>
                          <li>
                              <p>인증상태</p>
                              <p class="fs-block">인증완료</p>
                          </li>
                          <li class="control">
                              <button disabled="">인증됨</button>
                          </li>
                      </ol>
                      <div class="head">계좌인증관리</div>
                      <ol>
                          <li class="sub-title">자동출금 인증</li>
                          <li>
                              <p>계좌번호</p>
                              <p class="fs-block">자동출금 인증을 해주세요.</p>
                          </li>
                          <li>
                              <p>인증상태</p>
                              <p class="fs-block"></p>
                          </li>
                          <li class="control">
                              <button>인증하기</button>
                          </li>
                          <li class="sub-title">계좌이체 인증</li>
                          <li>
                              <p>계좌번호</p>
                              <p class="fs-block">기업은행 23210816702025</p>
                          </li>
                          <li>
                              <p>인증상태</p>
                              <p class="fs-block">인증완료</p>
                          </li>
                          <li class="control">
                              <button disabled="">인증됨</button>
                          </li>
                      </ol>
                      <div class="head">발급된 가상계좌</div>
                      <ol>
                          <li>
                              <p>계좌번호</p>
                              <p class="fs-block">광주은행 9427010261003 김민국_모인</p>
                          </li>
                          <li class="control">
                              <button class="text">가상계좌복사하기</button>
                          </li>
                      </ol>
                  </div>
                  <p class="warning">계좌이체는 계좌변경이 불가능 합니다. 인증계좌 변경 희망시 홈페이지 1:1문의하기로 연락주세요.</p><br><br>
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
