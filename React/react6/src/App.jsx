import './App.css'
import Parent from "./component/Parent.jsx";
import Parent2 from "./component/Parent2.jsx";
import Join from "./component/Join.jsx";
import WelcomeDialog from "./component/WelcomeDialog.jsx";
import SplitPane from "./component/SplitPane.jsx";
import Contacts from "./component/Contacts.jsx";
import Chat from "./component/Chat.jsx";
import WelcomeDialog2 from "./component/WelcomeDialog2.jsx";
import SignUpDialog from "./component/SignUpDialog.jsx";
import ProfileCard from "./component/ProfileCard.jsx";

function App() {

  return (
    <div>
      <h3>상태 공유하기</h3>
      <Parent/>
      <br/>
      <hr/>
      <br/>
      <h3>상태 끌어올리기 (자식 컴포넌트의 데이터를 부모 컴포넌트로 전달)</h3>
      <Parent2/>
      <br/><br/>
      <Join/>

      <br/><hr/><br/>
      <h3>합성과 상속</h3>
      <WelcomeDialog/>

      <br/><br/>
      {/* 부모 컴포넌트인 App에서 자식 컴포넌트인 SplitPane 을 호출 */}
      {/* 자식 컴포넌트에 left, right 속성에 다른 컴포넌트를 전달 */}
      <SplitPane left={<Contacts/>} riehgt={<Chat/>}/>

      <br/><br/>
      <WelcomeDialog2/>

      <br/><br/>
      <SignUpDialog/>

      <br/><br/>
      <ProfileCard/>

      <br/><hr/><br/>

      <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
    </div>
  )
}

export default App
