// 현재 컴포넌트에서 사용하는 css 스타일 지정
// jsx 문법에서는 css 스타일을 js의 object 타입으로 입력
const styles= {
    wrapper : {
        margin:8,
        padding:8,
        display: 'flex',
        flexDirection:'row',
        border : '1px solid grey',
        borderRadius : 16,
    },
    imageContainer: {
    },
    image:{
        width:50,
        height:50,
        borderRadius:25,
    },
    contentContainer:{
        marginLeft:8,
        display: 'flex',
        flexDirection: 'column',
        justifyContent:'center',
    },
    nameText: {
        color:'black',
        fontSize:16,
        fontWeight:'bold',
    },
    commentText:{
        color:'black',
        fontSize: 16,
    },
}


function Comment(props) {
    return (
        <div style={styles.wrapper}>
            <div style={styles.imageContainer}>
                <img src="https://cdn-icons-png.flaticon.com/512/4889/4889066.png" alt="사람아이콘" style={styles.image}/>
            </div>
            <div style={styles.contentContainer}>
                <span style={styles.nameText}>{props.name}</span>
                <span style={styles.commentText}>{props.comment}</span>
            </div>
        </div>
    );
}

export default Comment;