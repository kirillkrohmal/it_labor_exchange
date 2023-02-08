export default function Recomendation(props) {
    return (
        <div class="card mt-3 me-3" style={{width: "18rem"} }>
            <div class="card-body">
                <h5 class="card-title">{props.title}</h5>
                <p class="card-text">{props.salary}</p>
                <p class="card-text">{props.description}</p>            
            </div>
        </div> 
    )

}