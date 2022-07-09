import { useEffect, useState } from 'react';
import './app.css';

const API_URL = 'http://localhost:8080/pokemon/';
const IMG_PATH = '/assets/'

const App = () => {
    const [pokemon, setPokemon] = useState({});
    const [pokemonImg, setPokemonImg] = useState("");

    const getRandomPokemon = async () => {
        const response = await fetch(API_URL + 'random');
        const data = await response.json();

        setPokemon(data);
        setPokemonImg(IMG_PATH + data.num + '.png');
    }

    useEffect(() => {
        getRandomPokemon();
        console.log(pokemon);
    }, [])

    return (
        <div className = 'app'>
            <h1 className='header'>Pokédex</h1>
            <div className='pokemon'>
                <img src={pokemonImg} alt={pokemon.name} className='pokemon-img'></img>
                <span className='pokemon-num'>#{pokemon.num}</span>
                <span className='pokemon-name'>{pokemon.name}</span>
                <div className='pokemon-stats'>
                    <h3 className='title'>Stats</h3>
                    <p className='stats'>
                        HP:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{pokemon.hp} <br />
                        Type:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{pokemon.type1}{pokemon.type2 ? ' / ' + pokemon.type2 : ''} <br />
                        Attack:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{pokemon.att} <br />
                        Defense:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{pokemon.def}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
                        Sp. Attack:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{pokemon.spatk} <br />
                        Sp. Defense:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{pokemon.spdef} <br />
                        Speed:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{pokemon.speed} <br />
                        Generation:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{pokemon.gen} <br />
                        Legendary:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{pokemon.legendary} <br />
                    </p>
                </div>
            </div>
        </div>
    )
}

export default App;