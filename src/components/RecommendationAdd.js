export default function RecommendationAdd(props) {
  const { refetch } = props;
  async function addVacancy(event) {
    event.preventDefault();
    const title = event.target.title.value;
    const salary = event.target.salary.value;
    const description = event.target.description.value;
    if (!title || !salary || !description)
      return alert("Необходимо заполнить форму");
    const body = { title, salary, description };

    try {
      const response = await fetch("/api/recommendations", {
        method: "POST",
        body: JSON.stringify(body),
        //body: {title, salary, description},
        headers: { "Content-Type": "application/json" },
      });
      if (!response.ok) throw "На стороне сервера произошла ошибка";
      //const reply = await response.text();
      refetch();
      event.target.reset();
      //alert("Данные успешно добавлены" + reply);
    } catch (error) {
      alert("На стороне сервера произошла ошибка");
      console.log(error);
    }
  }

  return (
    <form onSubmit={addVacancy}>
      <input name="title" placeholder="Название вакансии" />
      <br />
      <input name="salary" placeholder="Зарплата" />
      <br />
      <input name="description" placeholder="Описание" />
      <br />
      <input type="submit" value="Отправить" />
    </form>
  );
}
