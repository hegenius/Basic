import {useState} from "react";
import Toolbar from "./Toolbar.jsx";

function LandingPage() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const onClickLogin = () => {
    setIsLoggedIn(true);
  }

  const onClickLogout = () => {
    setIsLoggedIn(false);
  }

  return (
    <div>
      <Toolbar isLoggedIn={isLoggedIn}
               onClickLogin={onClickLogin}
               onClickLogout={onClickLogout} />
      <div className={'mt-3'}>소플과 함께하는 리액트 공부!</div>
    </div>
  );
}

export default LandingPage;