import loginAPI from '@/service/loginAPI'

export default {
  async login (cemail, cpwd) {
    try {
      const loginResponse = await loginAPI.login(cemail, cpwd)
      return loginResponse
    } catch (err) {
      alert(err)
    }
  }
}