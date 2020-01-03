<template>
  <div>
      <component :is="!loginCheck ? 'pre-auth' : 'post-auth'"></component>
  </div>
</template>

<script>
import PreAuth from "@/components/cmm/PreAuth.vue"
import PostAuth from "@/components/cmm/PostAuth.vue"
import {store} from "../store"
export default{
    components : {PreAuth, PostAuth},
    computed:{
        loginCheck: function(){
            // alert(`${store.state.admin.isAuth}`)
            return store.state.admin.isAuth
        }
    }
}
</script>

<style scoped>
</style>
