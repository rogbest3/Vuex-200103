<template>
<div id="root">
	<div class="themoin-main">
		<div class="themoin-currency-component">
			<div>
				<div class="graph-lines">
					<div class="line-box">
						<div class="line color-moin" style="transform: translate3d(0px, -83px, 0px) rotateZ(4.391deg);"></div>
					</div>
					<div class="line-box">
						<div class="line color-moin" style="transform: translate3d(0px, -74.9787px, 0px) rotateZ(0.0739949deg);"></div>
					</div>
					<div class="line-box">
						<div class="line color-moin" style="transform: translate3d(0px, -74.8259px, 0px) rotateZ(-0.6882deg);"></div>
					</div>
					<div class="line-box">
						<div class="line color-moin" style="transform: translate3d(0px, -76.0596px, 0px) rotateZ(7.59461deg);"></div>
					</div>
					<div class="line-box">
						<div class="line color-moin" style="transform: translate3d(0px, -62.1449px, 0px) rotateZ(6.45984deg);"></div>
					</div>
					<div class="line-box">
						<div class="line color-moin" style="transform: translate3d(0px, -50.3258px, 0px) rotateZ(1.84079deg);"></div>
					</div>
					<div class="line-box">
						<div class="line color-moin" style="transform: translate3d(0px, -46.958px, 0px) rotateZ(3.88589deg);"></div>
					</div>
					<div class="line-box">
						<div class="line color-moin" style="transform: translate3d(0px, -39.8604px, 0px) rotateZ(11.4038deg);"></div>
					</div>
					<div class="line-box">
						<div class="line color-moin" style="transform: translate3d(0px, -18.8193px, 0px) rotateZ(8.62074deg);"></div>
					</div>
				</div>
				<div class="graph-dots">
					<div class="dot-box">
						<div class="dot color-moin" style="transform: translate3d(0px, -80px, 0px);"></div>
						<div class="date">12</div>
						<div class="currency-tooltip">
							<div class="moin">
								<div>모인 환율</div>
								<div>1322.52</div>
							</div>
						</div>
					</div>
					<div class="dot-box">
						<div class="dot color-moin" style="transform: translate3d(0px, -71.9787px, 0px);"></div>
						<div class="date">13</div>
						<div class="currency-tooltip">
							<div class="moin">
								<div>모인 환율</div>
								<div>1319.37</div>
							</div>
						</div>
					</div>
					<div class="dot-box">
						<div class="dot color-moin" style="transform: translate3d(0px, -71.8259px, 0px);"></div>
						<div class="date">14</div>
						<div class="currency-tooltip">
							<div class="moin">
								<div>모인 환율</div>
								<div>1319.31</div>
							</div>
						</div>
					</div>
					<div class="dot-box">
						<div class="dot color-moin" style="transform: translate3d(0px, -73.0596px, 0px);"></div>
						<div class="date">15</div>
						<div class="currency-tooltip">
							<div class="moin">
								<div>모인 환율</div>
								<div>1319.79</div>
							</div>
						</div>
					</div>
					<div class="dot-box">
						<div class="dot color-moin" style="transform: translate3d(0px, -59.1449px, 0px);"></div>
						<div class="date">16</div>
						<div class="currency-tooltip">
							<div class="moin">
								<div>모인 환율</div>
								<div>1314.31</div>
							</div>
						</div>
					</div>
					<div class="dot-box">
						<div class="dot color-moin" style="transform: translate3d(0px, -47.3258px, 0px);"></div>
						<div class="date">17</div>
						<div class="currency-tooltip">
							<div class="moin">
								<div>모인 환율</div>
								<div>1309.66</div>
							</div>
						</div>
					</div>
					<div class="dot-box">
						<div class="dot color-moin" style="transform: translate3d(0px, -43.958px, 0px);"></div>
						<div class="date">18</div>
						<div class="currency-tooltip">
							<div class="moin">
								<div>모인 환율</div>
								<div>1308.33</div>
							</div>
						</div>
					</div>
					<div class="dot-box">
						<div class="dot color-moin" style="transform: translate3d(0px, -36.8604px, 0px);"></div>
						<div class="date">19</div>
						<div class="currency-tooltip">
							<div class="moin">
								<div>모인 환율</div>
								<div>1305.54</div>
							</div>
						</div>
					</div>
					<div class="dot-box">
						<div class="dot color-moin" style="transform: translate3d(0px, -15.8193px, 0px);"></div>
						<div class="date">20</div>
						<div class="currency-tooltip">
							<div class="moin">
								<div>모인 환율</div>
								<div>1297.26</div>
							</div>
						</div>
					</div>
					<div class="dot-box">
						<div class="dot color-moin" style="transform: translate3d(0px, 0px, 0px);"></div>
						<div class="date">21</div>
						<div class="currency-tooltip">
							<div class="moin">
								<div>모인 환율</div>
								<div>1291.03</div>
							</div>
						</div>
					</div>
				</div>

				<div class="content">
					<div class="title">실시간 모인 환율</div>
					<div class="currency">1 EUR = 1291.03 KRW</div>
				</div>
				<div class="legend">
					<div class="moin-avg">
						<div></div> 
						모인 환율
					</div>
				</div>
			</div>
		</div>

		<div class="themoin-remit-component">
			<div id="moin-event-amount" class="moin-event-amount">
				<p class="color-deepgrey"></p>
			</div>
			<div class="moin-amount">
				<div class="money-graph">
					<h3 class="index-money-title">실제로 받는 금액</h3>
					<div class="index-money-rank">
						<div id="rank-moin" class="index-money-moin">
							<div class="index-money-name">모&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;인</div>
							<div class="index-money-bar">
								<div style="height: 100%; width: 100%;"></div>
							</div>
							<div class="index-money-amount">4,256.29</div>
							<div class="index-money-unit">EUR</div>
						</div>
						<div id="rank-kb" class="index-money-bank">
							<div class="index-money-name">국민은행</div>
							<div class="index-money-bar">
								<div style="height: 100%; width: 50%;"></div>
							</div>
							<div class="index-money-amount">4,200.35</div>
							<div class="index-money-unit">EUR</div>
						</div>
						<div id="rank-hana" class="index-money-bank">
							<div class="index-money-name">하나은행</div>
							<div class="index-money-bar">
								<div style="height: 100%; width: 50%;"></div>
							</div>
							<div class="index-money-amount">4,200.35</div>
							<div class="index-money-unit">EUR</div>
						</div>
						<div id="rank-woori" class="index-money-bank">
							<div class="index-money-name">우리은행</div>
							<div class="index-money-bar">
								<div style="height: 100%; width: 50%;"></div>
							</div>
							<div class="index-money-amount">4,200.35</div>
							<div class="index-money-unit">EUR</div>
						</div>
						<div id="rank-shinhan" class="index-money-bank">
							<div class="index-money-name">신한은행</div>
							<div class="index-money-bar">
								<div style="height: 100%;"></div>
							</div>
							<div class="index-money-amount">3,863.71</div>
							<div class="index-money-unit">EUR</div>
						</div>
						<div id="rank-moin-verify" class="index-money-moin-event">
							<div class="index-money-name">학생인증</div>
							<div class="index-money-bar">
								<div style="height: 100%;"></div>
							</div>
							<div class="index-money-amount">0</div>
							<div class="index-money-unit">EUR</div>
						</div>
						<div id="rank-moin-event" class="index-money-moin-event">
							<div class="index-money-name">모인할인</div>
							<div class="index-money-bar">
								<div style="height: 100%;"></div>
							</div>
							<div class="index-money-amount">0</div>
							<div class="index-money-unit">EUR</div>
						</div>
					</div>
				</div>
				<div class="form-calculator main">
					<div class="amount-row">
						<div class="">
							<p>내가 보내는 금액 (수수료 포함)</p>
							<input class="send-amount" type="text" tabindex="0" value="5,500,000">
						</div>
						<div class="unit-select disabled" tabindex="0">
							<p>대한민국</p>
							<h3>KRW</h3>
						</div>
					</div>
					<div class="amount-row">
						<div class="">
							<p>실제로 받는 금액 (직접입력 가능)</p>
							<input class="receive-amount" type="text" tabindex="0" value="4,256.29">
						</div>
						<div class="unit-select receive" tabindex="0">
							<p>아일랜드</p>
							<h3>EUR</h3>
						</div>
					</div>
					<button type="submit" class="index-send-btn moin-body" @click.prevent="test">송금하기</button>
				</div>
			</div>
		</div>

		<div class="user-remit-container">
			<div class="user-title">
				<h3>{{cname}} 내 입금 계좌</h3>
			</div>
			<div class="user-account">
				<p class="warning">
					<span class="warning fs-block">반드시 인증받으신 기업은행 23210816702025 계좌에서 내 입금 계좌로 이체 해 주세요.</span><br>내 입금 계좌 : 
					<span class="fs-block">광주은행 9427010261003 {{cname}}_모인</span>
				</p>
			</div>
			<div class="user-title">
				<h3>송금 내역</h3>
			</div>
			<div class="user-limit">
				<p>올해 누적 송금액 :<span> 0</span> 원</p>
				<p class="divider">&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;</p>
				<p>올해 잔여 한도 :<span class=""> 55,000,000</span> 원</p>
			</div>
			<div class="remits empty">
				<br><h3>아직 송금 내역이 없습니다.</h3>
				<button class="start">여기를 눌러 송금을 시작하세요.</button><br><br>
				<img src="https://img.themoin.com/public/img/icon-null-illust.svg"><br><br>
			</div>
		</div>
	</div>
</div>
</template>
<script>
import {store} from "../../store"
import Axios from 'axios'
export default{
	
	create(){	//	후크 메서드 - 자동 호출, getJSON 같은 것
	
	},
	data(){
		return{
			cname : store.state.customer.cname,
			context : 'http://localhost:8080/'
			
		}
	},
	methods : {
		logout(){
			store.state.customer.cemail = ''
			store.state.customer.cpwd = ''
			store.state.customer.cname = ''
			store.state.customer.cphone = ''
			store.state.customer.id = ''
			store.state.authCheck = false
			store.state.showSidebar = false
			alert(`loginedCemail : ${store.state.customer.cemail}, loginedCpwd : ${store.state.customer.cpwd}`)
			this.$router.push('/')
		},
		withdrawal(){	// 자바에 정보가 하나도 없기 때문에 정보를 전부 줘야함 -> POST 사용
			alert('회원탈퇴')
			
			Axios
			.delete(`${this.context}/withdrawal/${store.state.customer.cemail}`)
			.then(()=>{
				alert(`회원탈퇴 성공`)
			})
			.catch(()=>{
				alert('AXIOS 실패')
			})
			
		},
		test(){
			alert(`store.cemail : ${store.state.customer.cemail}`)
		}
		
	}

}
</script>

<style scoped data-styled="" data-styled-version="4.3.2">
</style>
