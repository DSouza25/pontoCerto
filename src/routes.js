import { BrowserRouter, Route, Routes } from "react-router-dom";
import Login from './Login';
import Error from './Error';
import Home from './Home';

export default function RoutesApp(){
    return (
      <BrowserRouter>
          <Routes>
              <Route path="/" element={<Login/>}/>
              <Route path="/home" element={<Home/>}/>
              <Route path="*" element={<Error/>}/>
          </Routes>
      </BrowserRouter>
    );
}