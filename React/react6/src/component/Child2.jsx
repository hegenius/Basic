
function Child2(props) {
  return (
    <div className={'border border-2 border-success rounded-2 m-4 p-4'}>
      <h2>오른쪽 자식 컴포넌트 영역</h2>
      <h2>첫번째 전달받은 값 : {props.data}</h2>
      <h3>두번째 전달받은 값 : {props.data2}</h3>
    </div>
  );
}

export default Child2;