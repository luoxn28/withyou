<template>
  <tabbar>
    <tabbar-item>
      <img slot="icon" src="../assets/image/ic_nav_news_actived.png">
      <span slot="label">首页</span>
    </tabbar-item>
    <tabbar-item>
      <img slot="icon" src="../assets/image/ic_nav_discover_normal.png">
      <span slot="label">收藏</span>
    </tabbar-item>
    <tabbar-item>
      <img slot="icon" src="../assets/image/ic_nav_my_normal.png">
      <span slot="label">我们</span>
    </tabbar-item>
  </tabbar>
</template>

<script>
  import {Tabbar, TabbarItem} from 'vux'

  export default{
    name: 'AppFooter',
    components: {
      Tabbar,
      TabbarItem,
    },
    data(){
      return{
        selected: 1
      }
    },
  }
</script>

<style>
  @import '~vux/dist/vux.css';

  .add{
    height:40px;
    width:40px;
  }
</style>
