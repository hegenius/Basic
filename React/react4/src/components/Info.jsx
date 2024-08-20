// useState를 사용하기 위해서 모듈 import
import {useState} from "react";

// 함수 컴포넌트 선언
function Info() {
    // 변수 name 을 선언하고 useState()를 사용하여 state 객체로 관리, 초기값은 ''로 설정
    const [name, setName] = useState('');
    // 변수 nickname 을 선언하고 useState()를 사용하여 state 객체로 관리, 초기값은 ''로 설정
    const [nickname, setNickName] = useState('');

    // 이벤트 발생 시 동작할 콜백 함수 미리 선언, 화살표 함수로 선언
    // 매개변수 e 는 실제로 이벤트가 동작한 객체임
    const onChangeName = (e) => {
        // state 객체로 관리되고 있는 변수 name의 값을 수정하는 setName() 함수를 사용하여 값 변경
        // setName()함수는 내부적으로 setState()함수를 호출하여 화면 UI 재 랜더링을 시작함
        // e.target : 이벤트가 발생한 객체 혹은 태그를 의미
        // e.target.value : 이벤트가 발생한 객체의 value 속성 값
        setName(e.target.value);
    }

    // 한줄만 실행이면 { } 생략 가능
    const onChangeNickName = e => setNickName(e.target.value);

    return(
        <div className={''}>
            <div>
                <input className={'form-control'} value={name} onChange={onChangeName} />
                <input className={'form-control'} value={nickname} onChange={onChangeNickName} />
            </div>
            <div><strong>이름 : </strong>{name}</div>
            <div><strong>닉네임 : </strong>{nickname}</div>
        </div>

    );
}
export default Info;