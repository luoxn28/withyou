import Vue from 'vue'
import Router from 'vue-router'
import VueResource from 'vue-resource'

Vue.use(Router)
Vue.use(VueResource)

import Index from '@/pages/Index'
import Collection from '@/pages/Collection'
import We from '@/pages/We'
import NewNote from '@/pages/NewNote'

var routes = [
  {path: "/", component:Index},
  {path: "/collection", component:Collection},
  {path: "/we", component:We},
  {path: "/new/note", component:NewNote}
];

export default new Router({
  routes
})
