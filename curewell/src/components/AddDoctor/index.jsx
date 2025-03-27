import React, { useState } from "react";

const AddDoctor = () => {
  const [doctorName, setDoctorName] = useState("");
  const [message, setMessage] = useState("");

  const handleAddDoctor = () => {
    if (doctorName.trim() !== "") {
      setMessage(`Doctor ${doctorName} successfully added`);
      setDoctorName("");
    } else {
      setMessage("Please enter a valid doctor name");
    }
  };

  return (
    <div style={{ textAlign: "center", margin: "20px" }}>
      <h2>Add a New Doctor</h2>
      <label>
        Doctor Name:{" "}
        <input
          type="text"
          value={doctorName}
          onChange={(e) => setDoctorName(e.target.value)}
        />
      </label>
      <button onClick={handleAddDoctor} style={{ marginLeft: "10px" }}>
        Add Doctor
      </button>
      <button onClick={() => setDoctorName("")} style={{ marginLeft: "10px" }}>
        Cancel
      </button>
      <p style={{ color: "red", marginTop: "10px" }}>{message}</p>
    </div>
  );
};

export default AddDoctor;
