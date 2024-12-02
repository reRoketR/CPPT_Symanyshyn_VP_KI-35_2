import os


def main():
    try:
        # Ввід розміру матриці
        row = int(input("Input matrix size: "))
        if row <= 0:
            print("Incorrect matrix size!")
            return
    except ValueError:
        print("Incorrect input! Please enter an integer.")
        return

    # Ввід символа заповнювача
    symbol = input("Input filler symbol: ")
    if len(symbol) != 1:
        print("Incorrect filler size!")
        return

    # Створення матриці
    arr = create_length_for_sub_arr(row)
    file_name = "Lab1.txt"

    try:
        print_matrix(arr, symbol, row, file_name)
    except Exception as e:
        raise RuntimeError(f"Exception occurred while writing to a file: {e}")


def create_length_for_sub_arr(row):
    """
    Method that allocates the required length for each line.

    :param row: matrix size
    :return: a new jagged array
    """
    arr = []
    for i in range(row):
        length = 0
        for j in range(row):
            if i >= row // 2 and (row - i - 1 <= j <= i):
                length += 1
        arr.append([None] * length)
    return arr


def print_matrix(arr, symbol, row, file):
    """
    Method that generates a jagged array and prints it to a text file.

    :param arr: matrix to fill
    :param symbol: filler symbol
    :param row: matrix size
    :param file: file name
    """
    print("Result matrix:")

    with open(file, "w", encoding="utf-8") as writer:
        for i in range(row):
            index_j = 0
            for j in range(row):
                if i >= row // 2 and (row - i - 1 <= j <= i):
                    arr[i][index_j] = symbol
                    writer.write(f"{arr[i][index_j]} ")
                    print(arr[i][index_j], end=" ")
                    index_j += 1
                else:
                    writer.write("  ")
                    print("  ", end="")
            print()
            writer.write("\n")
    print(f"Matrix successfully written to '{os.path.abspath(file)}'.")


if __name__ == "__main__":
    main()
