<template>
  <div class="form-title">共享充电宝</div>
  <el-form :model="registerForm" class="register-form" label-width="80px">
    <el-form-item label="账号">
      <el-input v-model="registerForm.username" autocomplete="off" />
    </el-form-item>
    <el-form-item label="密码">
      <el-input v-model="registerForm.password" type="password" autocomplete="off" />
    </el-form-item>
    <el-form-item label="确认密码">
      <el-input v-model="registerForm.confirmPassword" type="password" autocomplete="off" />
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="handleRegister">注册</el-button>
      <el-button type="text" @click="$router.push('/login')">返回登录</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
import { register } from '../api/index'
export default {
  name: 'Register',
  data() {
    return {
      registerForm: {
        username: '',
        password: '',
        confirmPassword: ''
      }
    }
  },
  methods: {
    handleRegister() {
      if (this.registerForm.password !== this.registerForm.confirmPassword) {
        this.$message.error('两次密码不一致')
        return
      }
      register(this.registerForm).then(() => {
        this.$message.success('注册成功')
        this.$router.push('/login')
      })
    }
  }
}
</script>

<style scoped>
.form-title {
  text-align: center;
  font-size: 36px;
  margin-bottom: 30px;
  font-weight: bold;
}
.register-form {
  max-width: 400px;
  margin: 100px auto;
  padding: 40px 30px;
  border: 1px solid #eee;
  border-radius: 8px;
  background: #fff;
}
</style> 