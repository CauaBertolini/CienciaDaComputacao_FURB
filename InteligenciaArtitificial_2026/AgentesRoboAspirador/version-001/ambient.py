import random

class Ambient:
    STATUS_CLEAN = 0
    STATUS_WALL = 1
    STATUS_DIRT = 2


    def __init__(self, columns_amount: int, lines_amount: int):
        
        self.columns_amount = columns_amount
        self.lines_amount = lines_amount
        self.matrix = self.generate_ambient()


    def generate_ambient(self) -> list[list[int]]:

        ambient = []

        for l in range(self.lines_amount):
            line = []   

            for c in range(self.columns_amount):

                if l == 0 or l == self.lines_amount-1 or c == 0 or c == self.columns_amount-1:
                    line.append(self.STATUS_WALL)

                else:
                    line.append(self.STATUS_CLEAN)

            ambient.append(line) 

        return ambient


    def generate_dirt(self, dirt_amount: int = 0) -> None: 

        total_internal_space = (self.columns_amount-2) * (self.lines_amount-2)

        if dirt_amount == 0:
            dirt_amount = total_internal_space // 2

        if dirt_amount > total_internal_space:
            dirt_amount = total_internal_space
            
        
        for _ in range(dirt_amount):
            l = random.randint(1, self.lines_amount-2)
            c = random.randint(1, self.columns_amount-2)

            while(self.matrix[l][c] != self.STATUS_CLEAN):
                l = random.randint(1, self.lines_amount-2)
                c = random.randint(1, self.columns_amount-2)

            self.set_dirt(l, c)


    def set_dirt(self, line, column):
        self.matrix[line][column] = self.STATUS_DIRT


        
    def show_room(self):
        for line in self.matrix:
            print(line)