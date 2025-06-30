<template>
  <div class="order-page">
    <el-table :data="orders" style="width: 100%">
      <el-table-column prop="id" label="订单号" width="100" />
      <el-table-column prop="powerbankId" label="电宝编号" />
      <el-table-column prop="startTime" label="开始时间" />
      <el-table-column prop="endTime" label="结束时间" />
      <el-table-column prop="fee" label="费用(元)" />
    </el-table>
  </div>
</template>

<script>
import { getOrders } from '../api/index'
export default {
  name: 'Order',
  data() {
    return {
      orders: []
    }
  },
  mounted() {
    getOrders().then(res => {
      this.orders = res.data
    })
  }
}
</script>

<style scoped>
.order-page {
  max-width: 900px;
  margin: 40px auto;
  background: #fff;
  padding: 30px;
  border-radius: 8px;
}
</style> 