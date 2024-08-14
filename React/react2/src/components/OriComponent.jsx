function formatDate(date) {
    return date.toLocaleString();
}

function OriComponent(props) {
    return (
        <div className={'container mt-4'}>
            <div className={'mt-3'}>
                <img className={'img-thumbnail w-50'} src={props.author.avatarUrl} alt={props.author.name}/>
                <div className={'mt-2 px-3 fs-3'}>{props.author.name}</div>
            </div>
            <div className={'mt-2 px-3 fs-3'}>{props.text}</div>
            <div className={'mt-2 px-3 fs-3'}>{formatDate(props.date)}</div>
        </div>
    );
}

export default OriComponent;