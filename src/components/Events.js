import EventsRow from "./EventsRow"


export default function Events(props) {
    return (
       
        <div class="row">
            <div class="col-6">
                <h6>Мои события</h6>
                <EventsRow title="Отклики и приглашения" rate="+3" icon="aspect-ratio"/> 
                <EventsRow title="Просмотры и резюме" rate="+3" icon="heart"/> 
                <EventsRow title="Избранные вакансии" rate="0" icon="bookmark"/> 
                <EventsRow title="Автопоиски" rate="" icon="search"/> 

            
            </div>

            <div class="col-6">
                <h6>Подработка</h6>
                <p class="w-75">Разовые задания, неполный рабочий день, временная работа и другая подработка</p>
                <button class="btn btn-info">Найти</button>
            </div>
        </div>
    )
}