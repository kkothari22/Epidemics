function [U, S, V] = svDecomposition(r)
    fileName = './Data/X.csv';
    X = csvread(fileName);
    [U, S, V] = svd(X);
    %Using only 'r' Semantics
    [m,n] = size(X);
    if(r<m && r<n)
        csvwrite('./Data/U.csv',U(:,1:r));
        csvwrite('./Data/S.csv',S(1:r,1:r));
        csvwrite('./Data/V.csv',V(1:r,:));
    end
    display(U(:, 1:r));
    [r,index] = sort(U(:, 1:r),1, 'descend');
    display(r);
    display(index);    
    
end