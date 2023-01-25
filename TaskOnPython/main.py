import clear_matrix
import create_wave
import create_way
import point
import matrix
import print_matrix

maze = []
flag = True
start = point.Point(0, 1, 1)
finish = point.Point(7, 19, 99)


def menu():
    global maze
    global flag
    print("1/Create matrix\n2/Print matrix\n3/Create wave\n4/Create way\n5/Exit")
    number = input("Enter number: ")
    print("/////////////////////////")

    while flag:
        if number == "1":
            temp = matrix.Matrix(10, 20)
            maze = temp.fill_matrix()
            maze[start.get_row()][start.get_col()] = start.get_index()
            maze[finish.get_row()][finish.get_col()] = finish.get_index()
            menu()
        elif number == "2":
            print_matrix.print_matrix(maze)
            menu()
        elif number == "3":
            cr = create_wave.CreateWave(maze, start)
            cr.create_wave()
            print_matrix.print_matrix(cr.get_maze())
            menu()
        elif number == "4":
            cw = create_way.CreateWay(maze, finish)
            cw.way()
            clean_matrix = clear_matrix.clear(cw.get_maze())
            print_matrix.print_matrix(clean_matrix)
            menu()
        elif number == "5":
            flag = False
        else:
            menu()


menu()
