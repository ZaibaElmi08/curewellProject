import React, { useState } from "react";

const ViewSpecializations = () => {
  const [specializations] = useState([
    { code: "ANE", name: "Anesthesiologist" },
    { code: "CAR", name: "Cardiologist" },
    { code: "GYN", name: "Gynecologist" }
  ]);

  return (
    <div style={{ textAlign: "center", margin: "20px" }}>
      <h2>View Specialization</h2>
      <table border="1" style={{ width: "50%", margin: "auto", borderCollapse: "collapse" }}>
        <thead>
          <tr>
            <th>Specialization Code</th>
            <th>Specialization Name</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {specializations.map((specialization) => (
            <tr key={specialization.code}>
              <td>{specialization.code}</td>
              <td>{specialization.name}</td>
              <td>
                <button onClick={() => alert(`Viewing doctors for ${specialization.name}`)}>
                  View Doctors
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ViewSpecializations;
