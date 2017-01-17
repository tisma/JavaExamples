CFLAGS := -fPIC -O3 -g -Wall -Werror
CC := gcc
MAJOR := 0
MINOR := 1
NAME := library

lib: lib$(NAME).so

lib$(NAME).so: $(NAME).o
		$(CC) -shared -Wl,-soname,lib$(NAME).so $^ -o $@

clean:
		$(RM) *.o *.so*
