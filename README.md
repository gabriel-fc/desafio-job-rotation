#### Olá!!

Neste repositório econtra-se todos as implementações das atividades propostas no processo seletivo, de forma que você pode testá-las utilizando os testes unitários na pasta /tests.

Abaixo adiciono as respostas às questões de lógica:



### Q3: **Descubra a lógica e complete o próximo elemento:**

​	**a) 1, 3, 5, 7, _9_**

​	**b) 2, 4, 8, 16, 32, 64, 128**

​	**c) 0, 1, 4, 9, 16, 25, 36, 49** 

​	**d) 4, 16, 36, 64, 100**

​	**e) 1, 1, 2, 3, 5, 8, 13**

​	**f) 2,10, 12, 16, 17, 18, 19, 200**	



Q4: **Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?**

Primeiro iremos definir algumas variáveis importantes:

DVcaminhão = 80km/h é a velocidade média do caminhão, oq que significa que ele leva 1h para percorrer 80km. Como os dois pedágios impõem um aumento deste intervalo de tempo de 10 min (ou 1/6 horas), temos que DVcaminhão = 80/(1+(1/6)) ≃ 69km/h.

DVcarro = 110km/h

T = é o tempo passado desde que ambos os veículos saíram dos seus pontos iniciais (saíram ao mesmo tempo).

S0caminhão e S0carro = são os pontos de partida iniciais em relação à cidade de ribeirão preto.

como o caminhão sai de Franca para Ribeirão, S0caminhão = -100km

como o carro sai de Ribeirão para Franca, S0carro = 0km

Fórmula: S = S0 + DV * T é uma fórmula da física que indica o espaço atual a partir de um intervalo de tempo passado, do seu ponto inicial de partida e de sua velocidade. (esta fórmula só vale para corpos com aceleração nula).

Se Scaminhão = S0caminhao + DVcaminhao * T, Scarro = S0carro + DVcarro * T e se sabemos que o tempo T é o mesmo para ambos e que queremos encontrar o ponto que, dada as variáveis definidas, S0carro == S0caminhao, então:

Como as velocidades são vetoriais (possuem módulo, direção e sentido, V0carro é negativa pois se afasta de Ribeirão e V0caminhao é positiva pois se aproxima)

S0caminhao + V0caminhao * T =   S0carro + V0carro * T => (-100) + (69) * T = 0 + (-110) * T => 179T = 100 =>

T ≃ 0,56h ou aproximadamente 33,6 minutos.

dada a velocidade do caminhão, no instante 0,56 ele estará no espaço S = -100 + 69 * 0,56 => S = -61,36km ou a 61,56km de distância de Ribeirão.

dada a velocidade do carro, no instante 0,56 ele estará no espaço S = 0 -110 * 0,56 => S = -61,6km ou há 61,6km de distância de Ribeirão.



Considere ambos os valores de distância iguais (as diferenças se dão por efeito de arredondamento), como o caminhão se aproxima da cidade ao passo que o carro se distância, após os mesmos se cruzarem no tempo t = 0,56h o caminhão estará mais próximo de Ribeirão.





