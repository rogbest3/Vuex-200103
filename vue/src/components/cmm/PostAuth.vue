<template>
  <div id="root">
		<layout>
			<!-- slot은 template으로 바뀜 -->
			<template #header="header">
				<Nav/>
			</template>

			<template #sidebar="sidebar">
				<component :is="sidebarCheck" v-if="showSide"></component>
			</template>

			<template #content="content">
				<router-view/>
			</template>
			<template #footer="footer">
				<Footer/>			
			</template>
		</layout>
	</div>
</template>

<script>
import ManagerSidebar from "@/components/cmm/ManagerSidebar.vue"
import PreSidebar from "@/components/cmm/PreSidebar.vue"
import StudentSidebar from "@/components/cmm/StudentSidebar.vue"
import Layout from "@/components/cmm/Layout.vue"
import Nav from "@/components/cmm/Nav.vue"
import Footer from "@/components/cmm/Footer.vue"
import {store} from "../../store"

export default{
	components : {
		Layout, ManagerSidebar, PreSidebar, StudentSidebar, Nav, Footer
	},
	
	computed:{
		sidebarCheck: function(){
			return store.state.admin.sidebar
		},
		showSide(){
			return store.state.admin.showSidebar
		}

	}
}
</script>