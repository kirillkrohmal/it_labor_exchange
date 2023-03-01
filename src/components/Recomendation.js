export default function Recomendation(props) {
    return (
        <div className="card mt-3 me-3" style={{width: "18rem"} }>
            <div className="card-body">
                <h5 className="card-title">{props.title}</h5>
                <p className="card-text">{props.salary}</p>
                <p className="card-text">{props.description}</p>            
            </div>
        </div> 
    )

}