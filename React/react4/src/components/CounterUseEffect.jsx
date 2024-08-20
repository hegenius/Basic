import {useState, useEffect} from "react";

function CounterUseEffect() {
    // state 객체로 관리하는 변수 count, setCount() 함수를 선언, 초기값은 0
    const [count1, setCount1] = useState(0);
    const [count2, setCount2] = useState(0);

    // console.log('\n--------- CounterUseEffect 컴포넌트 실행 ---------\n')

    // useEffect : 리액트에서 제공하는 hook 중 하나로 클래스 컴포넌트만 사용할 수 있었던 리액트 컴포넌트 생명주기 함수를 사용할 수 있게 해줌
    // 하나의 컴포넌트에서 useEffect()를 여러번 사ㅛㅇ할 수 없음
    // 사용법 :
    // useEffect(effect 콜백함수, 의존성 배열);
    
    // effect 콜백함수 : useEffect 사용 시 동작할 소스코드
    // 의존성 배열 : 배열 안에 지정한 변수의 내용이 변경될 경우 useEffect 가 동작함
    useEffect(() => {
        setCount2(100);
        console.log('\n------ 컴포넌트 mount 시 동작 ------\n')
    }, []);

    // componentDidUpdate 함수의 역할
    // useEffect 사용 시 의존성 배열에 변수를 지정함, 주로 state 객체로 관리되는 변수를 지정
    // 의존성 배열의 요소를 지정된 변수의 값이 변경되면 componentDidUpdate() 함수로써 useEffect 가 동작함
    useEffect(() => {
        document.title = `총 ${count1} 번 클릭했습니다.`;
        console.log('\n------ 컴포넌트 update 시 동작 ------\n')
    }, [count1]);

    // componentWillUnmount() 함수의 역할
    // useEffect 사용 시 effect 콜백함수의 return 부분에 콜백함수를 입력하면 해당 컴포넌트가 삭제될 때 useEffect 가 동작하여 componentWillUnmount()함수의 역할을 수행함
    useEffect(() => {
        return () => {
        console.log('\n------ 컴포넌트 unmount 시 동작 ------\n')
        }
    }, []);
    
    return (
        <div>
            <p>총 <span className={'fs-3'}>{count1}</span> 번 클릭했습니다.</p>
            <button type={'button'} className={'btn btn-primary'} onClick={() => setCount1(count1+ 1)}>클릭</button>
            <div className={'mt-3'}>
                <p>두번째 count의 값 : <span className={'fs-3'}>{count2}</span></p>
                <button type={'button'} className={'btn btn-primary'} onClick={() => setCount2(count2 + 10)}>+10 클릭</button>
            </div>
        </div>
    );
}
export default CounterUseEffect;