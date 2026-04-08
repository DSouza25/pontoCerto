import { BrowserRouter, Route, Routes } from "react-router-dom";
import Login from './Login';
import Error from './Error';
import Home from './Home';
import ClockInOut from "./ClockInOut";

export default function RoutesApp(){
    return (
      <BrowserRouter>
          <Routes>
              <Route path="/" element={<Login/>}/>
              <Route path="/home" element={<Home/>}/>
              <Route path="/clockInOut" element={<ClockInOut/>}/>
              <Route path="*" element={<Error/>}/>
          </Routes>
      </BrowserRouter>
    );
}