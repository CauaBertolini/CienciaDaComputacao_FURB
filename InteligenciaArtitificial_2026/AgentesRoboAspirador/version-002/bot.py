from ambient import Ambient
import random
import time

# Mapeamento do Ciclo Hamiltoniano para percorrer todas as 16 posições (1 a 4) da sala 4x4
MAPA_ACOES_4X4 = {
    (1, 1): 'direita',
    (1, 2): 'direita',
    (1, 3): 'direita',
    (1, 4): 'abaixo',

    (2, 4): 'esquerda',
    (2, 3): 'esquerda',
    (2, 2): 'abaixo',
    (2, 1): 'acima',  

    (3, 2): 'direita',
    (3, 3): 'direita',
    (3, 4): 'abaixo',
    (3, 1): 'acima',  

    (4, 4): 'esquerda',
    (4, 3): 'esquerda',
    (4, 2): 'esquerda',
    (4, 1): 'acima', 
}


def funcaoMapear(percepcao):
    posicao = tuple(percepcao[0])
    status = percepcao[1]
    return posicao, status


def agenteReativoSimples(percepcao) -> str:

    posicao, status = funcaoMapear(percepcao)

    if status == Ambient.STATUS_DIRT:
        return 'aspirar'

    if posicao in MAPA_ACOES_4X4:
        return MAPA_ACOES_4X4[posicao]

    return 'direita'


class Bot:
    def __init__(self, room: Ambient):
        self.room = room
        self.current_position = (1, 1)
        self.generate_initial_position()
        self.start_simple_reactive_bot()


    def generate_initial_position(self):
        posicoes_internas = self.room.get_internal_positions()
        self.current_position = random.choice(posicoes_internas)


    def start_simple_reactive_bot(self, max_passos: int = 32):
        print(f"\nPosição inicial sorteada: {self.current_position}")
        print("Iniciando a limpeza com o Agente Reativo Simples...\n")

        passo = 0
        while passo < max_passos:
            linha, coluna = self.current_position

            status = self.room.matrix[linha][coluna]

            percepcao = ((linha, coluna), status)

            acao = agenteReativoSimples(percepcao)

            print(f"Passo {passo + 1:02d} | Posição: ({linha}, {coluna}) | Status: {'SUJO' if status == Ambient.STATUS_DIRT else 'LIMPO'} | Ação: {acao}")
            print(self.room.show_room())

            self.executar_acao(acao)

            passo += 1

        print("\n--- Estado Final da Sala ---")
        self.room.show_room()


    def executar_acao(self, acao: str):
        if acao == 'aspirar':
            self.aspirar()
        elif acao == 'acima':
            self.acima()
        elif acao == 'abaixo':
            self.abaixo()
        elif acao == 'esquerda':
            self.esquerda()
        elif acao == 'direita':
            self.direita()


    def acima(self):
        l, c = self.current_position
        self.current_position = (l - 1, c)


    def abaixo(self):
        l, c = self.current_position
        self.current_position = (l + 1, c)


    def esquerda(self):
        l, c = self.current_position
        self.current_position = (l, c - 1)


    def direita(self):
        l, c = self.current_position
        self.current_position = (l, c + 1)


    def aspirar(self):
        l, c = self.current_position
        self.room.matrix[l][c] = Ambient.STATUS_CLEAN