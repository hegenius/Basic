import {useEffect, useState} from "react";
import axios from "axios";

function BoardList() {
  const [borderList, setBoardList] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/boardList')
      .then(res => {
        // console.log(res.data);
        alert('데이터 통신 성공!!');

        const {data} = res;

        setBoardList(data);
      })
      .catch(err => {
        console.log(err);
        alert('데이터를 불러오는데 실패했습니다. ');
      });
  }, []); // 빈배열이면 화면 시작 후 한번만 실행

  return(
    <div>
      <table className={'table table-hover table-striped'}>
        <thead>
          <colgroup>
            <col width={'10%'}/>
            <col width={'50%'}/>
            <col width={'10%'}/>
            <col width={'20%'}/>
            <col width={'10%'}/>
          </colgroup>
          <tr>
            <th>글번호</th>
            <th>글제목</th>
            <th>글쓴이</th>
            <th>등록일</th>
            <th>조회수</th>
          </tr>
        </thead>
        <tbody>
          {
            borderList.map(item => {
              return (
                <tr key={item.boardIdx}>
                  <td>{item.boardIdx}</td>
                  <td>{item.title}</td>
                  <td>{item.createUser}</td>
                  <td>{item.createDate}</td>
                  <td>{item.hitCnt}</td>
                </tr>
              );
            })
          }
        </tbody>
      </table>
    </div>
  );
}

export default BoardList;