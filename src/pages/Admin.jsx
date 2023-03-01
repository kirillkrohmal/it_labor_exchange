import Recomendations from "../components/Recomendations";

export default function Admin (props) {
    async function addVacancy(event) {
        event.preventDefault()
        const title = event.target.title.value;
        const salary = event.target.salary.value;
        const description = event.target.description.value;
        //if(!title || !salary || !description) return alert("Необходимо заполнить форму")
        const body = {title, salary, description}
        
        
        try {
            const response = await fetch("/api/recommendations", {
            method: "POST",
            body: JSON.stringify(body),
            //body: {title, salary, description},
            headers: {"Content-Type": "application/json"} 
        })
        if(!response.ok) throw "На стороне сервера произошла ошибка"
        const reply = await response.text()
        alert("Данные успешно добавлены" + reply)
        
        }
        catch(error ) {
            alert("На стороне сервера произошла ошибка")
            console.log(error);
        }
     }

    return (
        <>
        
        <h1>Admin</h1>
        <form onSubmit={addVacancy}>
            <input name="title"/>
            <br/>
            <input name="salary"/>
            <br/>
            <input name="description"/>
            <br/>
            <input type="submit" value="Отправить"/>
        </form>
        <Recomendations isAdmin={true}/>
        </>
    )
}