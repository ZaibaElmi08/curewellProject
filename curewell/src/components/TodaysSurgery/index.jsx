import React, { useState } from "react";

const ViewTodaysSurgery = () => {
  const [surgeries] = useState([
    { id: 5000, doctorId: 1001, date: "01/01/2011", startTime: 17, endTime: 19, category: "ANE" },
    { id: 5001, doctorId: 1002, date: "01/01/2015", startTime: 15, endTime: 10, category: "CAR" }
  ]);

  return (
    <div style={{ textAlign: "center", margin: "20px" }}>
      <h2>View Today's Surgery</h2>
      <table border="1" style={{ width: "70%", margin: "auto", borderCollapse: "collapse" }}>
        <thead>
          <tr>
            <th>Surgery ID</th>
            <th>Doctor ID</th>
            <th>Surgery Date</th>
            <th>Start Time</th>
            <th>End Time</th>
            <th>Category</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {surgeries.map((surgery) => (
            <tr key={surgery.id}>
              <td>{surgery.id}</td>
              <td>{surgery.doctorId}</td>
              <td>{surgery.date}</td>
              <td>{surgery.startTime}</td>
              <td>{surgery.endTime}</td>
              <td>{surgery.category}</td>
              <td>
                <button onClick={() => alert(`Editing surgery time for ID ${surgery.id}`)}>
                  Edit Surgery Time
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ViewTodaysSurgery;
