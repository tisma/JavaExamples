#include <stdio.h>

void sum_array(int* array, int length) {
	int i = 0;
	for (i = 0; i < length; i++) {
		array[i] += i;
	}
}

ssize_t signum(ssize_t input) {
	printf("From shared library, I got input of %li\n", input);
	if (0 == input)
		return 0;

	return input < 0 ? -1 : 1;
}

