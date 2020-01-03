import Vue from 'vue'
import Router from 'vue-router'
// import Home from '@/components/Home'
import Main1 from "@/components/Main1"
import Main2 from "@/components/main/Main2"
import Login from "@/components/auth/Login"
import Join1 from "@/components/auth/Join1"
import Join2 from "@/components/auth/Join2"
import AuthMgmt from "@/components/mypage/AuthMgmt"
import Alarm from "@/components/mypage/Alarm"
import CusInfo from "@/components/mypage/CusInfo"
import PwdChg from "@/components/mypage/PwdChg"
import RefMgmt from "@/components/mypage/RefMgmt"
import CusInfoChg from "@/components/mypage/CusInfoChg"
// import Mypage from "@/components/Mypage"
import Nav from "@/components/cmm/Nav"
import PostAuth from "@/components/cmm/PostAuth"
import Admin from "@/components/mypage/Admin"
import AdminChg from "@/components/mypage/AdminChg"
import StudentList from "@/components/member/StudentList"
import HakList from "@/components/member/HakList"
import BanList from "@/components/member/BanList"
import StudentAdd from '@/components/student/StudentAdd'
import StudentEdit from '@/components/student/StudentEdit'
import StudentFindOne from '@/components/student/StudentFindOne'
import StudentsFindSome from '@/components/student/StudentsFindSome'
import StudentRemoval from '@/components/student/StudentRemoval'
import Students from '@/components/student/Students'
import FAQAdd from '@/components/board/FAQAdd'
import FAQEdit from '@/components/board/FAQEdit'
import FAQFindOne from '@/components/board/FAQFindOne'
import FAQFindSome from '@/components/board/FAQFindSome'
import FAQRemoval from '@/components/board/FAQRemoval'
import FAQs from '@/components/board/FAQs'
import MyKakaoLogin from '@/components/auth/MyKakaoLogin'

Vue.use(Router)

export default new Router({
	mode : 'history',
	routes : [ { path : '/', name : 'main1', component : Main1 },
				{ path : '/admin', name : 'admin', component : Admin },
				{ path : '/adminChg', name : 'adminChg', component : AdminChg },
				{ path : '/nav', name : 'nav', component : Nav },
				// { path : '/mypage', name : 'mypage', component : Mypage },
				{ path : '/main2', name : 'main2', component : Main2 },
				{ path : '/login', name : 'login', component : Login },
				{ path : '/join1', name : 'join1', component : Join1 },
				{ path : '/join2', name : 'join2', component : Join2 },
				{ path : '/authmgmt', name : 'authmgmt', component : AuthMgmt },
				{ path : '/alarm', name : 'alarm', component : Alarm },
				{ path : '/cusinfo', name : 'cusinfo', component : CusInfo },
				{ path : '/cusinfochg', name : 'cusinfochg', component : CusInfoChg },
				{ path : '/pwdchg', name : 'pwdchg', component : PwdChg },
				{ path : '/refmgmt', name : 'refmgmt', component : RefMgmt },
				{ path : '/postAuth', name : 'postAuth', component : PostAuth },
				{ path : '/studentList', name : 'studentList', component : StudentList },
				{ path : '/haklist', name : 'haklist', component : HakList },
				{ path : '/banlist', name : 'banlist', component : BanList },
				{ path: '/studentAdd',name: 'studentAdd', component: StudentAdd},
				{ path: '/studentEdit',name: 'studentEdit', component: StudentEdit},
				{ path: '/studentfindone',name: 'studentfindone', component: StudentFindOne},
				{ path: '/studentremoval',name: 'studentremoval', component: StudentRemoval},
				{ path: '/students',name: 'students', component: Students},
				{ path: '/studentsfindsome',name: 'studentsfindsome', component: StudentsFindSome},
				{ path: '/faqadd',name: 'faqadd', component: FAQAdd},
				{ path: '/faqedit',name: 'faqedit', component: FAQEdit},
				{ path: '/faqremoval',name: 'faqremoval', component: FAQRemoval},
				{ path: '/faqfindone',name: 'faqfindone', component: FAQFindOne},
				{ path: '/faqs',name: 'faqs', component: FAQs},
				{ path: '/faqfindsome',name: 'faqfindsome', component: FAQFindSome},
				{ path: '/myKakaoLogin',name: 'myKakaoLogin', component: MyKakaoLogin}

				//	children : [ { path : '/main2', name : 'main2', component : Main2 } ] }
			]
})