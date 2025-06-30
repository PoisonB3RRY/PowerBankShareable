<template>
  <el-tabs v-model="activeTab">
    <el-tab-pane label="用户管理" name="user">
      <el-table :data="users" style="width: 100%">
        <el-table-column prop="id" label="用户ID" width="100" />
        <el-table-column prop="username" label="用户名" />
        <el-table-column label="操作">
          <template #default="scope">
            <el-button type="danger" size="small" @click="deleteUser(scope.row)">删除</el-button>
          </template>
        </el-table-column>
      </el-table>
    </el-tab-pane>
    <el-tab-pane label="电宝管理" name="powerbank">
      <el-table :data="powerbanks" style="width: 100%">
        <el-table-column prop="id" label="编号" width="80" />
        <el-table-column prop="location" label="位置" />
        <el-table-column prop="status" label="状态" />
        <el-table-column prop="power" label="剩余电量" />
        <el-table-column label="操作">
          <template #default="scope">
            <el-button type="danger" size="small" @click="deletePowerbank(scope.row)">删除</el-button>
          </template>
        </el-table-column>
      </el-table>
    </el-tab-pane>
    <el-tab-pane label="订单管理" name="order">
      <el-table :data="orders" style="width: 100%">
        <el-table-column prop="id" label="订单号" width="100" />
        <el-table-column prop="powerbankId" label="电宝编号" />
        <el-table-column prop="userId" label="用户ID" />
        <el-table-column prop="fee" label="费用(元)" />
      </el-table>
    </el-tab-pane>
  </el-tabs>
</template>

<script>
import { getUsers, getAdminPowerbanks, getAdminOrders, deleteUser, deletePowerbank } from '../api/index'
export default {
  name: 'Admin',
  data() {
    return {
      activeTab: 'user',
      users: [],
      powerbanks: [],
      orders: []
    }
  },
  mounted() {
    this.fetchAll()
  },
  methods: {
    fetchAll() {
      getUsers().then(res => { this.users = res.data })
      getAdminPowerbanks().then(res => { this.powerbanks = res.data })
      getAdminOrders().then(res => { this.orders = res.data })
    },
    deleteUser(row) {
      deleteUser(row.id).then(() => {
        this.$message.success('删除成功')
        this.fetchAll()
      })
    },
    deletePowerbank(row) {
      deletePowerbank(row.id).then(() => {
        this.$message.success('删除成功')
        this.fetchAll()
      })
    }
  }
}
</script>

<style scoped>
.el-tabs {
  max-width: 1000px;
  margin: 40px auto;
  background: #fff;
  padding: 30px;
  border-radius: 8px;
}
</style> 