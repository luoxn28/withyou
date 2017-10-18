<template>
  <div>
    <AppMenu title="首页"></AppMenu>
    <app-footer page="Index"></app-footer>

    <AppIndexBox></AppIndexBox>

  </div>
</template>

<script>
  import AppMenu from '../components/Menu'
  import AppFooter from '../components/Footer'
  import AppIndexBox from '../components/IndexBox'

  export default {
    data () {
      return {
      }
    },
    components: {
      AppMenu, AppFooter, AppIndexBox
    }
  }
</script>

<style>
  /*@import '~vux/dist/vux.css';*/
</style>
