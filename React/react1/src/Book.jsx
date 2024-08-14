
// 부모 컴포넌트에서 전달받은 porps 객체는 이름이 props로 고정되어 있음
// props.속성명 형태로 사용할 수 있음
// JSX에서 직접 사용 시 {}로 감싸서 사용함 (<h1>{props.name}</h1>)
// 전달받은 props 객체의 데이터를 변수에 저장하여 사용하는 것도 가능함

// 1번 방식
function Book(props) {
    return (
        <div>
            <h1>{`이 책의 이름은 ${props.name} 입니다`}</h1>
            <h2>{`이 책은 총 ${props.numOfPage} 페이지로 이루어져 있습니다.`}</h2>
        </div>
    );
}

// // 2번 방식
// function Book(props) {
//     let bookName = props.name;
//     const bookPage = props.numOfPage;
//
//     return (
//         <div>
//             <h1>{`이 책의 이름은 ${bookName} 입니다`}</h1>
//             <h2>{`이 책은 총 ${bookPage} 페이지로 이루어져 있습니다.`}</h2>
//         </div>
//     );
// }
//
// // 3번 방식
// function Book() {
//     const{name, numOfPage} = props;
//     return (
//         <div>
//             <h1>{`이 책의 이름은 ${name} 입니다`}</h1>
//             <h2>{`이 책은 총 ${numOfPage} 페이지로 이루어져 있습니다.`}</h2>
//         </div>
//     );
// }
//
// // 4번 방식
// function Book({name, numOfPage}) {
//     return (
//         <div>
//             <h1>{`이 책의 이름은 ${name} 입니다`}</h1>
//             <h2>{`이 책은 총 ${numOfPage} 페이지로 이루어져 있습니다.`}</h2>
//         </div>
//     );
// }

export default Book;