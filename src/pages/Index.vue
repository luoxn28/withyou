<template>
  <div>
    <x-header :right-options="{showMore: true}" @on-click-more="showMenus = true">首页</x-header>
    <app-footer></app-footer>

    <div v-transfer-dom>
      <actionsheet :menus="menus" v-model="showMenus" show-cancel></actionsheet>
    </div>
  </div>
</template>

<script>
  import { XHeader, Actionsheet, TransferDom } from 'vux'
  import AppFooter from '../components/Footer'

  export default {
    directives: {
      TransferDom
    },
    data () {
      return {
        menus: {
          menu1: '菜单1',
          menu2: '菜单2'
        },
        showMenus: false
      }
    },
    components: {
      XHeader,
      Actionsheet,
      TransferDom,
      AppFooter,
    }
  }
</script>

<style>
  /*@import '~vux/dist/vux.css';*/
</style>
