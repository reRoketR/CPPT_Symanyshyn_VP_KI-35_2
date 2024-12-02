import math
import pickle


def calculate_expression(x):
    """
    Обчислює вираз y = sin(x - 9) / (x - cos(2 * x)).

    :param x: Значення x
    :return: Результат обчислення або None, якщо знаменник дорівнює нулю
    """
    try:
        denominator = x - math.cos(2 * x)
        if denominator == 0:
            raise ZeroDivisionError("Знаменник дорівнює нулю.")
        y = math.sin(x - 9) / denominator
        return y
    except ZeroDivisionError as e:
        print(f"Помилка: {e}")
        return None


def write_to_text_file(filename, results):
    """
    Записує результати обчислень у текстовий файл.

    :param filename: Ім'я файлу
    :param results: Список результатів для запису
    """
    try:
        with open(filename, "w", encoding="utf-8") as file:
            for x, y in results:
                file.write(f"x = {x:.2f}, y = {y}\n")
        print(f"Результати записані у файл {filename} у текстовому форматі.")
    except Exception as e:
        print(f"Помилка запису у текстовий файл: {e}")


def write_to_binary_file(filename, results):
    """
    Записує результати обчислень у двійковий файл.

    :param filename: Ім'я файлу
    :param results: Список результатів для запису
    """
    try:
        with open(filename, "wb") as file:
            pickle.dump(results, file)
        print(f"Результати записані у файл {filename} у двійковому форматі.")
    except Exception as e:
        print(f"Помилка запису у двійковий файл: {e}")


def read_from_binary_file(filename):
    """
    Зчитує результати з двійкового файлу.

    :param filename: Ім'я файлу
    :return: Список результатів
    """
    try:
        with open(filename, "rb") as file:
            results = pickle.load(file)
        print(f"Результати зчитані з файлу {filename} у двійковому форматі.")
        return results
    except Exception as e:
        print(f"Помилка читання з двійкового файлу: {e}")
        return []
