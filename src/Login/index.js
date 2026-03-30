import './login.css';
import relogioPNG from '../assets/relogio.png';

export default function Login(){
    return(
        <div className='bodyPage'>
            <div className='mainContainer'>
                <div className='leftText'>
                    <header>Ponto certo</header>
                    <main>
                        <h1>A precisão que  o seu <span>RH</span> merece.</h1>
                        <p>Gestão de ponto inteligente com transparência para a sua equipe.</p>
                        <img src={relogioPNG} alt='imagem de um relogio'></img>
                    </main>
                </div>
                <div className='containerForm'>
                    <h2>Bem-vindo ao ponto certo</h2>
                    <p>Acesse sua conta para gerenciar seu ponto</p>
                    <form>
                        <label >
                            E-mail corporativo
                            <input placeholder='Digite seu e-mail corporativo' type='text'/>
                        </label>
                        <label >
                            Senha
                            <input placeholder='Digite sua senha' type='password'/>
                        </label>
                        <button>Acessar painel</button>
                    </form>
                    <hr/>
                    <p>Ainda não tem acesso?</p>
                    <button>Solicitar acesso ao RH</button>
                </div>
            </div>
        </div>
    );
}