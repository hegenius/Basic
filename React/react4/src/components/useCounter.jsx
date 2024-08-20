import {useState} from "react";

// 커스텀 훅으로 사용하기 위해서 생성한 함수
// 커스텀 훅 사용 조건
// 1. 함수명이 'use' 로 시작
// 2. 함수 내부에서 다른 리액트 훅을 사용
function useCounter(initValue) {
    // useState 를 사용하여 변수 count 를 state 객체로 관리, 초기값으로 매개변수를 받아와서 사용함
    const [count, setCount] = useState(initValue);

    // const incrementCount = () => setCount((count) => count + 1 );
    const incrementCount = () => {
        return (
            setCount((count) => {
                return count + 1;
            })
        );
    }

    const decrementCount = () => setCount((count) => Math.max(count - 1,  0));

    // state 객체
    return [count, incrementCount, decrementCount];
}
export default useCounter;