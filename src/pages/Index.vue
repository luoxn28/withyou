<template>
  <div>
    <AppMenu title="首页"></AppMenu>
    <app-footer page="Index"></app-footer>

    <!--<AppIndexBox></AppIndexBox>-->

    <div style="margin: 10px;overflow: hidden;" v-for="item in list">
      <div style="margin: 10px;overflow: hidden;">
        <router-link :to=item.url>
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
  import AppMenu from '../components/Menu'
  import AppFooter from '../components/Footer'
  import AppIndexBox from '../components/IndexBox'

  export default {
    data () {
      return {
        list: [{
          title: '洗颜新潮流！人气洁面皂排行榜',
          img: 'http://i.guancha.cn/news/2017/10/18/20171018104551519.jpg',
          url: '/we',
          time: '2016-03-19'
        }, {
          title: '美容用品 & 日用品（上）',
          img: 'http://i.guancha.cn/news/2017/10/18/20171018121303459.jpg',
          url: '/we',
          time: '2016-03-20'
        }, {
          title: '远离车内毒气，日本车载空气净化器精选',
          img: 'http://i.guancha.cn/news/2017/10/18/20171018101746567.jpg',
          url: '/we',
          time: '2016-03-21'
        }]
      }
    },
    components: {
      Masker,
      AppMenu, AppFooter, AppIndexBox
    }
  }
</script>

<style>
  /*@import '~vux/dist/vux.css';*/

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
