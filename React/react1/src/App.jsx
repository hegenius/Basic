// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
import './App.css'
import Library from "./Library.jsx";

// 클래스 컴포넌트 : UI를 구성하는 방식을 자바스크립트의 클래스로 이루어진 컴포넌트, 예전에는 클래스 컴포넌트를 주로 사용하였음, 컴포넌트의 생명주기 함수를 사용하기 위해서 클래스 컴포넌트를 사용했음 
// 함수 컴포넌트 : UI를 구성하는 방식을 자바스크립트의 함수로 이루어진 컴포넌트, 예전에는 함수 컴포넌트는 기능 제약이 있었기 때문에 주로 클래스 컴포넌트를 사용함, Hooks 라는 기능이 추가되면서 함수 컴포넌트로 컴포넌트의 생명주기 함수를 모두 사용할 수 있게 됨

// 컴포넌트 : 리액트에서 UI를 구성하는 단위, 재사용이 가능한 UI 조각
// 컴포넌트의 이름은 첫글자를 대문자로 사용하는 것이 관례임
// 화면을 그리기 위한 컴포넌트는 export default로 지정해야 함

// 함수 컴포넌트를 선언함
// 자바스크립트 함수 선언과 동일함(화살표 함수 사용 가능)
function App() {
  // const [count, setCount] = useState(0)

  return (
    //   아래의 소스코드가 모두 JSX 문법임
    //   JSX의 기본 모습은 HTML 태그와 유사함
    //   JSX의 HTML 태그의 속성이 진짜 HTML 태그의 속성이 일부 다른 것이 존재함
    // <> div랑 똑같음
    <>
      {/*<div>*/}
      {/*  <a href="https://vitejs.dev" target="_blank">*/}
      {/*    <img src={viteLogo} className="logo" alt="Vite logo" />*/}
      {/*  </a>*/}
      {/*  <a href="https://react.dev" target="_blank">*/}
      {/*    <img src={reactLogo} className="logo react" alt="React logo" />*/}
      {/*  </a>*/}
      {/*</div>*/}
      {/*<h1>Vite + React</h1>*/}
      {/*<div className="card">*/}
      {/*  <button onClick={() => setCount((count) => count + 1)}>*/}
      {/*    count is {count}*/}
      {/*  </button>*/}
      {/*  <p>*/}
      {/*    Edit <code>src/App.jsx</code> and save to test HMR*/}
      {/*  </p>*/}
      {/*</div>*/}
      {/*<p className="read-the-docs">*/}
      {/*  Click on the Vite and React logos to learn more*/}
      {/*</p>*/}
        <div>
            <Library/>
        </div>
    </>
  )
}
// default export를 통해서 외부에서 사용할 수 있도록 제공
export default App
