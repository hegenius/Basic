import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'
import './index.css'
import App2 from "./App2.jsx";
import Clock from "./components/Clock.jsx";

// id 값이 root 인 태그 검색
// render() : 실제로 화면을 그려주는 함수

createRoot(document.getElementById('root')).render(
  // StrictMode : js 문법을 엄격하게 검사하는 모드
  <StrictMode>
    {/*  리액트 컴포넌트 호출 */}
    {/*  리액트는 JSX 문법을 사용하기 때문에 리액트 컴포넌트 사용 시 반드시 종료 태그가 필수 */}
    {/*  종료태그를 사용하지 않을 경우 시작 태그의 마지막에 '/' 기호를 추가해야 함 */}
    {/*<App />*/}
      <App2></App2>
  </StrictMode>,
)

// Clock 실행 시 상단 내용 모두 주석
// setInterval() : 일정 시간 간격으로 함수를 실행하는 자바스크립트 함수, 첫번째 매개변수로 일정 시간 후 동작할 함수를 입력, 두번째 매개변수로 시간 간격(1/1000 초)을 입력, 반환값으로 setInterval() 함수의 ID 값을 반환
// setTimeout() : 일정 시간이 흐른 후 함수를 실행하는 자바스크립트 함수
// clearInterval() : setInterval() 함수를 중지시키는 함수
// clearTimeout() : setTimeout() 함수를 중지시키는 함수
// setInterval(function () {
//     createRoot(document.getElementById('root')).render(
//         <StrictMode>
//             <Clock/>
//         </StrictMode>,
//     )
// }, 1000);