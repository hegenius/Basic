
// 컴포넌트 추출로 인하여 새로 생성된 자식 컴포넌트
function UserInfo(props) {
    return (
        <div className={'mt-3'}>
            {/* 부모 컴포넌트가 UserInfo 컴포넌트 호출 시 props에 전달한 데이터의 key 명이 userData 임 */}
            <img className={'img-thumbnail w-50'} src={props.userData.avatarUrl} alt={props.userData.name}/>
            <div className={'mt-2 px-3 fs-3'}>{props.userData.name}</div>
        </div>
    );
}

export default UserInfo;