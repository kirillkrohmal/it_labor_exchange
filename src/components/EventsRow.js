export default function EventsRow(props) {
    return (
        <div class="row">
            <div class="col-1">
                {props.icon === "aspect-ratio" && <i class="bi bi-aspect-ratio"></i>}
                {props.icon === "heart" && <i class="bi bi-heart"></i>}
                {props.icon === "bookmark" && <i class="bi bi-bookmark"></i>}
                {props.icon === "search" && <i class="bi bi-search"></i>}
 
            </div>
            <div class="col-8">{props.title}</div>
            <div class="col-1 text-end">{props.rate}</div>
        </div>
    )
}