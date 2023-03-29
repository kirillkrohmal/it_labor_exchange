export default function User(props) {
  const { id, userName, isEnabled } = props;

  return (
    <tr>
      <td>{id}</td>
      <td>{userName}</td>
      <td>{isEnabled}</td>
      <td>resume</td>
    </tr>
  );
}
