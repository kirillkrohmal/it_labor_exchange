import Recomendation from "./Recomendation";
import { useState, useEffect } from "react";

export default function Recomendations(props) {
    const [recomendations, setRecomendations] = useState([]) 

    useEffect(() => {
        fetch("/api/recommendations")
        .then (responce => {
          console.log(responce)
          if (!responce.ok) {
            throw Error(responce)
          }
          return responce.json()
        })
        .then (array => setRecomendations(array))
        .catch(error => console.log(error))
    }, [])

    return (
        <>
        <div className="d-flex flex-wrap">
          {
            recomendations.map(el => <Recomendation title={el.title} salary={el.salary} description={el.description}/>)
          }
        </div>
        <div className="d-flex mt-3">
            <button className="btn btn-primary">Показать все</button> 
            <button className="btn btn-primary ms-3">На карте</button> 

        </div>
        </>
    )
}