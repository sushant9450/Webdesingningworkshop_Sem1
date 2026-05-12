
function Student(props) {
  return (
    <div
      style={{
        border: "1px solid #ccc",
        padding: "15px",
        margin: "10px",
        borderRadius: "8px",
        backgroundColor: "#f5f5f5",
        boxShadow: "0 0 5px gray",
      }}
    >
      {}
      <h3>{props.name}</h3>
      <p>
        <b>Course:</b> {props.course}
      </p>
      <p>
        <b>Marks:</b> {props.marks}
      </p>
    </div>
  );
}


function App() {
  return (
    <div
      style={{
        border: "1px solid black",
        width: "300px",
        padding: "20px",
        margin: "20px auto",
        textAlign: "center",
      }}
    >
      <h1>Student Information</h1>

      {}
      <Student
        name="Sushant Singh"
        course="CSE"
        marks="85"
      />

      <Student
        name="Prince Jaiswal"
        course="IT"
        marks="92"
      />

      <Student
        name="Om jee Maurya"
        course="AIML"
        marks="78"
      />
    </div>
  );
}

export default App;