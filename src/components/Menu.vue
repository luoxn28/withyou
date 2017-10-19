<template>
  <div>
    <x-header :right-options="{showMore: true}" @on-click-more="showMenus = true"
              slot="header" style="width:100%;position:absolute;left:0;top:0;z-index:100;">{{ title }}</x-header>

    <div v-transfer-dom>
      <actionsheet :menus="menus" v-model="showMenus" @on-click-menu="changeLocale" show-cancel></actionsheet>
    </div>

    <div v-transfer-dom>
      <x-dialog v-model="show.img1" class="dialog-demo">
        <div class="img-box">
          <img src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508416738578&di=5ccfe5057985b104c5e71a8496357864&imgtype=0&src=http%3A%2F%2Fsc.jb51.net%2Fuploads%2Fallimg%2F150702%2F14-150F211502b34.jpg" style="width:100%; height: 100%">
        </div>
        <div @click="show.img1=false">
          <span class="vux-close"></span>
        </div>
      </x-dialog>
    </div>

    <div v-transfer-dom>
      <x-dialog v-model="show.img2" class="dialog-demo">
        <div class="img-box">
          <img src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508416738664&di=f84f6333c1abaca0ba16f09947e303f1&imgtype=0&src=http%3A%2F%2Fimg.taopic.com%2Fuploads%2Fallimg%2F120708%2F201994-120FQU61796.jpg" style="width:100%; height: 100%">
        </div>
        <div @click="show.img2=false">
          <span class="vux-close"></span>
        </div>
      </x-dialog>
    </div>

  </div>
</template>

<script>
  import Vue from 'vue'
  import { XHeader, Actionsheet, TransferDom, Toast, ToastPlugin, XSwitch, XDialog } from 'vux'

  Vue.use(ToastPlugin)

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
          menu1: 'you',
          menu2: 'me'
        },
        showMenus: false,
        show: {
          img1: false,
          img2: false
        }
      }
    },
    components: {
      XHeader,
      Actionsheet,
      TransferDom,
      Toast, ToastPlugin, XSwitch, XDialog
    },
    methods: {
      changeLocale (locale) {
//        console.info(locale)
//        this.$vux.toast.show({
//          text: 'with you'
//        })
        if (locale === 'menu1') {
          this.show.img1 = true
        } else if (locale === 'menu2') {
          this.show.img2 = true
        }

      }
    }
  }
</script>

<style lang="less" scoped>
  @import '~vux/src/styles/close';

  .dialog-demo {
    .weui-dialog{
      border-radius: 8px;
      padding-bottom: 8px;
    }
    .dialog-title {
      line-height: 30px;
      color: #666;
    }
    .img-box {
      height: 350px;
      overflow: hidden;
    }
    .vux-close {
      margin-top: 8px;
      margin-bottom: 8px;
    }
  }
</style>
