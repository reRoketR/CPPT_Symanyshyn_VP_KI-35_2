from lab_calculation import calculate_expression, write_to_text_file, write_to_binary_file, read_from_binary_file


def main():
    print("Програма обчислює вираз y = sin(x - 9) / (x - cos(2 * x)) для заданих значень x.")
    try:
        start = float(input("Введіть початкове значення x: "))
        end = float(input("Введіть кінцеве значення x: "))
        step = float(input("Введіть крок: "))
        if step <= 0:
            raise ValueError("Крок має бути більше 0.")
    except ValueError as e:
        print(f"Помилка вводу: {e}")
        return

    # Обчислення результатів
    results = []
    x = start
    while x <= end:
        y = calculate_expression(x)
        results.append((x, y))
        x += step

    # Запис результатів у текстовий файл
    write_to_text_file("results.txt", results)

    # Запис результатів у двійковий файл
    write_to_binary_file("results.bin", results)

    # Зчитування та виведення результатів із двійкового файлу
    print("\nРезультати з двійкового файлу:")
    binary_results = read_from_binary_file("results.bin")
    for x, y in binary_results:
        print(f"x = {x:.2f}, y = {y}")


if __name__ == "__main__":
    main()
