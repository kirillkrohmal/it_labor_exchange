import Recomendations from "../components/Recomendations";

export default function Admin (props) {
    

    return (
        <>
        
        <h1>Admin</h1>
        
        <Recomendations isAdmin={true}/>
        </>
    )
}