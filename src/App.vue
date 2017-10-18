<template>
  <div style="height:100%;">
    <drawer width="100%;">

      <view-box ref="viewBox" body-padding-top="46px" body-padding-bottom="55px">
        <x-header slot="header" style="width:100%;position:absolute;left:0;top:0;z-index:100;"></x-header>

        <router-view></router-view>

        <tabbar>
          <tabbar-item link="/">
            <img slot="icon" src="./assets/image/ic_nav_news_actived.png">
            <span slot="label">首页</span>
          </tabbar-item>
          <tabbar-item link="/collection">
            <img slot="icon" src="./assets/image/ic_nav_discover_actived.png">
            <span slot="label">收藏</span>
          </tabbar-item>
          <tabbar-item link="/we">
            <img slot="icon" src="./assets/image/ic_nav_my_pressed.png">
            <span slot="label">我们</span>
          </tabbar-item>
        </tabbar>

      </view-box>

    </drawer>
  </div>
</template>

<script>
  import { Drawer, ViewBox, XHeader, Tabbar, TabbarItem } from 'vux'

export default {
  name: 'app',
  components: {
    Drawer, ViewBox, XHeader, Tabbar, TabbarItem
  }
}
</script>

<style lang="less">
@import '~vux/src/styles/reset.less';

html {
  height: 100%;
  width: 100%;
  overflow-x: hidden;
}

body {
  background-color: #fbf9fe;
  height: 100%;
  width: 100%;
  overflow-x: hidden;
}
</style>
