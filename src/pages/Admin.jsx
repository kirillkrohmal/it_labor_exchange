import Recomendations from "../components/Recomendations";
import Users from "../components/Users";
export default function Admin (props) {
    

    return (
        <>
        
        <h1>Admin</h1>
        
        <Recomendations isAdmin={true}/>
        <Users />
        </>
    )
}