,<template>
  <div>
    <AppMenu title="新建记事"></AppMenu>
    <app-footer></app-footer>

    <group title="+ 新建记事">
      <x-input placeholder="title" v-model="note.title"></x-input>
      <x-textarea name="description" v-model="note.text" placeholder="content" :max="1000" autosize></x-textarea>
    </group>

    <flexbox class="sumit-box">
      <flexbox-item>
        <x-button type="warn" @click.native="clean">重置</x-button>
      </flexbox-item>
      <flexbox-item>
        <x-button type="primary" @click.native="submit">提交</x-button>
      </flexbox-item>
    </flexbox>

  </div>
</template>

<script>
  import { XTextarea, Group, XInput, XButton } from 'vux'
  import { Flexbox, FlexboxItem } from 'vux'
  import AppMenu from '../components/Menu'
  import AppFooter from '../components/Footer'

  export default {
    components: {
      XTextarea, Group, XInput, XButton,
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
        console.info(this.note)

        this.clean()
      },
      clean() {
        this.note.title = ''
        this.note.text = ''
      }
    }
  }
</script>

<style>
  .sumit-box {
    margin-top: 10px;
  }
</style>
