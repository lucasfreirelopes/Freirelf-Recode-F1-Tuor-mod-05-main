import phone from '../imagens/phone_14402.png';
import email from '../imagens/email_14410.png';

function Contato() {
    return (
        <div className='contatos'>
            <h1>Fale conosco</h1>
            <table>
                <tr>
                    <td className='contato'><img src={phone} alt="Telefone"/><i><b>(11) 91111-1111</b></i></td>
                    <td className='contato'><img src={email} alt="E-mail"/><i><b>faleconosco@f1tuor.com.br</b></i></td>
                </tr>
            </table>
        </div>
    );
}

export default Contato;