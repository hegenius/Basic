

// Axios : ajax 비동기 통신을 하기 위한 자바스크립트 라이브러리
// 리액트는 jQuery를 사용하지 않기 때문에 비동기 통신을 위해서 axios를 사용함
// 사용 시 해당 컴포넌트에 import 하여 사용
// 단축 메소드를 제공 (get, post, put, delete)
// then (콜백함수) : 데이터 통신 성공 시 자동 동작하는 부분
// catch (콜백함수) : 데이터 통신 실패 시 자동 동작하는 부분

// 문법 (기본)
// axios({
// url:'접속 주소',
// method : '통신 방식',
// data : {파라미터 값으로 전송할 데이터}
// });

// 사용법
// 설치 : npm install axios
// 선언 : import axios from 'axios';


import axios from "axios";

function AxiosTest() {
  const getKobisData = () => {
    axios.get('http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=82ca741a2844c5c180a208137bb92bd7&targetDt=20240827')
      .then(res => {
        console.log('비동기 통신 성공!!');
        // axios를 통해서 전달받은 전체 데이터 가져오기
        // axios 를 통해서 전달되는 데이터는 object 타입으로 전달됨
        // config, data, headers, request, status, statusText 의 속성을 가지고 있음
        // 서버가 전달한 실제 데이터는 data 속성에 담겨 있음
        // console.log(res);
        // console.log(res.data);
        
        // 전체 데이터 중에서 필요한 데이터만 가져오기
        // 객체 분할 할당을 사용하여 필요한 데이터만 가져옴
        const {boxOfficeResult} = res.data;
        // const {boxofficeType, dailyBoxOfficeList, showRange} = boxOfficeResult;
        // console.log(boxofficeType);
        // console.log(dailyBoxOfficeList);
        // console.log(showRange);
        const {dailyBoxOfficeList} = boxOfficeResult;
        console.log(dailyBoxOfficeList);

        // for(let i = 0; i , dailyBoxOfficeList.length; i++) {
        //   let boxOfficeList = '';
        //   boxOfficeList += '순위 : ' + dailyBoxOfficeList[i].rank + '\n';
        //   boxOfficeList += '영화명 : ' + dailyBoxOfficeList[i].movieNm + '\n';
        //   boxOfficeList += '개봉일 : ' + dailyBoxOfficeList[i].openDt;
        //   console.log(boxOfficeList);
        // }

        dailyBoxOfficeList.forEach(item => {
          let boxOfficeList = '';
          boxOfficeList += '순위 : ' + item.rank + '\n';
          boxOfficeList += '영화명 : ' + item.movieNm + '\n';
          boxOfficeList += '개봉일 : ' + item.openDt;
          console.log(boxOfficeList);
        });
      })
      .catch(err => {
        console.log('비동기 통신 중 오류가 발생했습니다.');
      });
  };

  return(
    <div>
      <button type={'button'} className={'btn btn-primary'} onClick={getKobisData}>클릭 시 데이터 가져오기</button>
    </div>
  );
}

export default AxiosTest;