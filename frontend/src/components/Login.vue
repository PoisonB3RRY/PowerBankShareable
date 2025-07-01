<template>
  <div class="form-title">共享充电宝</div>
  <el-form :model="loginForm" class="login-form" label-width="80px">
    <el-form-item label="账号">
      <el-input v-model="loginForm.username" autocomplete="off" />
    </el-form-item>
    <el-form-item label="密码">
      <el-input v-model="loginForm.password" type="password" autocomplete="off" />
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="handleLogin">登录</el-button>
      <el-button type="text" @click="$router.push('/register')">注册</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
import { login } from '../api/index'
export default {
  name: 'Login',
  data() {
    return {
      loginForm: {
        username: '',
        password: ''
      }
    }
  },
  methods: {
    handleLogin() {
      login(this.loginForm).then(() => {
        this.$router.push('/map')
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
.login-form {
  max-width: 400px;
  margin: 100px auto;
  padding: 40px 30px;
  border: 1px solid #eee;
  border-radius: 8px;
  background: #fff;
}
</style> 