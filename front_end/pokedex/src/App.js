import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import axios from 'axios';

function App() {

  const [randomPokemon, setRandomPokemon] = useState([])
  const getRandomPokemon = () => {
    fetch("http://localhost:8080/pokemon/random")
    .then((res) => res.json())
    .then((response) => {
      // console.log(response)
      setRandomPokemon(response);
    })
  }

  return (
    <div className="App">
      <h1>Pokedex</h1>
      <button class = "button" onClick={getRandomPokemon}>Get Random Pokemon</button>
      {/* <form>
        <input></input>
      </form> */}
      <p>Pokedex #: {randomPokemon.num}</p>
      <p>Name: {randomPokemon.name}</p>
      <p>Type 1: {randomPokemon.type1}</p>
      {randomPokemon.type2 && <p>Type2: {randomPokemon.type2}</p>}
      <p className='total'>Total: {randomPokemon.total}</p>
      <p>HP: {randomPokemon.hp}</p>
      <p>Attack: {randomPokemon.att}</p>
      <p>Defense: {randomPokemon.def}</p>
      <p>Sp. Attack: {randomPokemon.spatk}</p>
      <p>Sp. Defense: {randomPokemon.spdef}</p>
      <p>Speed: {randomPokemon.speed}</p>
      <p>Generation: {randomPokemon.gen}</p>
      <p>Legendary: {randomPokemon.legendary}</p>

    </div>
  );
}

export default App;
