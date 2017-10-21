,<template>
  <div>
    <AppMenu title="新建记事"></AppMenu>
    <app-footer></app-footer>

    <group title="+ 新建记事">
      <x-input placeholder="title" v-model="note.title"></x-input>
      <x-textarea name="description" v-model="note.text" placeholder="content" :max="1000" autosize></x-textarea>
    </group>

    <box gap="10px 10px">
      <flexbox>
        <flexbox-item>
          <x-button type="warn" @click.native="clean(true)">重置</x-button>
        </flexbox-item>
        <flexbox-item>
          <x-button type="primary" @click.native="submit">提交</x-button>
        </flexbox-item>
      </flexbox>
    </box>

  </div>
</template>

<script>
  import Vue from 'vue'
  import { XTextarea, Group, Box, XInput, XButton } from 'vux'
  import { Flexbox, FlexboxItem } from 'vux'
  import { Toast, ToastPlugin } from 'vux'
  import AppMenu from '../components/Menu'
  import AppFooter from '../components/Footer'

  Vue.use(ToastPlugin)

  export default {
    components: {
      XTextarea, Group, Box, XInput, XButton,
      Flexbox, FlexboxItem,
      AppMenu, AppFooter
    },
    data () {
      return {
        note: {
          title: '',
          text: ''
        }
      }
    },
    methods: {
      submit() {
        if (this.checkData()) {
          this.$http.post("/api/note", {
            title: this.note.title,
            text: this.note.text
          }, {emulateJSON:true}).then((response) => {
            this.$vux.toast.show({
              text: '提交成功'
            });
            this.clean(false);
          }).then((response) => {
            // TODO
          });
        } else {
          this.$vux.toast.show({
            type: 'cancel',
            text: '数据不能为空'
          });
        }
      },
      clean(show) {
        this.note.title = '';
        this.note.text = '';

        if (show) {
          this.$vux.toast.show({
            text: '重置成功'
          });
        }
      },
      checkData() {
        if ((this.note.title === null) || (this.note.title === '')) {
          return false;
        }
        if ((this.note.text === null) || (this.note.text === '')) {
          return false;
        }

        return true;
      }
    }
  }
</script>

<style>
</style>
