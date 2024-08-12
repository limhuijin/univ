import pygame, random

pygame.init()

BLACK = [0, 0, 0]
WHITE = [255, 255, 255]
SIZE = [300, 300]
SNOW_CNT = 70

screen = pygame.display.set_mode(SIZE)
pygame.display.set_caption("눈 오는 밤")

snow_list = []

for i in range(SNOW_CNT):
                x = random.randrange(0, SIZE[0])
                y = random.randrange(0, SIZE[1])
                snow_list.append([x, y])

clock = pygame.time.Clock()

done = False
while not done:
                for event in pygame.event.get():
                                if event.type == pygame.QUIT:
                                                done = True


                screen.fill(BLACK)

                for i in range(len(snow_list)):
                                #radius = 1
                                radius = random.randint(1, 3)
                                pygame.draw.circle(screen, WHITE, snow_list[i], radius)

                                snow_list[i][1] += 3
                                snow_list[i][0] += random.randint(-5, -2)

                                if snow_list[i][1] > SIZE[1]:
                                                snow_list[i][1] = random.randrange(-5, 0)
                                                snow_list[i][0] = random.randrange(0, SIZE[0])

                pygame.display.update()
                clock.tick(20)

pygame.quit()
