<template> 
	<div class="box">
		<div class="login-form">
			<form>
				<h2 class="text-center">검색</h2>     
				<a href="#">학년별 1등과 최하위 학생</a>  
				<div class="form-group">
					<input v-model="searchword" type="text" class="form-control" placeholder="" required="required">
				</div>

				<div class="form-group">
					<button @click.prevent="search_btn" type="submit" class="btn btn-primary btn-block">Search</button>
				</div>     
			</form>
			<a @click.prevent="namesOfStudents">1. 학생의 이름</a><br>
			<a @click.prevent="streamToArray">2. 스트림을 배열로 전환</a><br>
			<a @click.prevent="streamToMap">3. 스트림을 맵으로 전환. 학생이름이  key</a><br>
			<a @click.prevent="theNumberOfStudents">4. 학생의 수</a><br>
			<a @click.prevent="totalScore">5. 학생들 총점</a><br>
			<a @click.prevent="topStudent">6. 1등 학생</a><br>
			<a @click.prevent="getStat">7. 전체 학생 성적 통계</a><br>
			<a @click.prevent="nameList">8. 전체 학생 이름</a><br>
			<a @click.prevent="partioningByGender">1.단순분할 (성별로 분할)</a><br>
			<a @click.prevent="partioningCountPerGender">2.단순분할 (성별 학생수)</a><br>
			<a @click.prevent="partioningTopPerGender">3.단순분할 (성별 1등)</a><br>
			<a @click.prevent="partioningRejectPerGender">4.다중분할 (성별 불합격자,  50점이하)</a><br>
			<a @click.prevent="groupingByBan">1. 단순 그룹화(반별로 그룹화)</a><br>
			<a @click.prevent="groupingByGrade">2. 단순그룹화(성적별로 그룹화)</a><br>
			<a @click.prevent="groupingByCountByLevel">3. 단순그룹화 + 통계(성적별 학생수))</a><br>
			<a @click.prevent="groupingByHakAndBan">4. 다중 그룹화 (학년별, 반별)</a><br>
			<a @click.prevent="groupingTopByHakAndBan">5. 다중 그룹화 +통계 (학년별, 반별  1등)</a><br>
			<a @click.prevent="groupingByStat">6. 다중그룹화 + 통계(학년별, 반별  성적그룹)</a>
			<a @click.prevent="groupingByHak">7. 단순 그룹화(학별로 그룹화)</a><br>
		</div>
		<h3>학생 조건 검색 결과</h3>
		<table class="table">
			<tr>
				<th>아이디</th>
				<th>이메일</th>
				<th>비번</th>
				<th>이름</th>
				<th>폰 번호</th>
				<th>생일</th>
				<th>성별</th>
				<th>학년</th>
				<th>반</th>
				<th>성적</th>
				<th>역할</th>
			</tr>
			<tr v-for="(j, i) of list" :key="j.id">
				<td>{{i+1}}</td>
				<td>{{j}}</td>
				<td>{{j.cemail}}</td>
				<td>{{j.cpwd}}</td>
				<td>{{j.cname}}</td>
				<td>{{j.cphone}}</td>
				<td>{{j.sdate}}</td>
				<td>{{j.gender}}</td>
				<td>{{j.hak}}</td>
				<td>{{j.ban}}</td>
				<td>{{j.score}}</td>
				<td>{{j.role}}</td>
			</tr>
		</table>

</div>
	<!-- </div> -->
</template>
<script>
import axios from 'axios'
export default{
	data(){
		return {
			context: 'http://localhost:8080/',
			list: [],
			searchword : ''
		}
	},
	methods : {
		search_btn(){
		},
		axiosMethod(){
			axios
		//	.get(`${this.context}/students/${this.searchword}`)
			.get(`${this.context}/students/${this.searchword}`)
			.then(res =>{
				this.list = res.data.list
			})
			.catch(e=>{
				alert('AXIOS FAIL'+e)
			})
		},
		namesOfStudents(){
			this.searchword = 'namesOfStudents'
			this.axiosMethod()
		},
		streamToArray(){
			this.searchword = 'streamToArray'
			this.axiosMethod()
		},
		streamToMap(){
			
		},
		theNumberOfStudents(){
			
		},
		totalScore(){
			
		},
		topStudent(){
			
		},
		getStat(){
			
		},
		nameList(){
			
		},
		groupingByHak(){
			alert(`검색어 : ${this.searchword}`)	// 1학년 학생 목록
		//	this.searchword = 'partioningByGender'
			axios
			.get(`${this.context}/students/search/${this.searchword}`)
			.then(res =>{
				this.list = res.data.list
			})
			.catch(e=>{
				alert('AXIOS FAIL'+e)
			})
		},
		partioningByGender(){
			alert(`검색어 : ${this.searchword}`)	// 남학생 목록
		//	this.searchword = 'partioningByGender'
			axios
			.get(`${this.context}/students/search/${this.searchword}`)
			.then(res =>{
				this.list = res.data.list
			})
			.catch(e=>{
				alert('AXIOS FAIL'+e)
			})
		},
		partioningCountPerGender(){
			
		},
		partioningTopPerGender(){
			
		},
		partioningRejectPerGender(){
			
		},
		groupingByBan(){
			
		},
		groupingByGrade(){
			
		},
		groupingByCountByLevel(){
			
		},
		groupingByHakAndBan(){
			
		},
		groupingTopByHakAndBan(){
			
		},
		groupingByStat(){
			
		}
	},
	computed () {
		
	}
}
</script>
<style scoped>
.box{ padding : 10px 50px 0px 50px}
.table{border : 1px solid black}
.table tr{border : 1px solid black}
.table tr th{border : 1px solid black}
.table tr td{border : 1px solid black}
.login-form {
    width: 340px;
    margin: 50px auto;
}
.login-form form {
    margin-bottom: 15px;
    background: #f7f7f7;
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    padding: 30px;
}
.login-form h2 {
    margin: 0 0 15px;
}
.form-control, .btn {
    min-height: 38px;
    border-radius: 2px;
}
.btn {        
    font-size: 15px;
    font-weight: bold;
}
</style>