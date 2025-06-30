<template>
  <div class="map-page">
    <el-table :data="powerbanks" style="width: 100%">
      <el-table-column prop="id" label="编号" width="80" />
      <el-table-column prop="location" label="位置" />
      <el-table-column prop="status" label="状态" />
      <el-table-column prop="power" label="剩余电量" />
      <el-table-column label="操作">
        <template #default="scope">
          <el-button type="primary" size="small" :disabled="scope.row.status !== '可租赁'" @click="reserve(scope.row)">预约</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import { getPowerbanks, reservePowerbank } from '../api/index'
export default {
  name: 'Map',
  data() {
    return {
      powerbanks: []
    }
  },
  mounted() {
    // 获取电宝列表
    getPowerbanks().then(res => {
      this.powerbanks = res.data
    })
  },
  methods: {
    reserve(row) {
      reservePowerbank(row.id).then(res => {
        this.$message.success('预约成功')
        this.$router.push('/order')
        console.log(res)
      })
    }
  }
}
</script>

<style scoped>
.map-page {
  max-width: 900px;
  margin: 40px auto;
  background: #fff;
  padding: 30px;
  border-radius: 8px;
}
</style> 