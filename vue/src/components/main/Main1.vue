<template>
			<div class="themoin-landing">
				<div class="intro">
					<img src="https://img.themoin.com/public/img/group-446.svg">
					<div>
						<div class="badge">&lt;송금한도 향상 기념 이벤트&gt;</div>
						<div class="newmoin-text-header">건당 300만원 → 550만원</div>
						<div class="newmoin-text-header">연간 3150만원 → 5500만원</div><br>
						<p class="newmoin-text-subtitle-grey">송금 한도 향상을 애타게 기다리셨던 분들, 더 많이 송금해보세요<br> 
						'상담하기' 누르면 쿠폰을 받아볼 수 있습니다</p>
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
									<div class="index-money-amount">4,196.92</div>
									<div class="index-money-unit">EUR</div>
								</div>
								<div id="rank-kb" class="index-money-bank">
									<div class="index-money-name">국민은행</div>
									<div class="index-money-bar">
										<div style="height: 100%; width: 50%;"></div>
									</div>
									<div class="index-money-amount">4,141.75</div>
									<div class="index-money-unit">EUR</div>
								</div>
								<div id="rank-hana" class="index-money-bank">
									<div class="index-money-name">하나은행</div>
									<div class="index-money-bar">
										<div style="height: 100%; width: 50%;"></div>
									</div>
									<div class="index-money-amount">4,141.75</div>
									<div class="index-money-unit">EUR</div>
								</div>
								<div id="rank-woori" class="index-money-bank">
									<div class="index-money-name">우리은행</div>
									<div class="index-money-bar">
										<div style="height: 100%; width: 50%;"></div>
									</div>
									<div class="index-money-amount">4,141.75</div>
									<div class="index-money-unit">EUR</div>
								</div>
								<div id="rank-shinhan" class="index-money-bank">
									<div class="index-money-name">신한은행</div>
									<div class="index-money-bar">
										<div style="height: 100%;"></div>
									</div>
									<div class="index-money-amount">3,809.81</div>
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
									<input class="receive-amount" type="text" tabindex="0" value="4,196.92">
								</div>
								<div class="unit-select receive" tabindex="0">
									<p>아일랜드</p>
									<h3>EUR</h3>
								</div>
							</div>
							<button type="submit" class="index-send-btn moin-body">송금하기</button>
						</div>
					</div>
				</div>
				<div style="display:none"></div>
			</div>

</template>
<script>
export default{

}
</script>
<style scoped>
</style>