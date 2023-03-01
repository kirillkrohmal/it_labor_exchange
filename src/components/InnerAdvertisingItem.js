export default function InnerAdvertisinItem(props) {
    return (
        <div>
            <img className="me-3" src={`/img/${props.image}.png`} alt={props.title} title="Внутренняя реклама"/ >
            <a href={props.link}>{props.title}</a>

        </div>
    )
}