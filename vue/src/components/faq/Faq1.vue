<template>
  <div id="kakaoWrap" class="kakaopay_intro"> <!-- 인트로 kakaopay_intro, 서브 kakaopay_sub -->
    <div id="kakaoHead" role="banner">
      <div class="wrap_logo">
          <h1>
              <a href="/" id="kakaoServiceLogo" class="ico_pay ico_logo"><span class="ir_wa">Kakao pay</span></a>
              <a href="/" class="link_custom">고객센터</a>
          </h1>
      </div>
    </div>

    <hr class="hide">
    <div id="kakaoContent" role="main">
        <div id="cMain">
            <div id="mArticle">
                <div class="bg_search">
                    <div class="wrap_search">
                        <h2 class="screen_out">검색</h2>
                        <p class="txt_intro">
                            <span id="caption">안녕하세요.<br>카카오페이 고객센터입니다.</span>
                            <span id="cursor" style="opacity: 1; display: none;">|</span>
                        </p>
                        <form class="search_keyword" action="/faq" method="get">
                            <fieldset>
                                <legend class="screen_out">키워드 검색</legend>
                                <label for="fulltextsearch">
                                    <span class="screen_out">키워드 입력</span>
                                    <input type="text" name="search" id="fulltextsearch" class="tf_search" placeholder="궁금한 키워드를 검색해 보세요" onfocus="{$(this).removeAttr('placeholder')}" onblur="{$(this).attr('placeholder', '궁금한 키워드를 검색해 보세요')}">
                                </label>
                                <button type="submit" id="textsearch" class="btn_search #search" onclick="_tiq.push(['__trackEvent', 'text_search', $('#fulltextsearch').val()]);">
                                    <span class="ico_pay">검색</span>
                                </button>
                            </fieldset>
                        </form>
                        <form class="search_cate" action="/faq" method="get">
                            <fieldset>
                                <legend class="screen_out">카테고리 검색</legend>
                                <div class="opt_search" id="cat_wrp_1"> <!-- 레이어 오픈 : opt_on 추가 -->
                                    <input type="hidden" name="pid" value="">
                                    <span class="screen_out">대분류</span>
                                    <button type="button" class="btn_opt">
                                        <span id="cat_at_1" class="opt_select">카테고리 선택</span>
                                        <span class="ico_pay">선택 됨 / 옵션 열기</span>
                                    </button> <!-- 비활성화 disabled 추가 -->
                                    <div class="layer_opt" id="cat_op_1">
                                        <ul class="list_opt"></ul>
                                        <li>
                                            <a href="#none" class="link_opt" value="카테고리 선택" data-id="">카테고리 선택</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="카카오페이머니" data-id="15888">카카오페이머니</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="통합조회" data-id="20020">통합조회</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="계정/본인인증" data-id="15887">계정/본인인증</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="온라인결제" data-id="15895">온라인결제</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="오프라인결제" data-id="16087">오프라인결제</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="신용조회" data-id="20050">신용조회</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="해외결제" data-id="3000">해외결제</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="대출비교" data-id="29090">대출비교</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="간편보험" data-id="29080">간편보험</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="카드" data-id="15889">카드</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="청구서" data-id="15893">청구서</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="투자" data-id="26000">투자</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="배송" data-id="19050">배송</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="인증" data-id="15894">인증</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="카카오페이 카드" data-id="15897">카카오페이 카드</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="환전" data-id="20010">환전</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="영수증" data-id="19060">영수증</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="쿠폰" data-id="29050">쿠폰</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="멤버십" data-id="15892">멤버십</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="소호결제(구 QR결제)" data-id="16161">소호결제(구 QR결제)</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="카카오 포인트" data-id="15891">카카오 포인트</a>
                                        </li>
                                        <li>
                                            <a href="#none" class="link_opt" value="제휴카드" data-id="16200">제휴카드</a>
                                        </li>
                                    </div>
                                    <div class="bg_layer"></div>
                                </div>
                                <div class="opt_search" id="cat_wrp_2"> <!-- 레이어 오픈 : opt_on 추가 -->
                                    <input type="hidden" name="cid" value="-1" id="cat_value">
                                    <span class="screen_out">소분류</span>
                                    <button type="button" class="btn_opt">
                                        <span id="cat_at_2" class="opt_select">카테고리 선택</span>
                                        <span class="ico_pay">선택 됨 / 옵션 열기</span>
                                    </button> <!-- 비활성화 disabled 추가 -->
                                    <div class="layer_opt" id="cat_op_2">
                                        <ul class="list_opt"></ul>
                                        <li>
                                            <a href="#none" class="link_opt" value="카테고리 선택" data-id="-1">카테고리 선택</a>
                                        </li>
                                    </div>
                                    <div class="bg_layer"></div>
                                </div>
                                <button type="submit" id="categorysearch" class="btn_search #search" onclick="_tiq.push(['__trackEvent', 'category_search', $('#cat_value').val()]);">검색</button>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div id="cEtc">
    <h2 class="screen_out">고객센터 전화번호 리스트</h2>
    <!-- 2018-10-17 수정 시작 -->
    <ul class="list_support">
        <li>
            <div class="support_head">
                <span class="ico_pay ico_custom"></span>
                <strong class="tit_support">1:1 문의</strong>
            </div>
            <div class="support_body">
                <div class="bundle_support">
                    <span class="txt_phone">1644-7405</span>
                    <span class="txt_time">평일 9:00~18:00</span>
                </div>
                <div class="bundle_support">
                    <a href="/inquiry" class="link_phone #inquiry">메일 문의하기<span class="ico_pay ico_arr"></span></a>
                    <span class="txt_time">24시간 가능</span>
                </div>
                <div class="bundle_support">
                    <span class="link_phone #inquiry_talk" onclick="$('#inquiry_talk').submit()">
                        <form id="inquiry_talk" action="https://bizmessage.kakao.com/chat/open" style="cursor: pointer" method="post" target="_blank">
                            <input type="hidden" name="uuid" value="@카카오페이고객센터">
                            <input type="hidden" name="extra" value="homepage">
                            <input type="hidden" name="bot" value="true">
                            <input type="hidden" name="event" value="chatbot_home">
                            카톡 문의하기<span class="ico_pay ico_arr"></span>
                        </form>
                    </span>
                    <span class="txt_time">평일 9:00~17:30</span>
                </div>
            </div>
        </li>
        <li>
            <div class="support_head">
                <span class="ico_pay ico_lost"></span>
                <strong class="tit_support">분실·도용신고</strong>
                <span class="txt_support">분실은 24시간 가능</span>
            </div>
            <div class="support_body">
                <div class="bundle_support">
                    <span class="txt_phone">1833-7483</span>
                </div>
                <div class="bundle_support">
                    <a href="https://accounts.kakao.com/login?continue=https://kakaopay-more.kakao.com/settings/registered-kakaopay-list" class="link_phone #lost">분실 신고하기<span class="ico_pay ico_arr"></span></a>
                </div>
            </div>
        </li>
    </ul>
    <!--// 2018-10-17 수정 끝 -->
</div>
    </div>
    <hr class="hide">

    <div id="kakaoFoot" role="contentinfo">
    <div class="wrap_copy">
        <address class="desc_addr">
            <span class="txt_addr">경기도 성남시 분당구 판교역로 152 알파돔타워 12층</span>
            <span class="txt_addr">대표이사 : 류영준</span>
            <span class="txt_addr">사업자번호 : 527-88-00686</span>
        </address>
        <small class="txt_copy">Copyright © Kakaopay Corp. All rights reserved.</small>
    </div>
</div>
</div>
</template>

<script>

export default {

}
</script>

<style scoped>
</style>
