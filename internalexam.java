#include <stdio.h>

int main() {
    int a[10][10], b[10][10], result[10][10];
    int r1, c1, r2, c2, i, j, k, choice;

    // Input for first matrix
    printf("Enter rows and columns of first matrix: ");
    scanf("%d %d", &r1, &c1);

    printf("Enter elements of first matrix:\n");
    for(i = 0; i < r1; i++) {
        for(j = 0; j < c1; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    // Input for second matrix
    printf("Enter rows and columns of second matrix: ");
    scanf("%d %d", &r2, &c2);

    printf("Enter elements of second matrix:\n");
    for(i = 0; i < r2; i++) {
        for(j = 0; j < c2; j++) {
            scanf("%d", &b[i][j]);
        }
    }

    // Menu
    printf("\nChoose operation:\n");
    printf("1. Addition\n2. Subtraction\n3. Multiplication\n");
    scanf("%d", &choice);

    switch(choice) {
        case 1:
            if(r1 == r2 && c1 == c2) {
                for(i = 0; i < r1; i++) {
                    for(j = 0; j < c1; j++) {
                        result[i][j] = a[i][j] + b[i][j];
                    }
                }

                printf("Result (Addition):\n");
                for(i = 0; i < r1; i++) {
                    for(j = 0; j < c1; j++) {
                        printf("%d ", result[i][j]);
                    }
                    printf("\n");
                }
            } else {
                printf("Addition not possible!\n");
            }
            break;

        case 2:
            if(r1 == r2 && c1 == c2) {
                for(i = 0; i < r1; i++) {
                    for(j = 0; j < c1; j++) {
                        result[i][j] = a[i][j] - b[i][j];
                    }
                }

                printf("Result (Subtraction):\n");
                for(i = 0; i < r1; i++) {
                    for(j = 0; j < c1; j++) {
                        printf("%d ", result[i][j]);
                    }
                    printf("\n");
                }
            } else {
                printf("Subtraction not possible!\n");
            }
            break;

        case 3:
            if(c1 == r2) {
                for(i = 0; i < r1; i++) {
                    for(j = 0; j < c2; j++) {
                        result[i][j] = 0;
                        for(k = 0; k < c1; k++) {
                            result[i][j] += a[i][k] * b[k][j];
                        }
                    }
                }

                printf("Result (Multiplication):\n");
                for(i = 0; i < r1; i++) {
                    for(j = 0; j < c2; j++) {
                        printf("%d ", result[i][j]);
                    }
                    printf("\n");
                }
            } else {
                printf("Multiplication not possible!\n");
            }
            break;

        default:
            printf("Invalid choice!\n");
    }

    return 0;
}