<template>
  <div>
    <AppMenu title="记事"></AppMenu>
    <app-footer></app-footer>

    <div style="margin: 10px;overflow: hidden;">
      <masker style="border-radius: 2px;">
        <div class="m-img" :style="{backgroundImage: 'url(' + note.img + ')'}"></div>
        <div slot="content" class="m-title">
          {{note.title}}
          <br/>
          <span class="m-time">{{note.time}}</span>
        </div>
      </masker>
    </div>

    <div style="margin: 10px;overflow: hidden;">
      <hr style="margin: 5px">
      {{note.text}}
    </div>
  </div>
</template>

<script>
  import { Masker } from 'vux'
  import AppMenu from '../components/Menu'
  import AppFooter from '../components/Footer'
  import EventBus from '../util/EventBus'

  export default {
    components: {
      Masker,
      AppMenu, AppFooter
    },
    data () {
      return {
        note: ''
      }
    },
    created() {
      let currentNote = EventBus.data.currentNote;
      if ((currentNote === null) || (typeof(currentNote) === "undefined")) {
        currentNote = JSON.parse(window.localStorage.getItem('currentNote'));
      } else {
        window.localStorage.setItem("currentNote", JSON.stringify(currentNote));
      }

      this.note = currentNote;
      console.info(this.node);
    }
  }
</script>

<style>
  .m-img {
    padding-bottom: 33%;
    display: block;
    position: relative;
    max-width: 100%;
    background-size: cover;
    background-position: center center;
    cursor: pointer;
    border-radius: 2px;
  }

  .m-title {
    color: #fff;
    text-align: center;
    text-shadow: 0 0 2px rgba(0, 0, 0, .5);
    font-weight: 500;
    font-size: 16px;
    position: absolute;
    left: 0;
    right: 0;
    width: 100%;
    text-align: center;
    top: 50%;
    transform: translateY(-50%);
  }

  .m-time {
    font-size: 12px;
    padding-top: 4px;
    border-top: 1px solid #f0f0f0;
    display: inline-block;
    margin-top: 5px;
  }
</style>
