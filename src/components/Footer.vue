<template>
  <tabbar>
    <tabbar-item link="/">
      <img v-if="page=='Index'" slot="icon" src="../assets/image/ic_nav_news_actived.png">
      <img v-if="page!='Index'" slot="icon" src="../assets/image/ic_nav_news_normal.png">
      <span slot="label">首页</span>
    </tabbar-item>
    <tabbar-item link="/collection">
      <img v-if="page=='Collection'" slot="icon" src="../assets/image/ic_nav_discover_actived.png">
      <img v-if="page!='Collection'" slot="icon" src="../assets/image/ic_nav_discover_normal.png">
      <span slot="label">收藏</span>
    </tabbar-item>
    <tabbar-item link="/we">
      <img v-if="page=='We'"slot="icon" src="../assets/image/ic_nav_my_pressed.png">
      <img v-if="page!='We'"slot="icon" src="../assets/image/ic_nav_my_normal.png">
      <span slot="label">我们</span>
    </tabbar-item>
  </tabbar>
</template>

<script>
  import {Tabbar, TabbarItem} from 'vux'

  export default{
    name: 'AppFooter',
    props: [
      "page"
    ],
    components: {
      Tabbar,
      TabbarItem,
    },
    data: {
      selected: 1
    },
    methods: {
      selectEnum: function(selected) {
        this.selected = selected
        console.info(this.selected)
      }
    }

  }
</script>

<style>
  /*@import '~vux/dist/vux.css';*/
</style>
