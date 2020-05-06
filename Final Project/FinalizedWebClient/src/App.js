import React, { Component } from 'react';

import './App.css';

class App extends Component {
    constructor(props) {
        super(props);
        this.state = { sensors: [] } // store sensor details
    }

    componentDidMount() {
      this.updateSensorData();

      this.timerID = setInterval(
        () => this.updateSensorData(),
        40000 // to refresh the sensor details in every 40 seconds
      );
    }
  
    componentWillUnmount() {
      clearInterval(this.timerID);
    }

    updateSensorData() {

        const url = "/firealarmrest/webapi/sensor"; // API call for get the sensor details
        fetch(url)
          .then(response => response.json())
          .then(json => this.setState({ sensors: json }));
   }
  

    render() {
        const { sensors } = this.state;
        return (

          <div className = "container-fluid">
                <div className = "jumbotron-custom">
                  <h1 className = "display-4">Sensor Dashbord</h1>
                </div>

                <div className="row">

                  {
                      sensors.map((sensor) => ( 
                        <div className="col-xl-4 col-lg-5 col-md-6 col-sm-12">
                          <div className={sensor.status===1 ? "card" : "card disabled" }>
                            <div className="card-body">
                              <div className="header">
                                   {/*change the color according to the sensor status whether it is active or not*/}
                                <div className={sensor.status===1 ? "led green" : "led red" } title={sensor.status===1 ? "Sensor is Working" : "Sensor Disabled"}></div>
                                <h5 className="card-title">Floor #{ sensor.floorNo } - Room #{ sensor.roomNo }</h5>
                              </div>
                              <div className="body">
                                <p className="sensor-id">Sensor ID: <span>{ sensor.sensorId }</span></p>
                                <div className="row">
                                  <div className="col-md-6">
                                    Co2 Level : {sensor.status===1 ? sensor.co2Level : "Disabled"}
                                    <div className="progress">
                                      <div className={sensor.co2Level<4 ? "progress-bar bg-success" 
                                      : (sensor.co2Level<5 ? "progress-bar bg-warning" : "progress-bar bg-danger")} role="progressbar" 
                                      style={{"width": sensor.status===1 ? ((sensor.co2Level)*10 + "%") : "0%"}}
                                      aria-valuenow={ sensor.status===1 ? sensor.co2Level : 0 }
                                      aria-valuemin="0" aria-valuemax="10">{sensor.status===1 ? (sensor.co2Level)*10 + "%" : ""}</div>
                                    </div>
                                  </div>
                                  <div className="col-md-6">
                                    Smoke Level : {sensor.status===1 ? sensor.smokeLevel : "Disabled"}
                                    <div className="progress">
                                      <div className={sensor.smokeLevel<4 ? "progress-bar bg-success" 
                                      : (sensor.smokeLevel<5 ? "progress-bar bg-warning" : "progress-bar bg-danger")} role="progressbar" 
                                      style={{"width": sensor.status===1 ? ((sensor.smokeLevel)*10 + "%") : "0%"}}
                                      aria-valuenow={ sensor.status===1 ? sensor.smokeLevel : 0 }
                                      aria-valuemin="0" aria-valuemax="10">{sensor.status===1 ? (sensor.smokeLevel)*10 + "%" : ""}</div>
                                    </div>
                                  </div>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                      ))
                  } 

                </div>
              </div>
        );
    }



    

}
export default App;