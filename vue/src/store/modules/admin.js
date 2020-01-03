import loginAPI from "@/api/loginAPI"
import * as types from "@/store/modules/mutation_types"

import axios from "axios"
// import Constant from "@/store/modules/mutation_types"
// import * as types from "@/store/modules/mutation_types"
const state = {
	admin : {},
	isAuth : false,
    sidebar : 'preSidebar',
	showSidebar : false
}
const getters = {
	getAdmin : state => state.admin,
	getIsAuth : state => state.isAuth,
	getSidebar :state=> state.getSidebar,
	getShowSidebar : state=>state.ShowSidebar
}
const actions = {
	async login({commit}, {context, cemail, cpwd}){
		alert(`axios start - context : ${context}, email : ${cemail}, pwd : ${cpwd}`)
		let url = `${context}/login`
	/* 	let data = {
			cemail : this.cemail,
			cpwd : this.cpwd
		} */
		let headers = {
			'authorization': 'JWT fefege..',	// local이라 test용으로 사용됨
			'Accept' : 'application/json',
			'Content-Type': 'application/json' }
		// let dest = ''
		axios
		.post(url, {cemail, cpwd}, headers)
		.then(({data})=>{	// res.data => d
			commit('LOGIN', data)	

			// alert(`${res.data.result}`)
			/* if(res.data.result === "SUCCESS"){
				alert(`로그인 성공 - result : ${res.data.customer.cemail}`)
				// this.$store.state.customer = res.data.customer
			
				this.$store.commit('admin/login', res.data.customer)
				// this.$store.state.authCheck = true
			//	this.$store.commit(Constant.IS_AUTH, true)

				//alert(`cemail : ${this.$store.state.common.customer.cemail}, cpwd : ${this.$store.state.common.customer.cpwd}`)
				if(this.$store.state.customer.role !== 'student'){
					// this.$store.state.sidebar = 'managerSidebar'
					this.$store.commit(Constant.SIDEBAR, 'managerSidebar')
					this.$router.push({path : '/main2'})
				}else{
					// this.$store.state.sidebar = 'studentSidebar'
					this.$store.commit(Constant.SIDEBAR, 'studentSidebar')
					this.$router.push({path : '/main2'})
				} 
			
			}else{
				alert(`로그인 실패`)
				this.$router.push({path : '/login'})
			} */
		})
		.catch(()=>{
			alert('AXIOS 실패')
		})
	},
	async join(){
		let url = `${this.context}/join`
		let data = {
			cemail : this.cemail,
			cpwd : this.cpwd,
			cname : this.cname,
			cphone : this.cphone
		}
		let headers = {
			'authorization' : 'JWT fefege..',
			'Accept' : 'application/json',
			'Content-Type' : 'application/json'
		}
		axios
		.post(url, data, headers)
		.then(()=>{
			this.$router.push('/login')	
		})
		.catch(()=>{
			alert('AXIOS 실패')
			this.$router.push('/join1')	
		})
		
	}
}
const mutations = {
	LOGIN ( state, data ){
		// alert(`mutations - ${data.result}`)
		state.admin = data.customer
		state.isAuth = Boolean(data.result)
		state.sidebar = 'managerSidebar'
		// state.showSidebar = true
	//	alert(`mutations - ${state.isAuth }`)

	},
	LOGOUT ( state ){
		state.admin = null
	},
	[types.IS_AUTH] ( state, isAuth ){
		state.isAuth = isAuth
	},
	[types.SIDEBAR] ( state, sidebar ){
		state.sidebar = sidebar
	},
	[types.SHOWSIDEBAR] ( state, showsidebar ){
		state.showsidebar = showsidebar
	},
}

export default {
	name : 'admin',
	namespaced : true,
	state,
	getters,
	actions,
	mutations,
	loginAPI
}