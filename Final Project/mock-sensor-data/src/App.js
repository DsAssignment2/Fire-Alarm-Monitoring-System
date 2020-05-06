import React, { Component } from 'react';

import './App.css';

class App extends Component {
  
  constructor(props) {
    super(props);
    this.state = { sensors: [] } // store sensor details
    this.updateCount = 0;
    this.updatedSensors = { sensors: [] }; // store update sensor details
   }
      
    
    componentDidMount() {
      this.timerID = setInterval(
        () => this.getSensorData(),
        5000 // to change the smoke level and co2 level of a randomly selected sensor in every 5 seconds
      );
    }
  
    componentWillUnmount() {
      clearInterval(this.timerID); // clear the randomly selected sensor details recursively
    }

    getSensorData() { // for get sensor details
      if(this.updateCount===0){
        const url = "/firealarmrest/webapi/sensor"; // call the API for get sensor details
        fetch(url)
            .then(response => response.json())
            .then((responseJson)=>{
              this.setState({ sensors: responseJson });
              this.updateSensorData();
            });
      }else{
        this.updateSensorData();
      }
      this.updateCount++; // increase the update count by 1
      if(this.updateCount===5){
        this.updateCount=0; // set the update count value to 0
      }
    }

    updateSensorData() {
      const { sensors } = this.state;
      let randomSensor = sensors[Math.floor(Math.random() * Math.floor(sensors.length))]; // get randomly selected sensor
      let randomSensorId = randomSensor.sensorId; // get the Id of the randomly selected sensor and assign it to randomSensorId

      let requestBody = {
        co2Level : Math.floor(Math.random() * 10) + 1, // generate a co2 level value between 0 and 10
        smokeLevel : Math.floor(Math.random() * 10) + 1 // generate a smoke level value between 0 and 10
      }
      
       //call the API for update co2 level and smoke level of randomly selected sensor
       const url = "/firealarmrest/webapi/sensor/by/"+randomSensorId;

      const requestOptions = {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(requestBody)
      };
    fetch(url, requestOptions)
        .then(response => response.json())
        .then((updatedSensor)=>{
          this.showUpdatedSensor(updatedSensor); // show the updates sensor details
        });
   }

   showUpdatedSensor(updatedSensor){
      this.updatedSensors.sensors.push(updatedSensor);
   }
  

    render() {
        const { sensors } = this.updatedSensors;
        return (

          <div className = "container-fluid">
                <div className = "jumbotron">
                  <h1 className = "display-4">Mock Sensor</h1>
                </div>
                <div className="row code">

                  {
                      sensors.map((sensor) => ( 
                        <div className="col-sm-12">
                            //print the updated co2 level snd smoke level values
                          <p>Co2 Level: { sensor.co2Level }, Smoke Level: {sensor.smokeLevel} </p>
                        </div>
                      ))
                  } 

              </div>
            </div>
        );
    }



    

}
export default App;