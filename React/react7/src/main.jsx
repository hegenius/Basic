import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'
import Board from "./component/board/Board.jsx";

createRoot(document.getElementById('root')).render(
  <StrictMode>
    {/*<App />*/}
    <Board/>  {/* RestApi 게시판 만들기*/}
  </StrictMode>,
)
