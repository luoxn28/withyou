<template>
  <div style="height:100%;">
    <drawer width="100%;">
      <view-box ref="viewBox" body-padding-top="46px" body-padding-bottom="55px">
        <router-view></router-view>
      </view-box>
    </drawer>
  </div>
</template>

<script>
  import { Drawer, ViewBox } from 'vux'

export default {
  name: 'app',
  components: {
    Drawer, ViewBox
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
