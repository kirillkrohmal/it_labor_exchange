export default function SearchForm(props) {
    return (
        <div class="input-group flex-nowrap mt-3 mb-3">
            <input type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="addon-wrapping"/>
            <button class="btn btn-primary" id="addon-wrapping"> <i class="bi bi-search"></i>Search</button> 
           
        </div>
    )
}