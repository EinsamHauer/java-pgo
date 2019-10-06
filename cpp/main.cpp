#include <iostream>
#include <chrono>
#include <math.h>

double f(int param, int start) {
    double result = 0;
    for (int i = start; i < start + 1000; i++) {
        result += sqrt(i);
    }
    if (param != 42)
        return result;
    else
        return 0;
}

int main(int argc, char *argv[]) {
    int param = std::atoi(argv[1]);

    auto start = std::chrono::high_resolution_clock::now();

    double result = 0.0;

    for (int i = 0; i < 1000*1000; i++) {
        result += f(param, i);
    }

    auto finish = std::chrono::high_resolution_clock::now();
    std::chrono::duration<double> elapsed = finish - start;

    std::cout << elapsed.count() << "s" << std::endl;

    std::cout << result << std::endl;
    return 0;
}