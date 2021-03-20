### LUP Decomposition

The stability of LU decomposition is improved if pivoting is used to maximize the absolute values of the diagonal elements of the upper triangular matrix U.

The function LUP_decomp(A,false) performs LU-decomposition with partial pivoting. It returns an object consisting of the LU matrix, the permutation matrix, and the number of row exchanges made during partial pivoting. LUP(A, true) returns P matrix
