import InnerAdvertisingItem from "./InnerAdvertisingItem";

export default function InnerAdvertising(props) {
    return (
        <div class="row mt-3" >
            <div class="col-6" >
                <InnerAdvertisingItem title="Полезный сервис «Хочу у вас работать»" image="useful-service" link="https://hh.ru/article/98?from=tizer_60x60"/>        
            </div>
            <div class="col-6">
                <InnerAdvertisingItem title="Тысячи вакансий в твоем смартфоне" image="smartphone" link="https://hh.ru/mobile?from=tizer_60x60"/>
            </div>
        </div>
    )
}