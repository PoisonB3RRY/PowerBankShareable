import axios from 'axios'

// 用户相关
export function login(data) {
  return axios.post('/api/user/login', data)
}

export function register(data) {
  return axios.post('/api/user/register', data)
}

// 电宝相关
export function getPowerbanks() {
  return axios.get('/api/powerbank/list')
}

export function reservePowerbank(data) {
  return axios.post('/api/powerbank/reserve', data)
}

// 订单相关
export function getOrders() {
  return axios.get('/api/order/list')
}

// 管理员相关
export function getUsers() {
  return axios.get('/api/admin/users')
}

export function getAdminPowerbanks() {
  return axios.get('/api/admin/powerbanks')
}

export function getAdminOrders() {
  return axios.get('/api/admin/orders')
}

export function deleteUser(id) {
  return axios.delete(`/api/admin/user/${id}`)
}

export function deletePowerbank(id) {
  return axios.delete(`/api/admin/powerbank/${id}`)
} 