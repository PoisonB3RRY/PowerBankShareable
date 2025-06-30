import Login from '../components/Login.vue'
import Register from '../components/Register.vue'
import Map from '../components/Map.vue'
import Order from '../components/Order.vue'
import Admin from '../components/Admin.vue'

const routes = [
  { path: '/', redirect: '/login' },
  { path: '/login', component: Login },
  { path: '/register', component: Register },
  { path: '/map', component: Map },
  { path: '/order', component: Order },
  { path: '/admin', component: Admin }
]

export default routes 