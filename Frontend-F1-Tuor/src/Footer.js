import './App.css';
import Logo from './imagens/mercado-pago-logo.png';

function Footer() {
    return (
        <footer>
            <h3>Formas de pagamento</h3>
            <img className='footer' src={Logo} alt="Formas de pagamento" />
        </footer>
    );
}

export default Footer;