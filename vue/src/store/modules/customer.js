import loginAPI from "@/api/loginAPI"
import axios from "axios"
import Constant from "@/store/modules/mutation_types"
import * as types from "@/store/modules/mutation_types"

const state = {
	customer : {}
}
const getters = {}
const actions = {
		async login_btn(){
			alert('axios start')
			let url = `${this.$store.state.context}/login`
			let data = {
				cemail : this.cemail,
				cpwd : this.cpwd
			}
			let headers = {
				'authorization': 'JWT fefege..',	// local이라 test용으로 사용됨
				'Accept' : 'application/json',
				'Content-Type': 'application/json' }
			// let dest = ''
			axios
			.post(url, data, headers)
			.then(res=>{	// res.data => d
				// alert(`${res.data.result}`)
				if(res.data.result === "SUCCESS"){
					// alert(`로그인 성공 - result : ${res.data.person.userid}`)
					// this.$store.state.customer = res.data.customer
					this.$store.commit(Constant.CUSTOMER, res.data.customer)
					// this.$store.state.authCheck = true
				//	this.$store.commit(Constant.IS_AUTH, true)

					/* alert(`cemail : ${this.$store.state.customer.cemail}, cpwd : ${this.$store.state.customer.cpwd}`)
					if(this.$store.state.customer.role !== 'student'){
						// this.$store.state.sidebar = 'managerSidebar'
						this.$store.commit(Constant.SIDEBAR, 'managerSidebar')
						this.$router.push({path : '/main2'})
					}else{
						// this.$store.state.sidebar = 'studentSidebar'
						this.$store.commit(Constant.SIDEBAR, 'studentSidebar')
						this.$router.push({path : '/main2'})
					} */
				
				}else{
					alert(`로그인 실패`)
					this.$router.push({path : '/login'})
				}
			})
			.catch(()=>{
				alert('AXIOS 실패')
			})
		},
		async join_btn(){
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
	[types.CUSTOMER] ( state, customer ){
		alert(`mutations`)
		state.customer = customer
	},
	LOGIN ( state, customer ){
		alert(`mutations`)
		state.customer = customer
	},
	LOGOUT ( state ){
		state.customer = null
	}
}

export default {
	name : 'customer',
	namespaced : true,
	state,
	getters,
	actions,
	mutations,
	loginAPI
}