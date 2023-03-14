export default function RecommendationAdmin(props) {
  const { title, salary, description, id, refetch } = props;

  function deleteRecommendation() {
    fetch("/api/recommendations/" + id, { method: "DELETE" })
      .then((response) => {
        if (!response.ok) throw "Не удалось удалить запись";
        return response.text();
      })
      .then((text) => {
        refetch();
      })
      .catch((error) => alert(error));
  }

  return (
    <tr>
      <td>{title}</td>
      <td>{salary}</td>
      <td>{description}</td>
      <td>
        <button onClick={deleteRecommendation}>Удалить</button>
        <button>Править</button>
      </td>
    </tr>
  );
}
