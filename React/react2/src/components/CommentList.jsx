import Comment from "./Comment.jsx";

const commentList = [
    {seq:1, name:'황성빈', comment:'안녕하세요. 황성빈입니다.'},
    {seq:2, name:'윤동희', comment:'안녕하세요. 윤동희입니다.'},
    {seq:3, name:'손호영', comment:'안녕하세요. 손호영입니다.'},
    {seq:4, name:'전준우', comment:'안녕하세요. 전준우입니다.'},
    {seq:5, name:'정훈', comment:'안녕하세요. 정훈입니다.'},
]

function CommentList() {
    return (
        <div className={'container mt-4'}>
        {/* {} 를 사용하여 자바스크립트 코드를 입력함 */}
            {
                // ES6의 map() 함수를 사용하여 배열에 저장된 내용을 모두 사용하고 새로운 배열을 생성
                commentList.map(item => {
                   // 반환값 부분에 Comment 컴포넌트를 반환
                    return (
                      //   Comment 컴포넌트에 name, comment 속성을 지정하여 데이터를 전달
                      //   map() 을 사용하여 자식컴포넌트를 여러개 출력할 경우 key 속성을 반드시 지정해야 함
                      //   key 속성은 각각의 자식 컴포넌트를 식별하는 역할을 함
                      //   key 속성은 데이터 리스트 자체에서 데이터를 식별할 수 있는 데이터로 사용 (pk값 제일 좋음)
                      //   식별할 수 있는 데이터가 없을 경우 index를 사용(권장하지 않음), 하단 참고
                        <Comment name={item.name} comment={item.comment} key={item.seq}/>
                    );
                })
            }
        </div>
    );
}

// 식별할 수 있는 데이터가 없을 경우 index를 사용
// const commentList = [
//     {name:'황성빈', comment:'안녕하세요. 황성빈입니다.'},
//     {name:'윤동희', comment:'안녕하세요. 윤동희입니다.'},
//     {name:'손호영', comment:'안녕하세요. 손호영입니다.'},
//     {name:'전준우', comment:'안녕하세요. 전준우입니다.'},
//     {name:'정훈', comment:'안녕하세요. 정훈입니다.'},
// ]

// function CommentList() {
//     return (
//         <div className={'container mt-4'}>

//             {/*<Comment name={'test1'} comment={'댓글 테스트1입니다.'}/>*/}
//             {/*<Comment name={'test1'} comment={'댓글 테스트2입니다.'}/>*/}
//             {/*<Comment name={'test1'} comment={'댓글 테스트3입니다.'}/>*/}
//             {/*<Comment name={'test1'} comment={'댓글 테스트4입니다.'}/>*/}
//             {/*<Comment name={'test1'} comment={'댓글 테스트5입니다.'}/>*/}
//             {
//                 commentList.map((item, index) => {
//                     return (
//                       <Comment name={item.name} comment={item.comment} key={index}/>
//                     );
//                 })
//             }
//         </div>
//     );
// }


export default CommentList;