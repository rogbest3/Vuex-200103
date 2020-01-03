<template>
	<div>
		<header>
               <slot name="header"></slot>       
		</header>
		<!-- 시멘틱 -->
		<aside id="sidebar">
			<slot name="sidebar"></slot>
		</aside>
		<section id="content">
               <slot name="content"></slot>
		</section>
		<footer>
			<slot name="footer"></slot>
		</footer>
	</div>
</template>
<script>
export default{
	data(){
		return {
			
		}
	}
}
</script>
<style scoped>


</style>