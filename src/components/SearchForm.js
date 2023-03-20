export default function SearchForm(props) {
    return (
        <div className="input-group flex-nowrap mt-3 mb-3">
            <input type="text" className="form-control" placeholder="Username" aria-label="Username" aria-describedby="addon-wrapping"/>
            <button className="btn btn-primary" id="addon-wrapping"> <i className="bi bi-search"></i>Search</button> 
           
        </div>
    )
}