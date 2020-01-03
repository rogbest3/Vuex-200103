<template>
			<div class="themoin-mypage">
				<!-- <div class="tab-container">
                    <div class="tab">
                        <a class="active" @click.prevent="admin_a">관리자 변경</a>
                        <a class="" @click.prevent="cusinfo_a">회원 정보</a>
						<a class="" @click.prevent="pwdchg_a">비밀번호 변경</a>
						<a class="" @click.prevent="authmgmt_a">인증관리</a>
						<a class="" @click.prevent="alarm_a">알림설정</a>
						<a class="" @click.prevent="refmgmt_a">추천인 관리</a>
                        <div class="spacer"></div>
                        <img src="https://img.themoin.com/public/img/img-man-s.svg">
                        <p>rogbest@naver.com</p>
                    </div>
                </div> -->
				<div class="themoin-mypage-profile"><br>
                    <h1>관리자</h1><br>
                    <p class="newmoin-text-text-button" style="text-align: center;">기입한 연락처로 송금 관련 알림이 발송됩니다. 중요한 안내를 받지 못하는 일이 없도록 정확히 입력해주세요.<br>회원정보는 개인정보처리방침에 따라 안전하게 보호되며, 회원님의 동의없이 공개되지 않습니다.<br>정보 수정을 원하시면 하단의 수정하기 버튼을 눌러주세요.<br></p><br>
                    <div class="content themoin-recipient-field-section">
                        <form action="/a/v1/member/update" method="post">
                            <div class="form-row col-2">
                                <div class="firstname">
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">이름 (First name)</label>
                                        <input class="fs-block" placeholder="Gildong" type="text" tabindex="0" value="" v-model="cname">
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                                <div class="lastname">
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">성 (Last name)</label>
                                        <input class="fs-block" placeholder="Hong" type="text" tabindex="0" value="">
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="moin-dropdown country">
                                    <label>국가</label>
                                    <a id="update-country" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                                        <span class="moin-dropdown-text">대한민국 (South Korea)</span>
                                        <img class="pull-right" src="https://img.themoin.com/public/img/ic-dropdown-p.png">
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a>대한민국 (South Korea)</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="form-row col-2">
                                <div class="zip">
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">우편번호</label>
                                        <input class="fs-block" placeholder="12345" type="text" tabindex="0" value="">
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                                <div class="postcode">
                                    <button class="btn-zipcode" tabindex="0" type="button">우편번호 검색</button>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="address">
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">주소</label>
                                        <input class="fs-block" placeholder="417, Yeongdong-daero, Gangnam-gu, Seoul, Korea" type="text" tabindex="0" value="">
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="subaddress">
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">상세주소</label>
                                        <input class="fs-block" placeholder="B2 Floor" type="text" tabindex="0" value="">
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                            </div>
                            <div class="form-row col-2">
                                <div class="phone1">
                                    <div class="moin-dropdown">
                                        <label>국가 번호 (Country Code)</label>
                                        <a id="phone1" class="dropdown-toggle">+82 (South Korea)
                                            <img class="pull-right" src="https://img.themoin.com/public/img/ic-dropdown-p.png">
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a>+1 (United States)</a></li><li><a>+1 (Canada)</a></li><li><a>+1242 (Bahamas)</a></li><li><a>+1246 (Barbados)</a></li><li><a>+1264 (Anguilla)</a></li><li><a>+1268 (Antigua and Barbuda)</a></li><li><a>+1284 (British Virgin Islands)</a></li><li><a>+1340 (United States Virgin Islands)</a></li><li><a>+1345 (Cayman Islands)</a></li><li><a>+1441 (Bermuda)</a></li><li><a>+1473 (Grenada)</a></li><li><a>+1649 (Turks and Caicos Islands)</a></li><li><a>+1664 (Montserrat)</a></li><li><a>+1670 (Northern Mariana Islands)</a></li><li><a>+1671 (Guam)</a></li><li><a>+1684 (American Samoa)</a></li><li><a>+1721 (Sint Maarten)</a></li><li><a>+1758 (Saint Lucia)</a></li><li><a>+1767 (Dominica)</a></li><li><a>+1784 (Saint Vincent and the Grenadines)</a></li><li><a>+1787 (Puerto Rico)</a></li><li><a>+1809 (Dominican Republic)</a></li><li><a>+1868 (Trinidad and Tobago)</a></li><li><a>+1869 (Saint Kitts and Nevis)</a></li><li><a>+1876 (Jamaica)</a></li><li><a>+20 (Egypt)</a></li><li><a>+211 (South Sudan)</a></li><li><a>+212 (Western Sahara)</a></li><li><a>+212 (Morocco)</a></li><li><a>+213 (Algeria)</a></li><li><a>+216 (Tunisia)</a></li><li><a>+218 (Libya)</a></li><li><a>+220 (Gambia)</a></li><li><a>+221 (Senegal)</a></li><li><a>+222 (Mauritania)</a></li><li><a>+223 (Mali)</a></li><li><a>+224 (Guinea)</a></li><li><a>+225 (Ivory Coast)</a></li><li><a>+226 (Burkina Faso)</a></li><li><a>+227 (Niger)</a></li><li><a>+228 (Togo)</a></li><li><a>+229 (Benin)</a></li><li><a>+230 (Mauritius)</a></li><li><a>+231 (Liberia)</a></li><li><a>+232 (Sierra Leone)</a></li><li><a>+233 (Ghana)</a></li><li><a>+234 (Nigeria)</a></li><li><a>+235 (Chad)</a></li><li><a>+236 (Central African Republic)</a></li><li><a>+237 (Cameroon)</a></li><li><a>+238 (Cape Verde)</a></li><li><a>+239 (São Tomé and Príncipe)</a></li><li><a>+240 (Equatorial Guinea)</a></li><li><a>+241 (Gabon)</a></li><li><a>+242 (Republic of the Congo)</a></li><li><a>+243 (DR Congo)</a></li><li><a>+244 (Angola)</a></li><li><a>+245 (Guinea-Bissau)</a></li><li><a>+246 (British Indian Ocean Territory)</a></li><li><a>+248 (Seychelles)</a></li><li><a>+249 (Sudan)</a></li><li><a>+250 (Rwanda)</a></li><li><a>+251 (Ethiopia)</a></li><li><a>+252 (Somalia)</a></li><li><a>+253 (Djibouti)</a></li><li><a>+254 (Kenya)</a></li><li><a>+255 (Tanzania)</a></li><li><a>+256 (Uganda)</a></li><li><a>+257 (Burundi)</a></li><li><a>+258 (Mozambique)</a></li><li><a>+260 (Zambia)</a></li><li><a>+261 (Madagascar)</a></li><li><a>+262 (Mayotte)</a></li><li><a>+262 (Réunion)</a></li><li><a>+263 (Zimbabwe)</a></li><li><a>+264 (Namibia)</a></li><li><a>+265 (Malawi)</a></li><li><a>+266 (Lesotho)</a></li><li><a>+267 (Botswana)</a></li><li><a>+268 (Swaziland)</a></li><li><a>+269 (Comoros)</a></li><li><a>+27 (South Africa)</a></li><li><a>+291 (Eritrea)</a></li><li><a>+297 (Aruba)</a></li><li><a>+298 (Faroe Islands)</a></li><li><a>+299 (Greenland)</a></li><li><a>+30 (Greece)</a></li><li><a>+31 (Netherlands)</a></li><li><a>+32 (Belgium)</a></li><li><a>+33 (France)</a></li><li><a>+34 (Spain)</a></li><li><a>+350 (Gibraltar)</a></li><li><a>+351 (Portugal)</a></li><li><a>+352 (Luxembourg)</a></li><li><a>+353 (Ireland)</a></li><li><a>+354 (Iceland)</a></li><li><a>+355 (Albania)</a></li><li><a>+356 (Malta)</a></li><li><a>+357 (Cyprus)</a></li><li><a>+358 (Åland Islands)</a></li><li><a>+358 (Finland)</a></li><li><a>+359 (Bulgaria)</a></li><li><a>+36 (Hungary)</a></li><li><a>+370 (Lithuania)</a></li><li><a>+371 (Latvia)</a></li><li><a>+372 (Estonia)</a></li><li><a>+373 (Moldova)</a></li><li><a>+374 (Armenia)</a></li><li><a>+375 (Belarus)</a></li><li><a>+376 (Andorra)</a></li><li><a>+377 (Monaco)</a></li><li><a>+378 (San Marino)</a></li><li><a>+380 (Ukraine)</a></li><li><a>+381 (Serbia)</a></li><li><a>+382 (Montenegro)</a></li><li><a>+383 (Kosovo)</a></li><li><a>+385 (Croatia)</a></li><li><a>+386 (Slovenia)</a></li><li><a>+387 (Bosnia and Herzegovina)</a></li><li><a>+389 (Macedonia)</a></li><li><a>+39 (Italy)</a></li><li><a>+3906698 (Vatican City)</a></li><li><a>+40 (Romania)</a></li><li><a>+41 (Switzerland)</a></li><li><a>+420 (Czechia)</a></li><li><a>+421 (Slovakia)</a></li><li><a>+423 (Liechtenstein)</a></li><li><a>+43 (Austria)</a></li><li><a>+44 (United Kingdom)</a></li><li><a>+44 (Guernsey)</a></li><li><a>+44 (Isle of Man)</a></li><li><a>+44 (Jersey)</a></li><li><a>+45 (Denmark)</a></li><li><a>+46 (Sweden)</a></li><li><a>+47 (Norway)</a></li><li><a>+4779 (Svalbard and Jan Mayen)</a></li><li><a>+48 (Poland)</a></li><li><a>+49 (Germany)</a></li><li><a>+500 (Falkland Islands)</a></li><li><a>+500 (South Georgia)</a></li><li><a>+501 (Belize)</a></li><li><a>+502 (Guatemala)</a></li><li><a>+503 (El Salvador)</a></li><li><a>+504 (Honduras)</a></li><li><a>+505 (Nicaragua)</a></li><li><a>+506 (Costa Rica)</a></li><li><a>+507 (Panama)</a></li><li><a>+508 (Saint Pierre and Miquelon)</a></li><li><a>+509 (Haiti)</a></li><li><a>+51 (Peru)</a></li><li><a>+52 (Mexico)</a></li><li><a>+53 (Cuba)</a></li><li><a>+54 (Argentina)</a></li><li><a>+55 (Brazil)</a></li><li><a>+56 (Chile)</a></li><li><a>+57 (Colombia)</a></li><li><a>+58 (Venezuela)</a></li><li><a>+590 (Saint Barthélemy)</a></li><li><a>+590 (Guadeloupe)</a></li><li><a>+590 (Saint Martin)</a></li><li><a>+591 (Bolivia)</a></li><li><a>+592 (Guyana)</a></li><li><a>+593 (Ecuador)</a></li><li><a>+594 (French Guiana)</a></li><li><a>+595 (Paraguay)</a></li><li><a>+596 (Martinique)</a></li><li><a>+597 (Suriname)</a></li><li><a>+598 (Uruguay)</a></li><li><a>+5999 (Curaçao)</a></li><li><a>+60 (Malaysia)</a></li><li><a>+61 (Australia)</a></li><li><a>+61 (Cocos (Keeling) Islands)</a></li><li><a>+61 (Christmas Island)</a></li><li><a>+62 (Indonesia)</a></li><li><a>+63 (Philippines)</a></li><li><a>+64 (New Zealand)</a></li><li><a>+64 (Pitcairn Islands)</a></li><li><a>+65 (Singapore)</a></li><li><a>+66 (Thailand)</a></li><li><a>+670 (Timor-Leste)</a></li><li><a>+672 (Norfolk Island)</a></li><li><a>+673 (Brunei)</a></li><li><a>+674 (Nauru)</a></li><li><a>+675 (Papua New Guinea)</a></li><li><a>+676 (Tonga)</a></li><li><a>+677 (Solomon Islands)</a></li><li><a>+678 (Vanuatu)</a></li><li><a>+679 (Fiji)</a></li><li><a>+680 (Palau)</a></li><li><a>+681 (Wallis and Futuna)</a></li><li><a>+682 (Cook Islands)</a></li><li><a>+683 (Niue)</a></li><li><a>+685 (Samoa)</a></li><li><a>+686 (Kiribati)</a></li><li><a>+687 (New Caledonia)</a></li><li><a>+688 (Tuvalu)</a></li><li><a>+689 (French Polynesia)</a></li><li><a>+690 (Tokelau)</a></li><li><a>+691 (Micronesia)</a></li><li><a>+692 (Marshall Islands)</a></li><li><a>+7 (Russia)</a></li><li><a>+76 (Kazakhstan)</a></li><li><a>+81 (Japan)</a></li><li><a>+82 (South Korea)</a></li><li><a>+84 (Vietnam)</a></li><li><a>+850 (North Korea)</a></li><li><a>+852 (Hong Kong)</a></li><li><a>+853 (Macau)</a></li><li><a>+855 (Cambodia)</a></li><li><a>+856 (Laos)</a></li><li><a>+86 (China)</a></li><li><a>+880 (Bangladesh)</a></li><li><a>+886 (Taiwan)</a></li><li><a>+90 (Turkey)</a></li><li><a>+91 (India)</a></li><li><a>+92 (Pakistan)</a></li><li><a>+93 (Afghanistan)</a></li><li><a>+94 (Sri Lanka)</a></li><li><a>+95 (Myanmar)</a></li><li><a>+960 (Maldives)</a></li><li><a>+961 (Lebanon)</a></li><li><a>+962 (Jordan)</a></li><li><a>+963 (Syria)</a></li><li><a>+964 (Iraq)</a></li><li><a>+965 (Kuwait)</a></li><li><a>+966 (Saudi Arabia)</a></li><li><a>+967 (Yemen)</a></li><li><a>+968 (Oman)</a></li><li><a>+970 (Palestine)</a></li><li><a>+971 (United Arab Emirates)</a></li><li><a>+972 (Israel)</a></li><li><a>+973 (Bahrain)</a></li><li><a>+974 (Qatar)</a></li><li><a>+975 (Bhutan)</a></li><li><a>+976 (Mongolia)</a></li><li><a>+977 (Nepal)</a></li><li><a>+98 (Iran)</a></li><li><a>+992 (Tajikistan)</a></li><li><a>+993 (Turkmenistan)</a></li><li><a>+994 (Azerbaijan)</a></li><li><a>+995 (Georgia)</a></li><li><a>+996 (Kyrgyzstan)</a></li><li><a>+998 (Uzbekistan)</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="themoin-composite-input  phone2">
                                    <div class="extra-controls">
                                        <button>번호변경</button>
                                    </div>
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">휴대전화 번호 (Mobile)</label>
                                        <input class="fs-block" placeholder="01012345678" type="text" tabindex="0" maxlength="11" value="" v-model="cphone">
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                            </div>
							<div class="form-row">
                                <div class="subaddress">
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">생년월일</label>
                                        <input class="fs-block" placeholder="" type="text" tabindex="0" value="" v-model="sdate">
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                            </div>
							<div class="form-row">
                                <div class="subaddress">
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">성별</label>
                                        <input class="fs-block" placeholder="" type="text" tabindex="0" value="" v-model="gender">
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                            </div>
							<div class="form-row">
                                <div class="subaddress">
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">학년</label>
                                        <input class="fs-block" placeholder="" type="text" tabindex="0" value="" v-model="hak">
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                            </div>
							<div class="form-row">
                                <div class="subaddress">
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">반</label>
                                        <input class="fs-block" placeholder="" type="text" tabindex="0" value="" v-model="ban">
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                            </div>
							<div class="form-row">
                                <div class="subaddress">
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">성적</label>
                                        <input class="fs-block" placeholder="" type="text" tabindex="0" v-model="score">
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="subaddress">
                                    <div class="moin-input">
                                        <label style="color: rgb(116, 127, 155);">role</label>
                                        <input type="radio" value="teacher" v-model="picked">
                                        <label for="teacher">teacher</label><br>
                                        <input type="radio" value="manager" v-model="picked">
                                        <label for="manager">manager</label>
                                        <input type="radio" value="student" v-model="picked">
                                        <label for="student">student</label><br>
                                    </div>
                                    <p class="moin-error"></p>
                                </div>
                            </div>
                            <div class="form-row"></div>
                        </form>
                        <div class="daum-container hidden">
                            <div class="daum-layer">
                                <img id="btnCloseLayer" src="https://i1.daumcdn.net/localimg/localimages/07/postcode/320/close.png" alt="닫기 버튼" style="cursor: pointer; position: absolute; z-index: 1;">
                            </div>
                        </div>
                    </div>
                    <div class="form-row submit-row">
                        <div class="cancel">
                            <button class="account-cancel-btn" type="button" tabindex="0" @click.prevent="cancle_btn">취소</button>
                        </div>
                        <div class="submit"><button class="account-send-btn" type="button" tabindex="0" @click.prevent="save_btn">저장</button>
                        </div>
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
			cemail : store.state.customer.cemail,
			cpwd : store.state.customer.cpwd,
			cname : store.state.customer.cname,
			cphone : store.state.customer.cphone,
			gender : store.state.customer.gender,
			hak : store.state.customer.hak,
			ban : store.state.customer.ban,
			score : store.state.customer.score,
            sdate : store.state.customer.sdate,
            role : store.state.customer.role,
            picked : ''
		}
	},
	methods : {
		logo_a(){
			this.$router.push('/')
		},
		save_btn(){
			store.state.customer.cemail = this.cemail
			store.state.customer.cpwd = this.cpwd
			store.state.customer.cname = this.cname
			store.state.customer.cphone = this.cphone 
			store.state.customer.gender = this.gender
			store.state.customer.hak = this.hak
			store.state.customer.ban = this.ban
			store.state.customer.score = this.score
            store.state.customer.sdate = this.sdate
            store.state.customer.role = this.role

			let url = `${this.context}/update`
			let data = store.state.customer
			let headers = {
				'authorization' : 'JWT fefege..',
				'Accept' : 'application/json',
				'content-Type' : 'application/json'
			}
			Axios
			.put(url, data, headers)
			.then(res=>{
				if(res.data.result === "SUCCESS"){
					alert('수정 성공')
					store.state.customer = res.data.customer
					alert(`cemail : ${store.state.customer.cemail}, cname : ${store.state.customer.cname}`)
					this.$router.push('/cusinfo')
				}else{
					alert(`수정 실패`)
					this.$router.push({path : '/cusinfo'})
				
				}	
			})
			.catch(()=>{
				alert('AXIOS 실패')
			})
		},
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
		cancle_btn(){
			this.$router.push('/cusinfo')
		}
	}
}
</script>

<style scoped>
</style>
