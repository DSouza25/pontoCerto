import { useEffect, useState } from 'react';
import './clockInOut.css';
import fingerprint from '../assets/fingerprint.png';
import { NavLink } from 'react-router-dom';


export default function ClockInOut(){

    return(
        <div className='pageContainer'>
            <header className='menuRegister'>
                <p>Ponto Certo</p>
                <nav>
                    <NavLink to="/clockInOut" className={({isActive}) => isActive ? "active": ""} end>Início</NavLink>
                    <NavLink to="/clockInOut/" className={({isActive}) => isActive ? "active": ""} end>Histórico</NavLink>
                </nav>
                <a>Sair</a>
            </header>
            <div className='checkContainer'>
                <div className='aBox'>Bloco A</div>
                <div className='bBox'>Bloco B</div>
                <div className='cBox'>Bloco C</div>
                <div className='dBox'>Bloco D</div>
            </div>
        </div>
    );
}