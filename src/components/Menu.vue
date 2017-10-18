<template>
  <div>
    <x-header :right-options="{showMore: true}" @on-click-more="showMenus = true"
              slot="header" style="width:100%;position:absolute;left:0;top:0;z-index:100;">{{ title }}</x-header>

    <div v-transfer-dom>
      <actionsheet :menus="menus" v-model="showMenus" @on-click-menu="changeLocale" show-cancel></actionsheet>
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
    },
    methods: {
      changeLocale (locale) {
        console.info(locale)
      }
    }
  }
</script>

<style>
  /*@import '~vux/dist/vux.css';*/
</style>
