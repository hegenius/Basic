import {useState, useEffect} from "react";
import useCounter from "./useCounter.jsx";

// 최대값 설정
const MAX_CAPACITY = 10;

// 일반 함수 컴포넌트 선언
function Accommodate() {
    // state로 관리할 변수 선언, 초기값은 false
    const [isFull, setIsFull] = useState(false);
    // 사용자가 만든 커스텀 훅을 사용하여 변수에 데이터 입력하기 
    // 커스텀 훅을 사용하여 변수 및 함수를 대신 만들어서 가져옴
    const [count, increaseCount, decreaseCount] = useCounter(0);

    // useEffect를 사용하여 componentDidMount() 함수 역할 수행
    useEffect(() => {
        console.log("===============");
        console.log("useEffect() is called.");
        console.log(`isFull: ${isFull}`);
    });

    useEffect(() => {
        setIsFull(count >= MAX_CAPACITY);
        console.log(`Current count value: ${count}`);
    }, [count]);

    return (
        <div>
            <p>{`총 ${count}명 수용했습니다.`}</p>
            <button type={'button'} className={'btn btn-primary'} onClick={increaseCount} disabled={isFull}>입장</button>
            <button type={'button'} className={'btn btn-success'} onClick={decreaseCount}>퇴장</button>

            {isFull && <p className={'text-danger'}>정원이 가득찼습니다.</p>}
        </div>
    );
}
export default Accommodate;