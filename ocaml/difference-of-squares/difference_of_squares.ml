let square_of_sum x = 
    let x = (x * (x + 1)) / 2 in
    x * x

let sum_of_squares x = 
    (x * (x + 1) * (2 * x + 1)) / 6


let difference_of_squares x =
    square_of_sum x - sum_of_squares x
    
