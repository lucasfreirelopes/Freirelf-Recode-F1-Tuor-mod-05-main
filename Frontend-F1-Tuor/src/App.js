import './App.css';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Logo from './imagens/Logo.svg';

import Footer from './Footer';

import Home from './pages/Home';
import Destinos from './pages/Destinos';
import Promocoes from './pages/Promocoes';
import Contato from './pages/Contato';

function App() {
  return (
    <Router>
      <nav>
      <Link to={'/'}><img className='logo' src={Logo} alt='Logo'/></Link>
        <Link className='links' to={'/'}>Página inicial</Link>
        <Link className='links' to={'/destinos'}>Destinos</Link>
        <Link className='links' to={'/promocoes'}>Promoções</Link>
        <Link className='links' to={'/contato'}>Contato</Link>
      </nav>
      <Routes>
        <Route path='/' element={<Home/>}/>
        <Route path='/destinos' element={<Destinos/>}/>
        <Route path='/promocoes' element={<Promocoes/>}/>
        <Route path='/contato' element={<Contato/>}/>
      </Routes>
      <Footer/>
    </Router>
  );
}

export default App;
