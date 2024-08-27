import Card from "./Card.jsx";

function ProfileCard() {
  return (
    // 부모 컴포넌트인 ProfileCard 에서 자식 컴포넌트인 Card 를 호출
    // 자식 컴포넌트 호출 시 title, backgroundColor 속성을 추가하고 데이터를 전달
    // 컴포넌트 합성 기법 중 포함(Containment) 를 사용하여 html 태그를 자식 컴포넌트에 전달
    <div>
      <Card title={'아이유'} backgroundColor={'#1E90FF'}>
        <p>안녕하세요. 아이유입니다.</p>
        <p>리액트 처음해봅니다.</p>
      </Card>
      <Card title={'아이유'} backgroundColor={'DeepPink'}>
        <p>안녕하세요. 아이유입니다.</p>
        <p>리액트 처음해봅니다.</p>
      </Card>
      <Card title={'아이유'}>
        <p>안녕하세요. 아이유입니다.</p>
        <p>리액트 처음해봅니다.</p>
      </Card>
      <Card backgroundColor={'#1E90FF'}>
        <p>안녕하세요. 아이유입니다.</p>
        <p>리액트 처음해봅니다.</p>
      </Card>
    </div>
  );
}

export default ProfileCard;