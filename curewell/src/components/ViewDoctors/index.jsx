import React, { useState } from "react";

const ViewDoctors = () => {
  // Static data (later replace with API call)
  const [doctors, setDoctors] = useState([
    { id: 1001, name: "Albert" },
    { id: 1002, name: "Olivia" },
    { id: 1003, name: "Susan" }
  ]);

  return (
    <div style={{ textAlign: "center", margin: "20px" }}>
      <h2>View Doctor</h2>
      <table border="1" style={{ width: "50%", margin: "auto", borderCollapse: "collapse" }}>
        <thead>
          <tr>
            <th>Doctor ID</th>
            <th>Doctor Name</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {doctors.map((doctor) => (
            <tr key={doctor.id}>
              <td>{doctor.id}</td>
              <td>{doctor.name}</td>
              <td>
                <button onClick={() => alert(`Edit ${doctor.name}`)}>Edit Doctor Details</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ViewDoctors;
