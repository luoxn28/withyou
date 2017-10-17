<template>
  <div>
    <AppMenu title="收藏"></AppMenu>
    <app-footer page="Collection"></app-footer>
  </div>
</template>

<script>
  import AppMenu from '../components/Menu'
  import AppFooter from '../components/Footer'

  export default {
    data () {
      return {
      }
    },
    components: {
      AppMenu,
      AppFooter,
    }
  }
</script>

<style>
  /*@import '~vux/dist/vux.css';*/
</style>
