import * as types from "@/store/modules/mutation_types"

const state = {
/* 	isAuth : false,
    sidebar : 'preSidebar',
	showSidebar : false, */
	nav : 'nav',
    context : 'http://localhost:8080/',
	errorState : '',
	sidebarList : []
}
const getters = {
	getErrorState :state =>state.getErrorState,
	// getIsAuth : state => state.isAuth,
	// getSidebar :state=> state.getSidebar,
	// getShowSidebar : state=>state.ShowSidebar,
	getContext : state => state.context,
	getNav : state => state.getNav,
	getSidebarList : state => state.getSidebarList
}
const actions = {}
const mutations = { 
	// [types.CUSTOMER] ( state, customer ){
	// 	state.customer = customer
	// },
	[types.ERROR_STATE] ( state, errorState ){
		state.errorState = errorState
	},
/* 	[types.IS_AUTH] ( state, isAuth ){
		state.isAuth = isAuth
	},
	[types.SIDEBAR] ( state, sidebar ){
		state.sidebar = sidebar
	},
	[types.SHOWSIDEBAR] ( state, showsidebar ){
		state.showsidebar = showsidebar
	}, */
	[types.NAV] ( state, nav ){
		state.nav = nav
	},
	[types.SIDEBARLIST] ( state, sidebarlist ){
		state.sidebarlist = sidebarlist
	}
}
export default {
	name : 'common',
	namespaced : true,
	state,
	getters,
	actions,
	mutations
}