import Vue from 'vue'
import Vuex from 'vuex'	// Vuex - 생성자 함수
import common from "@/store/modules/common"
import customer from "@/store/modules/customer"
import admin from "@/store/modules/admin"
import article from "@/store/modules/article"

//import axios from 'axios'

Vue.use(Vuex)

export const store = new Vuex.Store({
  modules : {
    common,
    customer,
    admin,
    article
  },
  strict : true // ES6, 엄격하게 검사
})

