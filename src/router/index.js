import Vue from 'vue'
import Router from 'vue-router'
import VueResource from 'vue-resource'

Vue.use(Router)
Vue.use(VueResource)

import Index from '@/pages/Index'

var routes = [
  {path:"/", component:Index}
];

export default new Router({
  routes
})
