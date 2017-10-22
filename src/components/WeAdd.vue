<template>
  <div>
    <group>
      <cell title="+ 新建记事" value=":)" link="/new/note"></cell>
      <cell title="+ 新建美好瞬间" value=":)" link="/new/note"></cell>
    </group>
  </div>
</template>

<script>
  import { Group, Cell, CellBox } from 'vux'

  export default {
    components: {
      Group,
      Cell,
      CellBox
    }
  }
</script>
