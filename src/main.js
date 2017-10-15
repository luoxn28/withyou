import Vue from 'vue'
import App from './App'
import VueRouter from 'vue-router'

const FastClick = require('fastclick')
FastClick.attach(document.body)

Vue.use(VueRouter)

const router = new VueRouter()

import Index from './pages/Index'

router.map({
  '/': {
    component: Index
  }
})

router.start(App, '#app')

