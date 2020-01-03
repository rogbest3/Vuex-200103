import axios from 'axios'

const getUserInfo = (cemail, cpwd) => {
  return axios.get('/endpoint-for-get-user-info', {
    params: {
      'cemail': cemail,
      'cpwd': cpwd
    }
  })
}

const isFinished = cemail => {
  return axios.get('/endpoint-for-is-finished', {
    params: {
      'cemail': cemail
    }
  })
}

export default {
  async login (cemail, cpwd) {
    try {
      const getUserInfoPromise = await getUserInfo(cemail, cpwd)
      const isFinishedPromise = await isFinished(cemail) // Promise.all의 예시를 위해 집어넣음
      const [userInfoResponse, isFinishedResponse] = await Promise.all([getUserInfoPromise, isFinishedPromise])
      if (userInfoResponse.data.length === 0) return 'noAuth' // 로그인 결과에 따른 분기 처리를 해준다
      if (isFinishedResponse.data[0].CNT > 0) return 'done'
      return userInfoResponse
    } catch (err) {
      alert(err)
    }
  }
}