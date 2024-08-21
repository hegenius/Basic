import Event1 from "./components/Event1.jsx";
import ConfirmButton from "./components/ConfirmButton.jsx";
import Greeting from "./components/Greeting.jsx";
import LoginControl from "./components/LoginControl.jsx";
import MailBox from "./components/MailBox.jsx";
import LoginControl2 from "./components/LoginControl2.jsx";
import MainPage from "./components/MainPage.jsx";
import LandingPage from "./components/LandingPage.jsx";
import AttendanceBook from "./components/AttendanceBook.jsx";
import RequestForm from "./components/RequestForm.jsx";
import NameForm from "./components/NameForm.jsx";
import FruitSelect from "./components/FruitSelect.jsx";
import Reservation from "./components/Reservation.jsx";
import Join from "./components/Join.jsx";

function App() {
    return (
      <div className={'container mt-5'}>
        <h3>이벤트 사용하기</h3>
        <Event1/>

        <br/>
        <ConfirmButton/>

        <br/>
        <hr/>
        <br/>
        <h3>조건부 렌더링</h3>
        <Greeting isLoggedIn={true}/>

        <br/>
        <hr/>
        <br/>
        <h3>엘리먼트 변수</h3>
        <LoginControl/>
        <br/>
        <hr/>
        <br/>

        <h3>인라인 조건문</h3>
        <MailBox unreadMessages={0}/>
        <br/><br/>
        <MailBox unreadMessages={10}/>
        <br/>
        <hr/>
        <br/>

        <h3>삼항연산자 사용</h3>
        <LoginControl2/>
        <br/>
        <hr/>
        <br/>

        <h3>렌더링 막기</h3>
        <MainPage/>
        <br/>
        <hr/>
        <br/>
        <h3>로그인 여부 나타내는 톨바 만들기</h3>
        <LandingPage/>

        <br/>
        <hr/>
        <br/>
        <h3>리스트와 키</h3>
        <AttendanceBook/>

        <br/>
        <hr/>
        <br/>
        <h3>Form 사용하기</h3>
        <NameForm/>
        <br/><br/>
        <RequestForm/>
        <br/><br/>
        <FruitSelect/>
        <br/><br/>
        <Reservation/>

        <br/><br/>
        {/*<Join/>*/}
        <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
      </div>
    );
}

export default App
