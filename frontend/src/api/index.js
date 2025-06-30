import axios from 'axios'

// 用户相关
export function login(data) {
  return axios.post('/user/login', data)
}

export function register(data) {
  return axios.post('/user/register', data)
}

// 电宝相关
export function getPowerbanks() {
  return axios.get('/powerbank/list')
}

export function reservePowerbank(data) {
  return axios.post('/powerbank/reserve', data)
}

// 订单相关
export function getOrders() {
  return axios.get('/order/list')
}

// 管理员相关
export function getUsers() {
  return axios.get('/admin/users')
}

export function getAdminPowerbanks() {
  return axios.get('/admin/powerbanks')
}

export function getAdminOrders() {
  return axios.get('/admin/orders')
}

export function deleteUser(id) {
  return axios.delete(`/admin/user/${id}`)
}

export function deletePowerbank(id) {
  return axios.delete(`/admin/powerbank/${id}`)
} 