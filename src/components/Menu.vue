<template>
  <div>
    <x-header :right-options="{showMore: true}" @on-click-more="showMenus = true">{{ title }}</x-header>

    <div v-transfer-dom>
      <actionsheet :menus="menus" v-model="showMenus" show-cancel></actionsheet>
    </div>
  </div>
</template>

<script>
  import { XHeader, Actionsheet, TransferDom } from 'vux'

  export default {
    props: [
      "title"
    ],
    directives: {
      TransferDom
    },
    data () {
      return {
        menus: {
          menu1: '添加记事',
          menu2: '添加美好瞬间'
        },
        showMenus: false
      }
    },
    components: {
      XHeader,
      Actionsheet,
      TransferDom,
    }
  }
</script>

<style>
  /*@import '~vux/dist/vux.css';*/
</style>
