import { useEffect, useState } from 'react';
import './clockInOut.css';
import fingerprint from '../assets/fingerprint.png';


export default function ClockInOut(){

    return(
        <div className='pageContainer'>
            <div className='checkContainer'>
                <h1>Hora atual</h1>
                <p>data atual</p>
                <button>Registrar Ponto</button>
            </div>
        </div>
    );
}