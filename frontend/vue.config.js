const { defineConfig } = require('@vue/cli-service')

module.exports = defineConfig({
  transpileDependencies: [],
  devServer: {
    port: 8081,
    proxy: {
      '/api': {
        target: 'http://localhost:8080',
        changeOrigin: true,
        pathRewrite: { '^/api': '/api' }
      }
    }
  }
})