#include <iostream>
#include <chrono>
#include <cmath>

double f(int param1, int param2) {
    double result = 0;
    for (int i = 0; i < 1000; i++) {
        result += sqrt(i);
    }
    if (param1 != 42)
        return result + param2;
    else
        return 0;
}

int main(int argc, char *argv[]) {
    int param = (int) std::strtol(argv[1], nullptr, 10);

    auto start = std::chrono::high_resolution_clock::now();

    double result = 0.0;

    for (int i = 0; i < 1000*1000; i++) {
        result += f(param, i);
    }

    auto finish = std::chrono::high_resolution_clock::now();
    std::chrono::duration<double> elapsed = finish - start;

    std::cout << "Invoked with argument: " << param << std::endl;
    std::cout << "Elapsed: " << elapsed.count() << "s" << std::endl;
    std::cout << "Result: " << result << std::endl;
    return 0;
}