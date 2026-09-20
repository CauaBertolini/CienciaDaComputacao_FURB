from ambient import Ambient;
from bot import Bot

sala = Ambient(6, 6)
sala.generate_dirt(8)
sala.show_room()

bot = Bot(sala)