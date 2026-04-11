import { useEffect, useState } from 'react';
import './clockInOut.css';
import fingerprint from '../assets/fingerprint.png';
import clockIcon from '../assets/clockIcon.png';
import { NavLink, useLocation } from 'react-router-dom';


export default function ClockInOut(){

    const location = useLocation();
    console.log(location);
    const [checPoints, setCheckPoints] = useState(['ponto 1', 'ponto 2', 'ponto 3', 'ponto 4', 'ponto 4', 'ponto 4', 'ponto 4', 'ponto 4']);

    return(
        <div className='pageContainer'>
            <header className='menuRegister'>
                <p>Ponto Certo</p>
                <nav>
                    <a href='#check' className={ location.hash === "#check" || location.hash === "" ? "active": ""} end>Início</a>
                    <a href='#registers' className={ location.hash === "#registers" ? "active": ""} end>Histórico</a>
                </nav>
                <a>Sair</a>
            </header>
            <main className='mainBlock'>
                <div id='check' className='checkContainer'>
                    <div className='blocks'>
                        <div className='leftBlocks'>
                            <div className='aBox'>
                                <h1>00:00</h1>
                                <p>Dia da semana, 00 de mês</p>
                                <button>
                                    <img alt='impressão digital' className='fingerprint' src={fingerprint}/>
                                    Registrar Ponto
                                </button>
                                <select>
                                    <option>Loja 1</option>
                                    <option>Loja 2</option>
                                    <option>Loja 3</option>
                                </select>
                            </div>
                            <div className='bBox'>
                                <img src='' alt='logo de entrada'/>
                                <div>
                                    <p>Ultima marcação</p>
                                    <h3>tipo da marcação: horário</h3>
                                    <p>status</p>
                                </div>
                            </div>
                            <div className='cBox'>
                                <img className='clockIcon' src={clockIcon} alt='ícone de relógio'/>
                                <div>
                                    <p>Jornada do dia</p>
                                    <h3>Horário</h3>
                                    <p>Meta: valor de horas do dia</p>
                                </div>   
                            </div>
                        </div>
                        <div className='dBox'>
                            <h3>Registros do dia</h3>
                            <div className='checkpoints'>
                                {checPoints.map((point, index)=> (
                                    index < checPoints.length - 1 ? 
                                    <div key={index}>
                                        <div className='checkpoint'>
                                            <img src={clockIcon}/>
                                            <p>{point}</p>
                                        </div>
                                        <p>|</p>
                                        <p>|</p>
                                    </div> : 
                                    <div className='checkpoint' key={index}> <img src={clockIcon}/> <span>{point}</span></div>

                                    
                                ))}
                            </div>
                        </div>
                    </div>
                </div>
                <div id='registers' className='registersContainer'>

                </div>
            </main>
        </div>
    );
}