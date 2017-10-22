<template>
  <div>
    <div style="margin: 10px;overflow: hidden;" v-for="item in list">
      <div style="margin: 10px;overflow: hidden;">
        <router-link to='/note' @click.native="toNote(item)">
          <masker style="border-radius: 2px;">
            <div class="m-img" :style="{backgroundImage: 'url(' + item.img + ')'}"></div>
            <div slot="content" class="m-title">
              {{item.title}}
              <br/>
              <span class="m-time">{{item.time}}</span>
            </div>
          </masker>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
  import { Masker } from 'vux'
  import EventBus from '../util/EventBus'

  export default {
    props: [
      "title"
    ],
    components: {
      Masker
    },
    data () {
      return {
        url: 'http://i.guancha.cn/news/2017/10/18/20171018104551519.jpg',
        list: []
      }
    },
    created: function() {
      this.$http.get("/api/note/list").then((response) => {
        this.list = response.data.data;
      });
    },
    methods: {
      toNote(note) {
        EventBus.data.currentNote = note;
      }
    }
  }
</script>

<style lang="less">
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
