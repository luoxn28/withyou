<template>
  <div>
    <x-header :left-options="{showBack: false}">首页</x-header>
    <app-footer></app-footer>
  </div>
</template>

<script>
  import { XHeader } from 'vux'
  import AppFooter from '../components/Footer'

  export default {
    data () {
      return {
      }
    },
    components: {
      XHeader,
      AppFooter,
    }
  }
</script>

<style>
  @import '~vux/dist/vux.css';
</style>
