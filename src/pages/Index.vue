<template>
  <div>
    <AppMenu title="首页"></AppMenu>
    <app-footer page="Index"></app-footer>

    <AppIndexBox></AppIndexBox>
  </div>
</template>

<script>
  import { Masker } from 'vux'
  import AppMenu from '../components/Menu'
  import AppFooter from '../components/Footer'
  import AppIndexBox from '../components/IndexBox'

  export default {
    components: {
      Masker,
      AppMenu, AppFooter, AppIndexBox
    },
    data () {
      return {

      }
    }
  }
</script>

<style>
  /*@import '~vux/dist/vux.css';*/
</style>
