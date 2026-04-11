import { useEffect, useState } from 'react';
import './clockInOut.css';
import fingerprint from '../assets/fingerprint.png';
import { NavLink, useLocation } from 'react-router-dom';


export default function ClockInOut(){

    const location = useLocation();
    console.log(location);
    

    return(
        <div className='pageContainer'>
            <header className='menuRegister'>
                <p>Ponto Certo</p>
                <nav>
                    <a href='#check' className={ location.hash === "#check" ? "active": ""} end>Início</a>
                    <a href='#registers' className={ location.hash === "#registers" ? "active": ""} end>Histórico</a>
                </nav>
                <a>Sair</a>
            </header>
            <main className='mainBlock'>
                <div id='check' className='checkContainer'>
                    <div className='aBox'>Bloco A</div>
                    <div className='bBox'>Bloco B</div>
                    <div className='cBox'>Bloco C</div>
                    <div className='dBox'>Bloco D</div>
                </div>
                <div id='registers' className='registersContainer'>

                </div>
            </main>
        </div>
    );
}