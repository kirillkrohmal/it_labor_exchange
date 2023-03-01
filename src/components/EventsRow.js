export default function EventsRow(props) {
    return (
        <div className="row">
            <div className="col-1">
                {props.icon === "aspect-ratio" && <i className="bi bi-aspect-ratio"></i>}
                {props.icon === "heart" && <i className="bi bi-heart"></i>}
                {props.icon === "bookmark" && <i className="bi bi-bookmark"></i>}
                {props.icon === "search" && <i className="bi bi-search"></i>}
 
            </div>
            <div className="col-8">{props.title}</div>
            <div className="col-1 text-end">{props.rate}</div>
        </div>
    )
}