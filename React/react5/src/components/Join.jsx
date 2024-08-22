
// 문제 1) 회원 가입 페이지를 작성하세요
// id, 비밀번호, 이름, email, 휴대전화, 성별 정보를 입력받고 확인 버튼 클릭 시 console.log() 나 alert() 을 통하여 화면에 출력하는 컴포넌트를 작성하세요
// 컴포넌트 명 : Join.jsx

import {useState} from "react";

function Join() {
  const [valueId, setValueId] = useState('');
  const [valuePwd, setValuePwd] = useState('');
  const [valueName, setValueName] = useState('');
  const [valueEmail, setValueEmail] = useState('');
  const [valuePhone, setValuePhone] = useState('');
  const [valueGender, setValueGender] = useState('');

  // 이벤트 처리 함수
  const handleIdChange = (e) => {
    setValueId(e.target.valueId);
    console.log(`받아온 값 : ${e.target.valueId}, 현재 valueId 값 : ${valueId}`);
  }

  const handlePwdChange = (e) => {
    setValuePwd(e.target.valuePwd);
    console.log(`받아온 값 : ${e.target.valuePwd}, 현재 valuePwd 값 : ${valuePwd}`);
  }

  const handleNameChange = (e) => {
    setValueName(e.target.valueName);
    console.log(`받아온 값 : ${e.target.valueName}, 현재 valueName 값 : ${valueName}`);
  }

  const handleEmailChange = (e) => {
    setValueEmail(e.target.valueEmail);
    console.log(`받아온 값 : ${e.target.valueEmail}, 현재 valueEmail 값 : ${valueEmail}`);
  }

  const handlePhoneChange = (e) => {
    setValuePhone(e.target.valuePhone);
    console.log(`받아온 값 : ${e.target.valuePhone}, 현재 valuePhone 값 : ${valuePhone}`);
  }

  const handleGenderChange = (e) => {
    setValueGender(e.target.valueGender);
    console.log(`받아온 값 : ${e.target.valueGender}, 현재 valueGender 값 : ${valueGender}`);
  }

  const handleSubmit = (e) => {
    alert(`입력한 ID : ${valueId}, \n입력한 비밀번호 : ${valuePwd}, \n입력한 이름 : ${valueName}, \n입력한 email: ${valueEmail}, \n입력한 휴대전화 : ${valuePhone}, \n입력한 성별 : ${valueGender},`);
    e.preventDefault();
  }


  return(
    <div className={'row'}>
      <div className={'col-sm-6'}>
        <form onSubmit={handleSubmit}>
          <div className={'mt-3'}>
            <label htmlFor={'user-id'} className={'form-label'}> ID </label>
            <input type={'text'} className={'form-control'} id={'user-id'} value={valueId} onChange={handleIdChange}/>
          </div>

          <div className={'mt-3'}>
            <label htmlFor={'user-password'} className={'form-label'}> 비밀번호 </label>
            <input type="password" className={'form-control'} id={'user-password'} value={valuePwd} onChange={handlePwdChange}/>
          </div>

          <div className={'mt-3'}>
            <label htmlFor={'user-name2'} className={'form-label'}> 이름 </label>
            <input type={'text'} className={'form-control'} id={'user-name2'} value={valueName} onChange={handleNameChange}/>
          </div>

          <div className={'mt-3'}>
            <label htmlFor={'user-email2'} className={'form-label'}> E-mail </label>
            <input type={'text'} className={'form-control'} id={'user-email2'} value={valueEmail} onChange={handleEmailChange}/>
          </div>

          <div className={'mt-3'}>
            <label htmlFor={'user-phone'} className={'form-label'}> 휴대전화 </label>
            <input type={'text'} className={'form-control'} id={'user-phone'} value={valuePhone} onChange={handlePhoneChange}/>
          </div>

          <div className={'mt-3'}>
            <label htmlFor={'user-gender'} className={'form-label'}> 성별 </label>
            <input type={'text'} className={'form-control'} id={'user-gender'} value={valueGender} onChange={handleGenderChange}/>
          </div>

          <div className={'mt-3 d-grid gap-2'}>
            <button type={'submit'} className={'btn btn-primary'}>확인</button>
            <button type={'reset'} className={'btn btn-secondary'}>취소</button>
          </div>
        </form>
      </div>
    </div>
  );
}

export default Join;