<template>
  <div>
    <AppMenu title="我们"></AppMenu>
    <app-footer page="We"></app-footer>

    <AppWeAdd></AppWeAdd>
  </div>
</template>

<script>
  import AppMenu from '../components/Menu'
  import AppFooter from '../components/Footer'
  import AppWeAdd from '../components/WeAdd'

  export default {
    data () {
      return {
      }
    },
    components: {
      AppMenu, AppFooter, AppWeAdd
    }
  }
</script>

<style>
  /*@import '~vux/dist/vux.css';*/
</style>
